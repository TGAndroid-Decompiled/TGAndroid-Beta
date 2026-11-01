package org.telegram.ui.Components;
public final class mc implements Runnable {
    public final int f28449a;
    public final nc f28450b;
    public final boolean f28451c;

    public mc(nc ncVar, boolean z10, int i10) {
        this.f28449a = i10;
        this.f28450b = ncVar;
        this.f28451c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28449a) {
            case 0:
                boolean z10 = this.f28451c;
                nc ncVar = this.f28450b;
                if (!z10) {
                    ncVar.Y0.setVisibility(8);
                    return;
                } else {
                    ncVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f28451c;
                nc ncVar2 = this.f28450b;
                if (!z11) {
                    ncVar2.U0.setVisibility(8);
                    return;
                } else {
                    ncVar2.getClass();
                    return;
                }
        }
    }
}
