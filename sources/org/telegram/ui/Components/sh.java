package org.telegram.ui.Components;
public final class sh implements Runnable {
    public final int f30749a;
    public final yi f30750b;
    public final boolean f30751c;

    public sh(yi yiVar, boolean z10, int i10) {
        this.f30749a = i10;
        this.f30750b = yiVar;
        this.f30751c = z10;
    }

    @Override
    public final void run() {
        switch (this.f30749a) {
            case 0:
                boolean z10 = this.f30751c;
                yi yiVar = this.f30750b;
                if (!z10) {
                    yiVar.f33217f1.setVisibility(8);
                    return;
                } else {
                    yiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f30751c;
                yi yiVar2 = this.f30750b;
                if (!z11) {
                    yiVar2.f33268w.setVisibility(8);
                    return;
                } else {
                    yiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f30751c;
                yi yiVar3 = this.f30750b;
                if (!z12) {
                    yiVar3.f33276y.setVisibility(8);
                    return;
                } else {
                    yiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f30751c;
                yi yiVar4 = this.f30750b;
                if (z13) {
                    yiVar4.A1.setVisibility(4);
                    return;
                } else {
                    yiVar4.getClass();
                    return;
                }
        }
    }
}
