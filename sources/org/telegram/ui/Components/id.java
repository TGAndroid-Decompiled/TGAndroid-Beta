package org.telegram.ui.Components;
public final class id implements Runnable {
    public final int f24002a;
    public final jd f24003b;
    public final boolean f24004c;

    public id(jd jdVar, boolean z10, int i10) {
        this.f24002a = i10;
        this.f24003b = jdVar;
        this.f24004c = z10;
    }

    @Override
    public final void run() {
        switch (this.f24002a) {
            case 0:
                boolean z10 = this.f24004c;
                jd jdVar = this.f24003b;
                if (!z10) {
                    jdVar.Z0.setVisibility(8);
                    return;
                } else {
                    jdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f24004c;
                jd jdVar2 = this.f24003b;
                if (!z11) {
                    jdVar2.V0.setVisibility(8);
                    return;
                } else {
                    jdVar2.getClass();
                    return;
                }
        }
    }
}
