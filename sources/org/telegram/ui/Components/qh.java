package org.telegram.ui.Components;
public final class qh implements Runnable {
    public final int f29755a;
    public final vi f29756b;
    public final boolean f29757c;

    public qh(vi viVar, boolean z10, int i10) {
        this.f29755a = i10;
        this.f29756b = viVar;
        this.f29757c = z10;
    }

    @Override
    public final void run() {
        switch (this.f29755a) {
            case 0:
                boolean z10 = this.f29757c;
                vi viVar = this.f29756b;
                if (!z10) {
                    viVar.f31296c1.setVisibility(8);
                    return;
                } else {
                    viVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f29757c;
                vi viVar2 = this.f29756b;
                if (!z11) {
                    viVar2.f31358w.setVisibility(8);
                    return;
                } else {
                    viVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f29757c;
                vi viVar3 = this.f29756b;
                if (!z12) {
                    viVar3.f31366y.setVisibility(8);
                    return;
                } else {
                    viVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f29757c;
                vi viVar4 = this.f29756b;
                if (z13) {
                    viVar4.f31364x1.setVisibility(4);
                    return;
                } else {
                    viVar4.getClass();
                    return;
                }
        }
    }
}
