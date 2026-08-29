package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class ba implements Runnable {
    public boolean f27014a;
    public int f27015b;
    public int f27016c;
    public final ca d;

    public ba(ca caVar) {
        this.d = caVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        ca caVar = this.d;
        Paint paint = caVar.f27422w;
        if (caVar.f27407f == null) {
            caVar.f27407f = new Bitmap[2];
            caVar.f27409i = new Canvas[2];
        }
        int i11 = (int) (this.f27015b / 15.0f);
        for (int i12 = 0; i12 < 2; i12++) {
            if (i12 == 0) {
                i10 = caVar.f27419s;
            } else {
                i10 = this.f27016c;
            }
            int i13 = (int) (i10 / 15.0f);
            Bitmap bitmap2 = caVar.f27407f[i12];
            if (bitmap2 != null && ((bitmap2.getHeight() != i13 || caVar.f27407f[i12].getWidth() != i11) && (bitmap = caVar.f27407f[i12]) != null)) {
                bitmap.recycle();
                caVar.f27407f[i12] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = caVar.f27407f;
            if (bitmapArr[i12] == null) {
                try {
                    bitmapArr[i12] = Bitmap.createBitmap(i11, i13, Bitmap.Config.ARGB_8888);
                    caVar.f27409i[i12] = new Canvas(caVar.f27407f[i12]);
                    caVar.f27409i[i12].scale(i11 / caVar.f27406e[i12].getWidth(), i13 / caVar.f27406e[i12].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i12 == 1) {
                caVar.f27407f[i12].eraseColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, caVar.f27424y));
            } else {
                caVar.f27407f[i12].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(caVar.f27406e[i12], 15);
            Canvas canvas = caVar.f27409i[i12];
            if (canvas != null) {
                canvas.drawBitmap(caVar.f27406e[i12], 0.0f, 0.0f, paint);
            }
            if (this.f27014a) {
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new ig(this, 12));
    }
}
