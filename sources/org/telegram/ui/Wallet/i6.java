package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class i6 extends Drawable {
    public static int[] f34312k;
    public static int f34313l;
    public static Bitmap f34314m;
    public static Bitmap f34315n;
    public static final int[] f34316o = new int[2];
    public static final int[] f34317p = new int[2];
    public final int f34320c;
    public final int d;
    public Bitmap e;
    public float f34322g;
    public float h;
    public final Paint f34318a = new Paint(3);
    public final Paint f34319b = new Paint(3);
    public float f34321f = -1.0f;
    public int f34323i = 255;
    public float f34324j = 1.0f;

    public i6(int i10, int i11) {
        this.f34320c = i10;
        this.d = i11;
    }

    public static int a(float f7) {
        return Math.max(0, Math.min(255, Math.round(f7 * 0.97f * 255.0f)));
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.e != null && this.f34323i > 0) {
            Rect bounds = getBounds();
            float width = bounds.width() / this.e.getWidth();
            canvas.save();
            canvas.translate(bounds.left, bounds.top);
            canvas.scale(width, bounds.height() / this.e.getHeight());
            if (this.f34324j > 0.0f) {
                Paint paint = this.f34319b;
                paint.setColor(-16777216);
                paint.setAlpha((int) (this.f34323i * 0.35f * this.f34324j));
                Bitmap bitmap = f34314m;
                int[] iArr = f34316o;
                canvas.drawBitmap(bitmap, iArr[0], (AndroidUtilities.dp(1.0f) / width) + iArr[1], paint);
                paint.setAlpha((int) (this.f34323i * 0.55f * this.f34324j));
                Bitmap bitmap2 = f34315n;
                int[] iArr2 = f34317p;
                canvas.drawBitmap(bitmap2, iArr2[0], iArr2[1], paint);
            }
            int i10 = this.f34323i;
            Paint paint2 = this.f34318a;
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
        return this.f34320c;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f34323i = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
