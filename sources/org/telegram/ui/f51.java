package org.telegram.ui;
public final class f51 extends org.telegram.ui.Components.t71 {
    public final SecretMediaViewer m0;

    public f51(SecretMediaViewer secretMediaViewer) {
        this.m0 = secretMediaViewer;
    }

    @Override
    public final void B() {
        super.B();
        this.m0.W.a(false, true);
    }

    @Override
    public final void C() {
        super.C();
        this.m0.W.a(true, true);
    }

    @Override
    public final void P(boolean z10) {
        super.P(z10);
        this.m0.W.a(z10, true);
    }
}
