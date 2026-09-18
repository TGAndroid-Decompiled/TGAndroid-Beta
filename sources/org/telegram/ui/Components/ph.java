package org.telegram.ui.Components;
public final class ph implements Runnable {
    public final int f27029a;
    public final vi f27030b;
    public final boolean f27031c;

    public ph(vi viVar, boolean z10, int i10) {
        this.f27029a = i10;
        this.f27030b = viVar;
        this.f27031c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27029a) {
            case 0:
                boolean z10 = this.f27031c;
                vi viVar = this.f27030b;
                if (!z10) {
                    viVar.f28736c1.setVisibility(8);
                    return;
                } else {
                    viVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f27031c;
                vi viVar2 = this.f27030b;
                if (!z11) {
                    viVar2.f28797w.setVisibility(8);
                    return;
                } else {
                    viVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f27031c;
                vi viVar3 = this.f27030b;
                if (!z12) {
                    viVar3.f28805y.setVisibility(8);
                    return;
                } else {
                    viVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f27031c;
                vi viVar4 = this.f27030b;
                if (z13) {
                    viVar4.f28803x1.setVisibility(4);
                    return;
                } else {
                    viVar4.getClass();
                    return;
                }
        }
    }
}
