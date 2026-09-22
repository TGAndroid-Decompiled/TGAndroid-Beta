package org.telegram.ui.Components;
public final class hd implements Runnable {
    public final int f24678a;
    public final jd f24679b;
    public final boolean f24680c;

    public hd(jd jdVar, boolean z10, int i10) {
        this.f24678a = i10;
        this.f24679b = jdVar;
        this.f24680c = z10;
    }

    @Override
    public final void run() {
        switch (this.f24678a) {
            case 0:
                boolean z10 = this.f24680c;
                jd jdVar = this.f24679b;
                if (!z10) {
                    jdVar.Z0.setVisibility(8);
                    return;
                } else {
                    jdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f24680c;
                jd jdVar2 = this.f24679b;
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
