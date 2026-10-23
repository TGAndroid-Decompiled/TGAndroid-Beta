package org.telegram.ui.Components;
public final class jd implements Runnable {
    public final int f27671a;
    public final kd f27672b;
    public final boolean f27673c;

    public jd(kd kdVar, boolean z10, int i10) {
        this.f27671a = i10;
        this.f27672b = kdVar;
        this.f27673c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27671a) {
            case 0:
                boolean z10 = this.f27673c;
                kd kdVar = this.f27672b;
                if (!z10) {
                    kdVar.Z0.setVisibility(8);
                    return;
                } else {
                    kdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f27673c;
                kd kdVar2 = this.f27672b;
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
