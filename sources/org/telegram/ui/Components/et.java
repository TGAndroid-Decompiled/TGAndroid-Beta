package org.telegram.ui.Components;
public final class et extends m6 {
    public final int f34848e0;
    public final mt f34849f0;

    public et(mt mtVar, int i7) {
        super(false, false, false);
        this.f34848e0 = i7;
        this.f34849f0 = mtVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f34848e0) {
            case 0:
                this.f34849f0.invalidate();
                return;
            default:
                this.f34849f0.invalidate();
                return;
        }
    }
}
