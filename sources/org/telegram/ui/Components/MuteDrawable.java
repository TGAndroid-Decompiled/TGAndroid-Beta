package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public class MuteDrawable extends Drawable {
    private final AnimatedFloat animatedMuted;
    private Drawable baseDrawable;
    private final Paint clipPaint;
    private boolean muted;
    private final Paint strokePaint;

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public MuteDrawable(Context context) {
        Paint paint = new Paint(1);
        this.strokePaint = paint;
        Paint paint2 = new Paint(1);
        this.clipPaint = paint2;
        this.animatedMuted = new AnimatedFloat(new Runnable() {
            @Override
            public final void run() {
                this.f$0.invalidateSelf();
            }
        }, 0L, 200L, CubicBezierInterpolator.EASE_OUT);
        this.baseDrawable = context.getResources().getDrawable(R.drawable.filled_sound_on).mutate();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.566f));
        paint.setColor(-1);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint2.setStyle(style);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(4.5f));
        paint2.setColor(-65536);
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
    }

    @Override
    public void draw(Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        this.baseDrawable.setBounds(bounds);
        this.baseDrawable.draw(canvas);
        float f = this.animatedMuted.set(this.muted);
        if (f > 0.0f) {
            float fDpf2 = AndroidUtilities.dpf2(0.783f);
            float fCenterX = (bounds.centerX() - AndroidUtilities.dp(9.0f)) + fDpf2;
            float fCenterY = (bounds.centerY() - AndroidUtilities.dp(9.0f)) + fDpf2;
            float fCenterX2 = (bounds.centerX() + AndroidUtilities.dp(9.0f)) - fDpf2;
            float fCenterY2 = (bounds.centerY() + AndroidUtilities.dp(9.0f)) - fDpf2;
            if (this.muted) {
                fCenterX = AndroidUtilities.lerp(fCenterX2, fCenterX, f);
                fCenterY = AndroidUtilities.lerp(fCenterY2, fCenterY, f);
            } else {
                fCenterX2 = AndroidUtilities.lerp(fCenterX, fCenterX2, f);
                fCenterY2 = AndroidUtilities.lerp(fCenterY, fCenterY2, f);
            }
            float f2 = fCenterX;
            float f3 = fCenterY;
            float f4 = fCenterX2;
            float f5 = fCenterY2;
            canvas.drawLine(f2, f3, f4, f5, this.clipPaint);
            this.strokePaint.setAlpha((int) (Math.min(1.0f, f * 10.0f) * 255.0f));
            canvas.drawLine(f2, f3, f4, f5, this.strokePaint);
        }
        canvas.restore();
    }

    public void setMuted(boolean z, boolean z2) {
        this.muted = z;
        if (!z2) {
            this.animatedMuted.set(z, true);
        }
        invalidateSelf();
    }

    @Override
    public void setAlpha(int i) {
        this.baseDrawable.setAlpha(i);
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }
}
