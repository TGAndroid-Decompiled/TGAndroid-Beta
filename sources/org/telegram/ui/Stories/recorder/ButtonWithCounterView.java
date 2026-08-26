package org.telegram.ui.Stories.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.audio.AacUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChannelMonetizationLayout;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Loadable;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.TodoItemMenu;

public class ButtonWithCounterView extends FrameLayout implements Loadable {
    public int backgroundColor;
    public float countAlpha;
    public final AnimatedFloat countAlphaAnimated;
    public ValueAnimator countAnimator;
    public boolean countFilled;
    public float countScale;
    public final AnimatedTextView.AnimatedTextDrawable countText;
    public Drawable counterDrawable;
    public boolean customBackgroundColor;
    public boolean enabled;
    public ValueAnimator enabledAnimator;
    public float enabledT;
    public boolean filled;
    public boolean flickeringLoading;
    public LoadingDrawable flickeringLoadingDrawable;
    public int globalAlpha;
    public int lastCount;
    public int lastWrapWidth;
    public boolean loading;
    public ValueAnimator loadingAnimator;
    public CircularProgressDrawable loadingDrawable;
    public float loadingT;
    public int minWidth;
    public boolean neutral;
    public final Paint paint;
    public int radiusDp;
    public Theme.ResourcesProvider resourcesProvider;
    public final View rippleView;
    public boolean showZero;
    public final AnimatedTextView.AnimatedTextDrawable subText;
    public float subTextT;
    public boolean subTextVisible;
    public ValueAnimator subTextVisibleAnimator;
    public final AnimatedTextView.AnimatedTextDrawable text;
    public ButtonWithCounterView$$ExternalSyntheticLambda3 tick;
    public int timerSeconds;
    public boolean useWrapContent;
    public boolean withCounterIcon;
    public boolean wrapContentDynamic;
    public boolean wrapWidth;

    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final ButtonWithCounterView this$0;

