package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import org.telegram.messenger.AndroidUtilities;

public class FabBackgroundDrawable extends Drawable {
    private Paint bgPaint = new Paint(1);
    private Bitmap shadowBitmap;
    private Paint shadowPaint;

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public FabBackgroundDrawable() {
        Paint paint = new Paint();
        this.shadowPaint = paint;
        paint.setColor(1275068416);
    }

    @Override
    public void draw(Canvas canvas) {
        if (this.shadowBitmap == null) {
            onBoundsChange(getBounds());
        }
        int min = Math.min(getBounds().width(), getBounds().height());
        Bitmap bitmap = this.shadowBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, getBounds().centerX() - (this.shadowBitmap.getWidth() / 2), getBounds().centerY() - (this.shadowBitmap.getHeight() / 2), this.shadowPaint);
        }
        float f = min / 2;
        canvas.drawCircle(f, f, r0 - AndroidUtilities.dp(4.0f), this.bgPaint);
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        int min = Math.min(rect.width(), rect.height());
        if (min <= 0) {
            this.shadowBitmap = null;
            return;
        }
        this.shadowBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ALPHA_8);
        float f = min / 2;
        new Canvas(this.shadowBitmap).drawCircle(f, f, r5 - AndroidUtilities.dp(4.0f), new Paint(1));
    }

    @Keep
    public void setColor(int i) {
        this.bgPaint.setColor(i);
        invalidateSelf();
    }

    @Override
    public boolean getPadding(Rect rect) {
        int dp = AndroidUtilities.dp(4.0f);
        rect.set(dp, dp, dp, dp);
        return true;
    }
}
