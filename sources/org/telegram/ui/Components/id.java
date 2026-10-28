package org.telegram.ui.Components;
public final class id implements Runnable {
    public final int f29316a;
    public final jd f29317b;
    public final boolean f29318c;

    public id(jd jdVar, boolean z10, int i10) {
        this.f29316a = i10;
        this.f29317b = jdVar;
        this.f29318c = z10;
    }

    @Override
    public final void run() {
        switch (this.f29316a) {
            case 0:
                boolean z10 = this.f29318c;
                jd jdVar = this.f29317b;
                if (!z10) {
                    jdVar.Z0.setVisibility(8);
                    return;
                } else {
                    jdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f29318c;
                jd jdVar2 = this.f29317b;
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
