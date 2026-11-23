package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class g7 extends Drawable {
    public static float[] f44376k;
    public static Bitmap f44377l;
    public static Bitmap f44378m;
    public final int f44382b;
    public final int f44383c;
    public final Drawable d;
    public float f44385f;
    public float f44386g;
    public static final float[] f44375j = {0.2126f, 0.7152f, 0.0722f};
    public static final int[] f44379n = new int[2];
    public static final int[] f44380o = new int[2];
    public final Paint f44381a = new Paint(3);
    public float f44384e = -1.0f;
    public int h = 255;
    public float f44387i = 1.0f;

    public g7(int i7, int i10) {
        this.f44382b = i7;
        this.f44383c = i10;
        Drawable g10 = i5.c.g(org.telegram.messenger.t0.f27013b, 2131232814);
        this.d = g10;
        if (f44377l != null) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(84, 84, Bitmap.Config.ARGB_8888);
        g10.setBounds(0, 0, 84, 84);
        g10.draw(new Canvas(createBitmap));
        Paint paint = new Paint();
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint.setMaskFilter(new BlurMaskFilter(15.0f, blur));
        f44377l = createBitmap.extractAlpha(paint, f44379n);
        paint.setMaskFilter(new BlurMaskFilter(4.5f, blur));
        f44378m = createBitmap.extractAlpha(paint, f44380o);
        createBitmap.recycle();
    }

    public static float[] a(float f10, float f11, float f12) {
        float max = Math.max(f10, Math.max(f11, f12));
        float min = max - Math.min(f10, Math.min(f11, f12));
        float f13 = 0.55f * max;
        if (min > f13) {
            float f14 = f13 / min;
            f10 = com.google.android.gms.internal.vision.e2.z(f10, max, f14, max);
            f11 = com.google.android.gms.internal.vision.e2.z(f11, max, f14, max);
            f12 = com.google.android.gms.internal.vision.e2.z(f12, max, f14, max);
        }
        return new float[]{f10, f11, f12};
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.h > 0 && this.f44384e >= 0.0f) {
            Rect bounds = getBounds();
            if (this.f44387i > 0.0f) {
                float width = bounds.width() / 84.0f;
                canvas.save();
                canvas.translate(bounds.left, bounds.top);
                canvas.scale(width, bounds.height() / 84.0f);
                Paint paint = this.f44381a;
                paint.setColor(-16777216);
                paint.setAlpha((int) (this.h * 0.35f * this.f44387i));
                Bitmap bitmap = f44377l;
                int[] iArr = f44379n;
                canvas.drawBitmap(bitmap, iArr[0], (org.telegram.messenger.g0.L(1.0f) / width) + iArr[1], paint);
                paint.setAlpha((int) (this.h * 0.55f * this.f44387i));
                Bitmap bitmap2 = f44378m;
                int[] iArr2 = f44380o;
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
        return this.f44383c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f44382b;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i7) {
        this.h = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
