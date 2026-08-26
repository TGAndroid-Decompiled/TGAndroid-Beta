package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

public class OptionsSpeedIconDrawable extends Drawable {
    private AnimatedTextView.AnimatedTextDrawable textDrawable;
    private boolean textDrawableVisible;
    private Paint paint = new Paint(1);
    private final Drawable.Callback callback = new Drawable.Callback() {
        @Override
        public void invalidateDrawable(Drawable drawable) {
            OptionsSpeedIconDrawable.this.invalidateSelf();
        }

        @Override
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            OptionsSpeedIconDrawable.this.scheduleSelf(runnable, j);
        }

        @Override
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            OptionsSpeedIconDrawable.this.unscheduleSelf(runnable);
        }
    };
    private AnimatedFloat textDrawableAlpha = new AnimatedFloat(new GroupCallPip$$ExternalSyntheticLambda2(this, 24), 250, CubicBezierInterpolator.EASE_OUT_QUINT);

    public OptionsSpeedIconDrawable() {
        this.paint.setColor(-1);
    }

    @Override
    public void draw(Canvas canvas) {
        if (getBounds() == null) {
            return;
        }
        int iCenterX = getBounds().centerX();
        int iCenterY = getBounds().centerY();
        float f = iCenterX;
        float f2 = iCenterY;
        canvas.drawCircle(f, f2 - AndroidUtilities.dpf2(6.0f), AndroidUtilities.dpf2(2.0f), this.paint);
        canvas.drawCircle(f, f2, AndroidUtilities.dpf2(2.0f), this.paint);
        canvas.drawCircle(f, AndroidUtilities.dpf2(6.0f) + f2, AndroidUtilities.dpf2(2.0f), this.paint);
        if (this.textDrawable != null) {
            canvas.save();
            int iDp = iCenterX - AndroidUtilities.dp(11.6f);
            int iDp2 = AndroidUtilities.dp(4.0f) + iCenterY;
            float f3 = this.textDrawableAlpha.set(this.textDrawableVisible ? 1.0f : 0.0f);
            int alpha = this.paint.getAlpha();
            if (f3 < 1.0f) {
                this.paint.setAlpha((int) (f3 * 255.0f));
            }
            RectF rectF = AndroidUtilities.rectTmp;
            float f4 = iDp;
            float f5 = iDp2;
            rectF.set((f4 - AndroidUtilities.dpf2(1.5f)) - (this.textDrawable.getCurrentWidth() / 2.0f), f5 - AndroidUtilities.dpf2(4.0f), (this.textDrawable.getCurrentWidth() / 2.0f) + AndroidUtilities.dpf2(1.5f) + f4, AndroidUtilities.dpf2(5.0f) + f5);
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(2.0f), AndroidUtilities.dpf2(2.0f), this.paint);
            canvas.save();
            this.textDrawable.setBounds(iDp, iDp2, iDp, iDp2);
            this.textDrawable.draw(canvas);
            canvas.restore();
            this.paint.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(45.0f);
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(45.0f);
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i) {
        this.paint.setAlpha(i);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    public void setSpeed(Float f, boolean z) {
        if (f == null && this.textDrawable == null) {
            return;
        }
        if (this.textDrawable == null) {
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
            this.textDrawable = animatedTextDrawable;
            animatedTextDrawable.setCallback(this.callback);
            this.textDrawable.setAnimationProperties(0.3f, 0L, 165L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.textDrawable.setGravity(1);
            this.textDrawable.setTypeface(AndroidUtilities.bold());
            this.textDrawable.setTextSize(AndroidUtilities.dp(7.0f));
            this.textDrawable.setTextColor(-1);
            this.textDrawable.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
            this.textDrawable.getPaint().setStrokeWidth(AndroidUtilities.dpf2(0.1f));
            this.textDrawable.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        if (f == null) {
            this.textDrawable.cancelAnimation();
            this.textDrawable.setText("", z);
            this.textDrawableVisible = false;
        } else {
            String number = SpeedIconDrawable.formatNumber(f.floatValue());
            if (number.length() <= 1) {
                number = number.concat("X");
            }
            if (!TextUtils.equals(number, this.textDrawable.getText())) {
                this.textDrawable.cancelAnimation();
                this.textDrawable.setText(number, z);
                this.textDrawableVisible = !TextUtils.isEmpty(number);
            }
        }
        invalidateSelf();
    }
}
