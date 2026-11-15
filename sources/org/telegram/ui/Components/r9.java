package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;
public final class r9 implements Runnable {
    public boolean f38902a;
    public int f38903b;
    public int f38904c;
    public final s9 d;

    public r9(s9 s9Var) {
        this.d = s9Var;
    }

    @Override
    public final void run() {
        int i7;
        Bitmap bitmap;
        s9 s9Var = this.d;
        Paint paint = s9Var.f39255w;
        if (s9Var.f39240f == null) {
            s9Var.f39240f = new Bitmap[2];
            s9Var.f39242i = new Canvas[2];
        }
        int i10 = (int) (this.f38903b / 15.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                i7 = s9Var.f39252s;
            } else {
                i7 = this.f38904c;
            }
            int i12 = (int) (i7 / 15.0f);
            Bitmap bitmap2 = s9Var.f39240f[i11];
            if (bitmap2 != null && ((bitmap2.getHeight() != i12 || s9Var.f39240f[i11].getWidth() != i10) && (bitmap = s9Var.f39240f[i11]) != null)) {
                bitmap.recycle();
                s9Var.f39240f[i11] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = s9Var.f39240f;
            if (bitmapArr[i11] == null) {
                try {
                    bitmapArr[i11] = Bitmap.createBitmap(i10, i12, Bitmap.Config.ARGB_8888);
                    s9Var.f39242i[i11] = new Canvas(s9Var.f39240f[i11]);
                    s9Var.f39242i[i11].scale(i10 / s9Var.f39239e[i11].getWidth(), i12 / s9Var.f39239e[i11].getHeight());
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (i11 == 1) {
                s9Var.f39240f[i11].eraseColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, s9Var.f39257y));
            } else {
                s9Var.f39240f[i11].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(s9Var.f39239e[i11], 15);
            Canvas canvas = s9Var.f39242i[i11];
            if (canvas != null) {
                canvas.drawBitmap(s9Var.f39239e[i11], 0.0f, 0.0f, paint);
            }
            if (this.f38902a) {
                return;
            }
        }
        org.telegram.messenger.g0.h3(new dg(this, 12));
    }
}
