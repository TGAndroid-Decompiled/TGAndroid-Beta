package org.telegram.p009ui.Components.Premium;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.AnimatedTextView;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RLottieImageView;
import org.telegram.p009ui.Components.voip.CellFlickerDrawable;

public class PremiumButtonView extends FrameLayout {
    public FrameLayout buttonLayout;
    public AnimatedTextView buttonTextView;
    private boolean drawOverlayColor;
    CellFlickerDrawable flickerDrawable;
    RLottieImageView iconView;
    private boolean inc;
    private boolean isButtonTextSet;
    private boolean isFlickerDisabled;
    ValueAnimator overlayAnimator;
    private float overlayProgress;
    public TextView overlayTextView;
    private Paint paintOverlayPaint;
    Path path;
    private float progress;
    private int radius;
    private boolean showOverlay;

    public PremiumButtonView(Context context, boolean z) {
        this(context, AndroidUtilities.m35dp(8.0f), z);
    }

    public PremiumButtonView(Context context, int i, boolean z) {
        super(context);
        this.paintOverlayPaint = new Paint(1);
        this.path = new Path();
        this.radius = i;
        CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable();
        this.flickerDrawable = cellFlickerDrawable;
        cellFlickerDrawable.animationSpeedScale = 1.2f;
        cellFlickerDrawable.drawFrame = false;
        cellFlickerDrawable.repeatProgress = 4.0f;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        AnimatedTextView animatedTextView = new AnimatedTextView(context);
        this.buttonTextView = animatedTextView;
        animatedTextView.setGravity(17);
        this.buttonTextView.setTextColor(-1);
        this.buttonTextView.setTextSize(AndroidUtilities.m35dp(14.0f));
        this.buttonTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.iconView = rLottieImageView;
        rLottieImageView.setColorFilter(-1);
        this.iconView.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        this.buttonLayout = frameLayout;
        frameLayout.addView(linearLayout, LayoutHelper.createFrame(-2, -2, 17));
        this.buttonLayout.setBackground(Theme.createSimpleSelectorRoundRectDrawable(i, 0, ColorUtils.setAlphaComponent(-1, 120)));
        linearLayout.addView(this.buttonTextView, LayoutHelper.createLinear(-2, -2, 16));
        linearLayout.addView(this.iconView, LayoutHelper.createLinear(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(this.buttonLayout);
        if (z) {
            TextView textView = new TextView(context);
            this.overlayTextView = textView;
            textView.setPadding(AndroidUtilities.m35dp(34.0f), 0, AndroidUtilities.m35dp(34.0f), 0);
            this.overlayTextView.setGravity(17);
            this.overlayTextView.setTextColor(Theme.getColor("featuredStickers_buttonText"));
            this.overlayTextView.setTextSize(1, 14.0f);
            this.overlayTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.overlayTextView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.m35dp(8.0f), 0, ColorUtils.setAlphaComponent(-1, 120)));
            addView(this.overlayTextView);
            this.paintOverlayPaint.setColor(Theme.getColor("featuredStickers_addButton"));
            updateOverlayProgress();
        }
    }

    public RLottieImageView getIconView() {
        return this.iconView;
    }

