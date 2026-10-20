package org.telegram.ui.Components;
public final class jd implements Runnable {
    public final int f27502a;
    public final kd f27503b;
    public final boolean f27504c;

    public jd(kd kdVar, boolean z10, int i10) {
        this.f27502a = i10;
        this.f27503b = kdVar;
        this.f27504c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27502a) {
            case 0:
                boolean z10 = this.f27504c;
                kd kdVar = this.f27503b;
                if (!z10) {
                    kdVar.Z0.setVisibility(8);
                    return;
                } else {
                    kdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f27504c;
                kd kdVar2 = this.f27503b;
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
