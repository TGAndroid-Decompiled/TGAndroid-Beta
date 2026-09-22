package org.telegram.ui.Components;
public final class ph implements Runnable {
    public final int f27041a;
    public final vi f27042b;
    public final boolean f27043c;

    public ph(vi viVar, boolean z10, int i10) {
        this.f27041a = i10;
        this.f27042b = viVar;
        this.f27043c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27041a) {
            case 0:
                boolean z10 = this.f27043c;
                vi viVar = this.f27042b;
                if (!z10) {
                    viVar.f28738c1.setVisibility(8);
                    return;
                } else {
                    viVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f27043c;
                vi viVar2 = this.f27042b;
                if (!z11) {
                    viVar2.f28799w.setVisibility(8);
                    return;
                } else {
                    viVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f27043c;
                vi viVar3 = this.f27042b;
                if (!z12) {
                    viVar3.f28807y.setVisibility(8);
                    return;
                } else {
                    viVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f27043c;
                vi viVar4 = this.f27042b;
                if (z13) {
                    viVar4.f28805x1.setVisibility(4);
                    return;
                } else {
                    viVar4.getClass();
                    return;
                }
        }
    }
}
