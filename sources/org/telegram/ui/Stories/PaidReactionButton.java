package org.telegram.ui.Stories;

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
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.blur3.StrokeDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarReactionsOverlay;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.iv.RichMediaCell$$ExternalSyntheticLambda1;

public final class PaidReactionButton extends View {
    public float accumulatedRippleIntensity;
    public final AnimatedFloat animatedFilled;
    public final AnimatedFloat animatedShowCounter;
    public final Paint backgroundPaint;
    public final Paint clearPaint;
    public final Path clipPath;
    public final float countScale;
    public final AnimatedTextView.AnimatedTextDrawable countText;
    public final PaidReactionButtonEffectsView effectsView;
    public boolean filled;
    public final Drawable iconDrawable;
    public long lastRippleTime;
    public final StarsReactionsSheet.Particles particles;
    public final int[] pos;
    public final RectF rect;
    public int stars;
    public final StrokeDrawable strokeDrawable;

    public final class PaidReactionButtonEffectsView extends View {
        public final ArrayList chips;
        public final AnimatedTextView.AnimatedTextDrawable counter;
        public final int currentAccount;
        public final int[] effectAssets;
        public final ArrayList effects;
        public float focus;
        public ValueAnimator focusAnimator;
        public boolean hidden;
        public final PaidReactionButton$PaidReactionButtonEffectsView$$ExternalSyntheticLambda0 hideCounterRunnable;
        public final RectF reactionBounds;

        public final class Chip {
            public final Paint backgroundPaint;
            public final long dialogId;
            public final RLottieDrawable effect;
            public final ImageReceiver imageReceiver;
            public boolean isKilled;
            public final AnimatedFloat killProgress;
            public final AnimatedFloat progress;
            public final float randomRotation;
            public final float randomTranslation;
            public final Text text;

