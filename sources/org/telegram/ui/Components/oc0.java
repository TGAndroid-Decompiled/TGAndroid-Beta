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
public final class oc0 extends Drawable {
    public final Drawable f29732a;
    public final Paint f29733b;
    public final Paint f29734c;
    public final z5 d;
    public boolean f29735e;

    public oc0(Context context) {
        Paint paint = new Paint(1);
        this.f29733b = paint;
        Paint paint2 = new Paint(1);
        this.f29734c = paint2;
        this.d = new z5(new ec0(this, 2), 200L, pr.f30184g, 0);
        this.f29732a = context.getResources().getDrawable(R.drawable.filled_sound_on).mutate();
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
        Drawable drawable = this.f29732a;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        float e6 = this.d.e(this.f29735e);
        if (e6 > 0.0f) {
            float dpf2 = AndroidUtilities.dpf2(0.783f);
            float centerX = (bounds.centerX() - AndroidUtilities.dp(9.0f)) + dpf2;
            float centerY = (bounds.centerY() - AndroidUtilities.dp(9.0f)) + dpf2;
            float dp = (AndroidUtilities.dp(9.0f) + bounds.centerX()) - dpf2;
            float dp2 = (AndroidUtilities.dp(9.0f) + bounds.centerY()) - dpf2;
            if (this.f29735e) {
                centerX = AndroidUtilities.lerp(dp, centerX, e6);
                centerY = AndroidUtilities.lerp(dp2, centerY, e6);
            } else {
                dp = AndroidUtilities.lerp(centerX, dp, e6);
                dp2 = AndroidUtilities.lerp(centerY, dp2, e6);
            }
            float f10 = dp2;
            float f11 = centerX;
            float f12 = centerY;
            float f13 = dp;
            canvas.drawLine(f11, f12, f13, f10, this.f29734c);
            Paint paint = this.f29733b;
            paint.setAlpha((int) (Math.min(1.0f, e6 * 10.0f) * 255.0f));
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
        this.f29732a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
