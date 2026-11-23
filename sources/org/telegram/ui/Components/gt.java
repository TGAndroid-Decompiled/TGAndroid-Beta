package org.telegram.ui.Components;
public final class gt extends n6 {
    public final int f35666e0;
    public final ot f35667f0;

    public gt(ot otVar, int i7) {
        super(false, false, false);
        this.f35666e0 = i7;
        this.f35667f0 = otVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f35666e0) {
            case 0:
                this.f35667f0.invalidate();
                return;
            default:
                this.f35667f0.invalidate();
                return;
        }
    }
}