        public AnonymousClass1(ButtonWithCounterView buttonWithCounterView, int i) {
            this.$r8$classId = i;
            this.this$0 = buttonWithCounterView;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    ButtonWithCounterView buttonWithCounterView = this.this$0;
                    buttonWithCounterView.subTextVisible = false;
                    buttonWithCounterView.subText.setText(null, false, true);
                    break;
                default:
                    ButtonWithCounterView buttonWithCounterView2 = this.this$0;
                    buttonWithCounterView2.countScale = 1.0f;
                    buttonWithCounterView2.invalidate();
                    break;
            }
        }
    }

    public ButtonWithCounterView(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, resourcesProvider, true);
    }

    private int getWrapWidth() {
        return getPaddingRight() + getPaddingLeft() + ((int) (calculateCounterWidth(this.countText.getCurrentWidth() + AndroidUtilities.dp(15.66f), this.countAlphaAnimated.set(this.countAlpha, false)) + this.text.getCurrentWidth() + (this.withCounterIcon ? AndroidUtilities.dp(12.0f) : 0.0f)));
    }

    public float calculateCounterWidth(float f, float f2) {
        return f * f2;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return false;
    }

    public TextPaint getTextPaint() {
        return this.text.textPaint;
    }

    @Override
    public final boolean isEnabled() {
        return this.enabled;
    }

    @Override
    public final boolean isLoading() {
        return this.loading;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int wrapWidth;
        boolean z;
        float f;
        this.rippleView.draw(canvas);
        if (this.flickeringLoading) {
            if (this.loading) {
                if (this.flickeringLoadingDrawable == null) {
                    Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                    LoadingDrawable loadingDrawable = new LoadingDrawable();
                    loadingDrawable.resourcesProvider = resourcesProvider;
                    this.flickeringLoadingDrawable = loadingDrawable;
                    loadingDrawable.setCallback(this);
                    LoadingDrawable loadingDrawable2 = this.flickeringLoadingDrawable;
                    loadingDrawable2.gradientWidthScale = 2.0f;
                    loadingDrawable2.appearByGradient = true;
                    loadingDrawable2.strokePaint.setStrokeWidth(0.0f);
                    this.flickeringLoadingDrawable.setColors(Theme.multAlpha(0.02f, -1), Theme.multAlpha(0.375f, -1));
                }
                LoadingDrawable loadingDrawable3 = this.flickeringLoadingDrawable;
                loadingDrawable3.disappearStart = -1L;
                loadingDrawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                LoadingDrawable loadingDrawable4 = this.flickeringLoadingDrawable;
                float f2 = this.radiusDp;
                loadingDrawable4.getClass();
                loadingDrawable4.setRadii(AndroidUtilities.dp(f2));
                this.flickeringLoadingDrawable.draw(canvas);
            } else {
                LoadingDrawable loadingDrawable5 = this.flickeringLoadingDrawable;
                if (loadingDrawable5 != null) {
                    loadingDrawable5.disappear();
                    this.flickeringLoadingDrawable.draw(canvas);
                    if (this.flickeringLoadingDrawable.isDisappeared()) {
                        this.flickeringLoadingDrawable.start = -1L;
                    }
                }
            }
        }
        float f3 = this.loadingT;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.text;
        if (f3 > 0.0f) {
            if (this.loadingDrawable == null) {
                this.loadingDrawable = new CircularProgressDrawable(animatedTextDrawable.textPaint.getColor());
            }
            int iDp = (int) ((1.0f - this.loadingT) * AndroidUtilities.dp(24.0f));
            this.loadingDrawable.setBounds(0, iDp, getWidth(), getHeight() + iDp);
            this.loadingDrawable.paint.setAlpha((int) (this.loadingT * 255.0f));
            this.loadingDrawable.draw(canvas);
            invalidate();
        }
        float f4 = this.loadingT;
        if (f4 < 1.0f) {
            if (f4 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.loadingT * AndroidUtilities.dp(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.loadingT * 0.4f));
                z = true;
            } else {
                z = false;
            }
            float currentWidth = animatedTextDrawable.getCurrentWidth();
            float f5 = this.countAlphaAnimated.set(this.countAlpha, false);
            float fDp = this.withCounterIcon ? AndroidUtilities.dp(12.0f) : 0.0f;
            float fDp2 = AndroidUtilities.dp(15.66f);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.countText;
            float fCalculateCounterWidth = calculateCounterWidth(animatedTextDrawable2.getCurrentWidth() + fDp2, f5) + currentWidth + fDp;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - fCalculateCounterWidth) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - animatedTextDrawable.currentHeight) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) AacUtil.m(getMeasuredWidth() - fCalculateCounterWidth, getWidth(), 2.0f, currentWidth), (int) (((getMeasuredHeight() + animatedTextDrawable.currentHeight) / 2.0f) - AndroidUtilities.dp(1.0f)));
            rect.offset(0, (int) ((-AndroidUtilities.dp(7.0f)) * this.subTextT));
            animatedTextDrawable.alpha = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.enabledT) * (1.0f - this.loadingT) * this.globalAlpha);
            animatedTextDrawable.setBounds(rect);
            animatedTextDrawable.draw(canvas);
            if (this.subTextVisible) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable3 = this.subText;
                fCalculateCounterWidth = animatedTextDrawable3.getCurrentWidth();
                rect.set((int) (((getMeasuredWidth() - fCalculateCounterWidth) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - animatedTextDrawable3.currentHeight) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) AacUtil.m(getMeasuredWidth() - fCalculateCounterWidth, getWidth(), 2.0f, fCalculateCounterWidth), (int) (((getMeasuredHeight() + animatedTextDrawable3.currentHeight) / 2.0f) - AndroidUtilities.dp(1.0f)));
                rect.offset(0, AndroidUtilities.dp(11.0f));
                canvas.save();
                float fLerp = AndroidUtilities.lerp(0.1f, 1.0f, this.subTextT);
                canvas.scale(fLerp, fLerp, rect.centerX(), rect.bottom);
                animatedTextDrawable3.alpha = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.enabledT) * (1.0f - this.loadingT) * 200.0f * this.subTextT);
                animatedTextDrawable3.setBounds(rect);
                animatedTextDrawable3.draw(canvas);
                canvas.restore();
            }
            rect.set((int) (ImageReceiver$$ExternalSyntheticOutline0.m(getMeasuredWidth(), fCalculateCounterWidth, 2.0f, currentWidth) + AndroidUtilities.dp(this.countFilled ? 5.0f : 2.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), animatedTextDrawable2.getCurrentWidth() + fDp) + ImageReceiver$$ExternalSyntheticOutline0.m(getMeasuredWidth(), fCalculateCounterWidth, 2.0f, currentWidth) + AndroidUtilities.dp((this.countFilled ? 5 : 2) + 8)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.countScale != 1.0f) {
                canvas.save();
                float f6 = this.countScale;
                canvas.scale(f6, f6, rect.centerX(), rect.centerY());
            }
            if (this.countFilled) {
                Paint paint = this.paint;
                f = 0.5f;
                paint.setAlpha((int) (AndroidUtilities.lerp(0.5f, 1.0f, this.enabledT) * (1.0f - this.loadingT) * this.globalAlpha * f5 * f5));
                float fDp3 = AndroidUtilities.dp(this.withCounterIcon ? 4.0f : 10.0f);
                canvas.drawRoundRect(rectF, fDp3, fDp3, paint);
            } else {
                f = 0.5f;
            }
            CharSequence charSequence = animatedTextDrawable2.currentText;
            rect.offset(-AndroidUtilities.dp((charSequence != null ? charSequence.length() : 0) > 1 ? 0.3f : 0.0f), -AndroidUtilities.dp(0.4f));
            float fM = ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, this.loadingT, this.globalAlpha, f5);
            if (this.countFilled) {
                f = 1.0f;
            }
            animatedTextDrawable2.alpha = (int) (fM * f);
            animatedTextDrawable2.setBounds(rect);
            canvas.save();
            if (this.countFilled && this.withCounterIcon) {
                this.counterDrawable.setAlpha((int) ((1.0f - this.loadingT) * this.globalAlpha * f5 * 1.0f));
                this.counterDrawable.setBounds(AndroidUtilities.dp(1.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top, this.counterDrawable.getIntrinsicWidth() + AndroidUtilities.dp(1.0f) + rect.left, this.counterDrawable.getIntrinsicHeight() + AndroidUtilities.dp(2.0f) + rect.top);
                this.counterDrawable.draw(canvas);
                canvas.translate(fDp / 2.0f, 0.0f);
            }
            animatedTextDrawable2.draw(canvas);
            canvas.restore();
            if (this.countScale != 1.0f) {
                canvas.restore();
            }
            if (z) {
                canvas.restore();
            }
        }
        if (!this.useWrapContent || this.lastWrapWidth == (wrapWidth = getWrapWidth())) {
            return;
        }
        this.lastWrapWidth = wrapWidth;
        requestLayout();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.filled && isClickable() && getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onMeasure(int i, int i2) {
        if (!this.useWrapContent) {
            if (!this.wrapWidth) {
                super.onMeasure(i, i2);
                return;
            } else {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(Math.max(this.text.getCurrentWidth() + getPaddingLeft() + getPaddingRight(), this.minWidth), View.MeasureSpec.getSize(i)), 1073741824), i2);
                return;
            }
        }
        int wrapWidth = getWrapWidth();
        this.lastWrapWidth = wrapWidth;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(wrapWidth, View.MeasureSpec.getSize(i)), 1073741824), i2);
        View view = this.rippleView;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
    }

    public void setColor(int i) {
        if (this.filled) {
            this.customBackgroundColor = true;
            int iDp = AndroidUtilities.dp(this.radiusDp);
            this.backgroundColor = i;
            setBackground(Theme.createRoundRectDrawable(iDp, i));
            return;
        }
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.text;
        animatedTextDrawable.textPaint.setColor(i);
        animatedTextDrawable.alpha = Color.alpha(i);
        int iMultAlpha = Theme.multAlpha(0.1f, i);
        int i2 = this.radiusDp;
        this.rippleView.setBackground(Theme.createRadSelectorDrawable(iMultAlpha, i2, i2));
    }

    public final void setCount(int i, boolean z) {
        int i2;
        int i3 = 1;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.countText;
        if (z) {
            animatedTextDrawable.cancelAnimation();
        }
        float f = 1.0f;
        if (z && i != (i2 = this.lastCount) && i > 0 && i2 > 0) {
            ValueAnimator valueAnimator = this.countAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.countAnimator = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.countAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ButtonWithCounterView$$ExternalSyntheticLambda0(this, 0));
            this.countAnimator.addListener(new AnonymousClass1(this, i3));
            this.countAnimator.setInterpolator(new OvershootInterpolator(2.0f));
            this.countAnimator.setDuration(200L);
            this.countAnimator.start();
        }
        this.lastCount = i;
        if (i == 0 && !this.showZero) {
            f = 0.0f;
        }
        this.countAlpha = f;
        animatedTextDrawable.setText(LocaleController.formatNumber(i, ' '), z, true);
        invalidate();
    }

    public void setCountFilled(boolean z) {
        this.countFilled = z;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.countText;
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(z ? 12.0f : 14.0f));
        int color = this.countFilled ? this.backgroundColor : this.text.textPaint.getColor();
        animatedTextDrawable.textPaint.setColor(color);
        animatedTextDrawable.alpha = Color.alpha(color);
    }

    public void setCounterColor(int i) {
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.countText;
        animatedTextDrawable.textPaint.setColor(i);
        animatedTextDrawable.alpha = Color.alpha(i);
        this.counterDrawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public void setEnabled(boolean z) {
        if (this.enabled != z) {
            ValueAnimator valueAnimator = this.enabledAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.enabledAnimator = null;
            }
            float f = this.enabledT;
            this.enabled = z;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
            this.enabledAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ButtonWithCounterView$$ExternalSyntheticLambda0(this, 1));
            this.enabledAnimator.start();
        }
        super.setEnabled(z);
    }

    public void setFilled(boolean z) {
        if (this.filled == z) {
            return;
        }
        this.filled = z;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.text;
        if (z) {
            setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(this.radiusDp), this.backgroundColor));
            animatedTextDrawable.textPaint.setTypeface(AndroidUtilities.bold());
        } else {
            setBackground(null);
            animatedTextDrawable.textPaint.setTypeface(null);
        }
        updateColors$1();
    }

    public void setFlickeringLoading(boolean z) {
        this.flickeringLoading = z;
    }

    public void setGlobalAlpha(float f) {
        this.globalAlpha = (int) (f * 255.0f);
    }

    @Override
    public void setLoading(boolean z) {
        if (this.loading != z) {
            if (this.flickeringLoading) {
                this.loading = z;
                invalidate();
                return;
            }
            ValueAnimator valueAnimator = this.loadingAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.loadingAnimator = null;
            }
            float f = this.loadingT;
            this.loading = z;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
            this.loadingAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ButtonWithCounterView$$ExternalSyntheticLambda0(this, 2));
            this.loadingAnimator.addListener(new TodoItemMenu.AnonymousClass15(6, this, z));
            this.loadingAnimator.setDuration(320L);
            this.loadingAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.loadingAnimator.start();
        }
    }

    public void setMinWidth(int i) {
        this.wrapWidth = true;
        this.minWidth = i;
    }

    public final void setNeutral() {
        this.neutral = true;
        setFilled(true);
        setColor(Theme.getColor(Theme.key_buttonNeutral, this.resourcesProvider));
        updateColors$1();
    }

    public void setRoundRadius(int i) {
        this.radiusDp = i;
        if (this.filled) {
            setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(i), this.backgroundColor));
        } else {
            setBackground(null);
        }
        updateColors$1();
    }

    public void setShowZero(boolean z) {
        this.showZero = z;
    }

    public final void setSubText(CharSequence charSequence, boolean z) {
        ValueAnimator valueAnimator;
        int i = 0;
        boolean z2 = charSequence != null;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.subText;
        if (z && (valueAnimator = animatedTextDrawable.animator) != null) {
            valueAnimator.cancel();
        }
        setContentDescription(charSequence);
        invalidate();
        if (!this.subTextVisible || z2) {
            animatedTextDrawable.setText(charSequence, z, true);
        } else {
            ValueAnimator valueAnimator2 = this.subTextVisibleAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.subTextVisibleAnimator = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.subTextT, 0.0f);
            this.subTextVisibleAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ButtonWithCounterView$$ExternalSyntheticLambda0(this, 3));
            this.subTextVisibleAnimator.addListener(new AnonymousClass1(this, i));
            this.subTextVisibleAnimator.setDuration(200L);
            this.subTextVisibleAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.subTextVisibleAnimator.start();
        }
        if (this.subTextVisible || !z2) {
            return;
        }
        this.subTextVisible = true;
        ValueAnimator valueAnimator3 = this.subTextVisibleAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            this.subTextVisibleAnimator = null;
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.subTextT, 1.0f);
        this.subTextVisibleAnimator = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addUpdateListener(new ButtonWithCounterView$$ExternalSyntheticLambda0(this, 4));
        this.subTextVisibleAnimator.setDuration(200L);
        this.subTextVisibleAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.subTextVisibleAnimator.start();
    }

    public void setText(CharSequence charSequence) {
        setText(charSequence, false, true);
    }

    public final void setText$1(CharSequence charSequence) {
        setText(charSequence, false, true);
    }

    public void setTextAlpha(float f) {
        this.text.alpha = (int) (f * 255.0f);
    }

    public void setTextColor(int i) {
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.text;
        animatedTextDrawable.textPaint.setColor(i);
        animatedTextDrawable.alpha = Color.alpha(i);
        if (this.filled) {
            return;
        }
        View view = this.rippleView;
        int iMultAlpha = Theme.multAlpha(0.1f, animatedTextDrawable.textPaint.getColor());
        int i2 = this.radiusDp;
        view.setBackground(Theme.createRadSelectorDrawable(iMultAlpha, i2, i2));
    }

    public final void setTimer(Runnable runnable) {
        AndroidUtilities.cancelRunOnUIThread(this.tick);
        setCountFilled(false);
        this.timerSeconds = 5;
        setCount(5, false);
        setShowZero(false);
        ButtonWithCounterView$$ExternalSyntheticLambda3 buttonWithCounterView$$ExternalSyntheticLambda3 = new ButtonWithCounterView$$ExternalSyntheticLambda3(this, runnable, 0);
        this.tick = buttonWithCounterView$$ExternalSyntheticLambda3;
        AndroidUtilities.runOnUIThread(buttonWithCounterView$$ExternalSyntheticLambda3, 1000L);
    }

    public void setUseWrapContent(boolean z) {
        this.useWrapContent = z;
    }

    public boolean subTextSplitToWords() {
        return !(this instanceof ChannelMonetizationLayout.AnonymousClass6);
    }

    public final void updateColors$1() {
        int i;
        int i2;
        if (!this.customBackgroundColor) {
            this.backgroundColor = Theme.getColor(this.neutral ? Theme.key_buttonNeutral : Theme.key_featuredStickers_addButton, this.resourcesProvider);
        }
        if (this.filled) {
            i = this.neutral ? Theme.key_buttonNeutralText : Theme.key_featuredStickers_buttonText;
        } else {
            i = Theme.key_featuredStickers_addButton;
        }
        int color = Theme.getColor(i, this.resourcesProvider);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.text;
        animatedTextDrawable.textPaint.setColor(color);
        animatedTextDrawable.alpha = Color.alpha(color);
        boolean z = this.filled;
        View view = this.rippleView;
        if (z) {
            int color2 = Theme.getColor(Theme.key_listSelector, this.resourcesProvider);
            int i3 = this.radiusDp;
            view.setBackground(Theme.createRadSelectorDrawable(color2, i3, i3));
        } else {
            int iMultAlpha = Theme.multAlpha(0.1f, animatedTextDrawable.textPaint.getColor());
            int i4 = this.radiusDp;
            view.setBackground(Theme.createRadSelectorDrawable(iMultAlpha, i4, i4));
        }
        if (this.filled) {
            i2 = this.neutral ? Theme.key_buttonNeutralText : Theme.key_featuredStickers_buttonText;
        } else {
            i2 = Theme.key_featuredStickers_addButton;
        }
        int color3 = Theme.getColor(i2, this.resourcesProvider);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.subText;
        animatedTextDrawable2.textPaint.setColor(color3);
        animatedTextDrawable2.alpha = Color.alpha(color3);
        int i5 = this.backgroundColor;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable3 = this.countText;
        animatedTextDrawable3.textPaint.setColor(i5);
        animatedTextDrawable3.alpha = Color.alpha(i5);
        this.paint.setColor(Theme.getColor(Theme.key_featuredStickers_buttonText, this.resourcesProvider));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.flickeringLoadingDrawable == drawable || this.text == drawable || this.subText == drawable || this.countText == drawable || super.verifyDrawable(drawable);
    }

    public final void withCounterIcon() {
        this.withCounterIcon = true;
        Drawable drawableMutate = getContext().getDrawable(R.drawable.mini_boost_button).mutate();
        this.counterDrawable = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(this.backgroundColor, PorterDuff.Mode.SRC_IN));
    }

    public final void wrapContentDynamic() {
        this.wrapContentDynamic = true;
    }

    public ButtonWithCounterView(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context);
        this.radiusDp = 8;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.countAlphaAnimated = new AnimatedFloat(350L, cubicBezierInterpolator);
        this.countFilled = true;
        this.timerSeconds = 0;
        this.subTextT = 0.0f;
        this.loadingT = 0.0f;
        this.countScale = 1.0f;
        this.enabledT = 1.0f;
        this.enabled = true;
        this.globalAlpha = 255;
        this.filled = z;
        this.resourcesProvider = resourcesProvider;
        ScaleStateListAnimator.apply(this, 0.02f, 1.2f);
        View view = new View(context);
        this.rippleView = view;
        addView(view, LayoutHelper.createFrame(-1.0f, -1));
        if (z) {
            int iDp = AndroidUtilities.dp(8.0f);
            int color = Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider);
            this.backgroundColor = color;
            setBackground(Theme.createRoundRectDrawable(iDp, color));
        }
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, false, false);
        this.text = animatedTextDrawable;
        animatedTextDrawable.moveAmplitude = 0.3f;
        animatedTextDrawable.animateDuration = 250L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(14.0f));
        if (z) {
            animatedTextDrawable.textPaint.setTypeface(AndroidUtilities.bold());
        }
        animatedTextDrawable.gravity = 1;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(subTextSplitToWords(), true, false, false);
        this.subText = animatedTextDrawable2;
        animatedTextDrawable2.moveAmplitude = 0.3f;
        animatedTextDrawable2.animateDuration = 250L;
        animatedTextDrawable2.animateWave = 1.0f;
        animatedTextDrawable2.animateInterpolator = cubicBezierInterpolator;
        animatedTextDrawable2.setCallback(this);
        animatedTextDrawable2.setTextSize(AndroidUtilities.dp(12.0f));
        animatedTextDrawable2.gravity = 1;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable3 = new AnimatedTextView.AnimatedTextDrawable(false, false, true, false);
        this.countText = animatedTextDrawable3;
        animatedTextDrawable3.moveAmplitude = 0.3f;
        animatedTextDrawable3.animateDuration = 250L;
        animatedTextDrawable3.animateWave = 1.0f;
        animatedTextDrawable3.animateInterpolator = cubicBezierInterpolator;
        animatedTextDrawable3.setCallback(this);
        animatedTextDrawable3.setTextSize(AndroidUtilities.dp(12.0f));
        animatedTextDrawable3.textPaint.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable3.setText("", true, true);
        animatedTextDrawable3.gravity = 1;
        setWillNotDraw(false);
        updateColors$1();
    }

    public final void setText(CharSequence charSequence, boolean z, boolean z2) {
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.text;
        if (z) {
            animatedTextDrawable.cancelAnimation();
        }
        animatedTextDrawable.setText(charSequence, z, z2);
        setContentDescription(charSequence);
        invalidate();
    }
}
