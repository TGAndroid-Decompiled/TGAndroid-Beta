package org.telegram.ui.Components;
public final class kd implements Runnable {
    public final int f27805a;
    public final ld f27806b;
    public final boolean f27807c;

    public kd(ld ldVar, boolean z10, int i10) {
        this.f27805a = i10;
        this.f27806b = ldVar;
        this.f27807c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27805a) {
            case 0:
                boolean z10 = this.f27807c;
                ld ldVar = this.f27806b;
                if (!z10) {
                    ldVar.Z0.setVisibility(8);
                    return;
                } else {
                    ldVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f27807c;
                ld ldVar2 = this.f27806b;
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
