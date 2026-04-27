package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public class FragmentSpansContainer extends ScrollView {
    public final ArrayList allSpans;
    private final int currentAccount;
    private Delegate delegate;
    private int fieldY;
    private boolean ignoreScrollEvent;
    public final LongSparseArray selectedContacts;
    private final SpansContainer spansContainer;
    private int visualHeight;

    public interface Delegate {
        void onAfterMeasure(int i);
    }

    public FragmentSpansContainer(Context context, int i) {
        super(context);
        this.selectedContacts = new LongSparseArray();
        this.allSpans = new ArrayList();
        this.currentAccount = i;
        SpansContainer spansContainer = new SpansContainer(context);
        this.spansContainer = spansContainer;
        setVerticalScrollBarEnabled(false);
        addView(spansContainer, LayoutHelper.createFrame(-1, -2.0f));
    }

    public ViewGroup getSpansContainer() {
        return this.spansContainer;
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f = this.visualHeight;
        float y = motionEvent.getY();
        if (action != 0 || y <= f) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (this.ignoreScrollEvent) {
            this.ignoreScrollEvent = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top += this.fieldY + AndroidUtilities.dp(20.0f);
        rect.bottom += this.fieldY + AndroidUtilities.dp(50.0f);
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    public void addSpan(GroupCreateSpan groupCreateSpan) {
        this.spansContainer.addSpan(groupCreateSpan);
    }

    public void endAnimation() {
        this.spansContainer.endAnimation();
    }

    public void removeSpan(GroupCreateSpan groupCreateSpan) {
        this.spansContainer.removeSpan(groupCreateSpan);
    }

    public void removeAllSpans(boolean z) {
        this.spansContainer.removeAllSpans(z);
    }

    private class SpansContainer extends ViewGroup {
        private View addingSpan;
        private int animationIndex;
        private boolean animationStarted;
        private final ArrayList animators;
        private int containerHeight;
        private AnimatorSet currentAnimation;
        private int maxTy;
        private final ArrayList removingSpans;

        public SpansContainer(Context context) {
            super(context);
            this.animators = new ArrayList();
            this.removingSpans = new ArrayList();
            this.animationIndex = -1;
        }

        @Override
        protected void onMeasure(int r17, int r18) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.FragmentSpansContainer.SpansContainer.onMeasure(int, int):void");
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }

        public void addSpan(GroupCreateSpan groupCreateSpan) {
            FragmentSpansContainer.this.allSpans.add(groupCreateSpan);
            if (!groupCreateSpan.isFlag) {
                FragmentSpansContainer.this.selectedContacts.put(groupCreateSpan.getUid(), groupCreateSpan);
            }
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.currentAnimation.setupEndValues();
                this.currentAnimation.cancel();
            }
            this.animationStarted = false;
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.currentAnimation = animatorSet2;
            animatorSet2.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    SpansContainer.this.addingSpan = null;
                    SpansContainer.this.currentAnimation = null;
                    SpansContainer.this.animationStarted = false;
                }
            });
            this.currentAnimation.setDuration(150L);
            this.addingSpan = groupCreateSpan;
            this.animators.clear();
            this.animators.add(ObjectAnimator.ofFloat(this.addingSpan, (Property<View, Float>) View.SCALE_X, 0.01f, 1.0f));
            this.animators.add(ObjectAnimator.ofFloat(this.addingSpan, (Property<View, Float>) View.SCALE_Y, 0.01f, 1.0f));
            this.animators.add(ObjectAnimator.ofFloat(this.addingSpan, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            addView(groupCreateSpan);
        }

        public void endAnimation() {
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet == null || !animatorSet.isRunning()) {
                return;
            }
            this.currentAnimation.setupEndValues();
            this.currentAnimation.cancel();
        }

        public void removeSpan(final GroupCreateSpan groupCreateSpan) {
            FragmentSpansContainer.this.ignoreScrollEvent = true;
            if (!groupCreateSpan.isFlag) {
                FragmentSpansContainer.this.selectedContacts.remove(groupCreateSpan.getUid());
            }
            FragmentSpansContainer.this.allSpans.remove(groupCreateSpan);
            groupCreateSpan.setOnClickListener(null);
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.setupEndValues();
                this.currentAnimation.cancel();
            }
            this.animationStarted = false;
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.currentAnimation = animatorSet2;
            animatorSet2.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    SpansContainer.this.removeView(groupCreateSpan);
                    SpansContainer.this.removingSpans.clear();
                    SpansContainer.this.currentAnimation = null;
                    SpansContainer.this.animationStarted = false;
                }
            });
            this.currentAnimation.setDuration(150L);
            this.removingSpans.clear();
            this.removingSpans.add(groupCreateSpan);
            this.animators.clear();
            this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 1.0f, 0.01f));
            this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 1.0f, 0.01f));
            this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 1.0f, 0.0f));
            requestLayout();
        }

        public void removeAllSpans(boolean z) {
            FragmentSpansContainer.this.ignoreScrollEvent = true;
            final ArrayList arrayList = new ArrayList(FragmentSpansContainer.this.allSpans);
            FragmentSpansContainer.this.allSpans.clear();
            this.removingSpans.clear();
            this.removingSpans.addAll(arrayList);
            for (int i = 0; i < arrayList.size(); i++) {
                ((GroupCreateSpan) arrayList.get(i)).setOnClickListener(null);
            }
            endAnimation();
            if (z) {
                this.animationStarted = false;
                AnimatorSet animatorSet = new AnimatorSet();
                this.currentAnimation = animatorSet;
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            SpansContainer.this.removeView((View) arrayList.get(i2));
                        }
                        SpansContainer.this.removingSpans.clear();
                        SpansContainer.this.currentAnimation = null;
                        SpansContainer.this.animationStarted = false;
                    }
                });
                this.animators.clear();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    GroupCreateSpan groupCreateSpan = (GroupCreateSpan) arrayList.get(i2);
                    this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 1.0f, 0.01f));
                    this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 1.0f, 0.01f));
                    this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 1.0f, 0.0f));
                }
            } else {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    removeView((View) arrayList.get(i3));
                }
                this.removingSpans.clear();
                this.currentAnimation = null;
                this.animationStarted = false;
            }
            requestLayout();
        }
    }
}
