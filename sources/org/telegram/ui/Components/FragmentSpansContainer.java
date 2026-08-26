package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ChatActivity;

public class FragmentSpansContainer extends ScrollView {
    public final ArrayList allSpans;
    public final int currentAccount;
    public Delegate delegate;
    public int fieldY;
    public boolean ignoreScrollEvent;
    public final LongSparseArray selectedContacts;
    public final SpansContainer spansContainer;
    public int visualHeight;

    public interface Delegate {
        void onAfterMeasure(int i);
    }

    public final class SpansContainer extends ViewGroup {
        public GroupCreateSpan addingSpan;
        public int animationIndex;
        public boolean animationStarted;
        public final ArrayList animators;
        public int containerHeight;
        public AnimatorSet currentAnimation;
        public int maxTy;
        public final ArrayList removingSpans;

        public final class AnonymousClass1 extends AnimatorListenerAdapter {
            public final int $r8$classId;
            public final SpansContainer this$1;

            public AnonymousClass1(SpansContainer spansContainer, int i) {
                this.$r8$classId = i;
                this.this$1 = spansContainer;
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                switch (this.$r8$classId) {
                    case 0:
                        SpansContainer spansContainer = this.this$1;
                        NotificationCenter.getInstance(FragmentSpansContainer.this.currentAccount).onAnimationFinish(spansContainer.animationIndex);
                        spansContainer.requestLayout();
                        break;
                    default:
                        SpansContainer spansContainer2 = this.this$1;
                        spansContainer2.addingSpan = null;
                        spansContainer2.currentAnimation = null;
                        spansContainer2.animationStarted = false;
                        break;
                }
            }
        }

        public SpansContainer(Context context) {
            super(context);
            this.animators = new ArrayList();
            this.removingSpans = new ArrayList();
            this.animationIndex = -1;
        }

