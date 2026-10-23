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
    public static float[] f34211k;
    public static Bitmap f34212l;
    public static Bitmap f34213m;
    public final int f34217b;
    public final int f34218c;
    public final Drawable d;
    public float f34219f;
    public float f34220g;
    public static final float[] f34210j = {0.2126f, 0.7152f, 0.0722f};
    public static final int[] f34214n = new int[2];
    public static final int[] f34215o = new int[2];
    public final Paint f34216a = new Paint(3);
    public float e = -1.0f;
    public int h = 255;
    public float f34221i = 1.0f;

    public f6(int i10, int i11) {
        this.f34217b = i10;
        this.f34218c = i11;
        Drawable mutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.wallet_card_diamond).mutate();
        this.d = mutate;
        if (f34212l != null) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(84, 84, Bitmap.Config.ARGB_8888);
        mutate.setBounds(0, 0, 84, 84);
        mutate.draw(new Canvas(createBitmap));
        Paint paint = new Paint();
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint.setMaskFilter(new BlurMaskFilter(15.0f, blur));
        f34212l = createBitmap.extractAlpha(paint, f34214n);
        paint.setMaskFilter(new BlurMaskFilter(4.5f, blur));
        f34213m = createBitmap.extractAlpha(paint, f34215o);
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
            if (this.f34221i > 0.0f) {
                float width = bounds.width() / 84.0f;
                canvas.save();
                canvas.translate(bounds.left, bounds.top);
                canvas.scale(width, bounds.height() / 84.0f);
                Paint paint = this.f34216a;
                paint.setColor(-16777216);
                paint.setAlpha((int) (this.h * 0.35f * this.f34221i));
                Bitmap bitmap = f34212l;
                int[] iArr = f34214n;
                canvas.drawBitmap(bitmap, iArr[0], (AndroidUtilities.dp(1.0f) / width) + iArr[1], paint);
                paint.setAlpha((int) (this.h * 0.55f * this.f34221i));
                Bitmap bitmap2 = f34213m;
                int[] iArr2 = f34215o;
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
        return this.f34218c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f34217b;
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
