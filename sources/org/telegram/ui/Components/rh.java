package org.telegram.ui.Components;
public final class rh implements Runnable {
    public final int f28010a;
    public final xi f28011b;
    public final boolean f28012c;

    public rh(xi xiVar, boolean z10, int i10) {
        this.f28010a = i10;
        this.f28011b = xiVar;
        this.f28012c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28010a) {
            case 0:
                boolean z10 = this.f28012c;
                xi xiVar = this.f28011b;
                if (!z10) {
                    xiVar.f30261c1.setVisibility(8);
                    return;
                } else {
                    xiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f28012c;
                xi xiVar2 = this.f28011b;
                if (!z11) {
                    xiVar2.f30322w.setVisibility(8);
                    return;
                } else {
                    xiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f28012c;
                xi xiVar3 = this.f28011b;
                if (!z12) {
                    xiVar3.f30330y.setVisibility(8);
                    return;
                } else {
                    xiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f28012c;
                xi xiVar4 = this.f28011b;
                if (z13) {
                    xiVar4.f30328x1.setVisibility(4);
                    return;
                } else {
                    xiVar4.getClass();
                    return;
                }
        }
    }
}
