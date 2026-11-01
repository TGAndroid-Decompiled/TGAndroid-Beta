package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class t6 extends Drawable {
    public static float[] f35241k;
    public static Bitmap f35242l;
    public static Bitmap f35243m;
    public final int f35247b;
    public final int f35248c;
    public final Drawable d;
    public float f35249f;
    public float f35250g;
    public static final float[] f35240j = {0.2126f, 0.7152f, 0.0722f};
    public static final int[] f35244n = new int[2];
    public static final int[] f35245o = new int[2];
    public final Paint f35246a = new Paint(3);
    public float e = -1.0f;
    public int h = 255;
    public float f35251i = 1.0f;

    public t6(int i10, int i11) {
        this.f35247b = i10;
        this.f35248c = i11;
        Drawable f7 = i0.a.f(org.telegram.messenger.w0.f18945b, 2131232806);
        this.d = f7;
        if (f35242l != null) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(84, 84, Bitmap.Config.ARGB_8888);
        f7.setBounds(0, 0, 84, 84);
        f7.draw(new Canvas(createBitmap));
        Paint paint = new Paint();
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint.setMaskFilter(new BlurMaskFilter(15.0f, blur));
        f35242l = createBitmap.extractAlpha(paint, f35244n);
        paint.setMaskFilter(new BlurMaskFilter(4.5f, blur));
        f35243m = createBitmap.extractAlpha(paint, f35245o);
        createBitmap.recycle();
    }

    public static float[] a(float f7, float f10, float f11) {
        float max = Math.max(f7, Math.max(f10, f11));
        float min = max - Math.min(f7, Math.min(f10, f11));
        float f12 = 0.55f * max;
        if (min > f12) {
            float f13 = f12 / min;
            f7 = c3.i0.z(f7, max, f13, max);
            f10 = c3.i0.z(f10, max, f13, max);
            f11 = c3.i0.z(f11, max, f13, max);
        }
        return new float[]{f7, f10, f11};
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.h > 0 && this.e >= 0.0f) {
            Rect bounds = getBounds();
            if (this.f35251i > 0.0f) {
                float width = bounds.width() / 84.0f;
                canvas.save();
                canvas.translate(bounds.left, bounds.top);
                canvas.scale(width, bounds.height() / 84.0f);
                Paint paint = this.f35246a;
                paint.setColor(-16777216);
                paint.setAlpha((int) (this.h * 0.35f * this.f35251i));
                Bitmap bitmap = f35242l;
                int[] iArr = f35244n;
                canvas.drawBitmap(bitmap, iArr[0], (org.telegram.messenger.i0.L(1.0f) / width) + iArr[1], paint);
                paint.setAlpha((int) (this.h * 0.55f * this.f35251i));
                Bitmap bitmap2 = f35243m;
                int[] iArr2 = f35245o;
                canvas.drawBitmap(bitmap2, iArr2[0], iArr2[1], paint);
                canvas.restore();
            }
            Drawable drawable = this.d;
            drawable.setBounds(bounds);
            drawable.setAlpha(this.h);
            drawable.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f35248c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f35247b;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
        this.h = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
