package org.telegram.ui.Components;
public final class qh implements Runnable {
    public final int f27349a;
    public final wi f27350b;
    public final boolean f27351c;

    public qh(wi wiVar, boolean z10, int i10) {
        this.f27349a = i10;
        this.f27350b = wiVar;
        this.f27351c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27349a) {
            case 0:
                boolean z10 = this.f27351c;
                wi wiVar = this.f27350b;
                if (!z10) {
                    wiVar.f29656c1.setVisibility(8);
                    return;
                } else {
                    wiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f27351c;
                wi wiVar2 = this.f27350b;
                if (!z11) {
                    wiVar2.f29717w.setVisibility(8);
                    return;
                } else {
                    wiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f27351c;
                wi wiVar3 = this.f27350b;
                if (!z12) {
                    wiVar3.f29725y.setVisibility(8);
                    return;
                } else {
                    wiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f27351c;
                wi wiVar4 = this.f27350b;
                if (z13) {
                    wiVar4.f29723x1.setVisibility(4);
                    return;
                } else {
                    wiVar4.getClass();
                    return;
                }
        }
    }
}
