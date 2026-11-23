package org.telegram.ui.Components;
public final class xc implements Runnable {
    public final int f41992a;
    public final yc f41993b;
    public final boolean f41994c;

    public xc(yc ycVar, boolean z10, int i7) {
        this.f41992a = i7;
        this.f41993b = ycVar;
        this.f41994c = z10;
    }

    @Override
    public final void run() {
        switch (this.f41992a) {
            case 0:
                boolean z10 = this.f41994c;
                yc ycVar = this.f41993b;
                if (!z10) {
                    ycVar.Z0.setVisibility(8);
                    return;
                } else {
                    ycVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f41994c;
                yc ycVar2 = this.f41993b;
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
