package org.telegram.ui.Components;
public final class hd implements Runnable {
    public final int f24639a;
    public final jd f24640b;
    public final boolean f24641c;

    public hd(jd jdVar, boolean z10, int i10) {
        this.f24639a = i10;
        this.f24640b = jdVar;
        this.f24641c = z10;
    }

    @Override
    public final void run() {
        switch (this.f24639a) {
            case 0:
                boolean z10 = this.f24641c;
                jd jdVar = this.f24640b;
                if (!z10) {
                    jdVar.Z0.setVisibility(8);
                    return;
                } else {
                    jdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f24641c;
                jd jdVar2 = this.f24640b;
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
