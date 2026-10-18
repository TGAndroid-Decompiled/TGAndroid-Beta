package org.telegram.ui.Components;
public final class jd implements Runnable {
    public final int f27505a;
    public final kd f27506b;
    public final boolean f27507c;

    public jd(kd kdVar, boolean z10, int i10) {
        this.f27505a = i10;
        this.f27506b = kdVar;
        this.f27507c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27505a) {
            case 0:
                boolean z10 = this.f27507c;
                kd kdVar = this.f27506b;
                if (!z10) {
                    kdVar.Z0.setVisibility(8);
                    return;
                } else {
                    kdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f27507c;
                kd kdVar2 = this.f27506b;
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
