package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;
public final class z9 implements Runnable {
    public boolean f42696a;
    public int f42697b;
    public int f42698c;
    public final aa d;

    public z9(aa aaVar) {
        this.d = aaVar;
    }

    @Override
    public final void run() {
        int i7;
        Bitmap bitmap;
        aa aaVar = this.d;
        Paint paint = aaVar.f33429w;
        if (aaVar.f33414f == null) {
            aaVar.f33414f = new Bitmap[2];
            aaVar.f33416i = new Canvas[2];
        }
        int i10 = (int) (this.f42697b / 15.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                i7 = aaVar.f33426s;
            } else {
                i7 = this.f42698c;
            }
            int i12 = (int) (i7 / 15.0f);
            Bitmap bitmap2 = aaVar.f33414f[i11];
            if (bitmap2 != null && ((bitmap2.getHeight() != i12 || aaVar.f33414f[i11].getWidth() != i10) && (bitmap = aaVar.f33414f[i11]) != null)) {
                bitmap.recycle();
                aaVar.f33414f[i11] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = aaVar.f33414f;
            if (bitmapArr[i11] == null) {
                try {
                    bitmapArr[i11] = Bitmap.createBitmap(i10, i12, Bitmap.Config.ARGB_8888);
                    aaVar.f33416i[i11] = new Canvas(aaVar.f33414f[i11]);
                    aaVar.f33416i[i11].scale(i10 / aaVar.f33413e[i11].getWidth(), i12 / aaVar.f33413e[i11].getHeight());
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (i11 == 1) {
                aaVar.f33414f[i11].eraseColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, aaVar.f33431y));
            } else {
                aaVar.f33414f[i11].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(aaVar.f33413e[i11], 15);
            Canvas canvas = aaVar.f33416i[i11];
            if (canvas != null) {
                canvas.drawBitmap(aaVar.f33413e[i11], 0.0f, 0.0f, paint);
            }
            if (this.f42696a) {
                return;
            }
        }
        org.telegram.messenger.g0.g3(new ng(this, 12));
    }
}
