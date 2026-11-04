package org.telegram.ui;
public final class bp0 extends org.telegram.ui.Components.m51 {
    public final int f44122n0;
    public final org.telegram.messenger.cs f44123o0;

    public bp0(org.telegram.messenger.cs csVar, int i3) {
        this.f44122n0 = i3;
        this.f44123o0 = csVar;
    }

    @Override
    public final void g0() {
        switch (this.f44122n0) {
            case 0:
                super.g0();
                PhotoViewer photoViewer = (PhotoViewer) this.f44123o0;
                if (photoViewer.f41562v4 == 0) {
                    PhotoViewer.Z(photoViewer, false);
                }
                if (!photoViewer.P8) {
                    d1.f.D(S());
                    d1.f.x(false);
                    return;
                }
                return;
            default:
                super.g0();
                ((SecretMediaViewer) this.f44123o0).V.a(false, true);
                return;
        }
    }

    @Override
    public final void h0() {
        switch (this.f44122n0) {
            case 0:
                super.h0();
                PhotoViewer photoViewer = (PhotoViewer) this.f44123o0;
                PhotoViewer.Z(photoViewer, true);
                if (!photoViewer.P8) {
                    d1.f.D(S());
                    d1.f.x(true);
                    return;
                }
                return;
            default:
                super.h0();
                ((SecretMediaViewer) this.f44123o0).V.a(true, true);
                return;
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        d2.y0 g7;
        switch (this.f44122n0) {
            case 0:
                super.onRenderedFirstFrame();
                PhotoViewer photoViewer = (PhotoViewer) this.f44123o0;
                boolean z10 = true;
                photoViewer.S = true;
                if (photoViewer.E2) {
                    photoViewer.f41420f0.invalidate();
                }
                photoViewer.C3();
                if (!d1.f.u() && !photoViewer.f41522r) {
                    z10 = false;
                }
                t0(z10);
                if (!photoViewer.P8) {
                    d1.f.D(S());
                    k2.i0 i0Var = this.d;
                    float f10 = 1.0f;
                    if (i0Var != null && (g7 = i0Var.g()) != null) {
                        f10 = g7.f8517a;
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
    public void p0(long j10) {
        switch (this.f44122n0) {
            case 0:
                q0(j10, false);
                PhotoViewer photoViewer = (PhotoViewer) this.f44123o0;
                if (photoViewer.f41533s1) {
                    PhotoViewer.a0(photoViewer, j10);
                }
                if (!photoViewer.P8) {
                    d1.f.D(j10);
                    return;
                }
                return;
            default:
                super.p0(j10);
                return;
        }
    }

    @Override
    public void u0(boolean z10) {
        switch (this.f44122n0) {
            case 1:
                super.u0(z10);
                ((SecretMediaViewer) this.f44123o0).V.a(z10, true);
                return;
            default:
                super.u0(z10);
                return;
        }
    }

    @Override
    public void v0(float f10) {
        switch (this.f44122n0) {
            case 0:
                super.v0(f10);
                if (!((PhotoViewer) this.f44123o0).P8) {
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
