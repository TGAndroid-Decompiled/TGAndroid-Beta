package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;
public final class p9 implements Runnable {
    public boolean f29320a;
    public int f29321b;
    public int f29322c;
    public final q9 d;

    public p9(q9 q9Var) {
        this.d = q9Var;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        q9 q9Var = this.d;
        Paint paint = q9Var.f29618w;
        if (q9Var.f29603f == null) {
            q9Var.f29603f = new Bitmap[2];
            q9Var.f29605i = new Canvas[2];
        }
        int i11 = (int) (this.f29321b / 15.0f);
        for (int i12 = 0; i12 < 2; i12++) {
            if (i12 == 0) {
                i10 = q9Var.f29615s;
            } else {
                i10 = this.f29322c;
            }
            int i13 = (int) (i10 / 15.0f);
            Bitmap bitmap2 = q9Var.f29603f[i12];
            if (bitmap2 != null && ((bitmap2.getHeight() != i13 || q9Var.f29603f[i12].getWidth() != i11) && (bitmap = q9Var.f29603f[i12]) != null)) {
                bitmap.recycle();
                q9Var.f29603f[i12] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = q9Var.f29603f;
            if (bitmapArr[i12] == null) {
                try {
                    bitmapArr[i12] = Bitmap.createBitmap(i11, i13, Bitmap.Config.ARGB_8888);
                    q9Var.f29605i[i12] = new Canvas(q9Var.f29603f[i12]);
                    q9Var.f29605i[i12].scale(i11 / q9Var.e[i12].getWidth(), i13 / q9Var.e[i12].getHeight());
                } catch (Throwable th2) {
                    org.telegram.messenger.f8.g(th2, true);
                }
            }
            if (i12 == 1) {
                q9Var.f29603f[i12].eraseColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, q9Var.f29620y));
            } else {
                q9Var.f29603f[i12].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(q9Var.e[i12], 15);
            Canvas canvas = q9Var.f29605i[i12];
            if (canvas != null) {
                canvas.drawBitmap(q9Var.e[i12], 0.0f, 0.0f, paint);
            }
            if (this.f29320a) {
                return;
            }
        }
        org.telegram.messenger.i0.g3(new tf(this, 13));
    }
}
