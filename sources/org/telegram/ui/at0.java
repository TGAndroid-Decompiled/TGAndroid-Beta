package org.telegram.ui;
public final class at0 extends org.telegram.ui.Components.i71 {
    public final PhotoViewer f32640j0;

    public at0(PhotoViewer photoViewer) {
        this.f32640j0 = photoViewer;
    }

    @Override
    public final void B() {
        super.B();
        PhotoViewer photoViewer = this.f32640j0;
        if (photoViewer.f31827r4 == 0) {
            PhotoViewer.Y(photoViewer, false);
        }
        if (!photoViewer.K8) {
            d1.f.D(n());
            d1.f.x(false);
        }
    }

    @Override
    public final void C() {
        super.C();
        PhotoViewer photoViewer = this.f32640j0;
        PhotoViewer.Y(photoViewer, true);
        if (!photoViewer.K8) {
            d1.f.D(n());
            d1.f.x(true);
        }
    }

    @Override
    public final void K(long j10) {
        L(j10, false);
        PhotoViewer photoViewer = this.f32640j0;
        if (photoViewer.f31796o1) {
            PhotoViewer.Z(photoViewer, j10);
        }
        if (!photoViewer.K8) {
            d1.f.D(j10);
        }
    }

    @Override
    public final void Q(float f10) {
        super.Q(f10);
        if (!this.f32640j0.K8) {
            d1.f.z(f10);
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        j3.v1 d;
        super.onRenderedFirstFrame();
        PhotoViewer photoViewer = this.f32640j0;
        boolean z4 = true;
        photoViewer.O = true;
        if (photoViewer.A2) {
            photoViewer.f31679b0.invalidate();
        }
        photoViewer.z3();
        if (!d1.f.u() && !photoViewer.f31822r) {
            z4 = false;
        }
        O(z4);
        if (!photoViewer.K8) {
            d1.f.D(n());
            j3.f0 f0Var = this.d;
            float f10 = 1.0f;
            if (f0Var != null && (d = f0Var.d()) != null) {
                f10 = d.f8838a;
            }
            d1.f.z(f10);
        }
    }
}
