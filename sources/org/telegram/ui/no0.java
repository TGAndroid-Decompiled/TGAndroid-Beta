package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
public final class no0 extends org.telegram.ui.Components.w51 {
    public final org.telegram.ui.Components.ba f48036h0;
    public final PhotoViewer f48037i0;

    public no0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f48037i0 = photoViewer;
        new Path();
        this.f48036h0 = new org.telegram.ui.Components.ba(photoViewer.f41392c0, this, 0, false);
    }

    @Override
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        PhotoViewer photoViewer = this.f48037i0;
        canvas.translate((-getX()) - photoViewer.S7.getX(), (-getY()) - photoViewer.S7.getY());
        photoViewer.U0(canvas, this.f48036h0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i3;
        if (org.telegram.messenger.az.f21619c0 && ((i3 = this.f48037i0.f41499o4) == 1 || i3 == 2 || i3 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.f48037i0.f41420f0.invalidate();
        }
    }
}
