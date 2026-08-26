package org.telegram.ui.Stories.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Loadable;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Stories.StoryViewer;

public class ButtonWithCounterView extends FrameLayout implements Loadable {
    private int backgroundColor;
    private float countAlpha;
    private final AnimatedFloat countAlphaAnimated;
    private ValueAnimator countAnimator;
    private boolean countFilled;
    private float countScale;
    private final AnimatedTextView.AnimatedTextDrawable countText;
    private Drawable counterDrawable;
    private boolean customBackgroundColor;
    private boolean enabled;
    private ValueAnimator enabledAnimator;
    private float enabledT;
    private boolean filled;
    private boolean flickeringLoading;
    private LoadingDrawable flickeringLoadingDrawable;
    private int globalAlpha;
    private int lastCount;
    private int lastWrapWidth;
    private boolean loading;
    private ValueAnimator loadingAnimator;
    private CircularProgressDrawable loadingDrawable;
    private float loadingT;
    private int minWidth;
    private boolean neutral;
    private final Paint paint;
    private int radiusDp;
    private Theme.ResourcesProvider resourcesProvider;
    public final View rippleView;
    private boolean showZero;
    public final AnimatedTextView.AnimatedTextDrawable subText;
    private final int subTextAlpha;
    private float subTextT;
    private boolean subTextVisible;
    private ValueAnimator subTextVisibleAnimator;
    public final AnimatedTextView.AnimatedTextDrawable text;
    private Runnable tick;
    private int timerSeconds;
    public boolean useWrapContent;
    private boolean withCounterIcon;
    public boolean wrapContentDynamic;
    private boolean wrapWidth;

