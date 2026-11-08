package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class o6 extends Drawable {
    public static float[] f42964k;
    public static Bitmap f42965l;
    public static Bitmap f42966m;
    public final int f42970b;
    public final int f42971c;
    public final Drawable d;
    public float f42973f;
    public float f42974g;
    public static final float[] f42963j = {0.2126f, 0.7152f, 0.0722f};
    public static final int[] f42967n = new int[2];
    public static final int[] f42968o = new int[2];
    public final Paint f42969a = new Paint(3);
    public float f42972e = -1.0f;
    public int h = 255;
    public float f42975i = 1.0f;

    public o6(int i7, int i10) {
        this.f42970b = i7;
        this.f42971c = i10;
        Drawable h = jg.g.h(org.telegram.messenger.t0.f25566b, 2131232808);
        this.d = h;
        if (f42965l != null) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(84, 84, Bitmap.Config.ARGB_8888);
        h.setBounds(0, 0, 84, 84);
        h.draw(new Canvas(createBitmap));
        Paint paint = new Paint();
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint.setMaskFilter(new BlurMaskFilter(15.0f, blur));
        f42965l = createBitmap.extractAlpha(paint, f42967n);
        paint.setMaskFilter(new BlurMaskFilter(4.5f, blur));
        f42966m = createBitmap.extractAlpha(paint, f42968o);
        createBitmap.recycle();
    }

    public static float[] a(float f10, float f11, float f12) {
        float max = Math.max(f10, Math.max(f11, f12));
        float min = max - Math.min(f10, Math.min(f11, f12));
        float f13 = 0.55f * max;
        if (min > f13) {
            float f14 = f13 / min;
            f10 = com.google.android.recaptcha.internal.a.z(f10, max, f14, max);
            f11 = com.google.android.recaptcha.internal.a.z(f11, max, f14, max);
            f12 = com.google.android.recaptcha.internal.a.z(f12, max, f14, max);
        }
        return new float[]{f10, f11, f12};
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.h > 0 && this.f42972e >= 0.0f) {
            Rect bounds = getBounds();
            if (this.f42975i > 0.0f) {
                float width = bounds.width() / 84.0f;
                canvas.save();
                canvas.translate(bounds.left, bounds.top);
                canvas.scale(width, bounds.height() / 84.0f);
                Paint paint = this.f42969a;
                paint.setColor(-16777216);
                paint.setAlpha((int) (this.h * 0.35f * this.f42975i));
                Bitmap bitmap = f42965l;
                int[] iArr = f42967n;
                canvas.drawBitmap(bitmap, iArr[0], (org.telegram.messenger.g0.L(1.0f) / width) + iArr[1], paint);
                paint.setAlpha((int) (this.h * 0.55f * this.f42975i));
                Bitmap bitmap2 = f42966m;
                int[] iArr2 = f42968o;
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
        return this.f42971c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f42970b;
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
