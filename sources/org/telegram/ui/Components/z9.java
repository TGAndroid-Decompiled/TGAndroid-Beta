package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;
public final class z9 implements Runnable {
    public boolean f42825a;
    public int f42826b;
    public int f42827c;
    public final aa d;

    public z9(aa aaVar) {
        this.d = aaVar;
    }

    @Override
    public final void run() {
        int i7;
        Bitmap bitmap;
        aa aaVar = this.d;
        Paint paint = aaVar.f33320w;
        if (aaVar.f33305f == null) {
            aaVar.f33305f = new Bitmap[2];
            aaVar.f33307i = new Canvas[2];
        }
        int i10 = (int) (this.f42826b / 15.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                i7 = aaVar.f33317s;
            } else {
                i7 = this.f42827c;
            }
            int i12 = (int) (i7 / 15.0f);
            Bitmap bitmap2 = aaVar.f33305f[i11];
            if (bitmap2 != null && ((bitmap2.getHeight() != i12 || aaVar.f33305f[i11].getWidth() != i10) && (bitmap = aaVar.f33305f[i11]) != null)) {
                bitmap.recycle();
                aaVar.f33305f[i11] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = aaVar.f33305f;
            if (bitmapArr[i11] == null) {
                try {
                    bitmapArr[i11] = Bitmap.createBitmap(i10, i12, Bitmap.Config.ARGB_8888);
                    aaVar.f33307i[i11] = new Canvas(aaVar.f33305f[i11]);
                    aaVar.f33307i[i11].scale(i10 / aaVar.f33304e[i11].getWidth(), i12 / aaVar.f33304e[i11].getHeight());
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (i11 == 1) {
                aaVar.f33305f[i11].eraseColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394d6, aaVar.f33322y));
            } else {
                aaVar.f33305f[i11].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(aaVar.f33304e[i11], 15);
            Canvas canvas = aaVar.f33307i[i11];
            if (canvas != null) {
                canvas.drawBitmap(aaVar.f33304e[i11], 0.0f, 0.0f, paint);
            }
            if (this.f42825a) {
                return;
            }
        }
        org.telegram.messenger.g0.g3(new lg(this, 12));
    }
}
