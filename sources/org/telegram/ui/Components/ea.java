package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

public final class ea {

    public String f27998a;

    public Bitmap f27999b;

    public final Paint f28000c;
    public final int d;

    public final Runnable f28001e;

    public org.telegram.messenger.y7 f28002f;

    public ea(int i10, Runnable runnable) {
        Paint paint = new Paint(1);
        this.f28000c = paint;
        this.d = i10;
        this.f28001e = runnable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        this.f27998a = null;
        if (this.f28002f != null) {
            Utilities.globalQueue.cancelRunnable(this.f28002f);
        }
        Bitmap bitmap = this.f27999b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f27999b.recycle();
        }
        this.f27999b = null;
    }

    public final android.graphics.Bitmap b(android.graphics.Bitmap r9, java.lang.String r10, int r11, int r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ea.b(android.graphics.Bitmap, java.lang.String, int, int, boolean):android.graphics.Bitmap");
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
