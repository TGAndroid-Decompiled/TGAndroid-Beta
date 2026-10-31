package org.telegram.ui.Components;
public final class mc implements Runnable {
    public final int f28412a;
    public final nc f28413b;
    public final boolean f28414c;

    public mc(nc ncVar, boolean z10, int i10) {
        this.f28412a = i10;
        this.f28413b = ncVar;
        this.f28414c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28412a) {
            case 0:
                boolean z10 = this.f28414c;
                nc ncVar = this.f28413b;
                if (!z10) {
                    ncVar.Y0.setVisibility(8);
                    return;
                } else {
                    ncVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f28414c;
                nc ncVar2 = this.f28413b;
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
