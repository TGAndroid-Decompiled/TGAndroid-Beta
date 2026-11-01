package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class FabBackgroundDrawable extends Drawable {
    public final Paint f31358a = new Paint(1);
    public final Paint f31359b;
    public Bitmap f31360c;

    public FabBackgroundDrawable() {
        Paint paint = new Paint();
        this.f31359b = paint;
        paint.setColor(1275068416);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        if (this.f31360c == null) {
            onBoundsChange(getBounds());
        }
        int min = Math.min(getBounds().width(), getBounds().height());
        Bitmap bitmap = this.f31360c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, getBounds().centerX() - (this.f31360c.getWidth() / 2), getBounds().centerY() - (this.f31360c.getHeight() / 2), this.f31359b);
        }
        float f7 = min / 2;
        canvas.drawCircle(f7, f7, i10 - org.telegram.messenger.i0.L(4.0f), this.f31358a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final boolean getPadding(Rect rect) {
        int L = org.telegram.messenger.i0.L(4.0f);
        rect.set(L, L, L, L);
        return true;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        int i10;
        int min = Math.min(rect.width(), rect.height());
        if (min <= 0) {
            this.f31360c = null;
            return;
        }
        this.f31360c = Bitmap.createBitmap(min, min, Bitmap.Config.ALPHA_8);
        float f7 = min / 2;
        new Canvas(this.f31360c).drawCircle(f7, f7, i10 - org.telegram.messenger.i0.L(4.0f), new Paint(1));
    }

    public void setColor(int i10) {
        this.f31358a.setColor(i10);
        invalidateSelf();
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
