package org.telegram.ui.Components;
public final class nh implements Runnable {
    public final int f30970a;
    public final ti f30971b;
    public final boolean f30972c;

    public nh(ti tiVar, boolean z10, int i10) {
        this.f30970a = i10;
        this.f30971b = tiVar;
        this.f30972c = z10;
    }

    @Override
    public final void run() {
        switch (this.f30970a) {
            case 0:
                boolean z10 = this.f30972c;
                ti tiVar = this.f30971b;
                if (!z10) {
                    tiVar.f33019f1.setVisibility(8);
                    return;
                } else {
                    tiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f30972c;
                ti tiVar2 = this.f30971b;
                if (!z11) {
                    tiVar2.f33070w.setVisibility(8);
                    return;
                } else {
                    tiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f30972c;
                ti tiVar3 = this.f30971b;
                if (!z12) {
                    tiVar3.f33078y.setVisibility(8);
                    return;
                } else {
                    tiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f30972c;
                ti tiVar4 = this.f30971b;
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
