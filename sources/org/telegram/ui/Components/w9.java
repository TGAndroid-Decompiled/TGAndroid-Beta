package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class w9 implements Runnable {
    public boolean f34152a;
    public int f34153b;
    public int f34154c;
    public final x9 d;

    public w9(x9 x9Var) {
        this.d = x9Var;
    }

    @Override
    public final void run() {
        int i9;
        Bitmap bitmap;
        x9 x9Var = this.d;
        Paint paint = x9Var.f34621w;
        if (x9Var.f34606f == null) {
            x9Var.f34606f = new Bitmap[2];
            x9Var.f34608i = new Canvas[2];
        }
        int i10 = (int) (this.f34153b / 15.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                i9 = x9Var.f34618s;
            } else {
                i9 = this.f34154c;
            }
            int i12 = (int) (i9 / 15.0f);
            Bitmap bitmap2 = x9Var.f34606f[i11];
            if (bitmap2 != null && ((bitmap2.getHeight() != i12 || x9Var.f34606f[i11].getWidth() != i10) && (bitmap = x9Var.f34606f[i11]) != null)) {
                bitmap.recycle();
                x9Var.f34606f[i11] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = x9Var.f34606f;
            if (bitmapArr[i11] == null) {
                try {
                    bitmapArr[i11] = Bitmap.createBitmap(i10, i12, Bitmap.Config.ARGB_8888);
                    x9Var.f34608i[i11] = new Canvas(x9Var.f34606f[i11]);
                    x9Var.f34608i[i11].scale(i10 / x9Var.f34605e[i11].getWidth(), i12 / x9Var.f34605e[i11].getHeight());
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            if (i11 == 1) {
                x9Var.f34606f[i11].eraseColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, x9Var.f34623y));
            } else {
                x9Var.f34606f[i11].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(x9Var.f34605e[i11], 15);
            Canvas canvas = x9Var.f34608i[i11];
            if (canvas != null) {
                canvas.drawBitmap(x9Var.f34605e[i11], 0.0f, 0.0f, paint);
            }
            if (this.f34152a) {
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new fg(this, 12));
    }
}
