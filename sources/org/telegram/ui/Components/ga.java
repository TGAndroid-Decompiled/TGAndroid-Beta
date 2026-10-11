package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class ga implements Runnable {
    public boolean f26702a;
    public int f26703b;
    public int f26704c;
    public final ha d;

    public ga(ha haVar) {
        this.d = haVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        ha haVar = this.d;
        Paint paint = haVar.f27021w;
        if (haVar.f27006f == null) {
            haVar.f27006f = new Bitmap[2];
            haVar.f27008i = new Canvas[2];
        }
        int i11 = (int) (this.f26703b / 15.0f);
        for (int i12 = 0; i12 < 2; i12++) {
            if (i12 == 0) {
                i10 = haVar.f27018s;
            } else {
                i10 = this.f26704c;
            }
            int i13 = (int) (i10 / 15.0f);
            Bitmap bitmap2 = haVar.f27006f[i12];
            if (bitmap2 != null && ((bitmap2.getHeight() != i13 || haVar.f27006f[i12].getWidth() != i11) && (bitmap = haVar.f27006f[i12]) != null)) {
                bitmap.recycle();
                haVar.f27006f[i12] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = haVar.f27006f;
            if (bitmapArr[i12] == null) {
                try {
                    bitmapArr[i12] = Bitmap.createBitmap(i11, i13, Bitmap.Config.ARGB_8888);
                    haVar.f27008i[i12] = new Canvas(haVar.f27006f[i12]);
                    haVar.f27008i[i12].scale(i11 / haVar.f27005e[i12].getWidth(), i13 / haVar.f27005e[i12].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i12 == 1) {
                haVar.f27006f[i12].eraseColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20822d6, haVar.f27023y));
            } else {
                haVar.f27006f[i12].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(haVar.f27005e[i12], 15);
            Canvas canvas = haVar.f27008i[i12];
            if (canvas != null) {
                canvas.drawBitmap(haVar.f27005e[i12], 0.0f, 0.0f, paint);
            }
            if (this.f26702a) {
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new rg(this, 12));
    }
}
