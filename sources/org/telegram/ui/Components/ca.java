package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class ca implements Runnable {
    public boolean f25274a;
    public int f25275b;
    public int f25276c;
    public final da d;

    public ca(da daVar) {
        this.d = daVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        da daVar = this.d;
        Paint paint = daVar.f25649w;
        if (daVar.f25634f == null) {
            daVar.f25634f = new Bitmap[2];
            daVar.f25636i = new Canvas[2];
        }
        int i11 = (int) (this.f25275b / 15.0f);
        for (int i12 = 0; i12 < 2; i12++) {
            if (i12 == 0) {
                i10 = daVar.f25646s;
            } else {
                i10 = this.f25276c;
            }
            int i13 = (int) (i10 / 15.0f);
            Bitmap bitmap2 = daVar.f25634f[i12];
            if (bitmap2 != null && ((bitmap2.getHeight() != i13 || daVar.f25634f[i12].getWidth() != i11) && (bitmap = daVar.f25634f[i12]) != null)) {
                bitmap.recycle();
                daVar.f25634f[i12] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = daVar.f25634f;
            if (bitmapArr[i12] == null) {
                try {
                    bitmapArr[i12] = Bitmap.createBitmap(i11, i13, Bitmap.Config.ARGB_8888);
                    daVar.f25636i[i12] = new Canvas(daVar.f25634f[i12]);
                    daVar.f25636i[i12].scale(i11 / daVar.e[i12].getWidth(), i13 / daVar.e[i12].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i12 == 1) {
                daVar.f25634f[i12].eraseColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21184d6, daVar.f25651y));
            } else {
                daVar.f25634f[i12].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(daVar.e[i12], 15);
            Canvas canvas = daVar.f25636i[i12];
            if (canvas != null) {
                canvas.drawBitmap(daVar.e[i12], 0.0f, 0.0f, paint);
            }
            if (this.f25274a) {
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new ng(this, 13));
    }
}
