package org.telegram.ui;

import android.graphics.Canvas;
public final class ho0 implements ri.a, dh.b {
    public final org.telegram.ui.Components.ba f46403a;
    public final PhotoViewer f46404b;

    public ho0(PhotoViewer photoViewer) {
        this.f46404b = photoViewer;
        this.f46403a = new org.telegram.ui.Components.ba(photoViewer.f41354b0, photoViewer.f41382e0, 0, false);
    }

    @Override
    public final fh.g b() {
        fh.g gVar = new fh.g(this, this, this);
        this.f46404b.Z.add(gVar);
        return gVar;
    }

    @Override
    public final void e(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.save();
        canvas.clipRect(f10, f11, f12, f13);
        this.f46404b.N0(canvas, this.f46403a, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override
    public final void c(fh.g gVar) {
    }
}
