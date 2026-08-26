package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.QrActivity;
import org.telegram.ui.iv.RichDetailsCell;

public final class SeekSpeedDrawable extends Drawable {
    public final AnimatedFloat animatedDirection;
    public final AnimatedFloat animatedHintShown;
    public final AnimatedFloat animatedShown;
    public final AnimatedFloat animatedSpeed;
    public final Paint arrowPaint;
    public final Paint backgroundPaint = new Paint(1);
    public int direction;
    public final SeekBarView$$ExternalSyntheticLambda1 hideHintRunnable;
    public boolean hideHintScheduled;
    public final Path hintArrow;
    public RLottieDrawable hintDrawable;
    public final RectF hintRect;
    public final Text hintText;
    public final Runnable invalidate;
    public final boolean isPiP;
    public long lastFrameTime;
    public float lastSpeed;
    public final Path leftArrow;
    public final Path rightArrow;
    public boolean showHint;
    public boolean shown;
    public final RectF speedRect;
    public final QrActivity.QrView.AnonymousClass1 speedText;
    public float t;

    public SeekSpeedDrawable(Runnable runnable, boolean z) {
        Paint paint = new Paint(1);
        this.arrowPaint = paint;
        Path path = new Path();
        this.hintArrow = path;
        this.hintText = new Text(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.leftArrow = path2;
        Path path3 = new Path();
        this.rightArrow = path3;
        this.direction = 1;
        this.speedRect = new RectF();
        this.hintRect = new RectF();
        this.hideHintRunnable = new SeekBarView$$ExternalSyntheticLambda1(this, 12);
        this.invalidate = runnable;
        this.isPiP = z;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        AnimatedFloat animatedFloat = new AnimatedFloat(runnable, 360L, cubicBezierInterpolator, 0);
        this.animatedShown = animatedFloat;
        animatedFloat.set(0.0f, true);
        this.animatedDirection = new AnimatedFloat(runnable, 320L, cubicBezierInterpolator, 0);
        this.animatedSpeed = new AnimatedFloat(runnable, 200L, cubicBezierInterpolator, 0);
        AnimatedFloat animatedFloat2 = new AnimatedFloat(runnable, 360L, cubicBezierInterpolator, 0);
        this.animatedHintShown = animatedFloat2;
        animatedFloat2.set(0.0f, true);
        QrActivity.QrView.AnonymousClass1 anonymousClass1 = new QrActivity.QrView.AnonymousClass1(runnable);
        this.speedText = anonymousClass1;
        anonymousClass1.scaleAmplitude = 0.3f;
        anonymousClass1.moveAmplitude = 0.4f;
        anonymousClass1.animateDuration = 650L;
        anonymousClass1.animateWave = 1.6f;
        anonymousClass1.animateInterpolator = cubicBezierInterpolator;
        Typeface typeface = AndroidUtilities.getTypeface("fonts/num.otf");
        TextPaint textPaint = anonymousClass1.textPaint;
        textPaint.setTypeface(typeface);
        anonymousClass1.setTextSize(AndroidUtilities.dp(16.0f));
        setSpeed(2.0f, false);
        textPaint.setColor(-1);
        anonymousClass1.alpha = Color.alpha(-1);
        anonymousClass1.gravity = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.showHint = (z || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : true;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float currentWidth = this.speedText.getCurrentWidth() + AndroidUtilities.dp(46.0f);
        float f = this.animatedShown.set(this.shown);
        float f2 = this.animatedDirection.set(this.direction, false);
        if (f <= 0.0f) {
            return;
        }
        float f3 = this.animatedSpeed.set(Math.abs(this.lastSpeed), false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        float fMin = Math.min(0.016f, (jCurrentTimeMillis - this.lastFrameTime) / 1000.0f);
        this.lastFrameTime = jCurrentTimeMillis;
        this.t = (Math.min(f3, 4.0f) * 1.5f * fMin) + this.t;
        this.invalidate.run();
        float f4 = currentWidth / 2.0f;
        this.speedRect.set(bounds.centerX() - f4, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f4, AndroidUtilities.dp(37.0f) + bounds.top);
        canvas.save();
        float f5 = f * 0.4f;
        float f6 = 0.6f + f5;
        if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
            f6 *= 0.75f;
            if (this.isPiP) {
                canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
            }
        }
        canvas.scale(f6, f6, this.speedRect.centerX(), this.speedRect.top);
        canvas.translate(0.0f, (1.0f - f) * (-AndroidUtilities.dp(15.0f)));
        canvas.clipRect(this.speedRect);
        this.backgroundPaint.setColor(Theme.multAlpha(f5, -16777216));
        RectF rectF = this.speedRect;
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.speedRect.height() / 2.0f, this.backgroundPaint);
        this.speedText.setBounds(this.speedRect);
        canvas.save();
        float f7 = -f2;
        canvas.translate(((this.speedRect.centerX() - f4) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f7)) * AndroidUtilities.dp(30.0f)), this.speedRect.centerY());
        this.arrowPaint.setColor(Theme.multAlpha(((((((float) Math.sin(((double) this.t) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f7) * f, -1));
        canvas.drawPath(this.leftArrow, this.arrowPaint);
        canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
        this.arrowPaint.setColor(Theme.multAlpha(((((((float) Math.sin(((double) (this.t + 0.17f)) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f7) * f, -1));
        canvas.drawPath(this.leftArrow, this.arrowPaint);
        canvas.restore();
        canvas.save();
        canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * f2, 0.0f);
        QrActivity.QrView.AnonymousClass1 anonymousClass1 = this.speedText;
        anonymousClass1.alpha = (int) (f * 255.0f);
        anonymousClass1.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(((1.0f - Math.max(0.0f, f2)) * AndroidUtilities.dp(30.0f)) + ((this.speedRect.centerX() + f4) - AndroidUtilities.dp(30.0f)), this.speedRect.centerY());
        this.arrowPaint.setColor(Theme.multAlpha(((((((float) Math.sin(((double) this.t) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f2) * f, -1));
        canvas.drawPath(this.rightArrow, this.arrowPaint);
        canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
        this.arrowPaint.setColor(Theme.multAlpha(((((((float) Math.sin(((double) (this.t - 0.17f)) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f2) * f, -1));
        canvas.drawPath(this.rightArrow, this.arrowPaint);
        canvas.restore();
        canvas.restore();
        float f8 = this.animatedHintShown.set(this.showHint && this.shown);
        if (f8 > 0.0f) {
            if (this.hintDrawable == null) {
                int i = R.raw.seek_speed_hint;
                RLottieDrawable rLottieDrawable = new RLottieDrawable(i, SurfaceContainer$$ExternalSyntheticOutline0.m(i, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                this.hintDrawable = rLottieDrawable;
                rLottieDrawable.decodeSingleFrame = true;
                rLottieDrawable.scheduleNextGetFrame();
                this.hintDrawable.setCallback(new RichDetailsCell.AnonymousClass1(this, 8));
                this.hintDrawable.setAutoRepeat(1);
                this.hintDrawable.start();
            }
            float fDp = this.hintText.width + AndroidUtilities.dp(54.0f);
            float fDp2 = AndroidUtilities.dp(32.0f);
            RectF rectF2 = this.hintRect;
            float f9 = fDp / 2.0f;
            float fCenterX = bounds.centerX() - f9;
            RectF rectF3 = this.speedRect;
            float fHeight = (rectF3.height() * f) + rectF3.top + AndroidUtilities.dp(11.0f);
            float fCenterX2 = bounds.centerX() + f9;
            RectF rectF4 = this.speedRect;
            rectF2.set(fCenterX, fHeight, fCenterX2, (rectF4.height() * f) + rectF4.top + AndroidUtilities.dp(11.0f) + fDp2);
            canvas.save();
            float f10 = (0.25f * f8) + 0.75f;
            canvas.scale(f10, f10, this.hintRect.centerX(), this.hintRect.top);
            this.backgroundPaint.setColor(Theme.multAlpha(f8 * 0.4f, -16777216));
            canvas.save();
            canvas.translate(this.hintRect.centerX(), this.hintRect.top);
            canvas.drawPath(this.hintArrow, this.backgroundPaint);
            canvas.restore();
            canvas.drawRoundRect(this.hintRect, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.backgroundPaint);
            this.hintDrawable.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.hintRect.left), ((int) this.hintRect.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.hintRect.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.hintRect.centerY()));
            this.hintDrawable.setAlpha((int) (255.0f * f8));
            if (!this.hintDrawable.isRunning) {
                this.hintDrawable.restart(true);
            }
            this.hintDrawable.draw(canvas);
            this.hintText.draw(this.hintRect.left + AndroidUtilities.dp(39.0f), this.hintRect.centerY(), f8, -1, canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final boolean isShown() {
        return this.shown || this.animatedShown.value > 0.0f;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setShown(boolean z) {
        this.shown = z;
        this.invalidate.run();
        RLottieDrawable rLottieDrawable = this.hintDrawable;
        if (rLottieDrawable == null || !this.showHint) {
            return;
        }
        if (z) {
            rLottieDrawable.restart(false);
        } else {
            rLottieDrawable.isRunning = false;
            rLottieDrawable.checkChoreographer$1();
        }
    }

    public final void setSpeed(float f, boolean z) {
        if (Math.floor(this.lastSpeed * 10.0f) != Math.floor(10.0f * f)) {
            QrActivity.QrView.AnonymousClass1 anonymousClass1 = this.speedText;
            anonymousClass1.cancelAnimation();
            anonymousClass1.setText(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f))), z, true);
            this.lastSpeed = f;
        }
        int i = f > 0.0f ? 1 : -1;
        this.direction = i;
        if (!z) {
            this.animatedDirection.set(i, true);
        }
        this.invalidate.run();
        if (!this.showHint || Math.abs(f) <= 3.0f || this.hideHintScheduled) {
            return;
        }
        this.hideHintScheduled = true;
        AndroidUtilities.runOnUIThread(this.hideHintRunnable, 2500L);
        MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
    }
}
