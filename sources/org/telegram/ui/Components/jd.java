package org.telegram.ui.Components;
public final class jd implements Runnable {
    public final int f27508a;
    public final kd f27509b;
    public final boolean f27510c;

    public jd(kd kdVar, boolean z10, int i10) {
        this.f27508a = i10;
        this.f27509b = kdVar;
        this.f27510c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27508a) {
            case 0:
                boolean z10 = this.f27510c;
                kd kdVar = this.f27509b;
                if (!z10) {
                    kdVar.Z0.setVisibility(8);
                    return;
                } else {
                    kdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f27510c;
                kd kdVar2 = this.f27509b;
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
