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
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.blur3.StrokeDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;

public class PaidReactionButton extends View {
    private float accumulatedRippleIntensity;
    private final AnimatedFloat animatedFilled;
    private final AnimatedFloat animatedShowCounter;
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
    private int stars;
    private final StrokeDrawable strokeDrawable;

    public static class PaidReactionButtonEffectsView extends View {
        private final ArrayList chips;
        private final AnimatedTextView.AnimatedTextDrawable counter;
        private final AnimatedFloat counterAlpha;
        private boolean counterShown;
        public final int currentAccount;
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
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.focus, f);
            this.focusAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    PaidReactionButton.PaidReactionButtonEffectsView.$r8$lambda$wLzUhkXaYEUt0hNtllAzyVWPbAM(this.f$0, valueAnimator2);
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

        public static void $r8$lambda$wLzUhkXaYEUt0hNtllAzyVWPbAM(PaidReactionButtonEffectsView paidReactionButtonEffectsView, ValueAnimator valueAnimator) {
            paidReactionButtonEffectsView.getClass();
            paidReactionButtonEffectsView.focus = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            paidReactionButtonEffectsView.invalidate();
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

        public PaidReactionButtonEffectsView(Context context, int i) {
            super(context);
            this.reactionBounds = new RectF();
            this.counterAlpha = new AnimatedFloat(this, 0L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
            this.counter = animatedTextDrawable;
            this.effects = new ArrayList();
            this.effectAssets = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
            this.chips = new ArrayList();
            this.hidden = true;
            this.currentAccount = i;
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
                    PaidReactionButton.PaidReactionButtonEffectsView.m4342$r8$lambda$vpIAAgrDJtdfYngYmN4gFB_tSY(this.f$0);
                }
            };
        }

        public static void m4342$r8$lambda$vpIAAgrDJtdfYngYmN4gFB_tSY(PaidReactionButtonEffectsView paidReactionButtonEffectsView) {
            paidReactionButtonEffectsView.counterShown = false;
            paidReactionButtonEffectsView.invalidate();
            paidReactionButtonEffectsView.hide();
        }

