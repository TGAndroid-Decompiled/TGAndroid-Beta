package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarMenuSlider;
import org.telegram.ui.ActionBar.BottomSheetTabsOverlay;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SeekBarView;

public final class SlideIntChooseView extends FrameLayout {
    public CharSequence label;
    public final AnimatedTextView maxText;
    public float maxTextEmojiSaturation;
    public ValueAnimator maxTextEmojiSaturationAnimator;
    public final AnimatedTextView minText;
    public int minValueAllowed;
    public Options options;
    public final Theme.ResourcesProvider resourcesProvider;
    public final MaxFileSizeCell.AnonymousClass1 seekBarView;
    public float toMaxTextEmojiSaturation;
    public int value;
    public final AnimatedTextView valueText;
    public Utilities.Callback whenChanged;

    public final class AnonymousClass3 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final Object this$0;
        public final float val$value;

        public AnonymousClass3(Object obj, float f, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$value = f;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    ColorMatrix colorMatrix = new ColorMatrix();
                    SlideIntChooseView slideIntChooseView = (SlideIntChooseView) this.this$0;
                    float f = this.val$value;
                    slideIntChooseView.maxTextEmojiSaturation = f;
                    colorMatrix.setSaturation(f);
                    if (Theme.currentTheme.isDark()) {
                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - slideIntChooseView.maxTextEmojiSaturation) * (-0.3f));
                    }
                    slideIntChooseView.maxText.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    break;
                case 1:
                    ActionBarMenuSlider actionBarMenuSlider = (ActionBarMenuSlider) this.this$0;
                    actionBarMenuSlider.valueAnimator = null;
                    actionBarMenuSlider.value = this.val$value;
                    actionBarMenuSlider.invalidate();
                    break;
                case 2:
                    float f2 = this.val$value;
                    BottomSheetTabsOverlay.TabPreview tabPreview = (BottomSheetTabsOverlay.TabPreview) this.this$0;
                    tabPreview.dismissProgress = f2;
                    BottomSheetTabsOverlay bottomSheetTabsOverlay = tabPreview.parentView;
                    if (bottomSheetTabsOverlay != null) {
                        bottomSheetTabsOverlay.invalidate();
                    }
                    break;
                default:
                    float f3 = this.val$value;
                    ReactedUserHolderView reactedUserHolderView = (ReactedUserHolderView) this.this$0;
                    reactedUserHolderView.alphaInternal = f3;
                    reactedUserHolderView.invalidate();
                    break;
            }
        }
    }

    public final class Options {
        public int max;
        public int min;
        public Utilities.Callback2Return toString;
        public int[] steps = null;
        public int betweenSteps = 1;

        public final int getMax() {
            int[] iArr = this.steps;
            return iArr != null ? iArr[iArr.length - 1] : this.max;
        }

        public final int getMin() {
            int[] iArr = this.steps;
            return iArr != null ? iArr[0] : this.min;
        }
    }

    public SlideIntChooseView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.minValueAllowed = Integer.MIN_VALUE;
        this.toMaxTextEmojiSaturation = -1.0f;
        this.resourcesProvider = resourcesProvider;
        AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, true);
        this.minText = animatedTextView;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        animatedTextView.setAnimationProperties(0.3f, 0L, 220L, cubicBezierInterpolator);
        animatedTextView.setTextSize(AndroidUtilities.dp(13.0f));
        int i = Theme.key_windowBackgroundWhiteGrayText;
        animatedTextView.setTextColor(Theme.getColor(i, resourcesProvider));
        animatedTextView.setGravity(3);
        animatedTextView.setEmojiCacheType(19);
        animatedTextView.setEmojiColor(-1);
        animatedTextView.setImportantForAccessibility(2);
        addView(animatedTextView, LayoutHelper.createFrame(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        AnimatedTextView animatedTextView2 = new AnimatedTextView(context, false, true, true);
        this.valueText = animatedTextView2;
        animatedTextView2.setAnimationProperties(0.3f, 0L, 220L, cubicBezierInterpolator);
        animatedTextView2.setTextSize(AndroidUtilities.dp(13.0f));
        animatedTextView2.setGravity(17);
        animatedTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteValueText, resourcesProvider));
        animatedTextView2.setEmojiColor(-1);
        animatedTextView2.setEmojiCacheType(19);
        animatedTextView2.setImportantForAccessibility(2);
        addView(animatedTextView2, LayoutHelper.createFrame(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        AnimatedTextView animatedTextView3 = new AnimatedTextView(context, true, true, true);
        this.maxText = animatedTextView3;
        animatedTextView3.setAnimationProperties(0.3f, 0L, 220L, cubicBezierInterpolator);
        animatedTextView3.setTextSize(AndroidUtilities.dp(13.0f));
        animatedTextView3.setGravity(5);
        animatedTextView3.setTextColor(Theme.getColor(i, resourcesProvider));
        animatedTextView3.setEmojiColor(-1);
        animatedTextView3.setEmojiCacheType(19);
        animatedTextView3.setImportantForAccessibility(2);
        addView(animatedTextView3, LayoutHelper.createFrame(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        MaxFileSizeCell.AnonymousClass1 anonymousClass1 = new MaxFileSizeCell.AnonymousClass1(context, resourcesProvider);
        this.seekBarView = anonymousClass1;
        anonymousClass1.setReportChanges(true);
        anonymousClass1.setDelegate(new SeekBarView.SeekBarViewDelegate() {
            @Override
            public final CharSequence getContentDescription() {
                Utilities.Callback2Return callback2Return;
                SlideIntChooseView slideIntChooseView = SlideIntChooseView.this;
                slideIntChooseView.getClass();
                try {
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(slideIntChooseView.label)) {
                        sb.append(slideIntChooseView.label);
                    }
                    Options options = slideIntChooseView.options;
                    if (options != null && (callback2Return = options.toString) != null) {
                        CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(slideIntChooseView.value));
                        if (!TextUtils.isEmpty(charSequence)) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(charSequence);
                        }
                        CharSequence charSequence2 = (CharSequence) slideIntChooseView.options.toString.run(-1, Integer.valueOf(slideIntChooseView.options.getMin()));
                        CharSequence charSequence3 = (CharSequence) slideIntChooseView.options.toString.run(1, Integer.valueOf(slideIntChooseView.options.getMax()));
                        if (!TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(charSequence3)) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(charSequence2);
                            sb.append(" – ");
                            sb.append(charSequence3);
                        }
                    }
                    if (sb.length() > 0) {
                        return sb.toString();
                    }
                    return null;
                } catch (Throwable th) {
                    FileLog.e(th);
                    return slideIntChooseView.label;
                }
            }

            @Override
            public final int getStepsCount() {
                Options options = SlideIntChooseView.this.options;
                if (options == null) {
                    return 0;
                }
                int[] iArr = options.steps;
                return iArr != null ? (iArr.length - 1) * options.betweenSteps : options.getMax() - options.getMin();
            }

            @Override
            public final boolean needVisuallyDivideSteps() {
                return false;
            }

            @Override
            public final void onSeekBarDrag(boolean z, float f) {
                int iRound;
                int i2;
                SlideIntChooseView slideIntChooseView = SlideIntChooseView.this;
                Options options = slideIntChooseView.options;
                if (options == null || slideIntChooseView.whenChanged == null) {
                    return;
                }
                int[] iArr = options.steps;
                if (iArr != null) {
                    double length = f * (iArr.length - 1);
                    int iClamp = Utilities.clamp((int) Math.floor(length), slideIntChooseView.options.steps.length - 1, 0);
                    int iClamp2 = Utilities.clamp((int) Math.ceil(length), slideIntChooseView.options.steps.length - 1, 0);
                    int[] iArr2 = slideIntChooseView.options.steps;
                    iRound = Math.round(AndroidUtilities.lerp(iArr2[iClamp], iArr2[iClamp2], Math.round(((float) (length - Math.floor(length))) * slideIntChooseView.options.betweenSteps) / slideIntChooseView.options.betweenSteps));
                } else {
                    iRound = Math.round(((slideIntChooseView.options.getMax() - slideIntChooseView.options.getMin()) * f) + options.getMin());
                }
                int i3 = slideIntChooseView.minValueAllowed;
                if (i3 != Integer.MIN_VALUE) {
                    iRound = Math.max(iRound, i3);
                }
                int i4 = slideIntChooseView.value;
                if (i4 != iRound) {
                    if (slideIntChooseView.options.steps != null) {
                        int i5 = 1;
                        while (true) {
                            int[] iArr3 = slideIntChooseView.options.steps;
                            if (i5 >= iArr3.length) {
                                break;
                            }
                            int i6 = i5 - 1;
                            int i7 = iArr3[i6];
                            int i8 = iArr3[i5];
                            if (i4 >= i7 && i4 <= i8) {
                                i4 = i6;
                                break;
                            }
                            i5++;
                        }
                    }
                    if (slideIntChooseView.options.steps == null) {
                        i2 = iRound;
                        break;
                    }
                    int i9 = 1;
                    while (true) {
                        int[] iArr4 = slideIntChooseView.options.steps;
                        if (i9 >= iArr4.length) {
                            i2 = iRound;
                            break;
                        }
                        i2 = i9 - 1;
                        int i10 = iArr4[i2];
                        int i11 = iArr4[i9];
                        if (iRound >= i10 && iRound <= i11) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    if (i4 != i2) {
                        AndroidUtilities.vibrateCursor(slideIntChooseView.seekBarView);
                    }
                    slideIntChooseView.value = iRound;
                    slideIntChooseView.updateTexts(iRound, true);
                    Utilities.Callback callback = slideIntChooseView.whenChanged;
                    if (callback != null) {
                        callback.run(Integer.valueOf(slideIntChooseView.value));
                    }
                }
            }

            @Override
            public final void onSeekBarPressed(boolean z) {
                SeekBarView.SeekBarViewDelegate.CC.$default$onSeekBarPressed(this, z);
            }
        });
        addView(anonymousClass1, LayoutHelper.createFrame(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
    }

    public static int[] cut(int i, int[] iArr) {
        boolean z = false;
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 <= i) {
                i2++;
                if (i3 == i) {
                    z = true;
                }
            }
        }
        if (!z) {
            i2++;
        }
        if (i2 == iArr.length) {
            return iArr;
        }
        int[] iArr2 = new int[i2];
        int i4 = 0;
        for (int i5 : iArr) {
            if (i5 <= i) {
                iArr2[i4] = i5;
                i4++;
            }
        }
        if (!z) {
            iArr2[i4] = i;
        }
        return iArr2;
    }

    public final float getProgress(int i) {
        if (this.options.steps != null) {
            int i2 = 1;
            while (true) {
                Options options = this.options;
                int[] iArr = options.steps;
                if (i2 >= iArr.length) {
                    break;
                }
                int i3 = i2 - 1;
                int i4 = iArr[i3];
                int i5 = iArr[i2];
                if (i >= i4 && i <= i5) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i - i4) / (i5 - i4)) * options.betweenSteps) / this.options.betweenSteps) + i3);
                }
                i2++;
            }
        }
        return Utilities.clamp01((i - this.options.getMin()) / (this.options.getMax() - this.options.getMin()));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(75.0f), 1073741824));
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, 0, AndroidUtilities.dp(80.0f), getMeasuredHeight()), new Rect(getMeasuredWidth() - AndroidUtilities.dp(80.0f), 0, getMeasuredWidth(), getMeasuredHeight())));
        }
    }

    public final void set(int i, Options options, Utilities.Callback callback) {
        this.value = i;
        this.options = options;
        this.whenChanged = callback;
        this.seekBarView.setProgress(getProgress(i), false);
        updateTexts(i, false);
    }

    public void setLabel(CharSequence charSequence) {
        this.label = charSequence;
    }

    public void setMinValueAllowed(int i) {
        this.minValueAllowed = i;
        if (this.value < i) {
            this.value = i;
        }
        if (this.options == null) {
            return;
        }
        this.seekBarView.setMinProgress(getProgress(i));
        updateTexts(this.value, false);
        invalidate();
    }

    public final void updateTexts(int i, boolean z) {
        int i2 = 0;
        Options options = this.options;
        if (options == null || options.toString == null) {
            return;
        }
        AnimatedTextView animatedTextView = this.minText;
        animatedTextView.cancelAnimation();
        AnimatedTextView animatedTextView2 = this.maxText;
        animatedTextView2.cancelAnimation();
        AnimatedTextView animatedTextView3 = this.valueText;
        animatedTextView3.cancelAnimation();
        animatedTextView3.setText((CharSequence) this.options.toString.run(0, Integer.valueOf(i)), z);
        animatedTextView.setText((CharSequence) this.options.toString.run(-1, Integer.valueOf(this.options.getMin())), z);
        animatedTextView2.setText((CharSequence) this.options.toString.run(1, Integer.valueOf(this.options.getMax())), z);
        animatedTextView2.setTextColor(Theme.getColor(i >= this.options.getMax() ? Theme.key_windowBackgroundWhiteValueText : Theme.key_windowBackgroundWhiteGrayText, this.resourcesProvider), z);
        float f = i >= this.options.getMax() ? 1.0f : 0.0f;
        if (Math.abs(this.toMaxTextEmojiSaturation - f) < 0.01f) {
            return;
        }
        ValueAnimator valueAnimator = this.maxTextEmojiSaturationAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.maxTextEmojiSaturationAnimator = null;
        }
        this.toMaxTextEmojiSaturation = f;
        if (z) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.maxTextEmojiSaturation, f);
            this.maxTextEmojiSaturationAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 7));
            this.maxTextEmojiSaturationAnimator.addListener(new AnonymousClass3(this, f, i2));
            this.maxTextEmojiSaturationAnimator.setDuration(240L);
            this.maxTextEmojiSaturationAnimator.start();
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        this.maxTextEmojiSaturation = f;
        colorMatrix.setSaturation(f);
        if (Theme.currentTheme.isDark()) {
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - this.maxTextEmojiSaturation) * (-0.3f));
        }
        animatedTextView2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }
}
