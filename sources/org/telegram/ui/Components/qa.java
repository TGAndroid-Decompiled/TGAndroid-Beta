package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class qa {
    public String f30215a;
    public Bitmap f30216b;
    public final Paint f30217c;
    public final int d;
    public final Runnable f30218e;
    public org.telegram.messenger.v7 f30219f;

    public qa(int i10, Runnable runnable) {
        Paint paint = new Paint(1);
        this.f30217c = paint;
        this.d = i10;
        this.f30218e = runnable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        this.f30215a = null;
        if (this.f30219f != null) {
            Utilities.globalQueue.cancelRunnable(this.f30219f);
        }
        Bitmap bitmap = this.f30216b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f30216b.recycle();
        }
        this.f30216b = null;
    }

    public final android.graphics.Bitmap b(android.graphics.Bitmap r9, java.lang.String r10, int r11, int r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qa.b(android.graphics.Bitmap, java.lang.String, int, int, boolean):android.graphics.Bitmap");
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
