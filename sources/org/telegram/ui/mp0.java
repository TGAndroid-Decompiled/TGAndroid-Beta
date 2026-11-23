package org.telegram.ui;
public final class mp0 extends org.telegram.ui.Components.i61 {
    public final int f49924n0;
    public final org.telegram.messenger.gs f49925o0;

    public mp0(org.telegram.messenger.gs gsVar, int i7) {
        this.f49924n0 = i7;
        this.f49925o0 = gsVar;
    }

    @Override
    public final void g0() {
        switch (this.f49924n0) {
            case 0:
                super.g0();
                PhotoViewer photoViewer = (PhotoViewer) this.f49925o0;
                if (photoViewer.f43351u4 == 0) {
                    PhotoViewer.R(photoViewer, false);
                }
                if (!photoViewer.O8) {
                    d1.f.D(S());
                    d1.f.x(false);
                    return;
                }
                return;
            default:
                super.g0();
                ((SecretMediaViewer) this.f49925o0).V.a(false, true);
                return;
        }
    }

    @Override
    public final void h0() {
        switch (this.f49924n0) {
            case 0:
                super.h0();
                PhotoViewer photoViewer = (PhotoViewer) this.f49925o0;
                PhotoViewer.R(photoViewer, true);
                if (!photoViewer.O8) {
                    d1.f.D(S());
                    d1.f.x(true);
                    return;
                }
                return;
            default:
                super.h0();
                ((SecretMediaViewer) this.f49925o0).V.a(true, true);
                return;
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        e2.w0 j3;
        switch (this.f49924n0) {
            case 0:
                super.onRenderedFirstFrame();
                PhotoViewer photoViewer = (PhotoViewer) this.f49925o0;
                boolean z10 = true;
                photoViewer.S = true;
                if (photoViewer.E2) {
                    photoViewer.f43218f0.invalidate();
                }
                photoViewer.y3();
                if (!d1.f.u() && !photoViewer.f43320r) {
                    z10 = false;
                }
                t0(z10);
                if (!photoViewer.O8) {
                    d1.f.D(S());
                    l2.f0 f0Var = this.d;
                    float f10 = 1.0f;
                    if (f0Var != null && (j3 = f0Var.j()) != null) {
                        f10 = j3.f10784a;
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
        switch (this.f49924n0) {
            case 0:
                q0(j3, false);
                PhotoViewer photoViewer = (PhotoViewer) this.f49925o0;
                if (photoViewer.f43332s1) {
                    PhotoViewer.S(photoViewer, j3);
                }
                if (!photoViewer.O8) {
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
    public void u0(boolean z10) {
        switch (this.f49924n0) {
            case 1:
                super.u0(z10);
                ((SecretMediaViewer) this.f49925o0).V.a(z10, true);
                return;
            default:
                super.u0(z10);
                return;
        }
    }

    @Override
    public void v0(float f10) {
        switch (this.f49924n0) {
            case 0:
                super.v0(f10);
                if (!((PhotoViewer) this.f49925o0).O8) {
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
