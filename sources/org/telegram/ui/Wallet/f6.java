package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class f6 extends Drawable {
    public static float[] f34206k;
    public static Bitmap f34207l;
    public static Bitmap f34208m;
    public final int f34212b;
    public final int f34213c;
    public final Drawable d;
    public float f34214f;
    public float f34215g;
    public static final float[] f34205j = {0.2126f, 0.7152f, 0.0722f};
    public static final int[] f34209n = new int[2];
    public static final int[] f34210o = new int[2];
    public final Paint f34211a = new Paint(3);
    public float e = -1.0f;
    public int h = 255;
    public float f34216i = 1.0f;

    public f6(int i10, int i11) {
        this.f34212b = i10;
        this.f34213c = i11;
        Drawable mutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.wallet_card_diamond).mutate();
        this.d = mutate;
        if (f34207l != null) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(84, 84, Bitmap.Config.ARGB_8888);
        mutate.setBounds(0, 0, 84, 84);
        mutate.draw(new Canvas(createBitmap));
        Paint paint = new Paint();
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint.setMaskFilter(new BlurMaskFilter(15.0f, blur));
        f34207l = createBitmap.extractAlpha(paint, f34209n);
        paint.setMaskFilter(new BlurMaskFilter(4.5f, blur));
        f34208m = createBitmap.extractAlpha(paint, f34210o);
        createBitmap.recycle();
    }

    public static float[] a(float f7, float f10, float f11) {
        float max = Math.max(f7, Math.max(f10, f11));
        float min = max - Math.min(f7, Math.min(f10, f11));
        float f12 = 0.55f * max;
        if (min > f12) {
            float f13 = f12 / min;
            f7 = com.google.android.gms.internal.play_billing.k3.y(f7, max, f13, max);
            f10 = com.google.android.gms.internal.play_billing.k3.y(f10, max, f13, max);
            f11 = com.google.android.gms.internal.play_billing.k3.y(f11, max, f13, max);
        }
        return new float[]{f7, f10, f11};
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.h > 0 && this.e >= 0.0f) {
            Rect bounds = getBounds();
            if (this.f34216i > 0.0f) {
                float width = bounds.width() / 84.0f;
                canvas.save();
                canvas.translate(bounds.left, bounds.top);
                canvas.scale(width, bounds.height() / 84.0f);
                Paint paint = this.f34211a;
                paint.setColor(-16777216);
                paint.setAlpha((int) (this.h * 0.35f * this.f34216i));
                Bitmap bitmap = f34207l;
                int[] iArr = f34209n;
                canvas.drawBitmap(bitmap, iArr[0], (AndroidUtilities.dp(1.0f) / width) + iArr[1], paint);
                paint.setAlpha((int) (this.h * 0.55f * this.f34216i));
                Bitmap bitmap2 = f34208m;
                int[] iArr2 = f34210o;
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
        return this.f34213c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f34212b;
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
