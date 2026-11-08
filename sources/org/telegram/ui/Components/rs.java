package org.telegram.ui.Components;
public final class rs extends i6 {
    public final int f37752d0;
    public final zs f37753e0;

    public rs(zs zsVar, int i7) {
        super(false, false, false);
        this.f37752d0 = i7;
        this.f37753e0 = zsVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f37752d0) {
            case 0:
                this.f37753e0.invalidate();
                return;
            default:
                this.f37753e0.invalidate();
                return;
        }
    }
}
