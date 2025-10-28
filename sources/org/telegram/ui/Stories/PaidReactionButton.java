package org.telegram.ui.Stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.blur3.StrokeDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.PaidReactionButton;

public class PaidReactionButton extends View {
    private float accumulatedRippleIntensity;
    private final AnimatedFloat animatedFilled;
    private final Paint backgroundPaint;
    private final Paint clearPaint;
    private final Path clipPath;
    private float countScale;
    private final AnimatedTextView.AnimatedTextDrawable countText;
    private final PaidReactionButtonEffectsView effectsView;
    private boolean filled;
    private final Drawable iconDrawable;
    private long lastRippleTime;
    private final StarsReactionsSheet.Particles particles;
    private final int[] pos;
    private final RectF rect;
    private final ColoredImageSpan span;
    private final StrokeDrawable strokeDrawable;

    public static class PaidReactionButtonEffectsView extends View {
        private final AnimatedTextView.AnimatedTextDrawable counter;
        private final AnimatedFloat counterAlpha;
        private boolean counterShown;
        private final int[] effectAssets;
        private final ArrayList effects;
        private float focus;
        private ValueAnimator focusAnimator;
        public boolean hidden;
        private Runnable hideCounterRunnable;
        public final RectF reactionBounds;

        public void focusTo(final float f, final Runnable runnable) {
            ValueAnimator valueAnimator = this.focusAnimator;
            if (valueAnimator != null) {
                this.focusAnimator = null;
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.focus, f);
            this.focusAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    PaidReactionButton.PaidReactionButtonEffectsView.this.lambda$focusTo$0(valueAnimator2);
                }
            });
            this.focusAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    Runnable runnable2;
                    PaidReactionButtonEffectsView.this.focus = f;
                    PaidReactionButtonEffectsView.this.invalidate();
                    if (animator != PaidReactionButtonEffectsView.this.focusAnimator || (runnable2 = runnable) == null) {
                        return;
                    }
                    runnable2.run();
                }
            });
            this.focusAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.focusAnimator.setDuration(320L);
            this.focusAnimator.start();
        }

        public void lambda$focusTo$0(ValueAnimator valueAnimator) {
            this.focus = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        public void showCounter(long j) {
            this.counter.cancelAnimation();
            this.counter.setText("+" + LocaleController.formatNumber(j, ','));
            this.counterShown = true;
            AndroidUtilities.cancelRunOnUIThread(this.hideCounterRunnable);
            AndroidUtilities.runOnUIThread(this.hideCounterRunnable, 1500L);
        }

        public void show() {
            this.hidden = false;
            focusTo(1.0f, null);
        }

        public PaidReactionButtonEffectsView(Context context) {
            super(context);
            this.reactionBounds = new RectF();
            this.counterAlpha = new AnimatedFloat(this, 0L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
            this.counter = animatedTextDrawable;
            this.effects = new ArrayList();
            this.effectAssets = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
            this.hidden = true;
            animatedTextDrawable.setCallback(this);
            animatedTextDrawable.setHacks(false, true, true);
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(40.0f));
            animatedTextDrawable.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
            animatedTextDrawable.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(3.5f), 0);
            animatedTextDrawable.setOverrideFullWidth(AndroidUtilities.displaySize.x);
            animatedTextDrawable.setTextColor(-1);
            animatedTextDrawable.setGravity(17);
            this.hideCounterRunnable = new Runnable() {
                @Override
                public final void run() {
                    PaidReactionButton.PaidReactionButtonEffectsView.this.lambda$new$1();
                }
            };
        }

        public void lambda$new$1() {
            this.counterShown = false;
            invalidate();
            hide();
        }

        public void updatePosition(PaidReactionButton paidReactionButton) {
            this.reactionBounds.set(paidReactionButton.getX() - getX(), paidReactionButton.getY() - getY(), (paidReactionButton.getX() - getX()) + paidReactionButton.getWidth(), (paidReactionButton.getY() - getY()) + paidReactionButton.getHeight());
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            float lerp = AndroidUtilities.lerp(1.0f, 1.8f, this.focus);
            int dp = (int) (AndroidUtilities.dp(90.0f) * lerp);
            int i = 0;
            while (i < this.effects.size()) {
                RLottieDrawable rLottieDrawable = (RLottieDrawable) this.effects.get(i);
                if (rLottieDrawable.getCurrentFrame() >= rLottieDrawable.getFramesCount()) {
                    this.effects.remove(i);
                    i--;
                } else {
                    float f = dp / 2.0f;
                    rLottieDrawable.setBounds((int) ((this.reactionBounds.left + (AndroidUtilities.dp(15.0f) * lerp)) - f), (int) (this.reactionBounds.centerY() - f), (int) (this.reactionBounds.left + (AndroidUtilities.dp(15.0f) * lerp) + f), (int) (this.reactionBounds.centerY() + f));
                    rLottieDrawable.setAlpha((int) (this.focus * 255.0f));
                    rLottieDrawable.draw(canvas);
                }
                i++;
            }
            float centerX = this.reactionBounds.centerX();
            float dp2 = this.reactionBounds.top - AndroidUtilities.dp(36.0f);
            canvas.save();
            float f2 = this.counterAlpha.set(this.counterShown);
            canvas.translate(0.0f, (this.counterShown ? AndroidUtilities.dp(60.0f) : -AndroidUtilities.dp(30.0f)) * (1.0f - f2));
            float lerp2 = AndroidUtilities.lerp(this.counterShown ? 1.8f : 1.3f, 1.0f, f2);
            canvas.scale(lerp2, lerp2, centerX, dp2);
            this.counter.setAlpha((int) (255.0f * f2));
            this.counter.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(3.5f), Theme.multAlpha(-1442840576, f2));
            this.counter.setBounds(centerX - AndroidUtilities.dp(100.0f), this.reactionBounds.top - AndroidUtilities.dp(48.0f), centerX + AndroidUtilities.dp(100.0f), this.reactionBounds.top - AndroidUtilities.dp(24.0f));
            this.counter.draw(canvas);
            canvas.restore();
        }

        @Override
        protected boolean verifyDrawable(Drawable drawable) {
            return drawable == this.counter || super.verifyDrawable(drawable);
        }

        public void playEffect() {
            while (this.effects.size() > 4) {
                ((RLottieDrawable) this.effects.remove(0)).recycle(true);
            }
            int[] iArr = this.effectAssets;
            int i = iArr[Utilities.fastRandom.nextInt(iArr.length)];
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i, "" + i, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
            rLottieDrawable.setMasterParent(this);
            rLottieDrawable.setAllowDecodeSingleFrame(true);
            rLottieDrawable.setAutoRepeat(0);
            rLottieDrawable.start();
            this.effects.add(rLottieDrawable);
            invalidate();
        }

        public void lambda$hide$2() {
            Iterator it = this.effects.iterator();
            while (it.hasNext()) {
                ((RLottieDrawable) it.next()).recycle(true);
            }
            this.effects.clear();
        }

        public void hide() {
            this.hidden = true;
            AndroidUtilities.cancelRunOnUIThread(this.hideCounterRunnable);
            this.counter.setText("");
            this.counterShown = false;
            invalidate();
            focusTo(0.0f, new Runnable() {
                @Override
                public final void run() {
                    PaidReactionButton.PaidReactionButtonEffectsView.this.lambda$hide$2();
                }
            });
        }
    }

    public PaidReactionButton(Context context, PaidReactionButtonEffectsView paidReactionButtonEffectsView, BlurredBackgroundColorProvider blurredBackgroundColorProvider) {
        super(context);
        this.rect = new RectF();
        this.clipPath = new Path();
        this.animatedFilled = new AnimatedFloat(this, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        Paint paint2 = new Paint(1);
        this.clearPaint = paint2;
        this.pos = new int[2];
        this.countScale = 1.0f;
        this.effectsView = paidReactionButtonEffectsView;
        ScaleStateListAnimator.apply(this);
        Resources resources = context.getResources();
        int i = R.drawable.star;
        this.iconDrawable = resources.getDrawable(i).mutate();
        StrokeDrawable strokeDrawable = new StrokeDrawable();
        this.strokeDrawable = strokeDrawable;
        strokeDrawable.setColorProvider(blurredBackgroundColorProvider);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.countText = animatedTextDrawable;
        animatedTextDrawable.setTextColor(-9866632);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(9.0f));
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        animatedTextDrawable.setAllowCancel(true);
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(i);
        this.span = coloredImageSpan;
        coloredImageSpan.setScale(1.8f, 1.8f);
        setCount(0);
        this.particles = new StarsReactionsSheet.Particles(1, 50);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(38.0f);
        float f = this.animatedFilled.set(this.filled);
        this.rect.set((getWidth() - dp) / 2.0f, (getHeight() - dp) / 2.0f, (getWidth() + dp) / 2.0f, (getHeight() + dp) / 2.0f);
        int blendARGB = ColorUtils.blendARGB(-14670806, -548067, f);
        this.backgroundPaint.setColor(blendARGB);
        StrokeDrawable strokeDrawable = this.strokeDrawable;
        RectF rectF = this.rect;
        strokeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.strokeDrawable.setBackgroundColor(blendARGB);
        this.strokeDrawable.draw(canvas);
        int dp2 = AndroidUtilities.dp(20.0f);
        this.iconDrawable.setBounds((getWidth() - dp2) / 2, (getHeight() - dp2) / 2, (getWidth() + dp2) / 2, (getHeight() + dp2) / 2);
        this.iconDrawable.draw(canvas);
        canvas.save();
        this.clipPath.rewind();
        Path path = this.clipPath;
        RectF rectF2 = this.rect;
        path.addRoundRect(rectF2, rectF2.height() / 2.0f, this.rect.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(this.clipPath);
        this.particles.setSpeed(AndroidUtilities.lerp(5.0f, 15.0f, f));
        this.particles.setBounds(this.rect);
        this.particles.process();
        this.particles.draw(canvas, -1, AndroidUtilities.lerp(0.5f, 1.0f, f));
        invalidate();
        canvas.restore();
        float isNotEmpty = this.countScale * this.countText.isNotEmpty();
        canvas.save();
        RectF rectF3 = AndroidUtilities.rectTmp;
        rectF3.set(getWidth() - dp, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
        canvas.scale(isNotEmpty, isNotEmpty, rectF3.centerX(), rectF3.centerY());
        rectF3.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, this.clearPaint);
        rectF3.set(getWidth() - dp, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, this.backgroundPaint);
        canvas.translate(rectF3.left + ((dp - this.countText.getCurrentWidth()) / 2.0f), AndroidUtilities.dp(7.0f));
        this.countText.setTextColor(ColorUtils.blendARGB(-9866632, -1, f));
        this.countText.draw(canvas);
        canvas.restore();
    }

    public void setCount(int i) {
        this.countText.setText(LocaleController.formatNumber(i, ','));
        requestLayout();
    }

    public void setFilled(boolean z) {
        if (this.filled == z) {
            return;
        }
        this.filled = z;
        invalidate();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.effectsView.updatePosition(this);
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return this.countText == drawable || super.verifyDrawable(drawable);
    }

    public void playEffect(long j) {
        this.effectsView.updatePosition(this);
        PaidReactionButtonEffectsView paidReactionButtonEffectsView = this.effectsView;
        if (paidReactionButtonEffectsView.hidden) {
            paidReactionButtonEffectsView.show();
        }
        this.effectsView.playEffect();
        this.effectsView.showCounter(j);
        ripple();
    }

    private void ripple() {
        getLocationInWindow(this.pos);
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.lastRippleTime;
        if (j < 100) {
            this.accumulatedRippleIntensity += 0.5f;
            return;
        }
        this.accumulatedRippleIntensity *= Utilities.clamp(1.0f - (((float) (j - 100)) / 200.0f), 1.0f, 0.0f);
        LaunchActivity.makeRipple(this.pos[0] + (getWidth() / 2.0f), this.pos[1] + (getHeight() / 2.0f), Utilities.clamp(this.accumulatedRippleIntensity, 0.9f, 0.3f));
        this.accumulatedRippleIntensity = 0.0f;
        this.lastRippleTime = currentTimeMillis;
    }

    public void stopEffects() {
        this.effectsView.updatePosition(this);
        this.effectsView.hide();
    }
}
