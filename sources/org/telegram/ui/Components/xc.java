package org.telegram.ui.Components;
public final class xc implements Runnable {
    public final int f41973a;
    public final yc f41974b;
    public final boolean f41975c;

    public xc(yc ycVar, boolean z10, int i7) {
        this.f41973a = i7;
        this.f41974b = ycVar;
        this.f41975c = z10;
    }

    @Override
    public final void run() {
        switch (this.f41973a) {
            case 0:
                boolean z10 = this.f41975c;
                yc ycVar = this.f41974b;
                if (!z10) {
                    ycVar.Z0.setVisibility(8);
                    return;
                } else {
                    ycVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f41975c;
                yc ycVar2 = this.f41974b;
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
