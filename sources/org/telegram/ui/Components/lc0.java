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
public final class lc0 extends Drawable {
    public final Drawable f28162a;
    public final Paint f28163b;
    public final Paint f28164c;
    public final e6 d;
    public boolean f28165e;

    public lc0(Context context) {
        Paint paint = new Paint(1);
        this.f28163b = paint;
        Paint paint2 = new Paint(1);
        this.f28164c = paint2;
        this.d = new e6(new cc0(this, 2), 200L, pr.f29494g, 0);
        this.f28162a = context.getResources().getDrawable(R.drawable.filled_sound_on).mutate();
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
        Drawable drawable = this.f28162a;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        float e7 = this.d.e(this.f28165e);
        if (e7 > 0.0f) {
            float dpf2 = AndroidUtilities.dpf2(0.783f);
            float centerX = (bounds.centerX() - AndroidUtilities.dp(9.0f)) + dpf2;
            float centerY = (bounds.centerY() - AndroidUtilities.dp(9.0f)) + dpf2;
            float dp = (AndroidUtilities.dp(9.0f) + bounds.centerX()) - dpf2;
            float dp2 = (AndroidUtilities.dp(9.0f) + bounds.centerY()) - dpf2;
            if (this.f28165e) {
                centerX = AndroidUtilities.lerp(dp, centerX, e7);
                centerY = AndroidUtilities.lerp(dp2, centerY, e7);
            } else {
                dp = AndroidUtilities.lerp(centerX, dp, e7);
                dp2 = AndroidUtilities.lerp(centerY, dp2, e7);
            }
            float f7 = dp2;
            float f10 = centerX;
            float f11 = centerY;
            float f12 = dp;
            canvas.drawLine(f10, f11, f12, f7, this.f28164c);
            Paint paint = this.f28163b;
            paint.setAlpha((int) (Math.min(1.0f, e7 * 10.0f) * 255.0f));
            canvas.drawLine(f10, f11, f12, f7, paint);
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
        this.f28162a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
