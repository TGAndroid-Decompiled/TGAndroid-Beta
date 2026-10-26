package org.telegram.ui.Components;
public final class id implements Runnable {
    public final int f29280a;
    public final jd f29281b;
    public final boolean f29282c;

    public id(jd jdVar, boolean z10, int i10) {
        this.f29280a = i10;
        this.f29281b = jdVar;
        this.f29282c = z10;
    }

    @Override
    public final void run() {
        switch (this.f29280a) {
            case 0:
                boolean z10 = this.f29282c;
                jd jdVar = this.f29281b;
                if (!z10) {
                    jdVar.Z0.setVisibility(8);
                    return;
                } else {
                    jdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f29282c;
                jd jdVar2 = this.f29281b;
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