            public Chip(PaidReactionButtonEffectsView paidReactionButtonEffectsView, View view, int i, long j, int i2, boolean z) {
                Paint paint = new Paint(1);
                this.backgroundPaint = paint;
                this.dialogId = j;
                this.randomTranslation = Utilities.clamp01(Utilities.fastRandom.nextFloat());
                this.randomRotation = Utilities.clamp01(Utilities.fastRandom.nextFloat());
                if (z) {
                    int[] iArr = paidReactionButtonEffectsView.effectAssets;
                    int i3 = iArr[Utilities.fastRandom.nextInt(iArr.length)];
                    RLottieDrawable rLottieDrawable = new RLottieDrawable(i3, DiffUtil.m(i3, ""), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
                    this.effect = rLottieDrawable;
                    rLottieDrawable.setMasterParent(view);
                    rLottieDrawable.setAllowDecodeSingleFrame(true);
                    rLottieDrawable.setAutoRepeat(0);
                    rLottieDrawable.start();
                }
                TLObject userOrChat = MessagesController.getInstance(i).getUserOrChat(j);
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                avatarDrawable.setInfo(userOrChat);
                ImageReceiver imageReceiver = new ImageReceiver(view);
                this.imageReceiver = imageReceiver;
                imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
                imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
                imageReceiver.setForUserOrChat(userOrChat, avatarDrawable);
                view.addOnAttachStateChangeListener(new StarGiftSheet.Roller.AnonymousClass1(this, 7));
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
        }

        public PaidReactionButtonEffectsView(Context context, int i) {
            super(context);
            this.reactionBounds = new RectF();
            new AnimatedFloat(this, 0L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
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
            this.hideCounterRunnable = new PaidReactionButton$PaidReactionButtonEffectsView$$ExternalSyntheticLambda0(this, 0);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            RectF rectF;
            float f;
            int i;
            PaidReactionButtonEffectsView paidReactionButtonEffectsView = this;
            Canvas canvas2 = canvas;
            float f2 = 1.0f;
            float fLerp = AndroidUtilities.lerp(1.0f, 1.8f, paidReactionButtonEffectsView.focus);
            int iDp = (int) (AndroidUtilities.dp(90.0f) * fLerp);
            int i2 = 0;
            while (true) {
                ArrayList arrayList = paidReactionButtonEffectsView.effects;
                int size = arrayList.size();
                rectF = paidReactionButtonEffectsView.reactionBounds;
                f = 255.0f;
                if (i2 >= size) {
                    break;
                }
                RLottieDrawable rLottieDrawable = (RLottieDrawable) arrayList.get(i2);
                if (rLottieDrawable.getCurrentFrame() >= rLottieDrawable.getFramesCount()) {
                    arrayList.remove(i2);
                    i2--;
                } else {
                    float f3 = iDp / 2.0f;
                    rLottieDrawable.setBounds((int) (((AndroidUtilities.dp(15.0f) * fLerp) + rectF.left) - f3), (int) (rectF.centerY() - f3), (int) OKLCH.m(AndroidUtilities.dp(15.0f), fLerp, rectF.left, f3), (int) (rectF.centerY() + f3));
                    rLottieDrawable.setAlpha((int) (paidReactionButtonEffectsView.focus * 255.0f));
                    rLottieDrawable.draw(canvas2);
                }
                i2++;
            }
            float fCenterX = rectF.centerX();
            float fDp = rectF.top - AndroidUtilities.dp(1.0f);
            canvas2.save();
            canvas2.translate(fCenterX, fDp);
            int i3 = 0;
            while (true) {
                ArrayList arrayList2 = paidReactionButtonEffectsView.chips;
                if (i3 >= arrayList2.size()) {
                    canvas2.restore();
                    return;
                }
                Chip chip = (Chip) arrayList2.get(i3);
                float f4 = chip.progress.set(f2);
                float f5 = chip.killProgress.set(chip.isKilled);
                float fDp2 = AndroidUtilities.dp(23.0f) + chip.text.getCurrentWidth();
                float fDp3 = AndroidUtilities.dp(18.0f);
                float fLerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.lerp(f2, 0.0f, f5), Utilities.clamp01(Math.min(AndroidUtilities.ilerp(f4, f2, 0.85f), AndroidUtilities.ilerp(f4, 0.0f, 0.12f))));
                Paint paint = chip.backgroundPaint;
                int i4 = (int) (fLerp2 * f);
                paint.setAlpha(i4);
                RLottieDrawable rLottieDrawable2 = chip.effect;
                if (rLottieDrawable2 != null) {
                    rLottieDrawable2.setAlpha(i4);
                }
                ImageReceiver imageReceiver = chip.imageReceiver;
                imageReceiver.setAlpha(fLerp2);
                canvas2.save();
                int i5 = i3;
                double d = f4;
                float fSin = (float) Math.sin(Math.pow(d, 0.44999998807907104d) * 3.141592653589793d * 3.0d);
                float fDp4 = AndroidUtilities.dp(4.0f);
                float f6 = (chip.randomTranslation * 2.0f) - 1.0f;
                canvas2.translate(fDp4 * f6, 0.0f);
                float f7 = 1.5f * ((chip.randomRotation * 2.0f) - 1.0f);
                canvas2.rotate(f7);
                canvas2.translate(0.0f, ((float) Math.pow(d, 0.800000011920929d)) * (-AndroidUtilities.dp(200.0f)));
                canvas2.translate(AndroidUtilities.dp(5.0f) * fSin * ((float) Math.pow(d, 0.5d)), 0.0f);
                canvas2.rotate(((float) (Math.sin((Math.pow(d, 0.44999998807907104d) - 0.15000000596046448d) * 3.141592653589793d * 3.0d) * ((double) Utilities.clamp01((float) Math.pow(d, 0.20000000298023224d))))) * (-6.0f));
                float fLerp3 = AndroidUtilities.lerp(0.4f, 1.0f, fLerp2);
                canvas2.scale(fLerp3, fLerp3);
                canvas2.translate((-fDp2) / 2.0f, (-fDp3) / 2.0f);
                float f8 = fDp3 / 2.0f;
                canvas2.drawRoundRect(0.0f, 0.0f, fDp2, fDp3, f8, f8, paint);
                imageReceiver.draw(canvas2);
                Canvas canvas3 = canvas2;
                chip.text.draw(canvas3, AndroidUtilities.dp(18.0f), f8, -1, fLerp2);
                canvas2 = canvas3;
                canvas2.restore();
                if (rLottieDrawable2 != null) {
                    canvas2.save();
                    canvas2.translate(AndroidUtilities.dp(4.0f) * f6, 0.0f);
                    canvas2.rotate(f7);
                    canvas2.translate(0.0f, (-AndroidUtilities.dp(200.0f)) * ((float) Math.pow(d, 0.800000011920929d)));
                    canvas2.translate(fSin * AndroidUtilities.dp(5.0f) * ((float) Math.pow(d, 0.5d)), 0.0f);
                    int iDp2 = AndroidUtilities.dp(90.0f);
                    int i6 = (-iDp2) / 2;
                    int i7 = iDp2 / 2;
                    rLottieDrawable2.setBounds(i6, AndroidUtilities.dp(8.0f) + i6, i7, AndroidUtilities.dp(8.0f) + i7);
                    rLottieDrawable2.draw(canvas2);
                    canvas2.restore();
                }
                if (f4 >= 1.0f || f5 >= 1.0f) {
                    ((Chip) arrayList2.get(i5)).imageReceiver.onDetachedFromWindow();
                    arrayList2.remove(i5);
                    i = i5 - 1;
                } else {
                    i = i5;
                }
                i3 = i + 1;
                paidReactionButtonEffectsView = this;
                f2 = 1.0f;
                f = 255.0f;
            }
        }

        public final void focusTo(float f, PaidReactionButton$PaidReactionButtonEffectsView$$ExternalSyntheticLambda0 paidReactionButton$PaidReactionButtonEffectsView$$ExternalSyntheticLambda0) {
            int i = 1;
            ValueAnimator valueAnimator = this.focusAnimator;
            if (valueAnimator != null) {
                this.focusAnimator = null;
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.focus, f);
            this.focusAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new RichMediaCell$$ExternalSyntheticLambda1(this, 9));
            this.focusAnimator.addListener(new StarReactionsOverlay.AnonymousClass1(this, f, paidReactionButton$PaidReactionButtonEffectsView$$ExternalSyntheticLambda0, i));
            this.focusAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.focusAnimator.setDuration(320L);
            this.focusAnimator.start();
        }

