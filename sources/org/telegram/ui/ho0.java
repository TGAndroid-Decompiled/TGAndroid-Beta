package org.telegram.ui;

import android.graphics.Canvas;
public final class ho0 implements ui.a, dh.b {
    public final org.telegram.ui.Components.ga f48502a;
    public final PhotoViewer f48503b;

    public ho0(PhotoViewer photoViewer) {
        this.f48503b = photoViewer;
        this.f48502a = new org.telegram.ui.Components.ga(photoViewer.f43180c0, photoViewer.f43208f0, 0, false);
    }

    @Override
    public final fh.g b() {
        fh.g gVar = new fh.g(this, this, this);
        this.f48503b.f43160a0.add(gVar);
        return gVar;
    }

    @Override
    public final void o(float f10, float f11, float f12, float f13, Canvas canvas) {
        canvas.save();
        canvas.clipRect(f10, f11, f12, f13);
        this.f48503b.N0(canvas, this.f48502a, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override
    public final void c(fh.g gVar) {
    }
}
