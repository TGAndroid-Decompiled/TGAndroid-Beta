package org.telegram.ui.Components;
public final class jd implements Runnable {
    public final int f25355a;
    public final ld f25356b;
    public final boolean f25357c;

    public jd(ld ldVar, boolean z10, int i10) {
        this.f25355a = i10;
        this.f25356b = ldVar;
        this.f25357c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25355a) {
            case 0:
                boolean z10 = this.f25357c;
                ld ldVar = this.f25356b;
                if (!z10) {
                    ldVar.Z0.setVisibility(8);
                    return;
                } else {
                    ldVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f25357c;
                ld ldVar2 = this.f25356b;
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
