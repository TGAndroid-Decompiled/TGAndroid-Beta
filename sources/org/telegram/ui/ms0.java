package org.telegram.ui;

public final class ms0 extends org.telegram.ui.Components.m61 {

    public final PhotoViewer f40591i0;

    public ms0(PhotoViewer photoViewer) {
        this.f40591i0 = photoViewer;
    }

    @Override
    public final void C() {
        super.C();
        PhotoViewer photoViewer = this.f40591i0;
        if (photoViewer.f35731q4 == 0) {
            PhotoViewer.Y(photoViewer, false);
        }
        if (photoViewer.J8) {
            return;
        }
        d1.f.C(o());
        d1.f.w(false);
    }

    @Override
    public final void D() {
        super.D();
        PhotoViewer photoViewer = this.f40591i0;
        PhotoViewer.Y(photoViewer, true);
        if (photoViewer.J8) {
            return;
        }
        d1.f.C(o());
        d1.f.w(true);
    }

    @Override
    public final void L(long j10) {
        M(j10, false);
        PhotoViewer photoViewer = this.f40591i0;
        if (photoViewer.f35702n1) {
            PhotoViewer.Z(photoViewer, j10);
        }
        if (photoViewer.J8) {
            return;
        }
        d1.f.C(j10);
    }

    @Override
    public final void R(float f10) {
        super.R(f10);
        if (this.f40591i0.J8) {
            return;
        }
        d1.f.y(f10);
    }

    @Override
    public final void onRenderedFirstFrame() {
        h3.x1 playbackParameters;
        super.onRenderedFirstFrame();
        PhotoViewer photoViewer = this.f40591i0;
        boolean z10 = true;
        photoViewer.N = true;
        if (photoViewer.f35812z2) {
            photoViewer.f35583a0.invalidate();
        }
        photoViewer.z3();
        if (!d1.f.t() && !photoViewer.f35735r) {
            z10 = false;
        }
        P(z10);
        if (photoViewer.J8) {
            return;
        }
        d1.f.C(o());
        h3.k0 k0Var = this.d;
        float f10 = 1.0f;
        if (k0Var != null && (playbackParameters = k0Var.getPlaybackParameters()) != null) {
            f10 = playbackParameters.f8242a;
        }
        d1.f.y(f10);
    }
}
