package org.telegram.ui.Components;
public final class nh implements Runnable {
    public final int f28907a;
    public final ri f28908b;
    public final boolean f28909c;

    public nh(ri riVar, boolean z10, int i10) {
        this.f28907a = i10;
        this.f28908b = riVar;
        this.f28909c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28907a) {
            case 0:
                boolean z10 = this.f28909c;
                ri riVar = this.f28908b;
                if (!z10) {
                    riVar.f30147f1.setVisibility(8);
                    return;
                } else {
                    riVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f28909c;
                ri riVar2 = this.f28908b;
                if (!z11) {
                    riVar2.f30198w.setVisibility(8);
                    return;
                } else {
                    riVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f28909c;
                ri riVar3 = this.f28908b;
                if (!z12) {
                    riVar3.f30206y.setVisibility(8);
                    return;
                } else {
                    riVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f28909c;
                ri riVar4 = this.f28908b;
                if (z13) {
                    riVar4.A1.setVisibility(4);
                    return;
                } else {
                    riVar4.getClass();
                    return;
                }
        }
    }
}
