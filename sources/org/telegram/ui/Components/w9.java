package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class w9 implements Runnable {
    public boolean f30185a;
    public int f30186b;
    public int f30187c;
    public final x9 d;

    public w9(x9 x9Var) {
        this.d = x9Var;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        x9 x9Var = this.d;
        Paint paint = x9Var.f30563w;
        if (x9Var.f30548f == null) {
            x9Var.f30548f = new Bitmap[2];
            x9Var.f30550i = new Canvas[2];
        }
        int i11 = (int) (this.f30186b / 15.0f);
        for (int i12 = 0; i12 < 2; i12++) {
            if (i12 == 0) {
                i10 = x9Var.f30560s;
            } else {
                i10 = this.f30187c;
            }
            int i13 = (int) (i10 / 15.0f);
            Bitmap bitmap2 = x9Var.f30548f[i12];
            if (bitmap2 != null && ((bitmap2.getHeight() != i13 || x9Var.f30548f[i12].getWidth() != i11) && (bitmap = x9Var.f30548f[i12]) != null)) {
                bitmap.recycle();
                x9Var.f30548f[i12] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = x9Var.f30548f;
            if (bitmapArr[i12] == null) {
                try {
                    bitmapArr[i12] = Bitmap.createBitmap(i11, i13, Bitmap.Config.ARGB_8888);
                    x9Var.f30550i[i12] = new Canvas(x9Var.f30548f[i12]);
                    x9Var.f30550i[i12].scale(i11 / x9Var.e[i12].getWidth(), i13 / x9Var.e[i12].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i12 == 1) {
                x9Var.f30548f[i12].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, x9Var.f30565y));
            } else {
                x9Var.f30548f[i12].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(x9Var.e[i12], 15);
            Canvas canvas = x9Var.f30550i[i12];
            if (canvas != null) {
                canvas.drawBitmap(x9Var.e[i12], 0.0f, 0.0f, paint);
            }
            if (this.f30185a) {
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new fg(this, 12));
    }
}
