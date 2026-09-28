package org.telegram.ui.Components;
public final class qh implements Runnable {
    public final int f27714a;
    public final wi f27715b;
    public final boolean f27716c;

    public qh(wi wiVar, boolean z10, int i10) {
        this.f27714a = i10;
        this.f27715b = wiVar;
        this.f27716c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27714a) {
            case 0:
                boolean z10 = this.f27716c;
                wi wiVar = this.f27715b;
                if (!z10) {
                    wiVar.f29934c1.setVisibility(8);
                    return;
                } else {
                    wiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f27716c;
                wi wiVar2 = this.f27715b;
                if (!z11) {
                    wiVar2.f29995w.setVisibility(8);
                    return;
                } else {
                    wiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f27716c;
                wi wiVar3 = this.f27715b;
                if (!z12) {
                    wiVar3.f30003y.setVisibility(8);
                    return;
                } else {
                    wiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f27716c;
                wi wiVar4 = this.f27715b;
                if (z13) {
                    wiVar4.f30001x1.setVisibility(4);
                    return;
                } else {
                    wiVar4.getClass();
                    return;
                }
        }
    }
}
