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

public final class vb0 extends Drawable {

    public final Drawable f33344a;

    public final Paint f33345b;

    public final Paint f33346c;
    public final y5 d;

    public boolean f33347e;

    public vb0(Context context) {
        Paint paint = new Paint(1);
        this.f33345b = paint;
        Paint paint2 = new Paint(1);
        this.f33346c = paint2;
        this.d = new y5(new mb0(this, 2), 200L, er.f28123g, 0);
        this.f33344a = context.getResources().getDrawable(R.drawable.filled_sound_on).mutate();
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
        Drawable drawable = this.f33344a;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        float fE = this.d.e(this.f33347e);
        if (fE > 0.0f) {
            float fDpf2 = AndroidUtilities.dpf2(0.783f);
            float fCenterX = (bounds.centerX() - AndroidUtilities.dp(9.0f)) + fDpf2;
            float fCenterY = (bounds.centerY() - AndroidUtilities.dp(9.0f)) + fDpf2;
            float fDp = (AndroidUtilities.dp(9.0f) + bounds.centerX()) - fDpf2;
            float fDp2 = (AndroidUtilities.dp(9.0f) + bounds.centerY()) - fDpf2;
            if (this.f33347e) {
                fCenterX = AndroidUtilities.lerp(fDp, fCenterX, fE);
                fCenterY = AndroidUtilities.lerp(fDp2, fCenterY, fE);
            } else {
                fDp = AndroidUtilities.lerp(fCenterX, fDp, fE);
                fDp2 = AndroidUtilities.lerp(fCenterY, fDp2, fE);
            }
            float f10 = fDp2;
            float f11 = fCenterX;
            float f12 = fCenterY;
            float f13 = fDp;
            canvas.drawLine(f11, f12, f13, f10, this.f33346c);
            int iMin = (int) (Math.min(1.0f, fE * 10.0f) * 255.0f);
            Paint paint = this.f33345b;
            paint.setAlpha(iMin);
            canvas.drawLine(f11, f12, f13, f10, paint);
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
    public final void setAlpha(int i10) {
        this.f33344a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
