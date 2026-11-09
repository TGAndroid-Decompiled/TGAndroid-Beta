package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;
public final class v9 implements Runnable {
    public boolean f39014a;
    public int f39015b;
    public int f39016c;
    public final w9 d;

    public v9(w9 w9Var) {
        this.d = w9Var;
    }

    @Override
    public final void run() {
        int i7;
        Bitmap bitmap;
        w9 w9Var = this.d;
        Paint paint = w9Var.f40014w;
        if (w9Var.f39999f == null) {
            w9Var.f39999f = new Bitmap[2];
            w9Var.f40001i = new Canvas[2];
        }
        int i10 = (int) (this.f39015b / 15.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                i7 = w9Var.f40011s;
            } else {
                i7 = this.f39016c;
            }
            int i12 = (int) (i7 / 15.0f);
            Bitmap bitmap2 = w9Var.f39999f[i11];
            if (bitmap2 != null && ((bitmap2.getHeight() != i12 || w9Var.f39999f[i11].getWidth() != i10) && (bitmap = w9Var.f39999f[i11]) != null)) {
                bitmap.recycle();
                w9Var.f39999f[i11] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = w9Var.f39999f;
            if (bitmapArr[i11] == null) {
                try {
                    bitmapArr[i11] = Bitmap.createBitmap(i10, i12, Bitmap.Config.ARGB_8888);
                    w9Var.f40001i[i11] = new Canvas(w9Var.f39999f[i11]);
                    w9Var.f40001i[i11].scale(i10 / w9Var.f39998e[i11].getWidth(), i12 / w9Var.f39998e[i11].getHeight());
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (i11 == 1) {
                w9Var.f39999f[i11].eraseColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, w9Var.f40016y));
            } else {
                w9Var.f39999f[i11].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(w9Var.f39998e[i11], 15);
            Canvas canvas = w9Var.f40001i[i11];
            if (canvas != null) {
                canvas.drawBitmap(w9Var.f39998e[i11], 0.0f, 0.0f, paint);
            }
            if (this.f39014a) {
                return;
            }
        }
        org.telegram.messenger.g0.h3(new xf(this, 12));
    }
}
