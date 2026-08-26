package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public class MuteDrawable extends Drawable {
    private final AnimatedFloat animatedMuted;
    private Drawable baseDrawable;
    private final Paint clipPaint;
    private boolean muted;
    private final Paint strokePaint;

    public MuteDrawable(Context context) {
        Paint paint = new Paint(1);
        this.strokePaint = paint;
        Paint paint2 = new Paint(1);
        this.clipPaint = paint2;
        this.animatedMuted = new AnimatedFloat(new GroupCallPip$$ExternalSyntheticLambda2(this, 23), 0L, 200L, CubicBezierInterpolator.EASE_OUT);
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
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        this.baseDrawable.setBounds(bounds);
        this.baseDrawable.draw(canvas);
        float f = this.animatedMuted.set(this.muted);
        if (f > 0.0f) {
            float fDpf2 = AndroidUtilities.dpf2(0.783f);
            float fCenterX = (bounds.centerX() - AndroidUtilities.dp(9.0f)) + fDpf2;
            float fCenterY = (bounds.centerY() - AndroidUtilities.dp(9.0f)) + fDpf2;
            float fDp = (AndroidUtilities.dp(9.0f) + bounds.centerX()) - fDpf2;
            float fDp2 = (AndroidUtilities.dp(9.0f) + bounds.centerY()) - fDpf2;
            if (this.muted) {
                fCenterX = AndroidUtilities.lerp(fDp, fCenterX, f);
                fCenterY = AndroidUtilities.lerp(fDp2, fCenterY, f);
            } else {
                fDp = AndroidUtilities.lerp(fCenterX, fDp, f);
                fDp2 = AndroidUtilities.lerp(fCenterY, fDp2, f);
            }
            float f2 = fDp2;
            float f3 = fCenterX;
            float f4 = fCenterY;
            float f5 = fDp;
            canvas.drawLine(f3, f4, f5, f2, this.clipPaint);
            this.strokePaint.setAlpha((int) (Math.min(1.0f, f * 10.0f) * 255.0f));
            canvas.drawLine(f3, f4, f5, f2, this.strokePaint);
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
        this.baseDrawable.setAlpha(i);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setMuted(boolean z, boolean z2) {
        this.muted = z;
        if (!z2) {
            this.animatedMuted.set(z, true);
        }
        invalidateSelf();
    }
}
