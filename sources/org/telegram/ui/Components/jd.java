package org.telegram.ui.Components;
public final class jd implements Runnable {
    public final int f25453a;
    public final ld f25454b;
    public final boolean f25455c;

    public jd(ld ldVar, boolean z10, int i10) {
        this.f25453a = i10;
        this.f25454b = ldVar;
        this.f25455c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25453a) {
            case 0:
                boolean z10 = this.f25455c;
                ld ldVar = this.f25454b;
                if (!z10) {
                    ldVar.Z0.setVisibility(8);
                    return;
                } else {
                    ldVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f25455c;
                ld ldVar2 = this.f25454b;
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
