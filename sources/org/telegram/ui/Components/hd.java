package org.telegram.ui.Components;
public final class hd implements Runnable {
    public final int f24642a;
    public final jd f24643b;
    public final boolean f24644c;

    public hd(jd jdVar, boolean z10, int i10) {
        this.f24642a = i10;
        this.f24643b = jdVar;
        this.f24644c = z10;
    }

    @Override
    public final void run() {
        switch (this.f24642a) {
            case 0:
                boolean z10 = this.f24644c;
                jd jdVar = this.f24643b;
                if (!z10) {
                    jdVar.Z0.setVisibility(8);
                    return;
                } else {
                    jdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f24644c;
                jd jdVar2 = this.f24643b;
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
