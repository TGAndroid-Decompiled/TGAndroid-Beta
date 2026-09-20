package org.telegram.ui.Components;
public final class ph implements Runnable {
    public final int f27301a;
    public final vi f27302b;
    public final boolean f27303c;

    public ph(vi viVar, boolean z10, int i10) {
        this.f27301a = i10;
        this.f27302b = viVar;
        this.f27303c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27301a) {
            case 0:
                boolean z10 = this.f27303c;
                vi viVar = this.f27302b;
                if (!z10) {
                    viVar.f29089c1.setVisibility(8);
                    return;
                } else {
                    viVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f27303c;
                vi viVar2 = this.f27302b;
                if (!z11) {
                    viVar2.f29150w.setVisibility(8);
                    return;
                } else {
                    viVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f27303c;
                vi viVar3 = this.f27302b;
                if (!z12) {
                    viVar3.f29158y.setVisibility(8);
                    return;
                } else {
                    viVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f27303c;
                vi viVar4 = this.f27302b;
                if (z13) {
                    viVar4.f29156x1.setVisibility(4);
                    return;
                } else {
                    viVar4.getClass();
                    return;
                }
        }
    }
}
