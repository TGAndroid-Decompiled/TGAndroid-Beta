package org.telegram.ui.Components;
public final class rs extends g6 {
    public final int f37793d0;
    public final xs f37794e0;

    public rs(xs xsVar, int i3) {
        super(false, false, false);
        this.f37793d0 = i3;
        this.f37794e0 = xsVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f37793d0) {
            case 0:
                this.f37794e0.invalidate();
                return;
            default:
                this.f37794e0.invalidate();
                return;
        }
    }
}
