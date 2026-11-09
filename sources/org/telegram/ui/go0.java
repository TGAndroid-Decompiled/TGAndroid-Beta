package org.telegram.ui;

import android.graphics.Canvas;
public final class go0 implements ri.a, dh.b {
    public final org.telegram.ui.Components.ca f46050a;
    public final PhotoViewer f46051b;

    public go0(PhotoViewer photoViewer) {
        this.f46051b = photoViewer;
        this.f46050a = new org.telegram.ui.Components.ca(photoViewer.f41363b0, photoViewer.f41391e0, 0, false);
    }

    @Override
    public final fh.g b() {
        fh.g gVar = new fh.g(this, this, this);
        this.f46051b.Z.add(gVar);
        return gVar;
    }

    @Override
    public final void e(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.save();
        canvas.clipRect(f10, f11, f12, f13);
        this.f46051b.N0(canvas, this.f46050a, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override
    public final void c(fh.g gVar) {
    }
}
