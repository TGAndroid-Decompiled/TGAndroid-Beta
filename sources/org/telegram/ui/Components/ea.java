package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class ea implements Runnable {
    public boolean f23895a;
    public int f23896b;
    public int f23897c;
    public final fa d;

    public ea(fa faVar) {
        this.d = faVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        fa faVar = this.d;
        Paint paint = faVar.f24122w;
        if (faVar.f24107f == null) {
            faVar.f24107f = new Bitmap[2];
            faVar.f24109i = new Canvas[2];
        }
        int i11 = (int) (this.f23896b / 15.0f);
        for (int i12 = 0; i12 < 2; i12++) {
            if (i12 == 0) {
                i10 = faVar.f24119s;
            } else {
                i10 = this.f23897c;
            }
            int i13 = (int) (i10 / 15.0f);
            Bitmap bitmap2 = faVar.f24107f[i12];
            if (bitmap2 != null && ((bitmap2.getHeight() != i13 || faVar.f24107f[i12].getWidth() != i11) && (bitmap = faVar.f24107f[i12]) != null)) {
                bitmap.recycle();
                faVar.f24107f[i12] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = faVar.f24107f;
            if (bitmapArr[i12] == null) {
                try {
                    bitmapArr[i12] = Bitmap.createBitmap(i11, i13, Bitmap.Config.ARGB_8888);
                    faVar.f24109i[i12] = new Canvas(faVar.f24107f[i12]);
                    faVar.f24109i[i12].scale(i11 / faVar.e[i12].getWidth(), i13 / faVar.e[i12].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i12 == 1) {
                faVar.f24107f[i12].eraseColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19060d6, faVar.f24124y));
            } else {
                faVar.f24107f[i12].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(faVar.e[i12], 15);
            Canvas canvas = faVar.f24109i[i12];
            if (canvas != null) {
                canvas.drawBitmap(faVar.e[i12], 0.0f, 0.0f, paint);
            }
            if (this.f23895a) {
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new pg(this, 12));
    }
}
