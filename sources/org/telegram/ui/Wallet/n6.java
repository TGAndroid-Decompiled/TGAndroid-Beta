package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class n6 extends Drawable {
    public static float[] f42882k;
    public static Bitmap f42883l;
    public static Bitmap f42884m;
    public final int f42888b;
    public final int f42889c;
    public final Drawable d;
    public float f42891f;
    public float f42892g;
    public static final float[] f42881j = {0.2126f, 0.7152f, 0.0722f};
    public static final int[] f42885n = new int[2];
    public static final int[] f42886o = new int[2];
    public final Paint f42887a = new Paint(3);
    public float f42890e = -1.0f;
    public int h = 255;
    public float f42893i = 1.0f;

    public n6(int i7, int i10) {
        this.f42888b = i7;
        this.f42889c = i10;
        Drawable h = jg.g.h(org.telegram.messenger.t0.f25566b, 2131232808);
        this.d = h;
        if (f42883l != null) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(84, 84, Bitmap.Config.ARGB_8888);
        h.setBounds(0, 0, 84, 84);
        h.draw(new Canvas(createBitmap));
        Paint paint = new Paint();
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint.setMaskFilter(new BlurMaskFilter(15.0f, blur));
        f42883l = createBitmap.extractAlpha(paint, f42885n);
        paint.setMaskFilter(new BlurMaskFilter(4.5f, blur));
        f42884m = createBitmap.extractAlpha(paint, f42886o);
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
        if (this.h > 0 && this.f42890e >= 0.0f) {
            Rect bounds = getBounds();
            if (this.f42893i > 0.0f) {
                float width = bounds.width() / 84.0f;
                canvas.save();
                canvas.translate(bounds.left, bounds.top);
                canvas.scale(width, bounds.height() / 84.0f);
                Paint paint = this.f42887a;
                paint.setColor(-16777216);
                paint.setAlpha((int) (this.h * 0.35f * this.f42893i));
                Bitmap bitmap = f42883l;
                int[] iArr = f42885n;
                canvas.drawBitmap(bitmap, iArr[0], (org.telegram.messenger.g0.L(1.0f) / width) + iArr[1], paint);
                paint.setAlpha((int) (this.h * 0.55f * this.f42893i));
                Bitmap bitmap2 = f42884m;
                int[] iArr2 = f42886o;
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
        return this.f42889c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f42888b;
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
