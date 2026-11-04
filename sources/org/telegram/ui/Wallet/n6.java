package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class n6 extends Drawable {
    public static float[] f42935k;
    public static Bitmap f42936l;
    public static Bitmap f42937m;
    public final int f42941b;
    public final int f42942c;
    public final Drawable d;
    public float f42944f;
    public float f42945g;
    public static final float[] f42934j = {0.2126f, 0.7152f, 0.0722f};
    public static final int[] f42938n = new int[2];
    public static final int[] f42939o = new int[2];
    public final Paint f42940a = new Paint(3);
    public float f42943e = -1.0f;
    public int h = 255;
    public float f42946i = 1.0f;

    public n6(int i3, int i10) {
        this.f42941b = i3;
        this.f42942c = i10;
        Drawable g7 = k2.p1.g(org.telegram.messenger.t0.f25457b, 2131232806);
        this.d = g7;
        if (f42936l != null) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(84, 84, Bitmap.Config.ARGB_8888);
        g7.setBounds(0, 0, 84, 84);
        g7.draw(new Canvas(createBitmap));
        Paint paint = new Paint();
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint.setMaskFilter(new BlurMaskFilter(15.0f, blur));
        f42936l = createBitmap.extractAlpha(paint, f42938n);
        paint.setMaskFilter(new BlurMaskFilter(4.5f, blur));
        f42937m = createBitmap.extractAlpha(paint, f42939o);
        createBitmap.recycle();
    }

    public static float[] a(float f10, float f11, float f12) {
        float max = Math.max(f10, Math.max(f11, f12));
        float min = max - Math.min(f10, Math.min(f11, f12));
        float f13 = 0.55f * max;
        if (min > f13) {
            float f14 = f13 / min;
            f10 = com.google.android.recaptcha.internal.a.y(f10, max, f14, max);
            f11 = com.google.android.recaptcha.internal.a.y(f11, max, f14, max);
            f12 = com.google.android.recaptcha.internal.a.y(f12, max, f14, max);
        }
        return new float[]{f10, f11, f12};
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.h > 0 && this.f42943e >= 0.0f) {
            Rect bounds = getBounds();
            if (this.f42946i > 0.0f) {
                float width = bounds.width() / 84.0f;
                canvas.save();
                canvas.translate(bounds.left, bounds.top);
                canvas.scale(width, bounds.height() / 84.0f);
                Paint paint = this.f42940a;
                paint.setColor(-16777216);
                paint.setAlpha((int) (this.h * 0.35f * this.f42946i));
                Bitmap bitmap = f42936l;
                int[] iArr = f42938n;
                canvas.drawBitmap(bitmap, iArr[0], (org.telegram.messenger.g0.L(1.0f) / width) + iArr[1], paint);
                paint.setAlpha((int) (this.h * 0.55f * this.f42946i));
                Bitmap bitmap2 = f42937m;
                int[] iArr2 = f42939o;
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
        return this.f42942c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f42941b;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i3) {
        this.h = i3;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
