package org.telegram.ui;
public final class o41 extends org.telegram.ui.Components.j71 {
    public final SecretMediaViewer f39528j0;

    public o41(SecretMediaViewer secretMediaViewer) {
        this.f39528j0 = secretMediaViewer;
    }

    @Override
    public final void B() {
        super.B();
        this.f39528j0.T.a(false, true);
    }

    @Override
    public final void C() {
        super.C();
        this.f39528j0.T.a(true, true);
    }

    @Override
    public final void P(boolean z4) {
        super.P(z4);
        this.f39528j0.T.a(z4, true);
    }
}
