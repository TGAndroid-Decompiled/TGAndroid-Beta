package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

public final class u9 implements Runnable {

    public boolean f33019a;

    public int f33020b;

    public int f33021c;
    public final v9 d;

    public u9(v9 v9Var) {
        this.d = v9Var;
    }

    @Override
    public final void run() {
        Bitmap bitmap;
        v9 v9Var = this.d;
        Paint paint = v9Var.f33333w;
        if (v9Var.f33318f == null) {
            v9Var.f33318f = new Bitmap[2];
            v9Var.f33320i = new Canvas[2];
        }
        int i10 = (int) (this.f33020b / 15.0f);
        int i11 = 0;
        while (i11 < 2) {
            int i12 = (int) ((i11 == 0 ? v9Var.f33330s : this.f33021c) / 15.0f);
            Bitmap bitmap2 = v9Var.f33318f[i11];
            if (bitmap2 != null && ((bitmap2.getHeight() != i12 || v9Var.f33318f[i11].getWidth() != i10) && (bitmap = v9Var.f33318f[i11]) != null)) {
                bitmap.recycle();
                v9Var.f33318f[i11] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = v9Var.f33318f;
            if (bitmapArr[i11] == null) {
                try {
                    bitmapArr[i11] = Bitmap.createBitmap(i10, i12, Bitmap.Config.ARGB_8888);
                    v9Var.f33320i[i11] = new Canvas(v9Var.f33318f[i11]);
                    v9Var.f33320i[i11].scale(i10 / v9Var.f33317e[i11].getWidth(), i12 / v9Var.f33317e[i11].getHeight());
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            if (i11 == 1) {
                v9Var.f33318f[i11].eraseColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, v9Var.f33335y));
            } else {
                v9Var.f33318f[i11].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(v9Var.f33317e[i11], 15);
            Canvas canvas = v9Var.f33320i[i11];
            if (canvas != null) {
                canvas.drawBitmap(v9Var.f33317e[i11], 0.0f, 0.0f, paint);
            }
            if (this.f33019a) {
                return;
            } else {
                i11++;
            }
        }
        AndroidUtilities.runOnUIThread(new bg(this, 12));
    }
}
