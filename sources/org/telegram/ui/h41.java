package org.telegram.ui;
public final class h41 extends org.telegram.ui.Components.i71 {
    public final SecretMediaViewer f34754j0;

    public h41(SecretMediaViewer secretMediaViewer) {
        this.f34754j0 = secretMediaViewer;
    }

    @Override
    public final void B() {
        super.B();
        this.f34754j0.T.a(false, true);
    }

    @Override
    public final void C() {
        super.C();
        this.f34754j0.T.a(true, true);
    }

    @Override
    public final void P(boolean z4) {
        super.P(z4);
        this.f34754j0.T.a(z4, true);
    }
}
