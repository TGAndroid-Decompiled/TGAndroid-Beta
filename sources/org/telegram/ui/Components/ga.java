package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class ga implements Runnable {
    public boolean f26375a;
    public int f26376b;
    public int f26377c;
    public final ha d;

    public ga(ha haVar) {
        this.d = haVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        ha haVar = this.d;
        Paint paint = haVar.f26729w;
        if (haVar.f26714f == null) {
            haVar.f26714f = new Bitmap[2];
            haVar.f26716i = new Canvas[2];
        }
        int i11 = (int) (this.f26376b / 15.0f);
        for (int i12 = 0; i12 < 2; i12++) {
            if (i12 == 0) {
                i10 = haVar.f26726s;
            } else {
                i10 = this.f26377c;
            }
            int i13 = (int) (i10 / 15.0f);
            Bitmap bitmap2 = haVar.f26714f[i12];
            if (bitmap2 != null && ((bitmap2.getHeight() != i13 || haVar.f26714f[i12].getWidth() != i11) && (bitmap = haVar.f26714f[i12]) != null)) {
                bitmap.recycle();
                haVar.f26714f[i12] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = haVar.f26714f;
            if (bitmapArr[i12] == null) {
                try {
                    bitmapArr[i12] = Bitmap.createBitmap(i11, i13, Bitmap.Config.ARGB_8888);
                    haVar.f26716i[i12] = new Canvas(haVar.f26714f[i12]);
                    haVar.f26716i[i12].scale(i11 / haVar.f26713e[i12].getWidth(), i13 / haVar.f26713e[i12].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i12 == 1) {
                haVar.f26714f[i12].eraseColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d6, haVar.f26731y));
            } else {
                haVar.f26714f[i12].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(haVar.f26713e[i12], 15);
            Canvas canvas = haVar.f26716i[i12];
            if (canvas != null) {
                canvas.drawBitmap(haVar.f26713e[i12], 0.0f, 0.0f, paint);
            }
            if (this.f26375a) {
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new tg(this, 12));
    }
}
