package org.telegram.ui.Components;
public final class et extends e6 {
    public final int f25923d0;
    public final mt f25924e0;

    public et(mt mtVar, int i10) {
        super(false, false, false);
        this.f25923d0 = i10;
        this.f25924e0 = mtVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f25923d0) {
            case 0:
                this.f25924e0.invalidate();
                return;
            default:
                this.f25924e0.invalidate();
                return;
        }
    }
}
