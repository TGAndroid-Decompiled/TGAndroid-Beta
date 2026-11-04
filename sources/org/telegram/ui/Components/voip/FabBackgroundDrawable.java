package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class FabBackgroundDrawable extends Drawable {
    public final Paint f39201a = new Paint(1);
    public final Paint f39202b;
    public Bitmap f39203c;

    public FabBackgroundDrawable() {
        Paint paint = new Paint();
        this.f39202b = paint;
        paint.setColor(1275068416);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i3;
        if (this.f39203c == null) {
            onBoundsChange(getBounds());
        }
        int min = Math.min(getBounds().width(), getBounds().height());
        Bitmap bitmap = this.f39203c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, getBounds().centerX() - (this.f39203c.getWidth() / 2), getBounds().centerY() - (this.f39203c.getHeight() / 2), this.f39202b);
        }
        float f10 = min / 2;
        canvas.drawCircle(f10, f10, i3 - org.telegram.messenger.g0.L(4.0f), this.f39201a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final boolean getPadding(Rect rect) {
        int L = org.telegram.messenger.g0.L(4.0f);
        rect.set(L, L, L, L);
        return true;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        int i3;
        int min = Math.min(rect.width(), rect.height());
        if (min <= 0) {
            this.f39203c = null;
            return;
        }
        this.f39203c = Bitmap.createBitmap(min, min, Bitmap.Config.ALPHA_8);
        float f10 = min / 2;
        new Canvas(this.f39203c).drawCircle(f10, f10, i3 - org.telegram.messenger.g0.L(4.0f), new Paint(1));
    }

    public void setColor(int i3) {
        this.f39201a.setColor(i3);
        invalidateSelf();
    }

    @Override
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
