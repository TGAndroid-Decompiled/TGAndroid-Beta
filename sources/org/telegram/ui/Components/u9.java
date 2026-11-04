package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;
public final class u9 implements Runnable {
    public boolean f38701a;
    public int f38702b;
    public int f38703c;
    public final v9 d;

    public u9(v9 v9Var) {
        this.d = v9Var;
    }

    @Override
    public final void run() {
        int i3;
        Bitmap bitmap;
        v9 v9Var = this.d;
        Paint paint = v9Var.f39052w;
        if (v9Var.f39037f == null) {
            v9Var.f39037f = new Bitmap[2];
            v9Var.f39039i = new Canvas[2];
        }
        int i10 = (int) (this.f38702b / 15.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                i3 = v9Var.f39049s;
            } else {
                i3 = this.f38703c;
            }
            int i12 = (int) (i3 / 15.0f);
            Bitmap bitmap2 = v9Var.f39037f[i11];
            if (bitmap2 != null && ((bitmap2.getHeight() != i12 || v9Var.f39037f[i11].getWidth() != i10) && (bitmap = v9Var.f39037f[i11]) != null)) {
                bitmap.recycle();
                v9Var.f39037f[i11] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = v9Var.f39037f;
            if (bitmapArr[i11] == null) {
                try {
                    bitmapArr[i11] = Bitmap.createBitmap(i10, i12, Bitmap.Config.ARGB_8888);
                    v9Var.f39039i[i11] = new Canvas(v9Var.f39037f[i11]);
                    v9Var.f39039i[i11].scale(i10 / v9Var.f39036e[i11].getWidth(), i12 / v9Var.f39036e[i11].getHeight());
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (i11 == 1) {
                v9Var.f39037f[i11].eraseColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, v9Var.f39054y));
            } else {
                v9Var.f39037f[i11].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(v9Var.f39036e[i11], 15);
            Canvas canvas = v9Var.f39039i[i11];
            if (canvas != null) {
                canvas.drawBitmap(v9Var.f39036e[i11], 0.0f, 0.0f, paint);
            }
            if (this.f38701a) {
                return;
            }
        }
        org.telegram.messenger.g0.h3(new vf(this, 12));
    }
}
