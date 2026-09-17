package org.telegram.ui.Components;
public final class ph implements Runnable {
    public final int f27026a;
    public final vi f27027b;
    public final boolean f27028c;

    public ph(vi viVar, boolean z10, int i10) {
        this.f27026a = i10;
        this.f27027b = viVar;
        this.f27028c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27026a) {
            case 0:
                boolean z10 = this.f27028c;
                vi viVar = this.f27027b;
                if (!z10) {
                    viVar.f28733c1.setVisibility(8);
                    return;
                } else {
                    viVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f27028c;
                vi viVar2 = this.f27027b;
                if (!z11) {
                    viVar2.f28794w.setVisibility(8);
                    return;
                } else {
                    viVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f27028c;
                vi viVar3 = this.f27027b;
                if (!z12) {
                    viVar3.f28802y.setVisibility(8);
                    return;
                } else {
                    viVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f27028c;
                vi viVar4 = this.f27027b;
                if (z13) {
                    viVar4.f28800x1.setVisibility(4);
                    return;
                } else {
                    viVar4.getClass();
                    return;
                }
        }
    }
}
