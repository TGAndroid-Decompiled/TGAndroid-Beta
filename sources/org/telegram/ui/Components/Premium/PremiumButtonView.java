package org.telegram.ui.Components.Premium;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CounterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Loadable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.voip.CellFlickerDrawable;

public class PremiumButtonView extends FrameLayout implements Loadable {
    public FrameLayout buttonLayout;
    public AnimatedTextView buttonTextView;
    AnimatedFloat counterOffset;
    AnimatedFloat counterOffset2;
    CounterView counterView;
    public boolean drawGradient;
    private boolean drawOverlayColor;
    CellFlickerDrawable flickerDrawable;
    RLottieImageView iconView;
    private boolean inc;
    private boolean isButtonTextSet;
    private boolean isFlickerDisabled;
    private boolean loading;
    private ValueAnimator loadingAnimator;
    private CircularProgressDrawable loadingDrawable;
    private float loadingT;
    ValueAnimator overlayAnimator;
    private float overlayProgress;
    public AnimatedTextView overlayTextView;
    private Paint paintOverlayPaint;
    Path path;
    private float progress;
    private int radius;
    private boolean showOverlay;

    public PremiumButtonView(Context context, int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.paintOverlayPaint = new Paint(1);
        this.path = new Path();
        this.drawGradient = true;
        this.counterOffset = new AnimatedFloat(this);
        this.counterOffset2 = new AnimatedFloat(this);
        this.loadingT = 0.0f;
        this.radius = i;
        CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable();
        this.flickerDrawable = cellFlickerDrawable;
        cellFlickerDrawable.animationSpeedScale = 1.2f;
        cellFlickerDrawable.drawFrame = false;
        cellFlickerDrawable.repeatProgress = 4.0f;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, true) {
            @Override
            public void onDraw(Canvas canvas) {
                if (PremiumButtonView.this.loadingT > 0.0f) {
                    if (PremiumButtonView.this.loadingDrawable == null) {
                        PremiumButtonView.this.loadingDrawable = new CircularProgressDrawable(PremiumButtonView.this.buttonTextView.getTextColor());
                    }
                    int dp = (int) ((1.0f - PremiumButtonView.this.loadingT) * AndroidUtilities.dp(24.0f));
                    PremiumButtonView.this.loadingDrawable.setBounds(0, dp, getWidth(), getHeight() + dp);
                    PremiumButtonView.this.loadingDrawable.setAlpha((int) (PremiumButtonView.this.loadingT * 255.0f));
                    PremiumButtonView.this.loadingDrawable.draw(canvas);
                    invalidate();
                }
                if (PremiumButtonView.this.loadingT < 1.0f) {
                    if (PremiumButtonView.this.loadingT == 0.0f) {
                        super.onDraw(canvas);
                        return;
                    }
                    canvas.save();
                    canvas.translate(0.0f, (int) (PremiumButtonView.this.loadingT * AndroidUtilities.dp(-24.0f)));
                    canvas.scale(1.0f, 1.0f - (PremiumButtonView.this.loadingT * 0.4f));
                    super.onDraw(canvas);
                    canvas.restore();
                }
            }
        };
        this.buttonTextView = animatedTextView;
        animatedTextView.setAnimationProperties(0.35f, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.buttonTextView.setGravity(17);
        this.buttonTextView.setTextColor(-1);
        this.buttonTextView.setTextSize(AndroidUtilities.dp(14.0f));
        this.buttonTextView.setTypeface(AndroidUtilities.bold());
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
            AnimatedTextView animatedTextView2 = new AnimatedTextView(context, true, true, true) {
                @Override
                public void onDraw(Canvas canvas) {
                    if (PremiumButtonView.this.loadingT > 0.0f) {
                        if (PremiumButtonView.this.loadingDrawable == null) {
                            PremiumButtonView.this.loadingDrawable = new CircularProgressDrawable(PremiumButtonView.this.buttonTextView.getTextColor());
                        }
                        int dp = (int) ((1.0f - PremiumButtonView.this.loadingT) * AndroidUtilities.dp(24.0f));
                        PremiumButtonView.this.loadingDrawable.setBounds(0, dp, getWidth(), getHeight() + dp);
                        PremiumButtonView.this.loadingDrawable.setAlpha((int) (PremiumButtonView.this.loadingT * 255.0f));
                        PremiumButtonView.this.loadingDrawable.draw(canvas);
                        invalidate();
                    }
                    if (PremiumButtonView.this.loadingT < 1.0f) {
                        if (PremiumButtonView.this.loadingT == 0.0f) {
                            super.onDraw(canvas);
                            return;
                        }
                        canvas.save();
                        canvas.translate(0.0f, (int) (PremiumButtonView.this.loadingT * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (PremiumButtonView.this.loadingT * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                    }
                }
            };
            this.overlayTextView = animatedTextView2;
            animatedTextView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            this.overlayTextView.setGravity(17);
            this.overlayTextView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
            this.overlayTextView.setTextSize(AndroidUtilities.dp(14.0f));
            this.overlayTextView.setTypeface(AndroidUtilities.bold());
            this.overlayTextView.getDrawable().setAllowCancel(true);
            this.overlayTextView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), 0, ColorUtils.setAlphaComponent(-1, 120)));
            addView(this.overlayTextView);
            this.paintOverlayPaint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider));
            updateOverlayProgress();
        }
    }

    public PremiumButtonView(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        this(context, AndroidUtilities.dp(8.0f), z, resourcesProvider);
    }

    public void lambda$setIcon$1() {
        this.iconView.getAnimatedDrawable().setCurrentFrame(0, true);
        this.iconView.playAnimation();
    }

    public void lambda$setLoading$0(ValueAnimator valueAnimator) {
        this.loadingT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.buttonTextView.invalidate();
        AnimatedTextView animatedTextView = this.overlayTextView;
        if (animatedTextView != null) {
            animatedTextView.invalidate();
        }
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
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.overlayProgress, this.showOverlay ? 1.0f : 0.0f);
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
        this.overlayTextView.setTranslationY(AndroidUtilities.dp(12.0f) * (1.0f - this.overlayProgress));
        this.buttonLayout.setAlpha(1.0f - this.overlayProgress);
        this.buttonLayout.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.overlayProgress);
        this.buttonLayout.setVisibility(this.overlayProgress == 1.0f ? 4 : 0);
        this.overlayTextView.setVisibility(this.overlayProgress == 0.0f ? 4 : 0);
        invalidate();
    }

    public void checkCounterView() {
        if (this.counterView == null) {
            CounterView counterView = new CounterView(getContext(), null);
            this.counterView = counterView;
            counterView.setGravity(3);
            this.counterView.setColors(Theme.key_featuredStickers_addButton, Theme.key_featuredStickers_buttonText);
            this.counterView.counterDrawable.circleScale = 0.8f;
            setClipChildren(false);
            addView(this.counterView, LayoutHelper.createFrame(-1, 24, 16));
        }
    }

    public void clearOverlayText() {
        this.showOverlay = false;
        updateOverlay(true);
    }

    @Override
    protected void dispatchDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.PremiumButtonView.dispatchDraw(android.graphics.Canvas):void");
    }

    public RLottieImageView getIconView() {
        return this.iconView;
    }

    public AnimatedTextView getTextView() {
        return this.buttonTextView;
    }

    public void hideIcon() {
        this.flickerDrawable.setOnRestartCallback(null);
        this.iconView.setVisibility(8);
    }

    @Override
    public boolean isEnabled() {
        return this.buttonLayout.isEnabled();
    }

    @Override
    public boolean isLoading() {
        return this.loading;
    }

    public boolean isShowOverlay() {
        return this.showOverlay;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
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
        this.iconView.setAnimation(i, 24, 24);
        CellFlickerDrawable cellFlickerDrawable = this.flickerDrawable;
        cellFlickerDrawable.progress = 2.0f;
        cellFlickerDrawable.setOnRestartCallback(new Runnable() {
            @Override
            public final void run() {
                PremiumButtonView.this.lambda$setIcon$1();
            }
        });
        invalidate();
        this.iconView.setVisibility(0);
    }

    @Override
    public void setLoading(final boolean z) {
        if (this.loading != z) {
            ValueAnimator valueAnimator = this.loadingAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.loadingAnimator = null;
            }
            float f = this.loadingT;
            this.loading = z;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
            this.loadingAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    PremiumButtonView.this.lambda$setLoading$0(valueAnimator2);
                }
            });
            this.loadingAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    PremiumButtonView.this.loadingT = z ? 1.0f : 0.0f;
                    PremiumButtonView.this.buttonTextView.invalidate();
                    AnimatedTextView animatedTextView = PremiumButtonView.this.overlayTextView;
                    if (animatedTextView != null) {
                        animatedTextView.invalidate();
                    }
                }
            });
            this.loadingAnimator.setDuration(320L);
            this.loadingAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.loadingAnimator.start();
        }
    }

    public void setOverlayText(String str, boolean z, boolean z2) {
        this.showOverlay = true;
        this.drawOverlayColor = z;
        this.overlayTextView.setText(str, z2);
        updateOverlay(z2);
    }
}