        public final void addSpan(GroupCreateSpan groupCreateSpan) {
            FragmentSpansContainer fragmentSpansContainer = FragmentSpansContainer.this;
            fragmentSpansContainer.allSpans.add(groupCreateSpan);
            if (!groupCreateSpan.isFlag) {
                fragmentSpansContainer.selectedContacts.put(groupCreateSpan, groupCreateSpan.getUid());
            }
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.currentAnimation.setupEndValues();
                this.currentAnimation.cancel();
            }
            this.animationStarted = false;
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.currentAnimation = animatorSet2;
            animatorSet2.addListener(new AnonymousClass1(this, 1));
            this.currentAnimation.setDuration(150L);
            this.addingSpan = groupCreateSpan;
            ArrayList arrayList = this.animators;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.addingSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.addingSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.addingSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 0.0f, 1.0f));
            addView(groupCreateSpan);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            ArrayList arrayList;
            int iM$2;
            char c;
            int childCount = getChildCount();
            int size = View.MeasureSpec.getSize(i);
            int iDp = size - AndroidUtilities.dp(26.0f);
            int iDp2 = AndroidUtilities.dp(10.0f);
            int iDp3 = AndroidUtilities.dp(10.0f);
            if (!this.animationStarted) {
                this.maxTy = 0;
            }
            int i3 = 0;
            int iM = 0;
            int iM2 = 0;
            while (true) {
                arrayList = this.animators;
                if (i3 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i3);
                if (childAt instanceof GroupCreateSpan) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                    ArrayList arrayList2 = this.removingSpans;
                    boolean zContains = arrayList2.contains(childAt);
                    if (zContains) {
                        c = 0;
                    } else {
                        c = 0;
                        if (childAt.getMeasuredWidth() + iM > iDp) {
                            iDp2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredHeight(), 8.0f, iDp2);
                            iM = 0;
                        }
                    }
                    if (childAt.getMeasuredWidth() + iM2 > iDp) {
                        iDp3 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredHeight(), 8.0f, iDp3);
                        iM2 = 0;
                    }
                    int iDp4 = AndroidUtilities.dp(13.0f) + iM;
                    if (!this.animationStarted) {
                        if (zContains) {
                            childAt.setTranslationX(AndroidUtilities.dp(13.0f) + iM2);
                            childAt.setTranslationY(iDp3);
                        } else if (arrayList2.isEmpty()) {
                            childAt.setTranslationX(iDp4);
                            childAt.setTranslationY(iDp2);
                            this.maxTy = Math.max(this.maxTy, iDp2);
                        } else {
                            float f = iDp4;
                            if (childAt.getTranslationX() != f) {
                                Property property = View.TRANSLATION_X;
                                float[] fArr = new float[1];
                                fArr[c] = f;
                                arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, fArr));
                            }
                            float f2 = iDp2;
                            if (childAt.getTranslationY() != f2) {
                                Property property2 = View.TRANSLATION_Y;
                                float[] fArr2 = new float[1];
                                fArr2[c] = f2;
                                arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, fArr2));
                            }
                            this.maxTy = Math.max(this.maxTy, iDp2);
                        }
                    }
                    if (!zContains) {
                        iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredWidth(), 9.0f, iM);
                    }
                    iM2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredWidth(), 9.0f, iM2);
                }
                i3++;
            }
            if (AndroidUtilities.isTablet()) {
                iM$2 = AndroidUtilities.dp(372.0f) / 3;
            } else {
                Point point = AndroidUtilities.displaySize;
                iM$2 = OKLCH.m$2(158.0f, Math.min(point.x, point.y), 3);
            }
            if (iDp - iM < iM$2) {
                iDp2 += AndroidUtilities.dp(40.0f);
            }
            if (iDp - iM2 < iM$2) {
                iDp3 += AndroidUtilities.dp(40.0f);
            }
            boolean z = this.animationStarted;
            FragmentSpansContainer fragmentSpansContainer = FragmentSpansContainer.this;
            if (!z) {
                int iDp5 = AndroidUtilities.dp(42.0f) + iDp3;
                fragmentSpansContainer.fieldY = iDp2;
                if (this.currentAnimation != null) {
                    this.containerHeight = AndroidUtilities.dp(42.0f) + iDp2;
                    this.currentAnimation.playTogether(arrayList);
                    this.currentAnimation.addListener(new AnonymousClass1(this, 0));
                    this.animationIndex = NotificationCenter.getInstance(fragmentSpansContainer.currentAccount).setAnimationInProgress(this.animationIndex, null);
                    this.currentAnimation.start();
                    this.animationStarted = true;
                } else {
                    this.containerHeight = iDp5;
                }
            }
            int i4 = this.maxTy;
            fragmentSpansContainer.visualHeight = i4 > 0 ? AndroidUtilities.dp(40.0f) + i4 : 0;
            setMeasuredDimension(size, this.containerHeight);
            Delegate delegate = fragmentSpansContainer.delegate;
            if (delegate != null) {
                delegate.onAfterMeasure(fragmentSpansContainer.visualHeight);
            }
        }

        public final void removeAllSpans() {
            FragmentSpansContainer fragmentSpansContainer = FragmentSpansContainer.this;
            fragmentSpansContainer.ignoreScrollEvent = true;
            ArrayList arrayList = fragmentSpansContainer.allSpans;
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            ArrayList arrayList3 = this.removingSpans;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            Object[] objArr = 0;
            for (int i = 0; i < arrayList2.size(); i++) {
                ((GroupCreateSpan) arrayList2.get(i)).setOnClickListener(null);
            }
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.currentAnimation.setupEndValues();
                this.currentAnimation.cancel();
            }
            this.animationStarted = false;
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.currentAnimation = animatorSet2;
            animatorSet2.addListener(new ChatActivity.AnonymousClass74(this, arrayList2, objArr == true ? 1 : 0, 20));
            ArrayList arrayList4 = this.animators;
            arrayList4.clear();
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                GroupCreateSpan groupCreateSpan = (GroupCreateSpan) arrayList2.get(i2);
                arrayList4.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 1.0f, 0.0f));
            }
            requestLayout();
        }

        public final void removeSpan(GroupCreateSpan groupCreateSpan) {
            boolean z = false;
            FragmentSpansContainer fragmentSpansContainer = FragmentSpansContainer.this;
            fragmentSpansContainer.ignoreScrollEvent = true;
            if (!groupCreateSpan.isFlag) {
                fragmentSpansContainer.selectedContacts.remove(groupCreateSpan.getUid());
            }
            fragmentSpansContainer.allSpans.remove(groupCreateSpan);
            groupCreateSpan.setOnClickListener(null);
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.setupEndValues();
                this.currentAnimation.cancel();
            }
            this.animationStarted = false;
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.currentAnimation = animatorSet2;
            animatorSet2.addListener(new ChatActivity.AnonymousClass74(this, groupCreateSpan, z, 19));
            this.currentAnimation.setDuration(150L);
            ArrayList arrayList = this.removingSpans;
            arrayList.clear();
            arrayList.add(groupCreateSpan);
            ArrayList arrayList2 = this.animators;
            arrayList2.clear();
            arrayList2.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList2.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList2.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 1.0f, 0.0f));
            requestLayout();
        }
    }

    public FragmentSpansContainer(Context context, int i) {
        super(context);
        this.selectedContacts = new LongSparseArray();
        this.allSpans = new ArrayList();
        this.currentAccount = i;
        SpansContainer spansContainer = new SpansContainer(context);
        this.spansContainer = spansContainer;
        setVerticalScrollBarEnabled(false);
        addView(spansContainer, LayoutHelper.createFrame(-2.0f, -1));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f = this.visualHeight;
        float y = motionEvent.getY();
        if (action != 0 || y <= f) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public ViewGroup getSpansContainer() {
        return this.spansContainer;
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (this.ignoreScrollEvent) {
            this.ignoreScrollEvent = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(this.fieldY, 20.0f, rect.top);
        rect.bottom = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(this.fieldY, 50.0f, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }
}
