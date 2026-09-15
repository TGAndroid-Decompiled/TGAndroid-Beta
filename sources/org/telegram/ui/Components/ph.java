package org.telegram.ui.Components;
public final class ph implements Runnable {
    public final int f27044a;
    public final vi f27045b;
    public final boolean f27046c;

    public ph(vi viVar, boolean z10, int i10) {
        this.f27044a = i10;
        this.f27045b = viVar;
        this.f27046c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27044a) {
            case 0:
                boolean z10 = this.f27046c;
                vi viVar = this.f27045b;
                if (!z10) {
                    viVar.f28741c1.setVisibility(8);
                    return;
                } else {
                    viVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f27046c;
                vi viVar2 = this.f27045b;
                if (!z11) {
                    viVar2.f28802w.setVisibility(8);
                    return;
                } else {
                    viVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f27046c;
                vi viVar3 = this.f27045b;
                if (!z12) {
                    viVar3.f28810y.setVisibility(8);
                    return;
                } else {
                    viVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f27046c;
                vi viVar4 = this.f27045b;
                if (z13) {
                    viVar4.f28808x1.setVisibility(4);
                    return;
                } else {
                    viVar4.getClass();
                    return;
                }
        }
    }
}
