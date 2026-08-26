package org.telegram.ui.Components.Premium.boosts.cells.selector;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ScrollView;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda9;
import org.telegram.ui.Stars.GiftOfferSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.iv.RichEditor;

public abstract class SelectorSearchCell extends ScrollView {
    public ArrayList<GroupCreateSpan> allSpans;
    private final LinearGradient bottomGradient;
    private final AnimatedFloat bottomGradientAlpha;
    private final Matrix bottomGradientMatrix;
    private final Paint bottomGradientPaint;
    public float containerHeight;
    private GroupCreateSpan currentDeletingSpan;
    private EditTextBoldCursor editText;
    private int fieldY;
    private int hintTextWidth;
    private boolean ignoreScrollEvent;
    private boolean ignoreTextChange;
    private Utilities.Callback<String> onSearchTextChange;
    private int prevResultContainerHeight;
    private final Theme.ResourcesProvider resourcesProvider;
    public int resultContainerHeight;
    private boolean scroll;
    private int selectedCount;
    public SpansContainer spansContainer;
    private final LinearGradient topGradient;
    private final AnimatedFloat topGradientAlpha;
    private final Matrix topGradientMatrix;
    private final Paint topGradientPaint;
    private Runnable updateHeight;

    public final class SpansContainer extends ViewGroup {
        public final ArrayList animAddingSpans;
        public final ArrayList animRemovingSpans;
        public boolean animationStarted;
        public final ArrayList animators;
        public AnimatorSet currentAnimation;
        public final ArrayList removingSpans;

        public final class AnonymousClass2 extends AnimatorListenerAdapter {
            public final int $r8$classId;
            public final SpansContainer this$1;
            public final ArrayList val$toDelete;

            public AnonymousClass2(SpansContainer spansContainer, ArrayList arrayList, int i) {
                this.$r8$classId = i;
                this.this$1 = spansContainer;
                this.val$toDelete = arrayList;
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                switch (this.$r8$classId) {
                    case 0:
                        int i = 0;
                        while (true) {
                            ArrayList arrayList = this.val$toDelete;
                            int size = arrayList.size();
                            SpansContainer spansContainer = this.this$1;
                            if (i >= size) {
                                spansContainer.getClass();
                                spansContainer.removingSpans.clear();
                                spansContainer.currentAnimation = null;
                                spansContainer.animationStarted = false;
                                SelectorSearchCell.this.editText.setAllowDrawCursor(true);
                                if (SelectorSearchCell.this.updateHeight != null) {
                                    SelectorSearchCell.this.updateHeight.run();
                                }
                                if (SelectorSearchCell.this.scroll) {
                                    SelectorSearchCell.this.fullScroll(130);
                                    SelectorSearchCell.this.scroll = false;
                                }
                            } else {
                                spansContainer.removeView((View) arrayList.get(i));
                                i++;
                            }
                            break;
                        }
                        break;
                    default:
                        int i2 = 0;
                        while (true) {
                            ArrayList arrayList2 = this.val$toDelete;
                            int size2 = arrayList2.size();
                            SpansContainer spansContainer2 = this.this$1;
                            if (i2 >= size2) {
                                spansContainer2.removingSpans.clear();
                                spansContainer2.currentAnimation = null;
                                spansContainer2.animationStarted = false;
                                SelectorSearchCell.this.editText.setAllowDrawCursor(true);
                                if (SelectorSearchCell.this.updateHeight != null) {
                                    SelectorSearchCell.this.updateHeight.run();
                                }
                                if (SelectorSearchCell.this.scroll) {
                                    SelectorSearchCell.this.fullScroll(130);
                                    SelectorSearchCell.this.scroll = false;
                                }
                            } else {
                                spansContainer2.removeView((View) arrayList2.get(i2));
                                i2++;
                            }
                            break;
                        }
                        break;
                }
            }
        }

