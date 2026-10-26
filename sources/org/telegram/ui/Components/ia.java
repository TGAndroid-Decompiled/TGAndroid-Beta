package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class ia implements Runnable {
    public boolean f29239a;
    public int f29240b;
    public int f29241c;
    public final ja d;

    public ia(ja jaVar) {
        this.d = jaVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        ja jaVar = this.d;
        Paint paint = jaVar.f29574w;
        if (jaVar.f29559f == null) {
            jaVar.f29559f = new Bitmap[2];
            jaVar.f29561i = new Canvas[2];
        }
        int i11 = (int) (this.f29240b / 15.0f);
        for (int i12 = 0; i12 < 2; i12++) {
            if (i12 == 0) {
                i10 = jaVar.f29571s;
            } else {
                i10 = this.f29241c;
            }
            int i13 = (int) (i10 / 15.0f);
            Bitmap bitmap2 = jaVar.f29559f[i12];
            if (bitmap2 != null && ((bitmap2.getHeight() != i13 || jaVar.f29559f[i12].getWidth() != i11) && (bitmap = jaVar.f29559f[i12]) != null)) {
                bitmap.recycle();
                jaVar.f29559f[i12] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = jaVar.f29559f;
            if (bitmapArr[i12] == null) {
                try {
                    bitmapArr[i12] = Bitmap.createBitmap(i11, i13, Bitmap.Config.ARGB_8888);
                    jaVar.f29561i[i12] = new Canvas(jaVar.f29559f[i12]);
                    jaVar.f29561i[i12].scale(i11 / jaVar.e[i12].getWidth(), i13 / jaVar.e[i12].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i12 == 1) {
                jaVar.f29559f[i12].eraseColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23356d6, jaVar.f29576y));
            } else {
                jaVar.f29559f[i12].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(jaVar.e[i12], 15);
            Canvas canvas = jaVar.f29561i[i12];
            if (canvas != null) {
                canvas.drawBitmap(jaVar.e[i12], 0.0f, 0.0f, paint);
            }
            if (this.f29239a) {
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new pg(this, 13));
    }
}
