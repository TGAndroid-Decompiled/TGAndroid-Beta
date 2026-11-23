package org.telegram.ui.Components;
public final class xc implements Runnable {
    public final int f41978a;
    public final yc f41979b;
    public final boolean f41980c;

    public xc(yc ycVar, boolean z10, int i7) {
        this.f41978a = i7;
        this.f41979b = ycVar;
        this.f41980c = z10;
    }

    @Override
    public final void run() {
        switch (this.f41978a) {
            case 0:
                boolean z10 = this.f41980c;
                yc ycVar = this.f41979b;
                if (!z10) {
                    ycVar.Z0.setVisibility(8);
                    return;
                } else {
                    ycVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f41980c;
                yc ycVar2 = this.f41979b;
                if (!z11) {
                    ycVar2.V0.setVisibility(8);
                    return;
                } else {
                    ycVar2.getClass();
                    return;
                }
        }
    }
}
