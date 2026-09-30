package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public class FabBackgroundDrawable extends Drawable {
    public final Paint f29171a = new Paint(1);
    public final Paint f29172b;
    public Bitmap f29173c;

    public FabBackgroundDrawable() {
        Paint paint = new Paint();
        this.f29172b = paint;
        paint.setColor(1275068416);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        if (this.f29173c == null) {
            onBoundsChange(getBounds());
        }
        int min = Math.min(getBounds().width(), getBounds().height());
        Bitmap bitmap = this.f29173c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, getBounds().centerX() - (this.f29173c.getWidth() / 2), getBounds().centerY() - (this.f29173c.getHeight() / 2), this.f29172b);
        }
        float f7 = min / 2;
        canvas.drawCircle(f7, f7, i10 - AndroidUtilities.dp(4.0f), this.f29171a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final boolean getPadding(Rect rect) {
        int dp = AndroidUtilities.dp(4.0f);
        rect.set(dp, dp, dp, dp);
        return true;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        int i10;
        int min = Math.min(rect.width(), rect.height());
        if (min <= 0) {
            this.f29173c = null;
            return;
        }
        this.f29173c = Bitmap.createBitmap(min, min, Bitmap.Config.ALPHA_8);
        float f7 = min / 2;
        new Canvas(this.f29173c).drawCircle(f7, f7, i10 - AndroidUtilities.dp(4.0f), new Paint(1));
    }

    public void setColor(int i10) {
        this.f29171a.setColor(i10);
        invalidateSelf();
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
