package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class ca implements Runnable {
    public boolean f22991a;
    public int f22992b;
    public int f22993c;
    public final da d;

    public ca(da daVar) {
        this.d = daVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        da daVar = this.d;
        Paint paint = daVar.f23306w;
        if (daVar.f23291f == null) {
            daVar.f23291f = new Bitmap[2];
            daVar.f23293i = new Canvas[2];
        }
        int i11 = (int) (this.f22992b / 15.0f);
        for (int i12 = 0; i12 < 2; i12++) {
            if (i12 == 0) {
                i10 = daVar.f23303s;
            } else {
                i10 = this.f22993c;
            }
            int i13 = (int) (i10 / 15.0f);
            Bitmap bitmap2 = daVar.f23291f[i12];
            if (bitmap2 != null && ((bitmap2.getHeight() != i13 || daVar.f23291f[i12].getWidth() != i11) && (bitmap = daVar.f23291f[i12]) != null)) {
                bitmap.recycle();
                daVar.f23291f[i12] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = daVar.f23291f;
            if (bitmapArr[i12] == null) {
                try {
                    bitmapArr[i12] = Bitmap.createBitmap(i11, i13, Bitmap.Config.ARGB_8888);
                    daVar.f23293i[i12] = new Canvas(daVar.f23291f[i12]);
                    daVar.f23293i[i12].scale(i11 / daVar.e[i12].getWidth(), i13 / daVar.e[i12].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i12 == 1) {
                daVar.f23291f[i12].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18863d6, daVar.f23308y));
            } else {
                daVar.f23291f[i12].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(daVar.e[i12], 15);
            Canvas canvas = daVar.f23293i[i12];
            if (canvas != null) {
                canvas.drawBitmap(daVar.e[i12], 0.0f, 0.0f, paint);
            }
            if (this.f22991a) {
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new ng(this, 12));
    }
}
