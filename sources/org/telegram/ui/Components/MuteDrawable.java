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

public final class MuteDrawable extends Drawable {
    public final AnimatedFloat animatedMuted;
    public final Drawable baseDrawable;
    public final Paint clipPaint;
    public boolean muted;
    public final Paint strokePaint;

    public MuteDrawable(Context context) {
        Paint paint = new Paint(1);
        this.strokePaint = paint;
        Paint paint2 = new Paint(1);
        this.clipPaint = paint2;
        this.animatedMuted = new AnimatedFloat(new HintView$1$$ExternalSyntheticLambda0(this, 24), 200L, CubicBezierInterpolator.EASE_OUT, 0);
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
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.baseDrawable;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
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
            Paint paint = this.strokePaint;
            paint.setAlpha((int) (Math.min(1.0f, f * 10.0f) * 255.0f));
            canvas.drawLine(f3, f4, f5, f2, paint);
        }
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.baseDrawable.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
