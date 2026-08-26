package org.telegram.ui.Components.Premium;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BadWayToMakeButtonRound;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Charts.StackBarChartView;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CounterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Loadable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.TON.TONIntroActivity;

public class PremiumButtonView extends FrameLayout implements Loadable {
    public final TONIntroActivity.AnonymousClass2 buttonLayout;
    public final CheckBoxCell.AnonymousClass1 buttonTextView;
    public final AnimatedFloat counterOffset;
    public final AnimatedFloat counterOffset2;
    public CounterView counterView;
    public boolean drawGradient;
    public boolean drawOverlayColor;
    public final CellFlickerDrawable flickerDrawable;
    public final RLottieImageView iconView;
    public boolean inc;
    public boolean isButtonTextSet;
    public boolean isFlickerDisabled;
    public boolean loading;
    public ValueAnimator loadingAnimator;
    public CircularProgressDrawable loadingDrawable;
    public float loadingT;
    public boolean nonClickable;
    public ValueAnimator overlayAnimator;
    public float overlayProgress;
    public final CheckBoxCell.AnonymousClass1 overlayTextView;
    public final Paint paintOverlayPaint;
    public final Path path;
    public float progress;
    public final int radius;
    public boolean showOverlay;

    public PremiumButtonView(Context context, int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        Paint paint = new Paint(1);
        this.paintOverlayPaint = paint;
        this.path = new Path();
        this.drawGradient = true;
        this.counterOffset = new AnimatedFloat(this);
        this.counterOffset2 = new AnimatedFloat(this);
        this.loadingT = 0.0f;
        this.radius = i;
        CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable(64, 204, 160);
        this.flickerDrawable = cellFlickerDrawable;
        cellFlickerDrawable.animationSpeedScale = 1.2f;
        cellFlickerDrawable.drawFrame = false;
        cellFlickerDrawable.repeatProgress = 4.0f;
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(0, context);
        CheckBoxCell.AnonymousClass1 anonymousClass1 = new CheckBoxCell.AnonymousClass1(this, context, 1);
        this.buttonTextView = anonymousClass1;
        anonymousClass1.setAnimationProperties(0.35f, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        anonymousClass1.setGravity(17);
        anonymousClass1.setTextColor(-1);
        anonymousClass1.setTextSize(AndroidUtilities.dp(14.0f));
        anonymousClass1.setTypeface(AndroidUtilities.bold());
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.iconView = rLottieImageView;
        rLottieImageView.setColorFilter(-1);
        rLottieImageView.setVisibility(8);
        TONIntroActivity.AnonymousClass2 anonymousClass2 = new TONIntroActivity.AnonymousClass2(this, context, 5);
        this.buttonLayout = anonymousClass2;
        anonymousClass2.addView(linearLayoutM, LayoutHelper.createFrame(-2, -2, 17));
        int alphaComponent = ColorUtils.setAlphaComponent(-1, 120);
        anonymousClass2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(i, i, i, i, 0, alphaComponent, alphaComponent));
        linearLayoutM.addView(anonymousClass1, LayoutHelper.createLinear(-2, -2, 16));
        linearLayoutM.addView(rLottieImageView, LayoutHelper.createLinear(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(anonymousClass2);
        BadWayToMakeButtonRound.round(this);
        ScaleStateListAnimator.apply(this, 0.02f, 1.2f);
        if (z) {
            CheckBoxCell.AnonymousClass1 anonymousClass3 = new CheckBoxCell.AnonymousClass1(this, context, 2);
            this.overlayTextView = anonymousClass3;
            anonymousClass3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            anonymousClass3.setGravity(17);
            anonymousClass3.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
            anonymousClass3.setTextSize(AndroidUtilities.dp(14.0f));
            anonymousClass3.setTypeface(AndroidUtilities.bold());
            anonymousClass3.getDrawable().setAllowCancel(true);
            int iDp = AndroidUtilities.dp(8.0f);
            int alphaComponent2 = ColorUtils.setAlphaComponent(-1, 120);
            anonymousClass3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, alphaComponent2, alphaComponent2));
            addView(anonymousClass3);
            paint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider));
            updateOverlayProgress();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        CounterView counterView = this.counterView;
        CheckBoxCell.AnonymousClass1 anonymousClass1 = this.overlayTextView;
        if (counterView != null) {
            float width = ((counterView.counterDrawable.getWidth() * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f;
            AnimatedFloat animatedFloat = this.counterOffset;
            animatedFloat.set(width);
            float width2 = (anonymousClass1.getDrawable().getWidth() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            AnimatedFloat animatedFloat2 = this.counterOffset2;
            animatedFloat2.set(width2);
            anonymousClass1.setTranslationX(-animatedFloat.get());
            this.counterView.setTranslationX(animatedFloat2.get() - animatedFloat.get());
        } else if (anonymousClass1 != null) {
            anonymousClass1.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f = this.overlayProgress;
        Paint paint = this.paintOverlayPaint;
        int i = this.radius;
        if (f != 1.0f || !this.drawOverlayColor) {
            if (this.inc) {
                float f2 = this.progress + 0.016f;
                this.progress = f2;
                if (f2 > 3.0f) {
                    this.inc = false;
                }
            } else {
                float f3 = this.progress - 0.016f;
                this.progress = f3;
                if (f3 < 1.0f) {
                    this.inc = true;
                }
            }
            if (this.drawGradient) {
                PremiumGradient.getInstance().mainGradient.gradientMatrix(0, 0, getMeasuredWidth(), getMeasuredHeight(), (-getMeasuredWidth()) * 0.1f * this.progress, 0.0f);
                float f4 = i;
                canvas.drawRoundRect(rectF, f4, f4, PremiumGradient.getInstance().getMainGradientPaint());
            } else {
                paint.setAlpha(255);
                float f5 = i;
                canvas.drawRoundRect(rectF, f5, f5, paint);
            }
            invalidate();
        }
        if (!BuildVars.IS_BILLING_UNAVAILABLE && !this.isFlickerDisabled) {
            int measuredWidth = getMeasuredWidth();
            CellFlickerDrawable cellFlickerDrawable = this.flickerDrawable;
            cellFlickerDrawable.parentWidth = measuredWidth;
            cellFlickerDrawable.draw(null, canvas, rectF, i);
        }
        float f6 = this.overlayProgress;
        if (f6 != 0.0f && this.drawOverlayColor) {
            paint.setAlpha((int) (f6 * 255.0f));
            if (this.overlayProgress != 1.0f) {
                Path path = this.path;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.overlayProgress, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float f7 = i;
                canvas.drawRoundRect(rectF, f7, f7, paint);
                canvas.restore();
            } else {
                float f8 = i;
                canvas.drawRoundRect(rectF, f8, f8, paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    public RLottieImageView getIconView() {
        return this.iconView;
    }

    public AnimatedTextView getTextView() {
        return this.buttonTextView;
    }

    @Override
    public final boolean isEnabled() {
        return this.buttonLayout.isEnabled();
    }

    @Override
    public final boolean isLoading() {
        return this.loading;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void setButton(String str, View.OnClickListener onClickListener, boolean z) {
        if (!this.isButtonTextSet && z) {
            z = true;
        }
        this.isButtonTextSet = true;
        CheckBoxCell.AnonymousClass1 anonymousClass1 = this.buttonTextView;
        if (z && anonymousClass1.isAnimating()) {
            anonymousClass1.cancelAnimation();
        }
        anonymousClass1.setText(str, z);
        TONIntroActivity.AnonymousClass2 anonymousClass2 = this.buttonLayout;
        anonymousClass2.setContentDescription(str);
        if (this.nonClickable) {
            return;
        }
        anonymousClass2.setOnClickListener(onClickListener);
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.buttonLayout.setEnabled(z);
    }

    public void setFlickerDisabled(boolean z) {
        this.isFlickerDisabled = z;
        invalidate();
    }

    public void setIcon(int i) {
        RLottieImageView rLottieImageView = this.iconView;
        rLottieImageView.setAnimation(i, 24, 24);
        CellFlickerDrawable cellFlickerDrawable = this.flickerDrawable;
        cellFlickerDrawable.progress = 2.0f;
        cellFlickerDrawable.onRestartCallback = new PremiumButtonView$$ExternalSyntheticLambda1(this, 0);
        invalidate();
        rLottieImageView.setVisibility(0);
    }

    @Override
    public void setLoading(boolean z) {
        if (this.loading != z) {
            ValueAnimator valueAnimator = this.loadingAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.loadingAnimator = null;
            }
            float f = this.loadingT;
            this.loading = z;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
            this.loadingAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new LimitPreviewView$$ExternalSyntheticLambda3(this, 1));
            this.loadingAnimator.addListener(new StoryViewer.AnonymousClass7(this, z, 6));
            this.loadingAnimator.setDuration(320L);
            this.loadingAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.loadingAnimator.start();
        }
    }

    public final void setOverlayText(CharSequence charSequence, boolean z, boolean z2) {
        this.showOverlay = true;
        this.drawOverlayColor = z;
        CheckBoxCell.AnonymousClass1 anonymousClass1 = this.overlayTextView;
        anonymousClass1.setText(charSequence, z2);
        anonymousClass1.setContentDescription(charSequence);
        updateOverlay(z2);
    }

    public final void updateOverlay(boolean z) {
        int i = 2;
        ValueAnimator valueAnimator = this.overlayAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.overlayAnimator.cancel();
        }
        if (!z) {
            this.overlayProgress = this.showOverlay ? 1.0f : 0.0f;
            updateOverlayProgress();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.overlayProgress, this.showOverlay ? 1.0f : 0.0f);
        this.overlayAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new StackBarChartView.AnonymousClass1(this, i));
        this.overlayAnimator.addListener(new BaseChartView.AnonymousClass4(this, 8));
        this.overlayAnimator.setDuration(250L);
        this.overlayAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.overlayAnimator.start();
    }

    public final void updateOverlayProgress() {
        float f = this.overlayProgress;
        CheckBoxCell.AnonymousClass1 anonymousClass1 = this.overlayTextView;
        anonymousClass1.setAlpha(f);
        anonymousClass1.setTranslationY((1.0f - this.overlayProgress) * AndroidUtilities.dp(12.0f));
        float f2 = 1.0f - this.overlayProgress;
        TONIntroActivity.AnonymousClass2 anonymousClass2 = this.buttonLayout;
        anonymousClass2.setAlpha(f2);
        anonymousClass2.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.overlayProgress);
        anonymousClass2.setVisibility(this.overlayProgress == 1.0f ? 4 : 0);
        anonymousClass1.setVisibility(this.overlayProgress == 0.0f ? 4 : 0);
        invalidate();
    }
}
