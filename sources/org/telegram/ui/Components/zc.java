package org.telegram.ui.Components;
public final class zc implements Runnable {
    public final int f35276a;
    public final ad f35277b;
    public final boolean f35278c;

    public zc(ad adVar, boolean z10, int i9) {
        this.f35276a = i9;
        this.f35277b = adVar;
        this.f35278c = z10;
    }

    @Override
    public final void run() {
        switch (this.f35276a) {
            case 0:
                boolean z10 = this.f35278c;
                ad adVar = this.f35277b;
                if (!z10) {
                    adVar.V0.setVisibility(8);
                    return;
                } else {
                    adVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f35278c;
                ad adVar2 = this.f35277b;
                if (!z11) {
                    adVar2.R0.setVisibility(8);
                    return;
                } else {
                    adVar2.getClass();
                    return;
                }
        }
    }
}
