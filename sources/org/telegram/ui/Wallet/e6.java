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
public final class e6 extends Drawable {
    public static float[] f36518k;
    public static Bitmap f36519l;
    public static Bitmap f36520m;
    public final int f36524b;
    public final int f36525c;
    public final Drawable d;
    public float f36526f;
    public float f36527g;
    public static final float[] f36517j = {0.2126f, 0.7152f, 0.0722f};
    public static final int[] f36521n = new int[2];
    public static final int[] f36522o = new int[2];
    public final Paint f36523a = new Paint(3);
    public float e = -1.0f;
    public int h = 255;
    public float f36528i = 1.0f;

    public e6(int i10, int i11) {
        this.f36524b = i10;
        this.f36525c = i11;
        Drawable mutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.wallet_card_diamond).mutate();
        this.d = mutate;
        if (f36519l != null) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(84, 84, Bitmap.Config.ARGB_8888);
        mutate.setBounds(0, 0, 84, 84);
        mutate.draw(new Canvas(createBitmap));
        Paint paint = new Paint();
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint.setMaskFilter(new BlurMaskFilter(15.0f, blur));
        f36519l = createBitmap.extractAlpha(paint, f36521n);
        paint.setMaskFilter(new BlurMaskFilter(4.5f, blur));
        f36520m = createBitmap.extractAlpha(paint, f36522o);
        createBitmap.recycle();
    }

    public static float[] a(float f7, float f10, float f11) {
        float max = Math.max(f7, Math.max(f10, f11));
        float min = max - Math.min(f7, Math.min(f10, f11));
        float f12 = 0.55f * max;
        if (min > f12) {
            float f13 = f12 / min;
            f7 = c3.h0.z(f7, max, f13, max);
            f10 = c3.h0.z(f10, max, f13, max);
            f11 = c3.h0.z(f11, max, f13, max);
        }
        return new float[]{f7, f10, f11};
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.h > 0 && this.e >= 0.0f) {
            Rect bounds = getBounds();
            if (this.f36528i > 0.0f) {
                float width = bounds.width() / 84.0f;
                canvas.save();
                canvas.translate(bounds.left, bounds.top);
                canvas.scale(width, bounds.height() / 84.0f);
                Paint paint = this.f36523a;
                paint.setColor(-16777216);
                paint.setAlpha((int) (this.h * 0.35f * this.f36528i));
                Bitmap bitmap = f36519l;
                int[] iArr = f36521n;
                canvas.drawBitmap(bitmap, iArr[0], (AndroidUtilities.dp(1.0f) / width) + iArr[1], paint);
                paint.setAlpha((int) (this.h * 0.55f * this.f36528i));
                Bitmap bitmap2 = f36520m;
                int[] iArr2 = f36522o;
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
        return this.f36525c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f36524b;
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
