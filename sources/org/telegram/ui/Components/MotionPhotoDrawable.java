package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

public class MotionPhotoDrawable extends Drawable {
    private final AnimatedFloat animatedDisabled;
    public final Paint clearPaint;
    private boolean disabled;
    private final Path play;
    public final Paint playPaint;
    public final Paint strokePaint;

    public MotionPhotoDrawable() {
        Path path = new Path();
        this.play = path;
        Paint paint = new Paint(1);
        this.strokePaint = paint;
        Paint paint2 = new Paint(1);
        this.playPaint = paint2;
        Paint paint3 = new Paint(1);
        this.clearPaint = paint3;
        this.animatedDisabled = new AnimatedFloat(new GroupCallPip$$ExternalSyntheticLambda2(this, 22), 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(-1);
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(2.0f)));
        paint2.setColor(-1);
        paint3.setStyle(style);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        path.moveTo(-AndroidUtilities.dpf2(3.75f), -AndroidUtilities.dpf2(5.4166f));
        path.lineTo(AndroidUtilities.dpf2(3.75f), 0.0f);
        path.lineTo(-AndroidUtilities.dpf2(3.75f), AndroidUtilities.dpf2(5.4166f));
        path.close();
    }

    @Override
    public void draw(Canvas canvas) {
        this.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        this.clearPaint.setStrokeWidth(AndroidUtilities.dpf2(3.32f));
        float f = this.animatedDisabled.set(this.disabled);
        float fCenterX = getBounds().centerX();
        float fCenterY = getBounds().centerY();
        float fDpf2 = AndroidUtilities.dpf2(10.66f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(fCenterX - fDpf2, fCenterY - fDpf2, fCenterX + fDpf2, fDpf2 + fCenterY);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(8.33f), AndroidUtilities.dpf2(8.33f), this.strokePaint);
        if (f > 0.0f) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        } else {
            canvas.save();
        }
        canvas.save();
        canvas.translate(AndroidUtilities.dpf2(1.0f) + fCenterX, fCenterY - AndroidUtilities.dpf2(0.5f));
        canvas.drawPath(this.play, this.playPaint);
        canvas.restore();
        if (f > 0.0f) {
            if (this.disabled) {
                canvas.drawLine(fCenterX - AndroidUtilities.dpf2(8.33f), fCenterY - AndroidUtilities.dpf2(8.33f), (fCenterX - AndroidUtilities.dpf2(8.33f)) + (AndroidUtilities.dpf2(16.66f) * f), (fCenterY - AndroidUtilities.dpf2(8.33f)) + (AndroidUtilities.dpf2(16.66f) * f), this.clearPaint);
                canvas.drawLine(fCenterX - AndroidUtilities.dpf2(8.33f), fCenterY - AndroidUtilities.dpf2(8.33f), (AndroidUtilities.dpf2(16.66f) * f) + (fCenterX - AndroidUtilities.dpf2(8.33f)), (AndroidUtilities.dpf2(16.66f) * f) + (fCenterY - AndroidUtilities.dpf2(8.33f)), this.strokePaint);
            } else {
                canvas.drawLine(AndroidUtilities.dpf2(8.33f) + fCenterX, AndroidUtilities.dpf2(8.33f) + fCenterY, (AndroidUtilities.dpf2(8.33f) + fCenterX) - (AndroidUtilities.dpf2(16.66f) * f), (AndroidUtilities.dpf2(8.33f) + fCenterY) - (AndroidUtilities.dpf2(16.66f) * f), this.clearPaint);
                canvas.drawLine(AndroidUtilities.dpf2(8.33f) + fCenterX, AndroidUtilities.dpf2(8.33f) + fCenterY, (AndroidUtilities.dpf2(8.33f) + fCenterX) - (AndroidUtilities.dpf2(16.66f) * f), (AndroidUtilities.dpf2(8.33f) + fCenterY) - (AndroidUtilities.dpf2(16.66f) * f), this.strokePaint);
            }
        }
        canvas.restore();
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i) {
        this.strokePaint.setAlpha(i);
        this.playPaint.setAlpha(i);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.playPaint.setColorFilter(colorFilter);
        this.strokePaint.setColorFilter(colorFilter);
    }

    public void setDisabled(boolean z, boolean z2) {
        this.disabled = z;
        if (!z2) {
            this.animatedDisabled.force(z);
        }
        invalidateSelf();
    }
}
