package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class ga {
    public String f28711a;
    public Bitmap f28712b;
    public final Paint f28713c;
    public final int d;
    public final Runnable f28714e;
    public org.telegram.messenger.v7 f28715f;

    public ga(int i9, Runnable runnable) {
        Paint paint = new Paint(1);
        this.f28713c = paint;
        this.d = i9;
        this.f28714e = runnable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        this.f28711a = null;
        if (this.f28715f != null) {
            Utilities.globalQueue.cancelRunnable(this.f28715f);
        }
        Bitmap bitmap = this.f28712b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f28712b.recycle();
        }
        this.f28712b = null;
    }

    public final android.graphics.Bitmap b(android.graphics.Bitmap r9, java.lang.String r10, int r11, int r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ga.b(android.graphics.Bitmap, java.lang.String, int, int, boolean):android.graphics.Bitmap");
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
