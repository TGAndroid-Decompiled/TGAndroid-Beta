package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

public class FabBackgroundDrawable extends Drawable {

    public final Paint f33468a = new Paint(1);

    public final Paint f33469b;

    public Bitmap f33470c;

    public FabBackgroundDrawable() {
        Paint paint = new Paint();
        this.f33469b = paint;
        paint.setColor(1275068416);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f33470c == null) {
            onBoundsChange(getBounds());
        }
        int iMin = Math.min(getBounds().width(), getBounds().height());
        Bitmap bitmap = this.f33470c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, getBounds().centerX() - (this.f33470c.getWidth() / 2), getBounds().centerY() - (this.f33470c.getHeight() / 2), this.f33469b);
        }
        int i10 = iMin / 2;
        float f10 = i10;
        canvas.drawCircle(f10, f10, i10 - AndroidUtilities.dp(4.0f), this.f33468a);
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
            this.f33470c = null;
            return;
        }
        this.f33470c = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ALPHA_8);
        int i10 = iMin / 2;
        float f10 = i10;
        new Canvas(this.f33470c).drawCircle(f10, f10, i10 - AndroidUtilities.dp(4.0f), new Paint(1));
    }

    public void setColor(int i10) {
        this.f33468a.setColor(i10);
        invalidateSelf();
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
