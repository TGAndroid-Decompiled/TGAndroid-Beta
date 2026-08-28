package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public class FabBackgroundDrawable extends Drawable {
    public final Paint f33418a = new Paint(1);
    public final Paint f33419b;
    public Bitmap f33420c;

    public FabBackgroundDrawable() {
        Paint paint = new Paint();
        this.f33419b = paint;
        paint.setColor(1275068416);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i9;
        if (this.f33420c == null) {
            onBoundsChange(getBounds());
        }
        int min = Math.min(getBounds().width(), getBounds().height());
        Bitmap bitmap = this.f33420c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, getBounds().centerX() - (this.f33420c.getWidth() / 2), getBounds().centerY() - (this.f33420c.getHeight() / 2), this.f33419b);
        }
        float f10 = min / 2;
        canvas.drawCircle(f10, f10, i9 - AndroidUtilities.dp(4.0f), this.f33418a);
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
        int i9;
        int min = Math.min(rect.width(), rect.height());
        if (min <= 0) {
            this.f33420c = null;
            return;
        }
        this.f33420c = Bitmap.createBitmap(min, min, Bitmap.Config.ALPHA_8);
        float f10 = min / 2;
        new Canvas(this.f33420c).drawCircle(f10, f10, i9 - AndroidUtilities.dp(4.0f), new Paint(1));
    }

    public void setColor(int i9) {
        this.f33418a.setColor(i9);
        invalidateSelf();
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
