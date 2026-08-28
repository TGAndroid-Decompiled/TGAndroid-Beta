package org.telegram.ui.Components;
public final class fh implements Runnable {
    public final int f28427a;
    public final ki f28428b;
    public final boolean f28429c;

    public fh(ki kiVar, boolean z10, int i9) {
        this.f28427a = i9;
        this.f28428b = kiVar;
        this.f28429c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28427a) {
            case 0:
                boolean z10 = this.f28429c;
                ki kiVar = this.f28428b;
                if (!z10) {
                    kiVar.Y0.setVisibility(8);
                    return;
                } else {
                    kiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f28429c;
                ki kiVar2 = this.f28428b;
                if (!z11) {
                    kiVar2.f30166w.setVisibility(8);
                    return;
                } else {
                    kiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f28429c;
                ki kiVar3 = this.f28428b;
                if (!z12) {
                    kiVar3.f30174y.setVisibility(8);
                    return;
                } else {
                    kiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f28429c;
                ki kiVar4 = this.f28428b;
                if (z13) {
                    kiVar4.f30158t1.setVisibility(4);
                    return;
                } else {
                    kiVar4.getClass();
                    return;
                }
        }
    }
}
