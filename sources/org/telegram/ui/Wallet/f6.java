package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class f6 extends Drawable {
    public static int[] f34191k;
    public static int f34192l;
    public static Bitmap f34193m;
    public static Bitmap f34194n;
    public static final int[] f34195o = new int[2];
    public static final int[] f34196p = new int[2];
    public final int f34199c;
    public final int d;
    public Bitmap e;
    public float f34201g;
    public float h;
    public final Paint f34197a = new Paint(3);
    public final Paint f34198b = new Paint(3);
    public float f34200f = -1.0f;
    public int f34202i = 255;
    public float f34203j = 1.0f;

    public f6(int i10, int i11) {
        this.f34199c = i10;
        this.d = i11;
    }

    public static int a(float f7) {
        return Math.max(0, Math.min(255, Math.round(f7 * 0.97f * 255.0f)));
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.e != null && this.f34202i > 0) {
            Rect bounds = getBounds();
            float width = bounds.width() / this.e.getWidth();
            canvas.save();
            canvas.translate(bounds.left, bounds.top);
            canvas.scale(width, bounds.height() / this.e.getHeight());
            if (this.f34203j > 0.0f) {
                Paint paint = this.f34198b;
                paint.setColor(-16777216);
                paint.setAlpha((int) (this.f34202i * 0.35f * this.f34203j));
                Bitmap bitmap = f34193m;
                int[] iArr = f34195o;
                canvas.drawBitmap(bitmap, iArr[0], (AndroidUtilities.dp(1.0f) / width) + iArr[1], paint);
                paint.setAlpha((int) (this.f34202i * 0.55f * this.f34203j));
                Bitmap bitmap2 = f34194n;
                int[] iArr2 = f34196p;
                canvas.drawBitmap(bitmap2, iArr2[0], iArr2[1], paint);
            }
            int i10 = this.f34202i;
            Paint paint2 = this.f34197a;
            paint2.setAlpha(i10);
            canvas.drawBitmap(this.e, 0.0f, 0.0f, paint2);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.d;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f34199c;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f34202i = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
