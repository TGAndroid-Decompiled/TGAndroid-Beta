package org.telegram.ui;

import android.graphics.Canvas;
public final class eo0 implements ui.a, dh.b {
    public final org.telegram.ui.Components.y9 f46889a;
    public final PhotoViewer f46890b;

    public eo0(PhotoViewer photoViewer) {
        this.f46890b = photoViewer;
        this.f46889a = new org.telegram.ui.Components.y9(photoViewer.f42735c0, photoViewer.f42763f0, 0, false);
    }

    @Override
    public final fh.g b() {
        fh.g gVar = new fh.g(this, this, this);
        this.f46890b.f42715a0.add(gVar);
        return gVar;
    }

    @Override
    public final void b0(float f10, float f11, float f12, float f13, Canvas canvas) {
        canvas.save();
        canvas.clipRect(f10, f11, f12, f13);
        this.f46890b.N0(canvas, this.f46889a, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override
    public final void c(fh.g gVar) {
    }
}
