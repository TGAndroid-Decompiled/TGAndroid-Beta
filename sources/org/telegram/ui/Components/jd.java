package org.telegram.ui.Components;
public final class jd implements Runnable {
    public final int f25302a;
    public final kd f25303b;
    public final boolean f25304c;

    public jd(kd kdVar, boolean z10, int i10) {
        this.f25302a = i10;
        this.f25303b = kdVar;
        this.f25304c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25302a) {
            case 0:
                boolean z10 = this.f25304c;
                kd kdVar = this.f25303b;
                if (!z10) {
                    kdVar.Z0.setVisibility(8);
                    return;
                } else {
                    kdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f25304c;
                kd kdVar2 = this.f25303b;
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
