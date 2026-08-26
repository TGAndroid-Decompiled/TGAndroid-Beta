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
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CounterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Loadable;
import org.telegram.ui.Components.PasscodeView$9$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.LoginActivity;

public class PremiumButtonView extends FrameLayout implements Loadable {
    public final ChatActivity.AnonymousClass60 buttonLayout;
    public final AnonymousClass1 buttonTextView;
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
    public final AnonymousClass1 overlayTextView;
    public final Paint paintOverlayPaint;
    public final Path path;
    public float progress;
    public final int radius;
    public boolean showOverlay;

    public PremiumButtonView(int i, Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
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
        LinearLayout linearLayoutM = zzkf.m(context, 0);
        final int i2 = 0;
        ?? r15 = new AnimatedTextView(this, context) {
            public final PremiumButtonView this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void onDraw(Canvas canvas) {
                switch (i2) {
                    case 0:
                        PremiumButtonView premiumButtonView = this.this$0;
                        if (premiumButtonView.loadingT > 0.0f) {
                            if (premiumButtonView.loadingDrawable == null) {
                                premiumButtonView.loadingDrawable = new CircularProgressDrawable(premiumButtonView.buttonTextView.getTextColor());
                            }
                            int iDp = (int) ((1.0f - premiumButtonView.loadingT) * AndroidUtilities.dp(24.0f));
                            premiumButtonView.loadingDrawable.setBounds(0, iDp, getWidth(), getHeight() + iDp);
                            premiumButtonView.loadingDrawable.paint.setAlpha((int) (premiumButtonView.loadingT * 255.0f));
                            premiumButtonView.loadingDrawable.draw(canvas);
                            invalidate();
                        }
                        float f = premiumButtonView.loadingT;
                        if (f < 1.0f) {
                            if (f == 0.0f) {
                                super.onDraw(canvas);
                            } else {
                                canvas.save();
                                canvas.translate(0.0f, (int) (premiumButtonView.loadingT * AndroidUtilities.dp(-24.0f)));
                                canvas.scale(1.0f, 1.0f - (premiumButtonView.loadingT * 0.4f));
                                super.onDraw(canvas);
                                canvas.restore();
                            }
                        }
                        break;
                    default:
                        PremiumButtonView premiumButtonView2 = this.this$0;
                        if (premiumButtonView2.loadingT > 0.0f) {
                            if (premiumButtonView2.loadingDrawable == null) {
                                premiumButtonView2.loadingDrawable = new CircularProgressDrawable(premiumButtonView2.buttonTextView.getTextColor());
                            }
                            int iDp2 = (int) ((1.0f - premiumButtonView2.loadingT) * AndroidUtilities.dp(24.0f));
                            premiumButtonView2.loadingDrawable.setBounds(0, iDp2, getWidth(), getHeight() + iDp2);
                            premiumButtonView2.loadingDrawable.paint.setAlpha((int) (premiumButtonView2.loadingT * 255.0f));
                            premiumButtonView2.loadingDrawable.draw(canvas);
                            invalidate();
                        }
                        float f2 = premiumButtonView2.loadingT;
                        if (f2 < 1.0f) {
                            if (f2 == 0.0f) {
                                super.onDraw(canvas);
                            } else {
                                canvas.save();
                                canvas.translate(0.0f, (int) (premiumButtonView2.loadingT * AndroidUtilities.dp(-24.0f)));
                                canvas.scale(1.0f, 1.0f - (premiumButtonView2.loadingT * 0.4f));
                                super.onDraw(canvas);
                                canvas.restore();
                            }
                        }
                        break;
                }
            }
        };
        this.buttonTextView = r15;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = r15.drawable;
        animatedTextDrawable.moveAmplitude = 0.35f;
        animatedTextDrawable.animateDuration = 350L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        r15.setGravity(17);
        r15.setTextColor(-1);
        r15.setTextSize(AndroidUtilities.dp(14.0f));
        r15.setTypeface(AndroidUtilities.bold());
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.iconView = rLottieImageView;
        rLottieImageView.setColorFilter(-1);
        rLottieImageView.setVisibility(8);
        ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60(this, context, 18);
        this.buttonLayout = anonymousClass60;
        anonymousClass60.addView(linearLayoutM, LayoutHelper.createFrame(-2, -2, 17));
        int alphaComponent = ColorUtils.setAlphaComponent(-1, 120);
        anonymousClass60.setBackground(Theme.createSimpleSelectorRoundRectDrawable(i, i, i, i, 0, alphaComponent, alphaComponent));
        linearLayoutM.addView((View) r15, LayoutHelper.createLinear(-2, -2, 16));
        linearLayoutM.addView(rLottieImageView, LayoutHelper.createLinear(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(anonymousClass60);
        setOutlineProvider(ViewOutlineProviderImpl.BOUNDS_ROUND_RECT);
        setClipToOutline(true);
        ScaleStateListAnimator.apply(this, 0.02f, 1.2f);
        if (z) {
            final int i3 = 1;
            ?? r4 = new AnimatedTextView(this, context) {
                public final PremiumButtonView this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public final void onDraw(Canvas canvas) {
                    switch (i3) {
                        case 0:
                            PremiumButtonView premiumButtonView = this.this$0;
                            if (premiumButtonView.loadingT > 0.0f) {
                                if (premiumButtonView.loadingDrawable == null) {
                                    premiumButtonView.loadingDrawable = new CircularProgressDrawable(premiumButtonView.buttonTextView.getTextColor());
                                }
                                int iDp = (int) ((1.0f - premiumButtonView.loadingT) * AndroidUtilities.dp(24.0f));
                                premiumButtonView.loadingDrawable.setBounds(0, iDp, getWidth(), getHeight() + iDp);
                                premiumButtonView.loadingDrawable.paint.setAlpha((int) (premiumButtonView.loadingT * 255.0f));
                                premiumButtonView.loadingDrawable.draw(canvas);
                                invalidate();
                            }
                            float f = premiumButtonView.loadingT;
                            if (f < 1.0f) {
                                if (f == 0.0f) {
                                    super.onDraw(canvas);
                                } else {
                                    canvas.save();
                                    canvas.translate(0.0f, (int) (premiumButtonView.loadingT * AndroidUtilities.dp(-24.0f)));
                                    canvas.scale(1.0f, 1.0f - (premiumButtonView.loadingT * 0.4f));
                                    super.onDraw(canvas);
                                    canvas.restore();
                                }
                            }
                            break;
                        default:
                            PremiumButtonView premiumButtonView2 = this.this$0;
                            if (premiumButtonView2.loadingT > 0.0f) {
                                if (premiumButtonView2.loadingDrawable == null) {
                                    premiumButtonView2.loadingDrawable = new CircularProgressDrawable(premiumButtonView2.buttonTextView.getTextColor());
                                }
                                int iDp2 = (int) ((1.0f - premiumButtonView2.loadingT) * AndroidUtilities.dp(24.0f));
                                premiumButtonView2.loadingDrawable.setBounds(0, iDp2, getWidth(), getHeight() + iDp2);
                                premiumButtonView2.loadingDrawable.paint.setAlpha((int) (premiumButtonView2.loadingT * 255.0f));
                                premiumButtonView2.loadingDrawable.draw(canvas);
                                invalidate();
                            }
                            float f2 = premiumButtonView2.loadingT;
                            if (f2 < 1.0f) {
                                if (f2 == 0.0f) {
                                    super.onDraw(canvas);
                                } else {
                                    canvas.save();
                                    canvas.translate(0.0f, (int) (premiumButtonView2.loadingT * AndroidUtilities.dp(-24.0f)));
                                    canvas.scale(1.0f, 1.0f - (premiumButtonView2.loadingT * 0.4f));
                                    super.onDraw(canvas);
                                    canvas.restore();
                                }
                            }
                            break;
                    }
                }
            };
            this.overlayTextView = r4;
            r4.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            r4.setGravity(17);
            r4.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
            r4.setTextSize(AndroidUtilities.dp(14.0f));
            r4.setTypeface(AndroidUtilities.bold());
            r4.getDrawable().allowCancel = true;
            int iDp = AndroidUtilities.dp(8.0f);
            int alphaComponent2 = ColorUtils.setAlphaComponent(-1, 120);
            r4.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, alphaComponent2, alphaComponent2));
            addView(r4);
            paint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider));
            updateOverlayProgress();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int iDp;
        CounterView counterView = this.counterView;
        AnonymousClass1 anonymousClass1 = this.overlayTextView;
        if (counterView != null) {
            CounterView.CounterDrawable counterDrawable = counterView.counterDrawable;
            if (counterDrawable.currentCount == 0) {
                iDp = 0;
            } else {
                iDp = AndroidUtilities.dp(counterDrawable.radius - 0.5f) + counterDrawable.countWidth;
            }
            float fDp = ((iDp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f;
            AnimatedFloat animatedFloat = this.counterOffset;
            animatedFloat.set(fDp, false);
            float measuredWidth = getMeasuredWidth() / 2.0f;
            AnimatedTextView.AnimatedTextDrawable drawable = anonymousClass1.getDrawable();
            float fMax = (Math.max(drawable.currentWidth, drawable.oldWidth) / 2.0f) + measuredWidth + AndroidUtilities.dp(3.0f);
            AnimatedFloat animatedFloat2 = this.counterOffset2;
            animatedFloat2.set(fMax, false);
            anonymousClass1.setTranslationX(-animatedFloat.value);
            this.counterView.setTranslationX(animatedFloat2.value - animatedFloat.value);
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
                PremiumGradient premiumGradient = PremiumGradient.getInstance();
                premiumGradient.mainGradient.gradientMatrix(0, (-getMeasuredWidth()) * 0.1f * this.progress, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
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
            int measuredWidth2 = getMeasuredWidth();
            CellFlickerDrawable cellFlickerDrawable = this.flickerDrawable;
            cellFlickerDrawable.parentWidth = measuredWidth2;
            cellFlickerDrawable.draw(i, canvas, rectF, null);
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
        AnonymousClass1 anonymousClass1 = this.buttonTextView;
        if (z && anonymousClass1.drawable.isAnimating()) {
            anonymousClass1.drawable.cancelAnimation();
        }
        anonymousClass1.setText(str, z, true);
        ChatActivity.AnonymousClass60 anonymousClass60 = this.buttonLayout;
        anonymousClass60.setContentDescription(str);
        if (this.nonClickable) {
            return;
        }
        anonymousClass60.setOnClickListener(onClickListener);
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
        rLottieImageView.setAnimation(i, 24, 24, null);
        CellFlickerDrawable cellFlickerDrawable = this.flickerDrawable;
        cellFlickerDrawable.progress = 2.0f;
        cellFlickerDrawable.onRestartCallback = new PasscodeView$9$$ExternalSyntheticLambda0(this, 14);
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
            valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(this, 28));
            this.loadingAnimator.addListener(new LoginActivity.AnonymousClass9(5, this, z));
            this.loadingAnimator.setDuration(320L);
            this.loadingAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.loadingAnimator.start();
        }
    }

    public final void setOverlayText(CharSequence charSequence, boolean z, boolean z2) {
        this.showOverlay = true;
        this.drawOverlayColor = z;
        AnonymousClass1 anonymousClass1 = this.overlayTextView;
        anonymousClass1.setText(charSequence, z2, true);
        anonymousClass1.setContentDescription(charSequence);
        updateOverlay(z2);
    }

    public final void updateOverlay(boolean z) {
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
        valueAnimatorOfFloat.addUpdateListener(new ChatActivity.AnonymousClass133(this, 8));
        this.overlayAnimator.addListener(new ItemOptions.AnonymousClass3(this, 18));
        this.overlayAnimator.setDuration(250L);
        this.overlayAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.overlayAnimator.start();
    }

    public final void updateOverlayProgress() {
        float f = this.overlayProgress;
        AnonymousClass1 anonymousClass1 = this.overlayTextView;
        anonymousClass1.setAlpha(f);
        anonymousClass1.setTranslationY((1.0f - this.overlayProgress) * AndroidUtilities.dp(12.0f));
        float f2 = 1.0f - this.overlayProgress;
        ChatActivity.AnonymousClass60 anonymousClass60 = this.buttonLayout;
        anonymousClass60.setAlpha(f2);
        anonymousClass60.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.overlayProgress);
        anonymousClass60.setVisibility(this.overlayProgress == 1.0f ? 4 : 0);
        anonymousClass1.setVisibility(this.overlayProgress == 0.0f ? 4 : 0);
        invalidate();
    }
}
