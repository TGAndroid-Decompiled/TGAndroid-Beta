package org.telegram.ui.Components;
public final class jd implements Runnable {
    public final int f27512a;
    public final kd f27513b;
    public final boolean f27514c;

    public jd(kd kdVar, boolean z10, int i10) {
        this.f27512a = i10;
        this.f27513b = kdVar;
        this.f27514c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27512a) {
            case 0:
                boolean z10 = this.f27514c;
                kd kdVar = this.f27513b;
                if (!z10) {
                    kdVar.Z0.setVisibility(8);
                    return;
                } else {
                    kdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f27514c;
                kd kdVar2 = this.f27513b;
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
