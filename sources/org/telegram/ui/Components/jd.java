package org.telegram.ui.Components;
public final class jd implements Runnable {
    public final int f27506a;
    public final kd f27507b;
    public final boolean f27508c;

    public jd(kd kdVar, boolean z10, int i10) {
        this.f27506a = i10;
        this.f27507b = kdVar;
        this.f27508c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27506a) {
            case 0:
                boolean z10 = this.f27508c;
                kd kdVar = this.f27507b;
                if (!z10) {
                    kdVar.Z0.setVisibility(8);
                    return;
                } else {
                    kdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f27508c;
                kd kdVar2 = this.f27507b;
                if (!z11) {
                    kdVar2.V0.setVisibility(8);
                    return;
                } else {
                    kdVar2.getClass();
                    return;
                }
        }
    }
}
