package org.telegram.ui.Components;
public final class jd implements Runnable {
    public final int f25340a;
    public final ld f25341b;
    public final boolean f25342c;

    public jd(ld ldVar, boolean z10, int i10) {
        this.f25340a = i10;
        this.f25341b = ldVar;
        this.f25342c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25340a) {
            case 0:
                boolean z10 = this.f25342c;
                ld ldVar = this.f25341b;
                if (!z10) {
                    ldVar.Z0.setVisibility(8);
                    return;
                } else {
                    ldVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f25342c;
                ld ldVar2 = this.f25341b;
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
