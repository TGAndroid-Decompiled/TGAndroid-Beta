package org.telegram.ui.Components;
public final class rs extends i6 {
    public final int f37791d0;
    public final zs f37792e0;

    public rs(zs zsVar, int i7) {
        super(false, false, false);
        this.f37791d0 = i7;
        this.f37792e0 = zsVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f37791d0) {
            case 0:
                this.f37792e0.invalidate();
                return;
            default:
                this.f37792e0.invalidate();
                return;
        }
    }
}
