package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class fa implements Runnable {
    public boolean f24256a;
    public int f24257b;
    public int f24258c;
    public final ga d;

    public fa(ga gaVar) {
        this.d = gaVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        ga gaVar = this.d;
        Paint paint = gaVar.f24503w;
        if (gaVar.f24488f == null) {
            gaVar.f24488f = new Bitmap[2];
            gaVar.f24490i = new Canvas[2];
        }
        int i11 = (int) (this.f24257b / 15.0f);
        for (int i12 = 0; i12 < 2; i12++) {
            if (i12 == 0) {
                i10 = gaVar.f24500s;
            } else {
                i10 = this.f24258c;
            }
            int i13 = (int) (i10 / 15.0f);
            Bitmap bitmap2 = gaVar.f24488f[i12];
            if (bitmap2 != null && ((bitmap2.getHeight() != i13 || gaVar.f24488f[i12].getWidth() != i11) && (bitmap = gaVar.f24488f[i12]) != null)) {
                bitmap.recycle();
                gaVar.f24488f[i12] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = gaVar.f24488f;
            if (bitmapArr[i12] == null) {
                try {
                    bitmapArr[i12] = Bitmap.createBitmap(i11, i13, Bitmap.Config.ARGB_8888);
                    gaVar.f24490i[i12] = new Canvas(gaVar.f24488f[i12]);
                    gaVar.f24490i[i12].scale(i11 / gaVar.e[i12].getWidth(), i13 / gaVar.e[i12].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i12 == 1) {
                gaVar.f24488f[i12].eraseColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19076d6, gaVar.f24505y));
            } else {
                gaVar.f24488f[i12].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(gaVar.e[i12], 15);
            Canvas canvas = gaVar.f24490i[i12];
            if (canvas != null) {
                canvas.drawBitmap(gaVar.e[i12], 0.0f, 0.0f, paint);
            }
            if (this.f24256a) {
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new qg(this, 12));
    }
}
