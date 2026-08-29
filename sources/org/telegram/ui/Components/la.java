package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class la {
    public String f30265a;
    public Bitmap f30266b;
    public final Paint f30267c;
    public final int d;
    public final Runnable f30268e;
    public org.telegram.messenger.a8 f30269f;

    public la(int i10, Runnable runnable) {
        Paint paint = new Paint(1);
        this.f30267c = paint;
        this.d = i10;
        this.f30268e = runnable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        this.f30265a = null;
        if (this.f30269f != null) {
            Utilities.globalQueue.cancelRunnable(this.f30269f);
        }
        Bitmap bitmap = this.f30266b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f30266b.recycle();
        }
        this.f30266b = null;
    }

    public final android.graphics.Bitmap b(android.graphics.Bitmap r9, java.lang.String r10, int r11, int r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.la.b(android.graphics.Bitmap, java.lang.String, int, int, boolean):android.graphics.Bitmap");
    }

    public final Bitmap c(ImageReceiver.BitmapHolder bitmapHolder) {
        if (bitmapHolder == null) {
            return null;
        }
        return b(bitmapHolder.bitmap, bitmapHolder.getKey(), bitmapHolder.orientation, 0, false);
    }

    public final Bitmap d(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return null;
        }
        return b(imageReceiver.getBitmap(), imageReceiver.getImageKey(), imageReceiver.getOrientation(), imageReceiver.getInvert(), false);
    }
}
