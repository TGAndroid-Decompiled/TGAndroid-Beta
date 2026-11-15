package org.telegram.ui.Components;
public final class ys extends g6 {
    public final int f42071e0;
    public final ft f42072f0;

    public ys(ft ftVar, int i7) {
        super(false, false, false);
        this.f42071e0 = i7;
        this.f42072f0 = ftVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f42071e0) {
            case 0:
                this.f42072f0.invalidate();
                return;
            default:
                this.f42072f0.invalidate();
                return;
        }
    }
}
