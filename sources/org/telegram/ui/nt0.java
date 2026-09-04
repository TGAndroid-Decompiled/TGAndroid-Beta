package org.telegram.ui;
public final class nt0 extends org.telegram.ui.Components.g71 {
    public final PhotoViewer m0;

    public nt0(PhotoViewer photoViewer) {
        this.m0 = photoViewer;
    }

    @Override
    public final void B() {
        super.B();
        PhotoViewer photoViewer = this.m0;
        if (photoViewer.f33693u4 == 0) {
            PhotoViewer.Y(photoViewer, false);
        }
        if (!photoViewer.N8) {
            b5.d.D(n());
            b5.d.x(false);
        }
    }

    @Override
    public final void C() {
        super.C();
        PhotoViewer photoViewer = this.m0;
        PhotoViewer.Y(photoViewer, true);
        if (!photoViewer.N8) {
            b5.d.D(n());
            b5.d.x(true);
        }
    }

    @Override
    public final void K(long j3) {
        L(j3, false);
        PhotoViewer photoViewer = this.m0;
        if (photoViewer.f33662r1) {
            PhotoViewer.Z(photoViewer, j3);
        }
        if (!photoViewer.N8) {
            b5.d.D(j3);
        }
    }

    @Override
    public final void Q(float f7) {
        super.Q(f7);
        if (!this.m0.N8) {
            b5.d.z(f7);
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        b2.v0 h;
        super.onRenderedFirstFrame();
        PhotoViewer photoViewer = this.m0;
        boolean z10 = true;
        photoViewer.R = true;
        if (photoViewer.D2) {
            photoViewer.f33549e0.invalidate();
        }
        photoViewer.z3();
        if (!b5.d.u() && !photoViewer.f33660r) {
            z10 = false;
        }
        O(z10);
        if (!photoViewer.N8) {
            b5.d.D(n());
            i2.f0 f0Var = this.d;
            float f7 = 1.0f;
            if (f0Var != null && (h = f0Var.h()) != null) {
                f7 = h.f2400a;
            }
            b5.d.z(f7);
        }
    }
}
