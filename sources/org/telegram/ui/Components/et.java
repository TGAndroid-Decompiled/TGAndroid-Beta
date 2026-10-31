package org.telegram.ui.Components;
public final class et extends e6 {
    public final int f25856d0;
    public final mt f25857e0;

    public et(mt mtVar, int i10) {
        super(false, false, false);
        this.f25856d0 = i10;
        this.f25857e0 = mtVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f25856d0) {
            case 0:
                this.f25857e0.invalidate();
                return;
            default:
                this.f25857e0.invalidate();
                return;
        }
    }
}
