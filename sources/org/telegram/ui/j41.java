package org.telegram.ui;
public final class j41 extends org.telegram.ui.Components.k71 {
    public final SecretMediaViewer f38017j0;

    public j41(SecretMediaViewer secretMediaViewer) {
        this.f38017j0 = secretMediaViewer;
    }

    @Override
    public final void B() {
        super.B();
        this.f38017j0.T.a(false, true);
    }

    @Override
    public final void C() {
        super.C();
        this.f38017j0.T.a(true, true);
    }

    @Override
    public final void P(boolean z4) {
        super.P(z4);
        this.f38017j0.T.a(z4, true);
    }
}
