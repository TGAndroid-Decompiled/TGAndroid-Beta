package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class oa {
    public String f29012a;
    public Bitmap f29013b;
    public final Paint f29014c;
    public final int d;
    public final Runnable f29015e;
    public org.telegram.messenger.x7 f29016f;

    public oa(int i10, Runnable runnable) {
        Paint paint = new Paint(1);
        this.f29014c = paint;
        this.d = i10;
        this.f29015e = runnable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        this.f29012a = null;
        if (this.f29016f != null) {
            Utilities.globalQueue.cancelRunnable(this.f29016f);
        }
        Bitmap bitmap = this.f29013b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f29013b.recycle();
        }
        this.f29013b = null;
    }

    public final android.graphics.Bitmap b(android.graphics.Bitmap r9, java.lang.String r10, int r11, int r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oa.b(android.graphics.Bitmap, java.lang.String, int, int, boolean):android.graphics.Bitmap");
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
