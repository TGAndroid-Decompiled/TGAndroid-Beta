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
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SeekBarView;

public class SlideIntChooseView extends FrameLayout {
    private CharSequence label;
    private final AnimatedTextView maxText;
    private float maxTextEmojiSaturation;
    private ValueAnimator maxTextEmojiSaturationAnimator;
    private final AnimatedTextView minText;
    private int minValueAllowed;
    private Options options;
    private final Theme.ResourcesProvider resourcesProvider;
    private final SeekBarView seekBarView;
    private float toMaxTextEmojiSaturation;
    private int value;
    private final AnimatedTextView valueText;
    private Utilities.Callback whenChanged;

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
        SeekBarView seekBarView = new SeekBarView(context, resourcesProvider) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.seekBarView = seekBarView;
        seekBarView.setReportChanges(true);
        seekBarView.setDelegate(new SeekBarView.SeekBarViewDelegate() {
            @Override
            public boolean needVisuallyDivideSteps() {
                return false;
            }

            @Override
            public void onSeekBarPressed(boolean z) {
                SeekBarView.SeekBarViewDelegate.CC.$default$onSeekBarPressed(this, z);
            }

            @Override
            public void onSeekBarDrag(boolean z, float f) {
                if (SlideIntChooseView.this.options == null || SlideIntChooseView.this.whenChanged == null) {
                    return;
                }
                int value = SlideIntChooseView.this.getValue(f);
                if (SlideIntChooseView.this.minValueAllowed != Integer.MIN_VALUE) {
                    value = Math.max(value, SlideIntChooseView.this.minValueAllowed);
                }
                if (SlideIntChooseView.this.value != value) {
                    SlideIntChooseView slideIntChooseView = SlideIntChooseView.this;
                    if (slideIntChooseView.getStep(slideIntChooseView.value) != SlideIntChooseView.this.getStep(value)) {
                        AndroidUtilities.vibrateCursor(SlideIntChooseView.this.seekBarView);
                    }
                    SlideIntChooseView.this.value = value;
                    SlideIntChooseView slideIntChooseView2 = SlideIntChooseView.this;
                    slideIntChooseView2.updateTexts(slideIntChooseView2.value, true);
                    if (SlideIntChooseView.this.whenChanged != null) {
                        SlideIntChooseView.this.whenChanged.run(Integer.valueOf(SlideIntChooseView.this.value));
                    }
                }
            }

            @Override
            public int getStepsCount() {
                if (SlideIntChooseView.this.options == null) {
                    return 0;
                }
                return SlideIntChooseView.this.options.getStepsCount();
            }

            @Override
            public CharSequence getContentDescription() {
                return SlideIntChooseView.this.buildAccessibilityDescription();
            }
        });
        addView(seekBarView, LayoutHelper.createFrame(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
    }

    public void setLabel(CharSequence charSequence) {
        this.label = charSequence;
    }

    public CharSequence buildAccessibilityDescription() {
        Utilities.Callback2Return callback2Return;
        try {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.label)) {
                sb.append(this.label);
            }
            Options options = this.options;
            if (options != null && (callback2Return = options.toString) != null) {
                CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(this.value));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) this.options.toString.run(-1, Integer.valueOf(this.options.getMin()));
                CharSequence charSequence3 = (CharSequence) this.options.toString.run(1, Integer.valueOf(this.options.getMax()));
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
            return this.label;
        }
    }

    public void set(int i, Options options, Utilities.Callback callback) {
        this.value = i;
        this.options = options;
        this.whenChanged = callback;
        this.seekBarView.setProgress(getProgress(i), false);
        updateTexts(i, false);
    }

    public float getProgress(int i) {
        if (this.options.steps != null) {
            int i2 = 1;
            while (true) {
                int[] iArr = this.options.steps;
                if (i2 >= iArr.length) {
                    break;
                }
                int i3 = iArr[i2 - 1];
                int i4 = iArr[i2];
                if (i >= i3 && i <= i4) {
                    return (1.0f / (iArr.length - 1)) * (r4 + (Math.round(((i - i3) / (i4 - i3)) * r2.betweenSteps) / this.options.betweenSteps));
                }
                i2++;
            }
        }
        return Utilities.clamp01((i - this.options.getMin()) / (this.options.getMax() - this.options.getMin()));
    }

    public int getValue(float f) {
        if (this.options.steps != null) {
            double length = f * (r1.length - 1);
            int iClamp = Utilities.clamp((int) Math.floor(length), this.options.steps.length - 1, 0);
            int iClamp2 = Utilities.clamp((int) Math.ceil(length), this.options.steps.length - 1, 0);
            int[] iArr = this.options.steps;
            return Math.round(AndroidUtilities.lerp(iArr[iClamp], iArr[iClamp2], Math.round(((float) (length - Math.floor(length))) * this.options.betweenSteps) / this.options.betweenSteps));
        }
        return Math.round(r0.getMin() + ((this.options.getMax() - this.options.getMin()) * f));
    }

    public int getStep(int i) {
        if (this.options.steps != null) {
            int i2 = 1;
            while (true) {
                int[] iArr = this.options.steps;
                if (i2 >= iArr.length) {
                    break;
                }
                int i3 = i2 - 1;
                int i4 = iArr[i3];
                int i5 = iArr[i2];
                if (i >= i4 && i <= i5) {
                    return i3;
                }
                i2++;
            }
        }
        return i;
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

    public void updateTexts(int i, boolean z) {
        Options options = this.options;
        if (options == null || options.toString == null) {
            return;
        }
        this.minText.cancelAnimation();
        this.maxText.cancelAnimation();
        this.valueText.cancelAnimation();
        this.valueText.setText((CharSequence) this.options.toString.run(0, Integer.valueOf(i)), z);
        this.minText.setText((CharSequence) this.options.toString.run(-1, Integer.valueOf(this.options.getMin())), z);
        this.maxText.setText((CharSequence) this.options.toString.run(1, Integer.valueOf(this.options.getMax())), z);
        this.maxText.setTextColor(Theme.getColor(i >= this.options.getMax() ? Theme.key_windowBackgroundWhiteValueText : Theme.key_windowBackgroundWhiteGrayText, this.resourcesProvider), z);
        setMaxTextEmojiSaturation(i >= this.options.getMax() ? 1.0f : 0.0f, z);
    }

    private void setMaxTextEmojiSaturation(final float f, boolean z) {
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
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$setMaxTextEmojiSaturation$0(valueAnimator2);
                }
            });
            this.maxTextEmojiSaturationAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(SlideIntChooseView.this.maxTextEmojiSaturation = f);
                    if (Theme.isCurrentThemeDark()) {
                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - SlideIntChooseView.this.maxTextEmojiSaturation) * (-0.3f));
                    }
                    SlideIntChooseView.this.maxText.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            });
            this.maxTextEmojiSaturationAnimator.setDuration(240L);
            this.maxTextEmojiSaturationAnimator.start();
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        this.maxTextEmojiSaturation = f;
        colorMatrix.setSaturation(f);
        if (Theme.isCurrentThemeDark()) {
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - this.maxTextEmojiSaturation) * (-0.3f));
        }
        this.maxText.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    public void lambda$setMaxTextEmojiSaturation$0(ValueAnimator valueAnimator) {
        ColorMatrix colorMatrix = new ColorMatrix();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.maxTextEmojiSaturation = fFloatValue;
        colorMatrix.setSaturation(fFloatValue);
        if (Theme.isCurrentThemeDark()) {
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - this.maxTextEmojiSaturation) * (-0.3f));
        }
        this.maxText.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(75.0f), 1073741824));
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, 0, AndroidUtilities.dp(80.0f), getMeasuredHeight()), new Rect(getMeasuredWidth() - AndroidUtilities.dp(80.0f), 0, getMeasuredWidth(), getMeasuredHeight())));
        }
    }

    public static int[] cut(int[] iArr, int i) {
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

    public static class Options {
        private int max;
        private int min;
        public int style;
        public Utilities.Callback2Return toString;
        public int[] steps = null;
        public int betweenSteps = 1;

        public static Options make(int i, int i2, int i3, final Utilities.CallbackReturn callbackReturn) {
            Options options = new Options();
            options.style = i;
            options.min = i2;
            options.max = i3;
            options.toString = new Utilities.Callback2Return() {
                @Override
                public final Object run(Object obj, Object obj2) {
                    return SlideIntChooseView.Options.lambda$make$0(callbackReturn, (Integer) obj, (Integer) obj2);
                }
            };
            return options;
        }

        public static CharSequence lambda$make$0(Utilities.CallbackReturn callbackReturn, Integer num, Integer num2) {
            return (CharSequence) callbackReturn.run(num2);
        }

        public static Options make(int i, int[] iArr, int i2, Utilities.Callback2Return callback2Return) {
            Options options = new Options();
            options.style = i;
            options.steps = iArr;
            options.betweenSteps = i2;
            options.toString = callback2Return;
            return options;
        }

        public static Options make(int i, final String str, int i2, int i3) {
            Options options = new Options();
            options.style = i;
            options.min = i2;
            options.max = i3;
            options.toString = new Utilities.Callback2Return() {
                @Override
                public final Object run(Object obj, Object obj2) {
                    return SlideIntChooseView.Options.lambda$make$1(str, (Integer) obj, (Integer) obj2);
                }
            };
            return options;
        }

        public static CharSequence lambda$make$1(String str, Integer num, Integer num2) {
            if (num.intValue() == 0) {
                return LocaleController.formatPluralString(str, num2.intValue(), new Object[0]);
            }
            return "" + num2;
        }

        public int getMin() {
            int[] iArr = this.steps;
            return iArr != null ? iArr[0] : this.min;
        }

        public int getMax() {
            int[] iArr = this.steps;
            return iArr != null ? iArr[iArr.length - 1] : this.max;
        }

        public int getStepsCount() {
            if (this.steps != null) {
                return (r0.length - 1) * this.betweenSteps;
            }
            return getMax() - getMin();
        }
    }
}
