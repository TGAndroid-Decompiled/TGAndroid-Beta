package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class ga {
    public String f27155a;
    public Bitmap f27156b;
    public final Paint f27157c;
    public final int d;
    public final Runnable f27158e;
    public org.telegram.messenger.b8 f27159f;

    public ga(int i10, Runnable runnable) {
        Paint paint = new Paint(1);
        this.f27157c = paint;
        this.d = i10;
        this.f27158e = runnable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        this.f27155a = null;
        if (this.f27159f != null) {
            Utilities.globalQueue.cancelRunnable(this.f27159f);
        }
        Bitmap bitmap = this.f27156b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f27156b.recycle();
        }
        this.f27156b = null;
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
