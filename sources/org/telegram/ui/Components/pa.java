package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class pa {
    public String f29577a;
    public Bitmap f29578b;
    public final Paint f29579c;
    public final int d;
    public final Runnable f29580e;
    public org.telegram.messenger.v7 f29581f;

    public pa(int i10, Runnable runnable) {
        Paint paint = new Paint(1);
        this.f29579c = paint;
        this.d = i10;
        this.f29580e = runnable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        this.f29577a = null;
        if (this.f29581f != null) {
            Utilities.globalQueue.cancelRunnable(this.f29581f);
        }
        Bitmap bitmap = this.f29578b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f29578b.recycle();
        }
        this.f29578b = null;
    }

    public final android.graphics.Bitmap b(android.graphics.Bitmap r9, java.lang.String r10, int r11, int r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pa.b(android.graphics.Bitmap, java.lang.String, int, int, boolean):android.graphics.Bitmap");
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
