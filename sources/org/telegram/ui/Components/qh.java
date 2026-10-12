package org.telegram.ui.Components;
public final class qh implements Runnable {
    public final int f28601a;
    public final vi f28602b;
    public final boolean f28603c;

    public qh(vi viVar, boolean z10, int i10) {
        this.f28601a = i10;
        this.f28602b = viVar;
        this.f28603c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28601a) {
            case 0:
                boolean z10 = this.f28603c;
                vi viVar = this.f28602b;
                if (!z10) {
                    viVar.f30002f1.setVisibility(8);
                    return;
                } else {
                    viVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f28603c;
                vi viVar2 = this.f28602b;
                if (!z11) {
                    viVar2.f30053w.setVisibility(8);
                    return;
                } else {
                    viVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f28603c;
                vi viVar3 = this.f28602b;
                if (!z12) {
                    viVar3.f30061y.setVisibility(8);
                    return;
                } else {
                    viVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f28603c;
                vi viVar4 = this.f28602b;
                if (z13) {
                    viVar4.A1.setVisibility(4);
                    return;
                } else {
                    viVar4.getClass();
                    return;
                }
        }
    }
}
