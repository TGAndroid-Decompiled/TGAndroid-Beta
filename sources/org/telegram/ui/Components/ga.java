package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class ga implements Runnable {
    public boolean f26377a;
    public int f26378b;
    public int f26379c;
    public final ha d;

    public ga(ha haVar) {
        this.d = haVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        ha haVar = this.d;
        Paint paint = haVar.f26725w;
        if (haVar.f26710f == null) {
            haVar.f26710f = new Bitmap[2];
            haVar.f26712i = new Canvas[2];
        }
        int i11 = (int) (this.f26378b / 15.0f);
        for (int i12 = 0; i12 < 2; i12++) {
            if (i12 == 0) {
                i10 = haVar.f26722s;
            } else {
                i10 = this.f26379c;
            }
            int i13 = (int) (i10 / 15.0f);
            Bitmap bitmap2 = haVar.f26710f[i12];
            if (bitmap2 != null && ((bitmap2.getHeight() != i13 || haVar.f26710f[i12].getWidth() != i11) && (bitmap = haVar.f26710f[i12]) != null)) {
                bitmap.recycle();
                haVar.f26710f[i12] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = haVar.f26710f;
            if (bitmapArr[i12] == null) {
                try {
                    bitmapArr[i12] = Bitmap.createBitmap(i11, i13, Bitmap.Config.ARGB_8888);
                    haVar.f26712i[i12] = new Canvas(haVar.f26710f[i12]);
                    haVar.f26712i[i12].scale(i11 / haVar.f26709e[i12].getWidth(), i13 / haVar.f26709e[i12].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i12 == 1) {
                haVar.f26710f[i12].eraseColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, haVar.f26727y));
            } else {
                haVar.f26710f[i12].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(haVar.f26709e[i12], 15);
            Canvas canvas = haVar.f26712i[i12];
            if (canvas != null) {
                canvas.drawBitmap(haVar.f26709e[i12], 0.0f, 0.0f, paint);
            }
            if (this.f26377a) {
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new tg(this, 12));
    }
}
