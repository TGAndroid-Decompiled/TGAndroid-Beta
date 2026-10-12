package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class qa {
    public String f28561a;
    public Bitmap f28562b;
    public final Paint f28563c;
    public final int d;
    public final Runnable e;
    public org.telegram.messenger.y7 f28564f;

    public qa(int i10, Runnable runnable) {
        Paint paint = new Paint(1);
        this.f28563c = paint;
        this.d = i10;
        this.e = runnable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        this.f28561a = null;
        if (this.f28564f != null) {
            Utilities.globalQueue.cancelRunnable(this.f28564f);
        }
        Bitmap bitmap = this.f28562b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f28562b.recycle();
        }
        this.f28562b = null;
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
