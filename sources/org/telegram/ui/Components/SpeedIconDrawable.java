package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedTextView;
public class SpeedIconDrawable extends Drawable {
    private final Drawable.Callback callback;
    private final Paint outlinePaint;
    private final AnimatedTextView.AnimatedTextDrawable textDrawable;

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public SpeedIconDrawable(boolean z) {
        Drawable.Callback callback = new Drawable.Callback() {
            @Override
            public void invalidateDrawable(Drawable drawable) {
                SpeedIconDrawable.this.invalidateSelf();
            }

            @Override
            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                SpeedIconDrawable.this.scheduleSelf(runnable, j);
            }

            @Override
            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                SpeedIconDrawable.this.unscheduleSelf(runnable);
            }
        };
        this.callback = callback;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.textDrawable = animatedTextDrawable;
        animatedTextDrawable.setCallback(callback);
        animatedTextDrawable.setAnimationProperties(0.3f, 0L, 165L, CubicBezierInterpolator.EASE_OUT_QUINT);
        animatedTextDrawable.setGravity(1);
        animatedTextDrawable.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(10.0f));
        animatedTextDrawable.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        animatedTextDrawable.getPaint().setStrokeWidth(AndroidUtilities.dpf2(0.6f));
        if (z) {
            Paint paint = new Paint(1);
            this.outlinePaint = paint;
            paint.setStyle(Paint.Style.STROKE);
            return;
        }
        this.outlinePaint = null;
    }

    public static String formatNumber(float f) {
        Math.abs(f - 0.25f);
        float round = Math.round(f * 10.0f) / 10.0f;
        long j = round;
        if (round == ((float) j)) {
            return "" + j;
        }
        return "" + round;
    }

    public void setValue(float f, boolean z) {
        String str = formatNumber(f) + "X";
        if (z && TextUtils.equals(this.textDrawable.getText(), str)) {
            return;
        }
        this.textDrawable.cancelAnimation();
        this.textDrawable.setText(str, z);
        invalidateSelf();
    }

    @Override
    public void draw(Canvas canvas) {
        Paint paint = this.outlinePaint;
        if (paint != null) {
            paint.setStrokeWidth(AndroidUtilities.dpf2(1.6f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(((getIntrinsicWidth() - this.textDrawable.getCurrentWidth()) / 2.0f) - AndroidUtilities.dpf2(3.0f), ((getIntrinsicHeight() - this.textDrawable.getHeight()) / 2.0f) + AndroidUtilities.dpf2(0.2f), ((getIntrinsicWidth() + this.textDrawable.getCurrentWidth()) / 2.0f) + AndroidUtilities.dpf2(3.0f), (getIntrinsicHeight() + this.textDrawable.getHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(3.0f), this.outlinePaint);
        }
        this.textDrawable.getPaint().setStrokeWidth(AndroidUtilities.dpf2(0.3f));
        this.textDrawable.setBounds(0, (int) ((getIntrinsicHeight() - this.textDrawable.getHeight()) / 2.0f), getIntrinsicWidth(), (int) ((getIntrinsicHeight() + this.textDrawable.getHeight()) / 2.0f));
        this.textDrawable.draw(canvas);
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public void setAlpha(int i) {
        this.textDrawable.setAlpha(i);
        Paint paint = this.outlinePaint;
        if (paint != null) {
            paint.setAlpha(i);
        }
    }

    public void setColor(int i) {
        this.textDrawable.setTextColor(i);
        Paint paint = this.outlinePaint;
        if (paint != null) {
            paint.setColor(i);
        }
    }
}