    public AnimatedTextView getTextView() {
        return this.buttonTextView;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        if (this.overlayProgress != 1.0f || !this.drawOverlayColor) {
            if (this.inc) {
                float f = this.progress + 0.016f;
                this.progress = f;
                if (f > 3.0f) {
                    this.inc = false;
                }
            } else {
                float f2 = this.progress - 0.016f;
                this.progress = f2;
                if (f2 < 1.0f) {
                    this.inc = true;
                }
            }
            PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, getMeasuredWidth(), getMeasuredHeight(), this.progress * (-getMeasuredWidth()) * 0.1f, 0.0f);
            int i = this.radius;
            canvas.drawRoundRect(rectF, i, i, PremiumGradient.getInstance().getMainGradientPaint());
            invalidate();
        }
        if (!BuildVars.IS_BILLING_UNAVAILABLE && !this.isFlickerDisabled) {
            this.flickerDrawable.setParentWidth(getMeasuredWidth());
            this.flickerDrawable.draw(canvas, rectF, this.radius, null);
        }
        float f3 = this.overlayProgress;
        if (f3 != 0.0f && this.drawOverlayColor) {
            this.paintOverlayPaint.setAlpha((int) (f3 * 255.0f));
            if (this.overlayProgress != 1.0f) {
                this.path.rewind();
                this.path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.overlayProgress, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(this.path);
                int i2 = this.radius;
                canvas.drawRoundRect(rectF, i2, i2, this.paintOverlayPaint);
                canvas.restore();
            } else {
                int i3 = this.radius;
                canvas.drawRoundRect(rectF, i3, i3, this.paintOverlayPaint);
            }
        }
        super.dispatchDraw(canvas);
    }

    public void setOverlayText(String str, boolean z, boolean z2) {
        this.showOverlay = true;
        this.drawOverlayColor = z;
        this.overlayTextView.setText(str);
        updateOverlay(z2);
    }

    private void updateOverlay(boolean z) {
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
        float[] fArr = new float[2];
        fArr[0] = this.overlayProgress;
        fArr[1] = this.showOverlay ? 1.0f : 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        this.overlayAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                PremiumButtonView.this.overlayProgress = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                PremiumButtonView.this.updateOverlayProgress();
            }
        });
        this.overlayAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PremiumButtonView premiumButtonView = PremiumButtonView.this;
                premiumButtonView.overlayProgress = premiumButtonView.showOverlay ? 1.0f : 0.0f;
                PremiumButtonView.this.updateOverlayProgress();
            }
        });
        this.overlayAnimator.setDuration(250L);
        this.overlayAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.overlayAnimator.start();
    }

    public void updateOverlayProgress() {
        this.overlayTextView.setAlpha(this.overlayProgress);
        this.overlayTextView.setTranslationY(AndroidUtilities.m35dp(12.0f) * (1.0f - this.overlayProgress));
        this.buttonLayout.setAlpha(1.0f - this.overlayProgress);
        this.buttonLayout.setTranslationY((-AndroidUtilities.m35dp(12.0f)) * this.overlayProgress);
        this.buttonLayout.setVisibility(this.overlayProgress == 1.0f ? 4 : 0);
        this.overlayTextView.setVisibility(this.overlayProgress != 0.0f ? 0 : 4);
        invalidate();
    }

    public void clearOverlayText() {
        this.showOverlay = false;
        updateOverlay(true);
    }

    public void setIcon(int i) {
        this.iconView.setAnimation(i, 24, 24);
        CellFlickerDrawable cellFlickerDrawable = this.flickerDrawable;
        cellFlickerDrawable.progress = 2.0f;
        cellFlickerDrawable.setOnRestartCallback(new Runnable() {
            @Override
            public final void run() {
                PremiumButtonView.this.lambda$setIcon$0();
            }
        });
        invalidate();
        this.iconView.setVisibility(0);
    }

    public void lambda$setIcon$0() {
        this.iconView.getAnimatedDrawable().setCurrentFrame(0, true);
        this.iconView.playAnimation();
    }

    public void hideIcon() {
        this.flickerDrawable.setOnRestartCallback(null);
        this.iconView.setVisibility(8);
    }

    public void setFlickerDisabled(boolean z) {
        this.isFlickerDisabled = z;
        invalidate();
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.buttonLayout.setEnabled(z);
    }

    @Override
    public boolean isEnabled() {
        return this.buttonLayout.isEnabled();
    }

    public void setButton(String str, View.OnClickListener onClickListener) {
        setButton(str, onClickListener, false);
    }

    public void setButton(String str, View.OnClickListener onClickListener, boolean z) {
        if (!this.isButtonTextSet && z) {
            z = true;
        }
        this.isButtonTextSet = true;
        if (z && this.buttonTextView.isAnimating()) {
            this.buttonTextView.cancelAnimation();
        }
        this.buttonTextView.setText(str, z);
        this.buttonLayout.setOnClickListener(onClickListener);
    }
}