        public final void hide() {
            this.hidden = true;
            AndroidUtilities.cancelRunOnUIThread(this.hideCounterRunnable);
            this.counter.setText("");
            invalidate();
            focusTo(0.0f, new PaidReactionButton$PaidReactionButtonEffectsView$$ExternalSyntheticLambda0(this, 1));
        }

        public final void updatePosition(PaidReactionButton paidReactionButton) {
            this.reactionBounds.set(paidReactionButton.getX() - getX(), paidReactionButton.getY() - getY(), (paidReactionButton.getX() - getX()) + paidReactionButton.getWidth(), (paidReactionButton.getY() - getY()) + paidReactionButton.getHeight());
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            return drawable == this.counter || super.verifyDrawable(drawable);
        }
    }

    public PaidReactionButton(Context context, PaidReactionButtonEffectsView paidReactionButtonEffectsView, BlurredBackgroundColorProviderThemed blurredBackgroundColorProviderThemed) {
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
        strokeDrawable.colorProvider = blurredBackgroundColorProviderThemed;
        Paint paint3 = strokeDrawable.paintStrokeTop;
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        Paint paint4 = strokeDrawable.paintStrokeBottom;
        paint4.setStyle(style);
        BlurredBackgroundColorProviderThemed blurredBackgroundColorProviderThemed2 = strokeDrawable.colorProvider;
        if (blurredBackgroundColorProviderThemed2 != null) {
            strokeDrawable.strokeColorTop = Theme.multAlpha(strokeDrawable.alpha, blurredBackgroundColorProviderThemed2.getStrokeColorTop());
            strokeDrawable.strokeColorBottom = Theme.multAlpha(strokeDrawable.alpha, strokeDrawable.colorProvider.getStrokeColorBottom());
            paint3.setColor(strokeDrawable.strokeColorTop);
            paint3.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
            paint4.setColor(strokeDrawable.strokeColorBottom);
            paint4.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
        }
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.countText = animatedTextDrawable;
        animatedTextDrawable.setTextColor(-9866632);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(9.0f));
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        animatedTextDrawable.setAllowCancel(true);
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new ColoredImageSpan(i).setScale(1.8f, 1.8f);
        setCount(0);
        this.particles = new StarsReactionsSheet.Particles(1, 50);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float fDp = AndroidUtilities.dp(38.0f);
        float f = this.animatedFilled.set(this.filled);
        float f2 = this.animatedShowCounter.set(this.stars > 0);
        RectF rectF = this.rect;
        rectF.set((getWidth() - fDp) / 2.0f, (getHeight() - fDp) / 2.0f, (getWidth() + fDp) / 2.0f, (getHeight() + fDp) / 2.0f);
        int iBlendARGB = ColorUtils.blendARGB(f, -14670806, -548067);
        Paint paint = this.backgroundPaint;
        paint.setColor(iBlendARGB);
        int i = (int) rectF.left;
        int i2 = (int) rectF.top;
        int i3 = (int) rectF.right;
        int i4 = (int) rectF.bottom;
        StrokeDrawable strokeDrawable = this.strokeDrawable;
        strokeDrawable.setBounds(i, i2, i3, i4);
        strokeDrawable.paintFill.setColor(iBlendARGB);
        strokeDrawable.invalidateSelf();
        strokeDrawable.draw(canvas);
        int iDp = AndroidUtilities.dp(20.0f);
        int width = (getWidth() - iDp) / 2;
        int height = (getHeight() - iDp) / 2;
        int width2 = (getWidth() + iDp) / 2;
        int height2 = (getHeight() + iDp) / 2;
        Drawable drawable = this.iconDrawable;
        drawable.setBounds(width, height, width2, height2);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.clipPath;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float fLerp = AndroidUtilities.lerp(5.0f, 15.0f, f);
        StarsReactionsSheet.Particles particles = this.particles;
        particles.speed = fLerp;
        particles.bounds.set(rectF);
        particles.removeParticlesOutside();
        particles.process();
        particles.draw(canvas, -1, AndroidUtilities.lerp(0.5f, 1.0f, f));
        invalidate();
        canvas.restore();
        if (f2 > 0.0f) {
            float fDp2 = AndroidUtilities.dp(12.0f);
            float fDp3 = AndroidUtilities.dp(6.0f);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.countText;
            float fMax = Math.max(fDp2, animatedTextDrawable.getCurrentWidth() + fDp3);
            float fIsNotEmpty = animatedTextDrawable.isNotEmpty() * this.countScale * f2;
            canvas.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(getWidth() - fMax, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.scale(fIsNotEmpty, fIsNotEmpty, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.clearPaint);
            rectF2.set(getWidth() - fMax, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((fMax - animatedTextDrawable.getCurrentWidth()) / 2.0f) + rectF2.left, AndroidUtilities.dp(6.33f));
            animatedTextDrawable.setTextColor(ColorUtils.blendARGB(f, -9866632, -1));
            animatedTextDrawable.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.effectsView.updatePosition(this);
    }

    public void setCount(int i) {
        this.stars = i;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.countText;
        if (i > 50000) {
            animatedTextDrawable.setText(AndroidUtilities.formatWholeNumber(i, 0));
        } else {
            animatedTextDrawable.setText(LocaleController.formatNumber(i, ','));
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
    public final boolean verifyDrawable(Drawable drawable) {
        return this.countText == drawable || super.verifyDrawable(drawable);
    }
}
