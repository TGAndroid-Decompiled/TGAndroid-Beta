package org.telegram.ui.Components;
public final class ld implements Runnable {
    public final int f28162a;
    public final od f28163b;
    public final boolean f28164c;

    public ld(od odVar, boolean z10, int i10) {
        this.f28162a = i10;
        this.f28163b = odVar;
        this.f28164c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28162a) {
            case 0:
                boolean z10 = this.f28164c;
                od odVar = this.f28163b;
                if (!z10) {
                    odVar.Z0.setVisibility(8);
                    return;
                } else {
                    odVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f28164c;
                od odVar2 = this.f28163b;
                if (!z11) {
                    odVar2.V0.setVisibility(8);
                    return;
                } else {
                    odVar2.getClass();
                    return;
                }
        }
    }
}