    public ButtonWithCounterView(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, true, resourcesProvider);
    }

    private int getWrapWidth() {
        return getPaddingRight() + getPaddingLeft() + ((int) (calculateCounterWidth(this.countText.getCurrentWidth() + AndroidUtilities.dp(15.66f), this.countAlphaAnimated.set(this.countAlpha)) + this.text.getCurrentWidth() + (this.withCounterIcon ? AndroidUtilities.dp(12.0f) : 0.0f)));
    }

    public final void animateCount() {
        int i = 2;
        ValueAnimator valueAnimator = this.countAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.countAnimator = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.countAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ButtonWithCounterView$$ExternalSyntheticLambda0(this, 0));
        this.countAnimator.addListener(new HintView2.AnonymousClass2(this, i));
        zzkk.m(2.0f, this.countAnimator);
        this.countAnimator.setDuration(200L);
        this.countAnimator.start();
    }

    public float calculateCounterWidth(float f, float f2) {
        return f * f2;
    }

    public void disableRippleView() {
        removeView(this.rippleView);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        return false;
    }

    public TextPaint getTextPaint() {
        return this.text.getPaint();
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }

    @Override
    public boolean isLoading() {
        return this.loading;
    }

    public boolean isSubTextVisible() {
        return this.subTextVisible;
    }

    public boolean isTimerActive() {
        return this.timerSeconds > 0;
    }

    public final void lambda$animateCount$4(ValueAnimator valueAnimator) {
        this.countScale = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        invalidate();
    }

    public final void lambda$setEnabled$5(ValueAnimator valueAnimator) {
        this.enabledT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public final void lambda$setLoading$3(ValueAnimator valueAnimator) {
        this.loadingT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public final void lambda$setSubText$1(ValueAnimator valueAnimator) {
        this.subTextT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public final void lambda$setSubText$2(ValueAnimator valueAnimator) {
        this.subTextT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public final void lambda$setTimer$0(Runnable runnable) {
        int i = this.timerSeconds - 1;
        this.timerSeconds = i;
        setCount(i, true);
        if (this.timerSeconds > 0) {
            AndroidUtilities.runOnUIThread(this.tick, 1000L);
            return;
        }
        setClickable(true);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int wrapWidth;
        boolean z;
        this.rippleView.draw(canvas);
        if (this.flickeringLoading) {
            if (this.loading) {
                if (this.flickeringLoadingDrawable == null) {
                    LoadingDrawable loadingDrawable = new LoadingDrawable(this.resourcesProvider);
                    this.flickeringLoadingDrawable = loadingDrawable;
                    loadingDrawable.setCallback(this);
                    this.flickeringLoadingDrawable.setGradientScale(2.0f);
                    this.flickeringLoadingDrawable.setAppearByGradient(true);
                    this.flickeringLoadingDrawable.strokePaint.setStrokeWidth(0.0f);
                    this.flickeringLoadingDrawable.setColors(Theme.multAlpha(0.02f, -1), Theme.multAlpha(0.375f, -1));
                }
                this.flickeringLoadingDrawable.resetDisappear();
                this.flickeringLoadingDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.flickeringLoadingDrawable.setRadiiDp(this.radiusDp);
                this.flickeringLoadingDrawable.draw(canvas);
            } else {
                LoadingDrawable loadingDrawable2 = this.flickeringLoadingDrawable;
                if (loadingDrawable2 != null) {
                    loadingDrawable2.disappear();
                    this.flickeringLoadingDrawable.draw(canvas);
                    if (this.flickeringLoadingDrawable.isDisappeared()) {
                        this.flickeringLoadingDrawable.reset();
                    }
                }
            }
        }
        if (this.loadingT > 0.0f) {
            if (this.loadingDrawable == null) {
                this.loadingDrawable = new CircularProgressDrawable(this.text.getTextColor());
            }
            int iDp = (int) ((1.0f - this.loadingT) * AndroidUtilities.dp(24.0f));
            this.loadingDrawable.setBounds(0, iDp, getWidth(), getHeight() + iDp);
            this.loadingDrawable.setAlpha((int) (this.loadingT * 255.0f));
            this.loadingDrawable.draw(canvas);
            invalidate();
        }
        float f = this.loadingT;
        if (f < 1.0f) {
            if (f != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.loadingT * AndroidUtilities.dp(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.loadingT * 0.4f));
                z = true;
            } else {
                z = false;
            }
            float currentWidth = this.text.getCurrentWidth();
            float f2 = this.countAlphaAnimated.set(this.countAlpha);
            float fDp = this.withCounterIcon ? AndroidUtilities.dp(12.0f) : 0.0f;
            float fCalculateCounterWidth = calculateCounterWidth(this.countText.getCurrentWidth() + AndroidUtilities.dp(15.66f), f2) + currentWidth + fDp;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - fCalculateCounterWidth) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - this.text.getHeight()) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) AacUtil.m(getMeasuredWidth() - fCalculateCounterWidth, getWidth(), 2.0f, currentWidth), (int) (((this.text.getHeight() + getMeasuredHeight()) / 2.0f) - AndroidUtilities.dp(1.0f)));
            rect.offset(0, (int) ((-AndroidUtilities.dp(7.0f)) * this.subTextT));
            this.text.setAlpha((int) (AndroidUtilities.lerp(0.5f, 1.0f, this.enabledT) * (1.0f - this.loadingT) * this.globalAlpha));
            this.text.setBounds(rect);
            this.text.draw(canvas);
            if (this.subTextVisible) {
                fCalculateCounterWidth = this.subText.getCurrentWidth();
                rect.set((int) (((getMeasuredWidth() - fCalculateCounterWidth) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - this.subText.getHeight()) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) AacUtil.m(getMeasuredWidth() - fCalculateCounterWidth, getWidth(), 2.0f, fCalculateCounterWidth), (int) (((this.subText.getHeight() + getMeasuredHeight()) / 2.0f) - AndroidUtilities.dp(1.0f)));
                rect.offset(0, AndroidUtilities.dp(11.0f));
                canvas.save();
                float fLerp = AndroidUtilities.lerp(0.1f, 1.0f, this.subTextT);
                canvas.scale(fLerp, fLerp, rect.centerX(), rect.bottom);
                this.subText.setAlpha((int) (AndroidUtilities.lerp(0.5f, 1.0f, this.enabledT) * (1.0f - this.loadingT) * 200.0f * this.subTextT));
                this.subText.setBounds(rect);
                this.subText.draw(canvas);
                canvas.restore();
            }
            rect.set((int) (ImageReceiver$$ExternalSyntheticOutline0.m(getMeasuredWidth(), fCalculateCounterWidth, 2.0f, currentWidth) + AndroidUtilities.dp(this.countFilled ? 5.0f : 2.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), this.countText.getCurrentWidth() + fDp) + ImageReceiver$$ExternalSyntheticOutline0.m(getMeasuredWidth(), fCalculateCounterWidth, 2.0f, currentWidth) + AndroidUtilities.dp((this.countFilled ? 5 : 2) + 8)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.countScale != 1.0f) {
                canvas.save();
                float f3 = this.countScale;
                canvas.scale(f3, f3, rect.centerX(), rect.centerY());
            }
            if (this.countFilled) {
                this.paint.setAlpha((int) (AndroidUtilities.lerp(0.5f, 1.0f, this.enabledT) * (1.0f - this.loadingT) * this.globalAlpha * f2 * f2));
                float fDp2 = AndroidUtilities.dp(this.withCounterIcon ? 4.0f : 10.0f);
                canvas.drawRoundRect(rectF, fDp2, fDp2, this.paint);
            }
            rect.offset(-AndroidUtilities.dp((this.countText.getText() != null ? this.countText.getText().length() : 0) > 1 ? 0.3f : 0.0f), -AndroidUtilities.dp(0.4f));
            this.countText.setAlpha((int) (ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, this.loadingT, this.globalAlpha, f2) * (this.countFilled ? 1.0f : 0.5f)));
            this.countText.setBounds(rect);
            canvas.save();
            if (this.countFilled && this.withCounterIcon) {
                this.counterDrawable.setAlpha((int) ((1.0f - this.loadingT) * this.globalAlpha * f2 * 1.0f));
                this.counterDrawable.setBounds(AndroidUtilities.dp(1.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top, this.counterDrawable.getIntrinsicWidth() + AndroidUtilities.dp(1.0f) + rect.left, this.counterDrawable.getIntrinsicHeight() + AndroidUtilities.dp(2.0f) + rect.top);
                this.counterDrawable.draw(canvas);
                canvas.translate(fDp / 2.0f, 0.0f);
            }
            this.countText.draw(canvas);
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
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
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
        this.text.setTextColor(i);
        View view = this.rippleView;
        int iMultAlpha = Theme.multAlpha(0.1f, i);
        int i2 = this.radiusDp;
        view.setBackground(Theme.createRadSelectorDrawable(iMultAlpha, i2, i2));
    }

    public void setCount(int i, boolean z) {
        int i2;
        if (z) {
            this.countText.cancelAnimation();
        }
        if (z && i != (i2 = this.lastCount) && i > 0 && i2 > 0) {
            animateCount();
        }
        this.lastCount = i;
        this.countAlpha = (i != 0 || this.showZero) ? 1.0f : 0.0f;
        this.countText.setText(LocaleController.formatNumber(i, ' '), z);
        invalidate();
    }

    public void setCountFilled(boolean z) {
        this.countFilled = z;
        this.countText.setTextSize(AndroidUtilities.dp(z ? 12.0f : 14.0f));
        this.countText.setTextColor(this.countFilled ? this.backgroundColor : this.text.getTextColor());
    }

    public void setCounterColor(int i) {
        this.countText.setTextColor(i);
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
        if (z) {
            setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(this.radiusDp), this.backgroundColor));
            this.text.setTypeface(AndroidUtilities.bold());
        } else {
            setBackground(null);
            this.text.setTypeface(null);
        }
        updateColors();
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
            valueAnimatorOfFloat.addUpdateListener(new ButtonWithCounterView$$ExternalSyntheticLambda0(this, 4));
            this.loadingAnimator.addListener(new StoryViewer.AnonymousClass7(this, z, 11));
            this.loadingAnimator.setDuration(320L);
            this.loadingAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.loadingAnimator.start();
        }
    }

    public void setMinWidth(int i) {
        this.wrapWidth = true;
        this.minWidth = i;
    }

    public ButtonWithCounterView setNeutral() {
        this.neutral = true;
        setFilled(true);
        setColor(Theme.getColor(Theme.key_buttonNeutral, this.resourcesProvider));
        updateColors();
        return this;
    }

    public ButtonWithCounterView setRound() {
        setRoundRadius(24);
        return this;
    }

    public void setRoundRadius(int i) {
        this.radiusDp = i;
        if (this.filled) {
            setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(i), this.backgroundColor));
        } else {
            setBackground(null);
        }
        updateColors();
    }

    public void setShowZero(boolean z) {
        this.showZero = z;
    }

    public void setSubText(CharSequence charSequence, boolean z) {
        boolean z2 = charSequence != null;
        if (z) {
            this.subText.cancelAnimation();
        }
        setContentDescription(charSequence);
        invalidate();
        if (!this.subTextVisible || z2) {
            this.subText.setText(charSequence, z);
        } else {
            ValueAnimator valueAnimator = this.subTextVisibleAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.subTextVisibleAnimator = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.subTextT, 0.0f);
            this.subTextVisibleAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ButtonWithCounterView$$ExternalSyntheticLambda0(this, 2));
            this.subTextVisibleAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public final void onAnimationEnd(Animator animator) {
                    ButtonWithCounterView buttonWithCounterView = ButtonWithCounterView.this;
                    buttonWithCounterView.subTextVisible = false;
                    buttonWithCounterView.subText.setText(null, false);
                }
            });
            this.subTextVisibleAnimator.setDuration(200L);
            this.subTextVisibleAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.subTextVisibleAnimator.start();
        }
        if (this.subTextVisible || !z2) {
            return;
        }
        this.subTextVisible = true;
        ValueAnimator valueAnimator2 = this.subTextVisibleAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.subTextVisibleAnimator = null;
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.subTextT, 1.0f);
        this.subTextVisibleAnimator = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addUpdateListener(new ButtonWithCounterView$$ExternalSyntheticLambda0(this, 3));
        this.subTextVisibleAnimator.setDuration(200L);
        this.subTextVisibleAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.subTextVisibleAnimator.start();
    }

    public void setSubTextHacks(boolean z, boolean z2, boolean z3, boolean z4) {
        this.subText.setHacks(z, z2, z3, z4);
    }

    public void setText(CharSequence charSequence) {
        setText(charSequence, false);
    }

    public void setTextAlpha(float f) {
        this.text.setAlpha((int) (f * 255.0f));
    }

    public void setTextColor(int i) {
        this.text.setTextColor(i);
        if (this.filled) {
            return;
        }
        View view = this.rippleView;
        int iMultAlpha = Theme.multAlpha(0.1f, this.text.getTextColor());
        int i2 = this.radiusDp;
        view.setBackground(Theme.createRadSelectorDrawable(iMultAlpha, i2, i2));
    }

    public void setTextHacks(boolean z, boolean z2, boolean z3, boolean z4) {
        this.text.setHacks(z, z2, z3, z4);
    }

    public void setTimer(int i, Runnable runnable) {
        AndroidUtilities.cancelRunOnUIThread(this.tick);
        setCountFilled(false);
        this.timerSeconds = i;
        setCount(i, false);
        setShowZero(false);
        ButtonWithCounterView$$ExternalSyntheticLambda1 buttonWithCounterView$$ExternalSyntheticLambda1 = new ButtonWithCounterView$$ExternalSyntheticLambda1(this, runnable, 0);
        this.tick = buttonWithCounterView$$ExternalSyntheticLambda1;
        AndroidUtilities.runOnUIThread(buttonWithCounterView$$ExternalSyntheticLambda1, 1000L);
    }

    public void setUseWrapContent(boolean z) {
        this.useWrapContent = z;
    }

    public boolean subTextSplitToWords() {
        return true;
    }

    public void updateColors(Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
        updateColors();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        return this.flickeringLoadingDrawable == drawable || this.text == drawable || this.subText == drawable || this.countText == drawable || super.verifyDrawable(drawable);
    }

    public void withCounterIcon() {
        this.withCounterIcon = true;
        Drawable drawableMutate = getContext().getDrawable(R.drawable.mini_boost_button).mutate();
        this.counterDrawable = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(this.backgroundColor, PorterDuff.Mode.SRC_IN));
    }

    public void wrapContentDynamic() {
        this.wrapContentDynamic = true;
    }

    public ButtonWithCounterView(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
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
        this.subTextAlpha = 200;
        this.filled = z;
        this.resourcesProvider = resourcesProvider;
        ScaleStateListAnimator.apply(this, 0.02f, 1.2f);
        View view = new View(context);
        this.rippleView = view;
        addView(view, LayoutHelper.createFrame(-1, -1.0f));
        if (z) {
            int iDp = AndroidUtilities.dp(8.0f);
            int color = Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider);
            this.backgroundColor = color;
            setBackground(Theme.createRoundRectDrawable(iDp, color));
        }
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, false);
        this.text = animatedTextDrawable;
        animatedTextDrawable.setAnimationProperties(0.3f, 0L, 250L, cubicBezierInterpolator);
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(14.0f));
        if (z) {
            animatedTextDrawable.setTypeface(AndroidUtilities.bold());
        }
        animatedTextDrawable.setGravity(1);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(subTextSplitToWords(), true, false);
        this.subText = animatedTextDrawable2;
        animatedTextDrawable2.setAnimationProperties(0.3f, 0L, 250L, cubicBezierInterpolator);
        animatedTextDrawable2.setCallback(this);
        animatedTextDrawable2.setTextSize(AndroidUtilities.dp(12.0f));
        animatedTextDrawable2.setGravity(1);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable3 = new AnimatedTextView.AnimatedTextDrawable(false, false, true);
        this.countText = animatedTextDrawable3;
        animatedTextDrawable3.setAnimationProperties(0.3f, 0L, 250L, cubicBezierInterpolator);
        animatedTextDrawable3.setCallback(this);
        animatedTextDrawable3.setTextSize(AndroidUtilities.dp(12.0f));
        animatedTextDrawable3.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable3.setText("");
        animatedTextDrawable3.setGravity(1);
        setWillNotDraw(false);
        updateColors();
    }

    public void setText(CharSequence charSequence, boolean z) {
        setText(charSequence, z, true);
    }

    public void setText(CharSequence charSequence, boolean z, boolean z2) {
        if (z) {
            this.text.cancelAnimation();
        }
        this.text.setText(charSequence, z, z2);
        setContentDescription(charSequence);
        invalidate();
    }

    public void updateColors() {
        int i;
        int i2;
        if (!this.customBackgroundColor) {
            this.backgroundColor = Theme.getColor(this.neutral ? Theme.key_buttonNeutral : Theme.key_featuredStickers_addButton, this.resourcesProvider);
        }
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.text;
        if (this.filled) {
            i = this.neutral ? Theme.key_buttonNeutralText : Theme.key_featuredStickers_buttonText;
        } else {
            i = Theme.key_featuredStickers_addButton;
        }
        animatedTextDrawable.setTextColor(Theme.getColor(i, this.resourcesProvider));
        if (this.filled) {
            View view = this.rippleView;
            int color = Theme.getColor(Theme.key_listSelector, this.resourcesProvider);
            int i3 = this.radiusDp;
            view.setBackground(Theme.createRadSelectorDrawable(color, i3, i3));
        } else {
            View view2 = this.rippleView;
            int iMultAlpha = Theme.multAlpha(0.1f, this.text.getTextColor());
            int i4 = this.radiusDp;
            view2.setBackground(Theme.createRadSelectorDrawable(iMultAlpha, i4, i4));
        }
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.subText;
        if (this.filled) {
            i2 = this.neutral ? Theme.key_buttonNeutralText : Theme.key_featuredStickers_buttonText;
        } else {
            i2 = Theme.key_featuredStickers_addButton;
        }
        animatedTextDrawable2.setTextColor(Theme.getColor(i2, this.resourcesProvider));
        this.countText.setTextColor(this.backgroundColor);
        this.paint.setColor(Theme.getColor(Theme.key_featuredStickers_buttonText, this.resourcesProvider));
    }

    public void setCount(String str, boolean z) {
        if (z) {
            this.countText.cancelAnimation();
            animateCount();
        }
        this.lastCount = -1;
        this.countAlpha = (!TextUtils.isEmpty(str) || this.showZero) ? 1.0f : 0.0f;
        this.countText.setText(str, z);
        invalidate();
    }
}
