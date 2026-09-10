package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class da implements Runnable {
    public boolean f22341a;
    public int f22342b;
    public int f22343c;
    public final ea d;

    public da(ea eaVar) {
        this.d = eaVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        ea eaVar = this.d;
        Paint paint = eaVar.f22651w;
        if (eaVar.f22636f == null) {
            eaVar.f22636f = new Bitmap[2];
            eaVar.f22638i = new Canvas[2];
        }
        int i11 = (int) (this.f22342b / 15.0f);
        for (int i12 = 0; i12 < 2; i12++) {
            if (i12 == 0) {
                i10 = eaVar.f22648s;
            } else {
                i10 = this.f22343c;
            }
            int i13 = (int) (i10 / 15.0f);
            Bitmap bitmap2 = eaVar.f22636f[i12];
            if (bitmap2 != null && ((bitmap2.getHeight() != i13 || eaVar.f22636f[i12].getWidth() != i11) && (bitmap = eaVar.f22636f[i12]) != null)) {
                bitmap.recycle();
                eaVar.f22636f[i12] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = eaVar.f22636f;
            if (bitmapArr[i12] == null) {
                try {
                    bitmapArr[i12] = Bitmap.createBitmap(i11, i13, Bitmap.Config.ARGB_8888);
                    eaVar.f22638i[i12] = new Canvas(eaVar.f22636f[i12]);
                    eaVar.f22638i[i12].scale(i11 / eaVar.e[i12].getWidth(), i13 / eaVar.e[i12].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i12 == 1) {
                eaVar.f22636f[i12].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, eaVar.f22653y));
            } else {
                eaVar.f22636f[i12].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(eaVar.e[i12], 15);
            Canvas canvas = eaVar.f22638i[i12];
            if (canvas != null) {
                canvas.drawBitmap(eaVar.e[i12], 0.0f, 0.0f, paint);
            }
            if (this.f22341a) {
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new rg(this, 12));
    }
}
