package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

public final class FabBackgroundDrawable extends Drawable {
    public final Paint bgPaint = new Paint(1);
    public Bitmap shadowBitmap;
    public final Paint shadowPaint;

    public FabBackgroundDrawable() {
        Paint paint = new Paint();
        this.shadowPaint = paint;
        paint.setColor(1275068416);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.shadowBitmap == null) {
            onBoundsChange(getBounds());
        }
        int iMin = Math.min(getBounds().width(), getBounds().height());
        Bitmap bitmap = this.shadowBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, getBounds().centerX() - (this.shadowBitmap.getWidth() / 2), getBounds().centerY() - (this.shadowBitmap.getHeight() / 2), this.shadowPaint);
        }
        int i = iMin / 2;
        float f = i;
        canvas.drawCircle(f, f, i - AndroidUtilities.dp(4.0f), this.bgPaint);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final boolean getPadding(Rect rect) {
        int iDp = AndroidUtilities.dp(4.0f);
        rect.set(iDp, iDp, iDp, iDp);
        return true;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        int iMin = Math.min(rect.width(), rect.height());
        if (iMin <= 0) {
            this.shadowBitmap = null;
            return;
        }
        this.shadowBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ALPHA_8);
        int i = iMin / 2;
        float f = i;
        new Canvas(this.shadowBitmap).drawCircle(f, f, i - AndroidUtilities.dp(4.0f), new Paint(1));
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
