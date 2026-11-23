package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;
public final class y9 implements Runnable {
    public boolean f42380a;
    public int f42381b;
    public int f42382c;
    public final z9 d;

    public y9(z9 z9Var) {
        this.d = z9Var;
    }

    @Override
    public final void run() {
        int i7;
        Bitmap bitmap;
        z9 z9Var = this.d;
        Paint paint = z9Var.f42776w;
        if (z9Var.f42761f == null) {
            z9Var.f42761f = new Bitmap[2];
            z9Var.f42763i = new Canvas[2];
        }
        int i10 = (int) (this.f42381b / 15.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                i7 = z9Var.f42773s;
            } else {
                i7 = this.f42382c;
            }
            int i12 = (int) (i7 / 15.0f);
            Bitmap bitmap2 = z9Var.f42761f[i11];
            if (bitmap2 != null && ((bitmap2.getHeight() != i12 || z9Var.f42761f[i11].getWidth() != i10) && (bitmap = z9Var.f42761f[i11]) != null)) {
                bitmap.recycle();
                z9Var.f42761f[i11] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = z9Var.f42761f;
            if (bitmapArr[i11] == null) {
                try {
                    bitmapArr[i11] = Bitmap.createBitmap(i10, i12, Bitmap.Config.ARGB_8888);
                    z9Var.f42763i[i11] = new Canvas(z9Var.f42761f[i11]);
                    z9Var.f42763i[i11].scale(i10 / z9Var.f42760e[i11].getWidth(), i12 / z9Var.f42760e[i11].getHeight());
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (i11 == 1) {
                z9Var.f42761f[i11].eraseColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, z9Var.f42778y));
            } else {
                z9Var.f42761f[i11].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(z9Var.f42760e[i11], 15);
            Canvas canvas = z9Var.f42763i[i11];
            if (canvas != null) {
                canvas.drawBitmap(z9Var.f42760e[i11], 0.0f, 0.0f, paint);
            }
            if (this.f42380a) {
                return;
            }
        }
        org.telegram.messenger.g0.g3(new ng(this, 12));
    }
}
