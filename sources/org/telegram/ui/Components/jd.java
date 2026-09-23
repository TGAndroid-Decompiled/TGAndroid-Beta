package org.telegram.ui.Components;
public final class jd implements Runnable {
    public final int f25256a;
    public final ld f25257b;
    public final boolean f25258c;

    public jd(ld ldVar, boolean z10, int i10) {
        this.f25256a = i10;
        this.f25257b = ldVar;
        this.f25258c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25256a) {
            case 0:
                boolean z10 = this.f25258c;
                ld ldVar = this.f25257b;
                if (!z10) {
                    ldVar.Z0.setVisibility(8);
                    return;
                } else {
                    ldVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f25258c;
                ld ldVar2 = this.f25257b;
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
