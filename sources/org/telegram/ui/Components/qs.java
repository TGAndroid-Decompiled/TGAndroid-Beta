package org.telegram.ui.Components;
public final class qs extends h6 {
    public final int f37381d0;
    public final ys f37382e0;

    public qs(ys ysVar, int i7) {
        super(false, false, false);
        this.f37381d0 = i7;
        this.f37382e0 = ysVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f37381d0) {
            case 0:
                this.f37382e0.invalidate();
                return;
            default:
                this.f37382e0.invalidate();
                return;
        }
    }
}
