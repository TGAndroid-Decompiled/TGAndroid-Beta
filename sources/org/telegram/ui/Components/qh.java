package org.telegram.ui.Components;
public final class qh implements Runnable {
    public final int f27619a;
    public final wi f27620b;
    public final boolean f27621c;

    public qh(wi wiVar, boolean z10, int i10) {
        this.f27619a = i10;
        this.f27620b = wiVar;
        this.f27621c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27619a) {
            case 0:
                boolean z10 = this.f27621c;
                wi wiVar = this.f27620b;
                if (!z10) {
                    wiVar.f29997c1.setVisibility(8);
                    return;
                } else {
                    wiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f27621c;
                wi wiVar2 = this.f27620b;
                if (!z11) {
                    wiVar2.f30058w.setVisibility(8);
                    return;
                } else {
                    wiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f27621c;
                wi wiVar3 = this.f27620b;
                if (!z12) {
                    wiVar3.f30066y.setVisibility(8);
                    return;
                } else {
                    wiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f27621c;
                wi wiVar4 = this.f27620b;
                if (z13) {
                    wiVar4.f30064x1.setVisibility(4);
                    return;
                } else {
                    wiVar4.getClass();
                    return;
                }
        }
    }
}
