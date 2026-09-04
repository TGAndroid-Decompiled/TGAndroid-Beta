package org.telegram.ui.Components;
public final class qh implements Runnable {
    public final int f29728a;
    public final vi f29729b;
    public final boolean f29730c;

    public qh(vi viVar, boolean z10, int i10) {
        this.f29728a = i10;
        this.f29729b = viVar;
        this.f29730c = z10;
    }

    @Override
    public final void run() {
        switch (this.f29728a) {
            case 0:
                boolean z10 = this.f29730c;
                vi viVar = this.f29729b;
                if (!z10) {
                    viVar.f31269c1.setVisibility(8);
                    return;
                } else {
                    viVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f29730c;
                vi viVar2 = this.f29729b;
                if (!z11) {
                    viVar2.f31331w.setVisibility(8);
                    return;
                } else {
                    viVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f29730c;
                vi viVar3 = this.f29729b;
                if (!z12) {
                    viVar3.f31339y.setVisibility(8);
                    return;
                } else {
                    viVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f29730c;
                vi viVar4 = this.f29729b;
                if (z13) {
                    viVar4.f31337x1.setVisibility(4);
                    return;
                } else {
                    viVar4.getClass();
                    return;
                }
        }
    }
}
