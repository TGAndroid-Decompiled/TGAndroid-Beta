package org.telegram.ui.Components;
public final class kd implements Runnable {
    public final int f25748a;
    public final nd f25749b;
    public final boolean f25750c;

    public kd(nd ndVar, boolean z10, int i10) {
        this.f25748a = i10;
        this.f25749b = ndVar;
        this.f25750c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25748a) {
            case 0:
                boolean z10 = this.f25750c;
                nd ndVar = this.f25749b;
                if (!z10) {
                    ndVar.Z0.setVisibility(8);
                    return;
                } else {
                    ndVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f25750c;
                nd ndVar2 = this.f25749b;
                if (!z11) {
                    ndVar2.V0.setVisibility(8);
                    return;
                } else {
                    ndVar2.getClass();
                    return;
                }
        }
    }
}
