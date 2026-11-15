package org.telegram.ui.Components;
public final class ys extends g6 {
    public final int f42069e0;
    public final ft f42070f0;

    public ys(ft ftVar, int i7) {
        super(false, false, false);
        this.f42069e0 = i7;
        this.f42070f0 = ftVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f42069e0) {
            case 0:
                this.f42070f0.invalidate();
                return;
            default:
                this.f42070f0.invalidate();
                return;
        }
    }
}
