package org.telegram.ui.Components;
public final class rs extends i6 {
    public final int f37771d0;
    public final ys f37772e0;

    public rs(ys ysVar, int i7) {
        super(false, false, false);
        this.f37771d0 = i7;
        this.f37772e0 = ysVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f37771d0) {
            case 0:
                this.f37772e0.invalidate();
                return;
            default:
                this.f37772e0.invalidate();
                return;
        }
    }
}
