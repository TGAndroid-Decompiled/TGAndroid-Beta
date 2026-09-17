package org.telegram.ui.Components;
public final class kd implements Runnable {
    public final int f27832a;
    public final ld f27833b;
    public final boolean f27834c;

    public kd(ld ldVar, boolean z10, int i10) {
        this.f27832a = i10;
        this.f27833b = ldVar;
        this.f27834c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27832a) {
            case 0:
                boolean z10 = this.f27834c;
                ld ldVar = this.f27833b;
                if (!z10) {
                    ldVar.Z0.setVisibility(8);
                    return;
                } else {
                    ldVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f27834c;
                ld ldVar2 = this.f27833b;
                if (!z11) {
                    ldVar2.V0.setVisibility(8);
                    return;
                } else {
                    ldVar2.getClass();
                    return;
                }
        }
    }
}
