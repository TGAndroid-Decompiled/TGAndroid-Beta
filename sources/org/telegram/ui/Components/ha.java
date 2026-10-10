package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class ha implements Runnable {
    public boolean f26972a;
    public int f26973b;
    public int f26974c;
    public final ia d;

    public ha(ia iaVar) {
        this.d = iaVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        ia iaVar = this.d;
        Paint paint = iaVar.f27301w;
        if (iaVar.f27286f == null) {
            iaVar.f27286f = new Bitmap[2];
            iaVar.f27288i = new Canvas[2];
        }
        int i11 = (int) (this.f26973b / 15.0f);
        for (int i12 = 0; i12 < 2; i12++) {
            if (i12 == 0) {
                i10 = iaVar.f27298s;
            } else {
                i10 = this.f26974c;
            }
            int i13 = (int) (i10 / 15.0f);
            Bitmap bitmap2 = iaVar.f27286f[i12];
            if (bitmap2 != null && ((bitmap2.getHeight() != i13 || iaVar.f27286f[i12].getWidth() != i11) && (bitmap = iaVar.f27286f[i12]) != null)) {
                bitmap.recycle();
                iaVar.f27286f[i12] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = iaVar.f27286f;
            if (bitmapArr[i12] == null) {
                try {
                    bitmapArr[i12] = Bitmap.createBitmap(i11, i13, Bitmap.Config.ARGB_8888);
                    iaVar.f27288i[i12] = new Canvas(iaVar.f27286f[i12]);
                    iaVar.f27288i[i12].scale(i11 / iaVar.f27285e[i12].getWidth(), i13 / iaVar.f27285e[i12].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i12 == 1) {
                iaVar.f27286f[i12].eraseColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20801d6, iaVar.f27303y));
            } else {
                iaVar.f27286f[i12].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(iaVar.f27285e[i12], 15);
            Canvas canvas = iaVar.f27288i[i12];
            if (canvas != null) {
                canvas.drawBitmap(iaVar.f27285e[i12], 0.0f, 0.0f, paint);
            }
            if (this.f26972a) {
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new rg(this, 12));
    }
}
