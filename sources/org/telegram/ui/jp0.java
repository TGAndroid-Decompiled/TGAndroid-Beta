package org.telegram.ui;
public final class jp0 extends org.telegram.ui.Components.n51 {
    public final int m0;
    public final org.telegram.messenger.ls f46998n0;

    public jp0(org.telegram.messenger.ls lsVar, int i7) {
        this.m0 = i7;
        this.f46998n0 = lsVar;
    }

    @Override
    public final void g0() {
        switch (this.m0) {
            case 0:
                super.g0();
                PhotoViewer photoViewer = (PhotoViewer) this.f46998n0;
                if (photoViewer.f41491t4 == 0) {
                    PhotoViewer.Q(photoViewer, false);
                }
                if (!photoViewer.N8) {
                    d1.f.D(S());
                    d1.f.x(false);
                    return;
                }
                return;
            default:
                super.g0();
                ((SecretMediaViewer) this.f46998n0).U.a(false, true);
                return;
        }
    }

    @Override
    public final void h0() {
        switch (this.m0) {
            case 0:
                super.h0();
                PhotoViewer photoViewer = (PhotoViewer) this.f46998n0;
                PhotoViewer.Q(photoViewer, true);
                if (!photoViewer.N8) {
                    d1.f.D(S());
                    d1.f.x(true);
                    return;
                }
                return;
            default:
                super.h0();
                ((SecretMediaViewer) this.f46998n0).U.a(true, true);
                return;
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        e2.w0 j3;
        switch (this.m0) {
            case 0:
                super.onRenderedFirstFrame();
                PhotoViewer photoViewer = (PhotoViewer) this.f46998n0;
                boolean z9 = true;
                photoViewer.R = true;
                if (photoViewer.D2) {
                    photoViewer.f41356e0.invalidate();
                }
                photoViewer.x3();
                if (!d1.f.u() && !photoViewer.f41468r) {
                    z9 = false;
                }
                t0(z9);
                if (!photoViewer.N8) {
                    d1.f.D(S());
                    l2.i0 i0Var = this.d;
                    float f10 = 1.0f;
                    if (i0Var != null && (j3 = i0Var.j()) != null) {
                        f10 = j3.f10638a;
                    }
                    d1.f.z(f10);
                    return;
                }
                return;
            default:
                super.onRenderedFirstFrame();
                return;
        }
    }

    @Override
    public void p0(long j3) {
        switch (this.m0) {
            case 0:
                q0(j3, false);
                PhotoViewer photoViewer = (PhotoViewer) this.f46998n0;
                if (photoViewer.f41470r1) {
                    PhotoViewer.R(photoViewer, j3);
                }
                if (!photoViewer.N8) {
                    d1.f.D(j3);
                    return;
                }
                return;
            default:
                super.p0(j3);
                return;
        }
    }

    @Override
    public void u0(boolean z9) {
        switch (this.m0) {
            case 1:
                super.u0(z9);
                ((SecretMediaViewer) this.f46998n0).U.a(z9, true);
                return;
            default:
                super.u0(z9);
                return;
        }
    }

    @Override
    public void v0(float f10) {
        switch (this.m0) {
            case 0:
                super.v0(f10);
                if (!((PhotoViewer) this.f46998n0).N8) {
                    d1.f.z(f10);
                    return;
                }
                return;
            default:
                super.v0(f10);
                return;
        }
    }
}
