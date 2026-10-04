package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class fa implements Runnable {
    public boolean f26426a;
    public int f26427b;
    public int f26428c;
    public final ga d;

    public fa(ga gaVar) {
        this.d = gaVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        ga gaVar = this.d;
        Paint paint = gaVar.f26765w;
        if (gaVar.f26750f == null) {
            gaVar.f26750f = new Bitmap[2];
            gaVar.f26752i = new Canvas[2];
        }
        int i11 = (int) (this.f26427b / 15.0f);
        for (int i12 = 0; i12 < 2; i12++) {
            if (i12 == 0) {
                i10 = gaVar.f26762s;
            } else {
                i10 = this.f26428c;
            }
            int i13 = (int) (i10 / 15.0f);
            Bitmap bitmap2 = gaVar.f26750f[i12];
            if (bitmap2 != null && ((bitmap2.getHeight() != i13 || gaVar.f26750f[i12].getWidth() != i11) && (bitmap = gaVar.f26750f[i12]) != null)) {
                bitmap.recycle();
                gaVar.f26750f[i12] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = gaVar.f26750f;
            if (bitmapArr[i12] == null) {
                try {
                    bitmapArr[i12] = Bitmap.createBitmap(i11, i13, Bitmap.Config.ARGB_8888);
                    gaVar.f26752i[i12] = new Canvas(gaVar.f26750f[i12]);
                    gaVar.f26752i[i12].scale(i11 / gaVar.f26749e[i12].getWidth(), i13 / gaVar.f26749e[i12].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i12 == 1) {
                gaVar.f26750f[i12].eraseColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20822d6, gaVar.f26767y));
            } else {
                gaVar.f26750f[i12].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(gaVar.f26749e[i12], 15);
            Canvas canvas = gaVar.f26752i[i12];
            if (canvas != null) {
                canvas.drawBitmap(gaVar.f26749e[i12], 0.0f, 0.0f, paint);
            }
            if (this.f26426a) {
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new qg(this, 12));
    }
}
