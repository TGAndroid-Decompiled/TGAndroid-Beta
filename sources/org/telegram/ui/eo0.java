package org.telegram.ui;

import android.graphics.Canvas;
public final class eo0 implements ri.a, dh.b {
    public final org.telegram.ui.Components.ca f45350a;
    public final PhotoViewer f45351b;

    public eo0(PhotoViewer photoViewer) {
        this.f45351b = photoViewer;
        this.f45350a = new org.telegram.ui.Components.ca(photoViewer.f41356b0, photoViewer.f41384e0, 0, false);
    }

    @Override
    public final fh.g b() {
        fh.g gVar = new fh.g(this, this, this);
        this.f45351b.Z.add(gVar);
        return gVar;
    }

    @Override
    public final void e(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.save();
        canvas.clipRect(f10, f11, f12, f13);
        this.f45351b.N0(canvas, this.f45350a, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override
    public final void c(fh.g gVar) {
    }
}
