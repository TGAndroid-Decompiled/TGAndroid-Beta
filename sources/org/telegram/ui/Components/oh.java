package org.telegram.ui.Components;
public final class oh implements Runnable {
    public final int f27090a;
    public final wi f27091b;
    public final boolean f27092c;

    public oh(wi wiVar, boolean z10, int i10) {
        this.f27090a = i10;
        this.f27091b = wiVar;
        this.f27092c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27090a) {
            case 0:
                boolean z10 = this.f27092c;
                wi wiVar = this.f27091b;
                if (!z10) {
                    wiVar.f29953c1.setVisibility(8);
                    return;
                } else {
                    wiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f27092c;
                wi wiVar2 = this.f27091b;
                if (!z11) {
                    wiVar2.f30014w.setVisibility(8);
                    return;
                } else {
                    wiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f27092c;
                wi wiVar3 = this.f27091b;
                if (!z12) {
                    wiVar3.f30022y.setVisibility(8);
                    return;
                } else {
                    wiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f27092c;
                wi wiVar4 = this.f27091b;
                if (z13) {
                    wiVar4.f30020x1.setVisibility(4);
                    return;
                } else {
                    wiVar4.getClass();
                    return;
                }
        }
    }
}
