package org.telegram.ui.Components;
public final class rs extends i6 {
    public final int f37731d0;
    public final ys f37732e0;

    public rs(ys ysVar, int i7) {
        super(false, false, false);
        this.f37731d0 = i7;
        this.f37732e0 = ysVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f37731d0) {
            case 0:
                this.f37732e0.invalidate();
                return;
            default:
                this.f37732e0.invalidate();
                return;
        }
    }
}
