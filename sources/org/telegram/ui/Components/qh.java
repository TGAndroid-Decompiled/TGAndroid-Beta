package org.telegram.ui.Components;
public final class qh implements Runnable {
    public final int f27618a;
    public final wi f27619b;
    public final boolean f27620c;

    public qh(wi wiVar, boolean z10, int i10) {
        this.f27618a = i10;
        this.f27619b = wiVar;
        this.f27620c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27618a) {
            case 0:
                boolean z10 = this.f27620c;
                wi wiVar = this.f27619b;
                if (!z10) {
                    wiVar.f29996c1.setVisibility(8);
                    return;
                } else {
                    wiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f27620c;
                wi wiVar2 = this.f27619b;
                if (!z11) {
                    wiVar2.f30057w.setVisibility(8);
                    return;
                } else {
                    wiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f27620c;
                wi wiVar3 = this.f27619b;
                if (!z12) {
                    wiVar3.f30065y.setVisibility(8);
                    return;
                } else {
                    wiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f27620c;
                wi wiVar4 = this.f27619b;
                if (z13) {
                    wiVar4.f30063x1.setVisibility(4);
                    return;
                } else {
                    wiVar4.getClass();
                    return;
                }
        }
    }
}
