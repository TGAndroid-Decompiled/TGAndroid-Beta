package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class FabBackgroundDrawable extends Drawable {
    public final Paint f39071a = new Paint(1);
    public final Paint f39072b;
    public Bitmap f39073c;

    public FabBackgroundDrawable() {
        Paint paint = new Paint();
        this.f39072b = paint;
        paint.setColor(1275068416);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        if (this.f39073c == null) {
            onBoundsChange(getBounds());
        }
        int min = Math.min(getBounds().width(), getBounds().height());
        Bitmap bitmap = this.f39073c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, getBounds().centerX() - (this.f39073c.getWidth() / 2), getBounds().centerY() - (this.f39073c.getHeight() / 2), this.f39072b);
        }
        float f10 = min / 2;
        canvas.drawCircle(f10, f10, i7 - org.telegram.messenger.g0.L(4.0f), this.f39071a);
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
        int i7;
        int min = Math.min(rect.width(), rect.height());
        if (min <= 0) {
            this.f39073c = null;
            return;
        }
        this.f39073c = Bitmap.createBitmap(min, min, Bitmap.Config.ALPHA_8);
        float f10 = min / 2;
        new Canvas(this.f39073c).drawCircle(f10, f10, i7 - org.telegram.messenger.g0.L(4.0f), new Paint(1));
    }

    public void setColor(int i7) {
        this.f39071a.setColor(i7);
        invalidateSelf();
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
