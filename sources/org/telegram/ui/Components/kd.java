package org.telegram.ui.Components;
public final class kd implements Runnable {
    public final int f27804a;
    public final ld f27805b;
    public final boolean f27806c;

    public kd(ld ldVar, boolean z10, int i10) {
        this.f27804a = i10;
        this.f27805b = ldVar;
        this.f27806c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27804a) {
            case 0:
                boolean z10 = this.f27806c;
                ld ldVar = this.f27805b;
                if (!z10) {
                    ldVar.Z0.setVisibility(8);
                    return;
                } else {
                    ldVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f27806c;
                ld ldVar2 = this.f27805b;
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
