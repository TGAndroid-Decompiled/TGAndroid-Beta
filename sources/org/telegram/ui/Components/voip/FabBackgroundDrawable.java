package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class FabBackgroundDrawable extends Drawable {
    public final Paint f40482a = new Paint(1);
    public final Paint f40483b;
    public Bitmap f40484c;

    public FabBackgroundDrawable() {
        Paint paint = new Paint();
        this.f40483b = paint;
        paint.setColor(1275068416);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        if (this.f40484c == null) {
            onBoundsChange(getBounds());
        }
        int min = Math.min(getBounds().width(), getBounds().height());
        Bitmap bitmap = this.f40484c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, getBounds().centerX() - (this.f40484c.getWidth() / 2), getBounds().centerY() - (this.f40484c.getHeight() / 2), this.f40483b);
        }
        float f10 = min / 2;
        canvas.drawCircle(f10, f10, i7 - org.telegram.messenger.g0.L(4.0f), this.f40482a);
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
            this.f40484c = null;
            return;
        }
        this.f40484c = Bitmap.createBitmap(min, min, Bitmap.Config.ALPHA_8);
        float f10 = min / 2;
        new Canvas(this.f40484c).drawCircle(f10, f10, i7 - org.telegram.messenger.g0.L(4.0f), new Paint(1));
    }

    public void setColor(int i7) {
        this.f40482a.setColor(i7);
        invalidateSelf();
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
