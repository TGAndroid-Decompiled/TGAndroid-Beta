package org.telegram.ui.Components;
public final class nh implements Runnable {
    public final int f30972a;
    public final ti f30973b;
    public final boolean f30974c;

    public nh(ti tiVar, boolean z10, int i10) {
        this.f30972a = i10;
        this.f30973b = tiVar;
        this.f30974c = z10;
    }

    @Override
    public final void run() {
        switch (this.f30972a) {
            case 0:
                boolean z10 = this.f30974c;
                ti tiVar = this.f30973b;
                if (!z10) {
                    tiVar.f33022f1.setVisibility(8);
                    return;
                } else {
                    tiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f30974c;
                ti tiVar2 = this.f30973b;
                if (!z11) {
                    tiVar2.f33073w.setVisibility(8);
                    return;
                } else {
                    tiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f30974c;
                ti tiVar3 = this.f30973b;
                if (!z12) {
                    tiVar3.f33081y.setVisibility(8);
                    return;
                } else {
                    tiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f30974c;
                ti tiVar4 = this.f30973b;
                if (z13) {
                    tiVar4.A1.setVisibility(4);
                    return;
                } else {
                    tiVar4.getClass();
                    return;
                }
        }
    }
}
