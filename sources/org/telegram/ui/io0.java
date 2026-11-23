package org.telegram.ui;

import android.graphics.Canvas;
public final class io0 implements ui.a, dh.b {
    public final org.telegram.ui.Components.ga f48807a;
    public final PhotoViewer f48808b;

    public io0(PhotoViewer photoViewer) {
        this.f48808b = photoViewer;
        this.f48807a = new org.telegram.ui.Components.ga(photoViewer.f43190c0, photoViewer.f43218f0, 0, false);
    }

    @Override
    public final fh.g b() {
        fh.g gVar = new fh.g(this, this, this);
        this.f48808b.f43170a0.add(gVar);
        return gVar;
    }

    @Override
    public final void o(float f10, float f11, float f12, float f13, Canvas canvas) {
        canvas.save();
        canvas.clipRect(f10, f11, f12, f13);
        this.f48808b.N0(canvas, this.f48807a, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override
    public final void c(fh.g gVar) {
    }
}