        public SpansContainer(Context context) {
            super(context);
            this.animAddingSpans = new ArrayList();
            this.animRemovingSpans = new ArrayList();
            this.animators = new ArrayList();
            this.removingSpans = new ArrayList();
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
            ArrayList arrayList2;
            Property property;
            Property property2;
            int iM$2;
            int i3;
            int childCount = getChildCount();
            int size = View.MeasureSpec.getSize(i);
            int iDp = size - AndroidUtilities.dp(28.0f);
            int iDp2 = AndroidUtilities.dp(10.0f);
            int iDp3 = AndroidUtilities.dp(10.0f);
            int i4 = 0;
            int iM = 0;
            int iM2 = 0;
            while (true) {
                arrayList = this.removingSpans;
                arrayList2 = this.animators;
                property = View.TRANSLATION_Y;
                property2 = View.TRANSLATION_X;
                if (i4 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i4);
                if (childAt instanceof GroupCreateSpan) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                    boolean zContains = arrayList.contains(childAt);
                    if (!zContains && childAt.getMeasuredWidth() + iM > iDp) {
                        iDp2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(4.0f, childAt.getMeasuredHeight(), iDp2);
                        iM = 0;
                    }
                    if (childAt.getMeasuredWidth() + iM2 > iDp) {
                        iDp3 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(4.0f, childAt.getMeasuredHeight(), iDp3);
                        iM2 = 0;
                    }
                    int iDp4 = AndroidUtilities.dp(14.0f) + iM;
                    if (!this.animationStarted) {
                        if (zContains) {
                            childAt.setTranslationX(AndroidUtilities.dp(14.0f) + iM2);
                            childAt.setTranslationY(iDp3);
                        } else if (arrayList.isEmpty()) {
                            childAt.setTranslationX(iDp4);
                            childAt.setTranslationY(iDp2);
                        } else {
                            float f = iDp4;
                            if (childAt.getTranslationX() != f) {
                                i3 = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, f));
                            } else {
                                i3 = 1;
                            }
                            float f2 = iDp2;
                            if (childAt.getTranslationY() != f2) {
                                float[] fArr = new float[i3];
                                fArr[0] = f2;
                                arrayList2.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, fArr));
                            }
                        }
                    }
                    if (!zContains) {
                        iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(6.0f, childAt.getMeasuredWidth(), iM);
                    }
                    iM2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(6.0f, childAt.getMeasuredWidth(), iM2);
                }
                i4++;
                childCount = childCount;
            }
            if (AndroidUtilities.isTablet()) {
                iM$2 = AndroidUtilities.dp(376.0f) / 3;
            } else {
                Point point = AndroidUtilities.displaySize;
                iM$2 = OKLCH.m$2(154.0f, Math.min(point.x, point.y), 3);
            }
            if (iDp - iM < iM$2) {
                iDp2 += AndroidUtilities.dp(36.0f);
                iM = 0;
            }
            if (iDp - iM2 < iM$2) {
                iDp3 += AndroidUtilities.dp(36.0f);
            }
            SelectorSearchCell selectorSearchCell = SelectorSearchCell.this;
            selectorSearchCell.editText.measure(View.MeasureSpec.makeMeasureSpec(iDp - iM, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
            selectorSearchCell.editText.setHintVisible(selectorSearchCell.editText.getMeasuredWidth() > selectorSearchCell.hintTextWidth, true);
            if (!this.animationStarted) {
                int iDp5 = AndroidUtilities.dp(38.0f) + iDp3;
                int iDp6 = AndroidUtilities.dp(16.0f) + iM;
                selectorSearchCell.fieldY = iDp2;
                if (this.currentAnimation != null) {
                    int iDp7 = AndroidUtilities.dp(38.0f) + iDp2;
                    selectorSearchCell.resultContainerHeight = iDp7;
                    float f3 = iDp7;
                    if (selectorSearchCell.containerHeight != f3) {
                        arrayList2.add(selectorSearchCell.getContainerHeightAnimator(f3));
                    }
                    float f4 = iDp6;
                    if (selectorSearchCell.editText.getTranslationX() != f4) {
                        arrayList2.add(ObjectAnimator.ofFloat(selectorSearchCell.editText, (Property<EditTextBoldCursor, Float>) property2, f4));
                    }
                    if (selectorSearchCell.editText.getTranslationY() != selectorSearchCell.fieldY) {
                        arrayList2.add(ObjectAnimator.ofFloat(selectorSearchCell.editText, (Property<EditTextBoldCursor, Float>) property, selectorSearchCell.fieldY));
                    }
                    selectorSearchCell.editText.setAllowDrawCursor(false);
                    this.currentAnimation.playTogether(arrayList2);
                    this.currentAnimation.setDuration(180L);
                    this.currentAnimation.setInterpolator(new LinearInterpolator());
                    this.currentAnimation.start();
                    this.animationStarted = true;
                    if (selectorSearchCell.updateHeight != null) {
                        selectorSearchCell.updateHeight.run();
                    }
                } else {
                    selectorSearchCell.resultContainerHeight = iDp5;
                    selectorSearchCell.containerHeight = iDp5;
                    selectorSearchCell.editText.setTranslationX(iDp6);
                    selectorSearchCell.editText.setTranslationY(selectorSearchCell.fieldY);
                    if (selectorSearchCell.updateHeight != null) {
                        selectorSearchCell.updateHeight.run();
                    }
                    if (selectorSearchCell.scroll) {
                        post(new GiftSheet$$ExternalSyntheticLambda9(this, 4));
                        selectorSearchCell.scroll = false;
                    }
                }
                selectorSearchCell.prevResultContainerHeight = selectorSearchCell.resultContainerHeight;
            } else if (this.currentAnimation != null) {
                if (!selectorSearchCell.ignoreScrollEvent && arrayList.isEmpty()) {
                    selectorSearchCell.editText.bringPointIntoView(selectorSearchCell.editText.getSelectionStart());
                }
                if (selectorSearchCell.scroll) {
                    selectorSearchCell.fullScroll(130);
                    selectorSearchCell.scroll = false;
                }
            }
            setMeasuredDimension(size, (int) selectorSearchCell.containerHeight);
        }

        public final void removeAllSpans(boolean z) {
            SelectorSearchCell selectorSearchCell = SelectorSearchCell.this;
            int i = 1;
            selectorSearchCell.ignoreScrollEvent = true;
            ArrayList arrayList = new ArrayList(selectorSearchCell.allSpans);
            ArrayList arrayList2 = this.removingSpans;
            arrayList2.clear();
            arrayList2.addAll(selectorSearchCell.allSpans);
            selectorSearchCell.allSpans.clear();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((GroupCreateSpan) arrayList.get(i2)).setOnClickListener(null);
            }
            setupEndValues();
            if (z) {
                this.animationStarted = false;
                AnimatorSet animatorSet = new AnimatorSet();
                this.currentAnimation = animatorSet;
                animatorSet.addListener(new AnonymousClass2(this, arrayList, i));
                ArrayList arrayList3 = this.animators;
                arrayList3.clear();
                ArrayList arrayList4 = this.animAddingSpans;
                arrayList4.clear();
                this.animRemovingSpans.clear();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    GroupCreateSpan groupCreateSpan = (GroupCreateSpan) arrayList.get(i3);
                    arrayList4.add(groupCreateSpan);
                    arrayList3.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 1.0f, 0.01f));
                    arrayList3.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 1.0f, 0.01f));
                    arrayList3.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 1.0f, 0.0f));
                }
            } else {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    removeView((View) arrayList.get(i4));
                }
                arrayList2.clear();
                this.currentAnimation = null;
                this.animationStarted = false;
                selectorSearchCell.editText.setAllowDrawCursor(true);
            }
            requestLayout();
        }

        public final void removeSpan(GroupCreateSpan groupCreateSpan) {
            SelectorSearchCell selectorSearchCell = SelectorSearchCell.this;
            selectorSearchCell.ignoreScrollEvent = true;
            selectorSearchCell.allSpans.remove(groupCreateSpan);
            groupCreateSpan.setOnClickListener(null);
            setupEndValues();
            this.animationStarted = false;
            AnimatorSet animatorSet = new AnimatorSet();
            this.currentAnimation = animatorSet;
            animatorSet.addListener(new RichEditor.AnonymousClass1(11, this, groupCreateSpan));
            ArrayList arrayList = this.removingSpans;
            arrayList.clear();
            arrayList.add(groupCreateSpan);
            ArrayList arrayList2 = this.animAddingSpans;
            arrayList2.clear();
            this.animRemovingSpans.clear();
            arrayList2.add(groupCreateSpan);
            ArrayList arrayList3 = this.animators;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 1.0f, 0.0f));
            requestLayout();
        }

        public final void setupEndValues() {
            ArrayList arrayList;
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            int i = 0;
            int i2 = 0;
            while (true) {
                arrayList = this.animAddingSpans;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((View) arrayList.get(i2)).setScaleX(1.0f);
                ((View) arrayList.get(i2)).setScaleY(1.0f);
                ((View) arrayList.get(i2)).setAlpha(1.0f);
                i2++;
            }
            while (true) {
                ArrayList arrayList2 = this.animRemovingSpans;
                if (i >= arrayList2.size()) {
                    arrayList.clear();
                    arrayList2.clear();
                    return;
                } else {
                    ((View) arrayList2.get(i)).setScaleX(0.0f);
                    ((View) arrayList2.get(i)).setScaleY(0.0f);
                    ((View) arrayList2.get(i)).setAlpha(0.0f);
                    i++;
                }
            }
        }
    }

    public SelectorSearchCell(Context context, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        super(context);
        this.allSpans = new ArrayList<>();
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.topGradientAlpha = new AnimatedFloat(this, 0L, 300L, cubicBezierInterpolator);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.topGradient = linearGradient;
        Paint paint = new Paint(1);
        this.topGradientPaint = paint;
        this.topGradientMatrix = new Matrix();
        this.bottomGradientAlpha = new AnimatedFloat(this, 0L, 300L, cubicBezierInterpolator);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.bottomGradient = linearGradient2;
        Paint paint2 = new Paint(1);
        this.bottomGradientPaint = paint2;
        this.bottomGradientMatrix = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.resourcesProvider = resourcesProvider;
        this.updateHeight = runnable;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        SpansContainer spansContainer = new SpansContainer(context);
        this.spansContainer = spansContainer;
        addView(spansContainer, LayoutHelper.createFrame(-1, -2.0f));
        EmojiBottomSheet.SearchField.AnonymousClass2 anonymousClass2 = new EmojiBottomSheet.SearchField.AnonymousClass2(this, context, 1);
        this.editText = anonymousClass2;
        if (Build.VERSION.SDK_INT >= 25) {
            anonymousClass2.setRevealOnFocusHint(false);
        }
        this.editText.setTextSize(1, 16.0f);
        this.editText.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText, resourcesProvider));
        this.editText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        EditTextBoldCursor editTextBoldCursor = this.editText;
        int i = Theme.key_groupcreate_cursor;
        editTextBoldCursor.setCursorColor(Theme.getColor(i, resourcesProvider));
        this.editText.setHandlesColor(Theme.getColor(i, resourcesProvider));
        this.editText.setCursorWidth(1.5f);
        EditTextBoldCursor editTextBoldCursor2 = this.editText;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 176);
        this.editText.setSingleLine(true);
        this.editText.setBackgroundDrawable(null);
        this.editText.setVerticalScrollBarEnabled(false);
        this.editText.setHorizontalScrollBarEnabled(false);
        this.editText.setTextIsSelectable(false);
        this.editText.setPadding(0, 0, 0, 0);
        this.editText.setImeOptions(268435462);
        this.editText.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        this.spansContainer.addView(this.editText);
        EditTextBoldCursor editTextBoldCursor3 = this.editText;
        int i2 = R.string.Search;
        editTextBoldCursor3.setHintText(LocaleController.getString(i2));
        this.hintTextWidth = (int) this.editText.getPaint().measureText(LocaleController.getString(i2));
        this.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                SelectorSearchCell selectorSearchCell = SelectorSearchCell.this;
                if (selectorSearchCell.ignoreTextChange || selectorSearchCell.onSearchTextChange == null || editable == null) {
                    return;
                }
                selectorSearchCell.onSearchTextChange.run(editable.toString());
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }
        });
    }

    public static void access$400(SelectorSearchCell selectorSearchCell, View view, HashSet hashSet, Runnable runnable) {
        if (selectorSearchCell.allSpans.contains(view)) {
            GroupCreateSpan groupCreateSpan = (GroupCreateSpan) view;
            if (groupCreateSpan.isDeleting()) {
                selectorSearchCell.currentDeletingSpan = null;
                selectorSearchCell.spansContainer.removeSpan(groupCreateSpan);
                hashSet.remove(Long.valueOf(groupCreateSpan.getUid()));
                runnable.run();
                return;
            }
            GroupCreateSpan groupCreateSpan2 = selectorSearchCell.currentDeletingSpan;
            if (groupCreateSpan2 != null) {
                groupCreateSpan2.cancelDeleteAnimation();
                selectorSearchCell.currentDeletingSpan = null;
            }
            selectorSearchCell.currentDeletingSpan = groupCreateSpan;
            groupCreateSpan.startDeleteAnimation();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int scrollY = getScrollY();
        float f = scrollY;
        canvas.saveLayerAlpha(0.0f, f, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float f2 = this.topGradientAlpha.set(canScrollVertically(-1));
        this.topGradientMatrix.reset();
        this.topGradientMatrix.postTranslate(0.0f, f);
        this.topGradient.setLocalMatrix(this.topGradientMatrix);
        this.topGradientPaint.setAlpha((int) (f2 * 255.0f));
        canvas.drawRect(0.0f, f, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, this.topGradientPaint);
        float f3 = this.bottomGradientAlpha.set(canScrollVertically(1));
        this.bottomGradientMatrix.reset();
        this.bottomGradientMatrix.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.bottomGradient.setLocalMatrix(this.bottomGradientMatrix);
        this.bottomGradientPaint.setAlpha((int) (f3 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + scrollY, this.bottomGradientPaint);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public Animator getContainerHeightAnimator(float f) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.containerHeight, f);
        valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 18));
        return valueAnimatorOfFloat;
    }

    public EditTextBoldCursor getEditText() {
        return this.editText;
    }

    public final void lambda$getContainerHeightAnimator$1(ValueAnimator valueAnimator) {
        setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final void lambda$updateSpans$0(HashSet hashSet, Runnable runnable, View view) {
        if (this.allSpans.contains(view)) {
            GroupCreateSpan groupCreateSpan = (GroupCreateSpan) view;
            if (groupCreateSpan.isDeleting()) {
                this.currentDeletingSpan = null;
                this.spansContainer.removeSpan(groupCreateSpan);
                hashSet.remove(Long.valueOf(groupCreateSpan.getUid()));
                runnable.run();
                return;
            }
            GroupCreateSpan groupCreateSpan2 = this.currentDeletingSpan;
            if (groupCreateSpan2 != null) {
                groupCreateSpan2.cancelDeleteAnimation();
                this.currentDeletingSpan = null;
            }
            this.currentDeletingSpan = groupCreateSpan;
            groupCreateSpan.startDeleteAnimation();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), Integer.MIN_VALUE));
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (this.ignoreScrollEvent) {
            this.ignoreScrollEvent = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(20.0f, this.fieldY, rect.top);
        rect.bottom = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(50.0f, this.fieldY, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    public void scrollToBottom() {
        this.scroll = true;
    }

    public void setContainerHeight(float f) {
        this.containerHeight = f;
        SpansContainer spansContainer = this.spansContainer;
        if (spansContainer != null) {
            spansContainer.requestLayout();
        }
    }

    public void setHintText(String str, boolean z) {
        this.editText.setHintText(str, z);
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.onSearchTextChange = callback;
    }

    public void setText(CharSequence charSequence) {
        this.ignoreTextChange = true;
        this.editText.setText(charSequence);
        this.ignoreTextChange = false;
    }

    public void updateSpans(boolean z, final HashSet<Long> hashSet, final Runnable runnable, List<TLRPC.TL_help_country> list) {
        int i;
        Property property;
        Property property2;
        Property property3;
        Iterator<Long> it;
        Object obj;
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < this.allSpans.size(); i2++) {
            GroupCreateSpan groupCreateSpan = this.allSpans.get(i2);
            if (!hashSet.contains(Long.valueOf(groupCreateSpan.getUid()))) {
                arrayList.add(groupCreateSpan);
            }
        }
        Iterator<Long> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            Long next = it2.next();
            long jLongValue = next.longValue();
            int i3 = 0;
            while (true) {
                if (i3 >= this.allSpans.size()) {
                    Object user = jLongValue >= 0 ? messagesController.getUser(next) : messagesController.getChat(Long.valueOf(-jLongValue));
                    if (list == null) {
                        it = it2;
                        obj = user;
                        break;
                    }
                    Iterator<TLRPC.TL_help_country> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            it = it2;
                            obj = user;
                            break;
                        }
                        TLRPC.TL_help_country next2 = it3.next();
                        it = it2;
                        if (next2.default_name.hashCode() == jLongValue) {
                            obj = next2;
                            break;
                        }
                        it2 = it;
                    }
                    if (obj != null) {
                        GroupCreateSpan groupCreateSpan2 = new GroupCreateSpan(getContext(), obj, null, true, this.resourcesProvider);
                        groupCreateSpan2.setOnClickListener(new GiftOfferSheet$$ExternalSyntheticLambda2(this, hashSet, runnable, 4));
                        arrayList2.add(groupCreateSpan2);
                    }
                    it2 = it;
                    break;
                }
                if (this.allSpans.get(i3).getUid() == jLongValue) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            SpansContainer spansContainer = this.spansContainer;
            SelectorSearchCell selectorSearchCell = SelectorSearchCell.this;
            selectorSearchCell.ignoreScrollEvent = true;
            selectorSearchCell.allSpans.removeAll(arrayList);
            selectorSearchCell.allSpans.addAll(arrayList2);
            ArrayList arrayList3 = spansContainer.removingSpans;
            arrayList3.clear();
            arrayList3.addAll(arrayList);
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                ((GroupCreateSpan) arrayList.get(i4)).setOnClickListener(null);
            }
            spansContainer.setupEndValues();
            if (z) {
                spansContainer.animationStarted = false;
                AnimatorSet animatorSet = new AnimatorSet();
                spansContainer.currentAnimation = animatorSet;
                animatorSet.addListener(new SpansContainer.AnonymousClass2(spansContainer, arrayList, 0));
                ArrayList arrayList4 = spansContainer.animators;
                arrayList4.clear();
                ArrayList arrayList5 = spansContainer.animAddingSpans;
                arrayList5.clear();
                ArrayList arrayList6 = spansContainer.animRemovingSpans;
                arrayList6.clear();
                int i5 = 0;
                while (true) {
                    int size = arrayList.size();
                    property = View.ALPHA;
                    property2 = View.SCALE_Y;
                    property3 = View.SCALE_X;
                    if (i5 >= size) {
                        break;
                    }
                    GroupCreateSpan groupCreateSpan3 = (GroupCreateSpan) arrayList.get(i5);
                    arrayList6.add(groupCreateSpan3);
                    arrayList4.add(ObjectAnimator.ofFloat(groupCreateSpan3, (Property<GroupCreateSpan, Float>) property3, 1.0f, 0.01f));
                    arrayList4.add(ObjectAnimator.ofFloat(groupCreateSpan3, (Property<GroupCreateSpan, Float>) property2, 1.0f, 0.01f));
                    arrayList4.add(ObjectAnimator.ofFloat(groupCreateSpan3, (Property<GroupCreateSpan, Float>) property, 1.0f, 0.0f));
                    i5++;
                }
                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                    GroupCreateSpan groupCreateSpan4 = (GroupCreateSpan) arrayList2.get(i6);
                    arrayList5.add(groupCreateSpan4);
                    arrayList4.add(ObjectAnimator.ofFloat(groupCreateSpan4, (Property<GroupCreateSpan, Float>) property3, 0.01f, 1.0f));
                    arrayList4.add(ObjectAnimator.ofFloat(groupCreateSpan4, (Property<GroupCreateSpan, Float>) property2, 0.01f, 1.0f));
                    arrayList4.add(ObjectAnimator.ofFloat(groupCreateSpan4, (Property<GroupCreateSpan, Float>) property, 0.0f, 1.0f));
                }
                i = 1;
            } else {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    spansContainer.removeView((View) arrayList.get(i7));
                }
                arrayList3.clear();
                spansContainer.currentAnimation = null;
                spansContainer.animationStarted = false;
                i = 1;
                selectorSearchCell.editText.setAllowDrawCursor(true);
            }
            for (int i8 = 0; i8 < arrayList2.size(); i8 += i) {
                spansContainer.addView((View) arrayList2.get(i8));
            }
            spansContainer.requestLayout();
        }
        this.editText.setOnKeyListener(new View.OnKeyListener() {
            public boolean wasEmpty;

            @Override
            public final boolean onKey(View view, int i9, KeyEvent keyEvent) {
                if (i9 == 67) {
                    int action = keyEvent.getAction();
                    SelectorSearchCell selectorSearchCell2 = SelectorSearchCell.this;
                    if (action == 0) {
                        this.wasEmpty = selectorSearchCell2.editText.length() == 0;
                    } else if (keyEvent.getAction() == 1 && this.wasEmpty && !selectorSearchCell2.allSpans.isEmpty()) {
                        SelectorSearchCell.access$400(selectorSearchCell2, (GroupCreateSpan) zzin.m(1, selectorSearchCell2.allSpans), hashSet, runnable);
                        return true;
                    }
                }
                return false;
            }
        });
    }
}
