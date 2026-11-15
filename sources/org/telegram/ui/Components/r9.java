package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;
public final class r9 implements Runnable {
    public boolean f38904a;
    public int f38905b;
    public int f38906c;
    public final s9 d;

    public r9(s9 s9Var) {
        this.d = s9Var;
    }

    @Override
    public final void run() {
        int i7;
        Bitmap bitmap;
        s9 s9Var = this.d;
        Paint paint = s9Var.f39258w;
        if (s9Var.f39243f == null) {
            s9Var.f39243f = new Bitmap[2];
            s9Var.f39245i = new Canvas[2];
        }
        int i10 = (int) (this.f38905b / 15.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                i7 = s9Var.f39255s;
            } else {
                i7 = this.f38906c;
            }
            int i12 = (int) (i7 / 15.0f);
            Bitmap bitmap2 = s9Var.f39243f[i11];
            if (bitmap2 != null && ((bitmap2.getHeight() != i12 || s9Var.f39243f[i11].getWidth() != i10) && (bitmap = s9Var.f39243f[i11]) != null)) {
                bitmap.recycle();
                s9Var.f39243f[i11] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = s9Var.f39243f;
            if (bitmapArr[i11] == null) {
                try {
                    bitmapArr[i11] = Bitmap.createBitmap(i10, i12, Bitmap.Config.ARGB_8888);
                    s9Var.f39245i[i11] = new Canvas(s9Var.f39243f[i11]);
                    s9Var.f39245i[i11].scale(i10 / s9Var.f39242e[i11].getWidth(), i12 / s9Var.f39242e[i11].getHeight());
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (i11 == 1) {
                s9Var.f39243f[i11].eraseColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, s9Var.f39260y));
            } else {
                s9Var.f39243f[i11].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(s9Var.f39242e[i11], 15);
            Canvas canvas = s9Var.f39245i[i11];
            if (canvas != null) {
                canvas.drawBitmap(s9Var.f39242e[i11], 0.0f, 0.0f, paint);
            }
            if (this.f38904a) {
                return;
            }
        }
        org.telegram.messenger.g0.h3(new dg(this, 12));
    }
}
