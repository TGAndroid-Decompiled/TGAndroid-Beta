package org.telegram.ui.Components;
public final class hd implements Runnable {
    public final int f24675a;
    public final jd f24676b;
    public final boolean f24677c;

    public hd(jd jdVar, boolean z10, int i10) {
        this.f24675a = i10;
        this.f24676b = jdVar;
        this.f24677c = z10;
    }

    @Override
    public final void run() {
        switch (this.f24675a) {
            case 0:
                boolean z10 = this.f24677c;
                jd jdVar = this.f24676b;
                if (!z10) {
                    jdVar.Z0.setVisibility(8);
                    return;
                } else {
                    jdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f24677c;
                jd jdVar2 = this.f24676b;
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