        public void updatePosition(PaidReactionButton paidReactionButton) {
            this.reactionBounds.set(paidReactionButton.getX() - getX(), paidReactionButton.getY() - getY(), (paidReactionButton.getX() - getX()) + paidReactionButton.getWidth(), (paidReactionButton.getY() - getY()) + paidReactionButton.getHeight());
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            float fLerp = AndroidUtilities.lerp(1.0f, 1.8f, this.focus);
            int iDp = (int) (AndroidUtilities.dp(90.0f) * fLerp);
            int i = 0;
            int i2 = 0;
            while (i2 < this.effects.size()) {
                RLottieDrawable rLottieDrawable = (RLottieDrawable) this.effects.get(i2);
                if (rLottieDrawable.getCurrentFrame() >= rLottieDrawable.getFramesCount()) {
                    this.effects.remove(i2);
                    i2--;
                } else {
                    float f = iDp / 2.0f;
                    rLottieDrawable.setBounds((int) ((this.reactionBounds.left + (AndroidUtilities.dp(15.0f) * fLerp)) - f), (int) (this.reactionBounds.centerY() - f), (int) (this.reactionBounds.left + (AndroidUtilities.dp(15.0f) * fLerp) + f), (int) (this.reactionBounds.centerY() + f));
                    rLottieDrawable.setAlpha((int) (this.focus * 255.0f));
                    rLottieDrawable.draw(canvas);
                }
                i2++;
            }
            float fCenterX = this.reactionBounds.centerX();
            float fDp = this.reactionBounds.top - AndroidUtilities.dp(1.0f);
            canvas.save();
            canvas.translate(fCenterX, fDp);
            while (i < this.chips.size()) {
                if (((Chip) this.chips.get(i)).draw(canvas)) {
                    ((Chip) this.chips.get(i)).detach();
                    this.chips.remove(i);
                    i--;
                }
                i++;
            }
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

        public void clearEffects() {
            ArrayList arrayList = this.effects;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((RLottieDrawable) obj).recycle(true);
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
                    this.f$0.clearEffects();
                }
            });
        }

        public class Chip {
            private final AvatarDrawable avatarDrawable;
            private final Paint backgroundPaint;
            public final long dialogId;
            private RLottieDrawable effect;
            private final ImageReceiver imageReceiver;
            private boolean isKilled;
            public final AnimatedFloat killProgress;
            public final AnimatedFloat progress;
            private final float randomRotation;
            private final float randomTranslation;
            public final int stars;
            private final Text text;

            public Chip(View view, int i, long j, int i2, int i3, boolean z) {
                Paint paint = new Paint(1);
                this.backgroundPaint = paint;
                this.dialogId = j;
                this.stars = i2;
                this.randomTranslation = Utilities.clamp01(Utilities.fastRandom.nextFloat());
                this.randomRotation = Utilities.clamp01(Utilities.fastRandom.nextFloat());
                if (z) {
                    int i4 = PaidReactionButtonEffectsView.this.effectAssets[Utilities.fastRandom.nextInt(PaidReactionButtonEffectsView.this.effectAssets.length)];
                    RLottieDrawable rLottieDrawable = new RLottieDrawable(i4, "" + i4, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
                    this.effect = rLottieDrawable;
                    rLottieDrawable.setMasterParent(view);
                    this.effect.setAllowDecodeSingleFrame(true);
                    this.effect.setAutoRepeat(0);
                    this.effect.start();
                }
                TLObject userOrChat = MessagesController.getInstance(i).getUserOrChat(j);
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                this.avatarDrawable = avatarDrawable;
                avatarDrawable.setInfo(userOrChat);
                ImageReceiver imageReceiver = new ImageReceiver(view);
                this.imageReceiver = imageReceiver;
                imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
                imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
                imageReceiver.setForUserOrChat(userOrChat, avatarDrawable);
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                    @Override
                    public void onViewAttachedToWindow(View view2) {
                        Chip.this.imageReceiver.onAttachedToWindow();
                    }

                    @Override
                    public void onViewDetachedFromWindow(View view2) {
                        Chip.this.imageReceiver.onDetachedFromWindow();
                    }
                });
                if (view.isAttachedToWindow()) {
                    imageReceiver.onAttachedToWindow();
                }
                paint.setColor(-1135603);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.star);
                coloredImageSpan.spaceScaleX = 0.875f;
                spannableStringBuilder.setSpan(coloredImageSpan, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i2, ','));
                this.text = new Text(spannableStringBuilder, 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                AnimatedFloat animatedFloat = new AnimatedFloat(view, 2000L, new LinearInterpolator());
                this.progress = animatedFloat;
                animatedFloat.force(0.0f);
                animatedFloat.set(1.0f);
                this.killProgress = new AnimatedFloat(view, 350L, 240L, CubicBezierInterpolator.EASE_OUT_QUINT);
            }

            public boolean draw(Canvas canvas) {
                float f = this.progress.set(1.0f);
                float f2 = this.killProgress.set(this.isKilled);
                float fDp = AndroidUtilities.dp(23.0f) + this.text.getCurrentWidth();
                float fDp2 = AndroidUtilities.dp(18.0f);
                float fLerp = AndroidUtilities.lerp(0.0f, AndroidUtilities.lerp(1.0f, 0.0f, f2), Utilities.clamp01(Math.min(AndroidUtilities.ilerp(f, 1.0f, 0.85f), AndroidUtilities.ilerp(f, 0.0f, 0.12f))));
                int i = (int) (255.0f * fLerp);
                this.backgroundPaint.setAlpha(i);
                RLottieDrawable rLottieDrawable = this.effect;
                if (rLottieDrawable != null) {
                    rLottieDrawable.setAlpha(i);
                }
                this.imageReceiver.setAlpha(fLerp);
                canvas.save();
                double d = f;
                float fSin = (float) Math.sin(Math.pow(d, 0.44999998807907104d) * 3.141592653589793d * 3.0d);
                canvas.translate(AndroidUtilities.dp(4.0f) * ((this.randomTranslation * 2.0f) - 1.0f), 0.0f);
                canvas.rotate(((this.randomRotation * 2.0f) - 1.0f) * 1.5f);
                canvas.translate(0.0f, (-AndroidUtilities.dp(200.0f)) * ((float) Math.pow(d, 0.800000011920929d)));
                canvas.translate(AndroidUtilities.dp(5.0f) * fSin * ((float) Math.pow(d, 0.5d)), 0.0f);
                canvas.rotate(((float) (Math.sin((Math.pow(d, 0.44999998807907104d) - 0.15000000596046448d) * 3.141592653589793d * 3.0d) * ((double) Utilities.clamp01((float) Math.pow(d, 0.20000000298023224d))))) * (-6.0f));
                float fLerp2 = AndroidUtilities.lerp(0.4f, 1.0f, fLerp);
                canvas.scale(fLerp2, fLerp2);
                canvas.translate((-fDp) / 2.0f, (-fDp2) / 2.0f);
                float f3 = fDp2 / 2.0f;
                canvas.drawRoundRect(0.0f, 0.0f, fDp, fDp2, f3, f3, this.backgroundPaint);
                this.imageReceiver.draw(canvas);
                this.text.draw(canvas, AndroidUtilities.dp(18.0f), f3, -1, fLerp);
                canvas.restore();
                if (this.effect != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(4.0f) * ((this.randomTranslation * 2.0f) - 1.0f), 0.0f);
                    canvas.rotate(((this.randomRotation * 2.0f) - 1.0f) * 1.5f);
                    canvas.translate(0.0f, (-AndroidUtilities.dp(200.0f)) * ((float) Math.pow(d, 0.800000011920929d)));
                    canvas.translate(fSin * AndroidUtilities.dp(5.0f) * ((float) Math.pow(d, 0.5d)), 0.0f);
                    int iDp = AndroidUtilities.dp(90.0f);
                    int i2 = (-iDp) / 2;
                    int i3 = iDp / 2;
                    this.effect.setBounds(i2, AndroidUtilities.dp(8.0f) + i2, i3, AndroidUtilities.dp(8.0f) + i3);
                    this.effect.draw(canvas);
                    canvas.restore();
                }
                return f >= 1.0f || f2 >= 1.0f;
            }

            public void detach() {
                this.imageReceiver.onDetachedFromWindow();
            }

            public void kill() {
                this.isKilled = true;
            }
        }

        public void pushChip(long j, int i, int i2) {
            this.chips.add(new Chip(this, this.currentAccount, j, i2, i, this.chips.size() < 5));
            invalidate();
        }

        public void removeChipsFrom(long j) {
            for (int i = 0; i < this.chips.size(); i++) {
                if (((Chip) this.chips.get(i)).dialogId == j) {
                    ((Chip) this.chips.get(i)).kill();
                }
            }
        }
    }

    public PaidReactionButton(Context context, PaidReactionButtonEffectsView paidReactionButtonEffectsView, BlurredBackgroundColorProvider blurredBackgroundColorProvider) {
        super(context);
        this.rect = new RectF();
        this.clipPath = new Path();
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatedFilled = new AnimatedFloat(this, 320L, cubicBezierInterpolator);
        this.animatedShowCounter = new AnimatedFloat(this, 320L, cubicBezierInterpolator);
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
        float fDp = AndroidUtilities.dp(38.0f);
        float f = this.animatedFilled.set(this.filled);
        float f2 = this.animatedShowCounter.set(this.stars > 0);
        this.rect.set((getWidth() - fDp) / 2.0f, (getHeight() - fDp) / 2.0f, (getWidth() + fDp) / 2.0f, (getHeight() + fDp) / 2.0f);
        int iBlendARGB = ColorUtils.blendARGB(-14670806, -548067, f);
        this.backgroundPaint.setColor(iBlendARGB);
        StrokeDrawable strokeDrawable = this.strokeDrawable;
        RectF rectF = this.rect;
        strokeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.strokeDrawable.setBackgroundColor(iBlendARGB);
        this.strokeDrawable.draw(canvas);
        int iDp = AndroidUtilities.dp(20.0f);
        this.iconDrawable.setBounds((getWidth() - iDp) / 2, (getHeight() - iDp) / 2, (getWidth() + iDp) / 2, (getHeight() + iDp) / 2);
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
        if (f2 > 0.0f) {
            float fMax = Math.max(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f) + this.countText.getCurrentWidth());
            float fIsNotEmpty = this.countScale * this.countText.isNotEmpty() * f2;
            canvas.save();
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(getWidth() - fMax, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.scale(fIsNotEmpty, fIsNotEmpty, rectF3.centerX(), rectF3.centerY());
            rectF3.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, this.clearPaint);
            rectF3.set(getWidth() - fMax, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, this.backgroundPaint);
            canvas.translate(rectF3.left + ((fMax - this.countText.getCurrentWidth()) / 2.0f), AndroidUtilities.dp(6.33f));
            this.countText.setTextColor(ColorUtils.blendARGB(-9866632, -1, f));
            this.countText.draw(canvas);
            canvas.restore();
        }
    }

    public void setCount(int i) {
        this.stars = i;
        if (i > 50000) {
            this.countText.setText(AndroidUtilities.formatWholeNumber(i, 0));
        } else {
            this.countText.setText(LocaleController.formatNumber(i, ','));
        }
        invalidate();
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
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.lastRippleTime;
        if (j < 100) {
            this.accumulatedRippleIntensity += 0.5f;
            return;
        }
        this.accumulatedRippleIntensity *= Utilities.clamp(1.0f - ((j - 100) / 200.0f), 1.0f, 0.0f);
        LaunchActivity.makeRipple(this.pos[0] + (getWidth() / 2.0f), this.pos[1] + (getHeight() / 2.0f), Utilities.clamp(this.accumulatedRippleIntensity, 0.9f, 0.3f));
        this.accumulatedRippleIntensity = 0.0f;
        this.lastRippleTime = jCurrentTimeMillis;
    }

    public void stopEffects() {
        this.effectsView.updatePosition(this);
        this.effectsView.hide();
    }
}
