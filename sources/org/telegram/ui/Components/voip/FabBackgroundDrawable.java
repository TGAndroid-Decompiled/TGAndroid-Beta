package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class FabBackgroundDrawable extends Drawable {
    public final Paint f40880a = new Paint(1);
    public final Paint f40881b;
    public Bitmap f40882c;

    public FabBackgroundDrawable() {
        Paint paint = new Paint();
        this.f40881b = paint;
        paint.setColor(1275068416);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        if (this.f40882c == null) {
            onBoundsChange(getBounds());
        }
        int min = Math.min(getBounds().width(), getBounds().height());
        Bitmap bitmap = this.f40882c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, getBounds().centerX() - (this.f40882c.getWidth() / 2), getBounds().centerY() - (this.f40882c.getHeight() / 2), this.f40881b);
        }
        float f10 = min / 2;
        canvas.drawCircle(f10, f10, i7 - org.telegram.messenger.g0.L(4.0f), this.f40880a);
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
            this.f40882c = null;
            return;
        }
        this.f40882c = Bitmap.createBitmap(min, min, Bitmap.Config.ALPHA_8);
        float f10 = min / 2;
        new Canvas(this.f40882c).drawCircle(f10, f10, i7 - org.telegram.messenger.g0.L(4.0f), new Paint(1));
    }

    public void setColor(int i7) {
        this.f40880a.setColor(i7);
        invalidateSelf();
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
