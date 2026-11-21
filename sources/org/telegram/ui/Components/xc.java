package org.telegram.ui.Components;
public final class xc implements Runnable {
    public final int f42043a;
    public final yc f42044b;
    public final boolean f42045c;

    public xc(yc ycVar, boolean z10, int i7) {
        this.f42043a = i7;
        this.f42044b = ycVar;
        this.f42045c = z10;
    }

    @Override
    public final void run() {
        switch (this.f42043a) {
            case 0:
                boolean z10 = this.f42045c;
                yc ycVar = this.f42044b;
                if (!z10) {
                    ycVar.Z0.setVisibility(8);
                    return;
                } else {
                    ycVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f42045c;
                yc ycVar2 = this.f42044b;
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
