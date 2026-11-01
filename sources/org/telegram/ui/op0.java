package org.telegram.ui;

import android.graphics.Canvas;
public final class op0 implements hi.a, tg.a {
    public final org.telegram.ui.Components.w9 f40243a;
    public final PhotoViewer f40244b;

    public op0(PhotoViewer photoViewer) {
        this.f40244b = photoViewer;
        this.f40243a = new org.telegram.ui.Components.w9(photoViewer.f33449b0, photoViewer.f33477e0, 0, false);
    }

    @Override
    public final vg.f b() {
        vg.f fVar = new vg.f(this, this, this);
        this.f40244b.Z.add(fVar);
        return fVar;
    }

    @Override
    public final void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        this.f40244b.U0(canvas, this.f40243a, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override
    public final void c(vg.f fVar) {
    }
}
