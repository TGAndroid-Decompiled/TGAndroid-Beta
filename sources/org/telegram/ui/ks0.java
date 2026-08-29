package org.telegram.ui;
public final class ks0 extends org.telegram.ui.Components.x61 {
    public final PhotoViewer f40004i0;

    public ks0(PhotoViewer photoViewer) {
        this.f40004i0 = photoViewer;
    }

    @Override
    public final void C() {
        super.C();
        PhotoViewer photoViewer = this.f40004i0;
        if (photoViewer.f35795q4 == 0) {
            PhotoViewer.Y(photoViewer, false);
        }
        if (!photoViewer.J8) {
            d1.f.D(o());
            d1.f.x(false);
        }
    }

    @Override
    public final void D() {
        super.D();
        PhotoViewer photoViewer = this.f40004i0;
        PhotoViewer.Y(photoViewer, true);
        if (!photoViewer.J8) {
            d1.f.D(o());
            d1.f.x(true);
        }
    }

    @Override
    public final void L(long j10) {
        M(j10, false);
        PhotoViewer photoViewer = this.f40004i0;
        if (photoViewer.f35765n1) {
            PhotoViewer.Z(photoViewer, j10);
        }
        if (!photoViewer.J8) {
            d1.f.D(j10);
        }
    }

    @Override
    public final void R(float f9) {
        super.R(f9);
        if (!this.f40004i0.J8) {
            d1.f.z(f9);
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        j3.x1 playbackParameters;
        super.onRenderedFirstFrame();
        PhotoViewer photoViewer = this.f40004i0;
        boolean z10 = true;
        photoViewer.N = true;
        if (photoViewer.f35875z2) {
            photoViewer.f35647a0.invalidate();
        }
        photoViewer.z3();
        if (!d1.f.u() && !photoViewer.f35799r) {
            z10 = false;
        }
        P(z10);
        if (!photoViewer.J8) {
            d1.f.D(o());
            j3.k0 k0Var = this.d;
            float f9 = 1.0f;
            if (k0Var != null && (playbackParameters = k0Var.getPlaybackParameters()) != null) {
                f9 = playbackParameters.f10848a;
            }
            d1.f.z(f9);
        }
    }
}
