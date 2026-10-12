package org.telegram.ui.Components;
public final class ld implements Runnable {
    public final int f28147a;
    public final od f28148b;
    public final boolean f28149c;

    public ld(od odVar, boolean z10, int i10) {
        this.f28147a = i10;
        this.f28148b = odVar;
        this.f28149c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28147a) {
            case 0:
                boolean z10 = this.f28149c;
                od odVar = this.f28148b;
                if (!z10) {
                    odVar.Z0.setVisibility(8);
                    return;
                } else {
                    odVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f28149c;
                od odVar2 = this.f28148b;
                if (!z11) {
                    odVar2.V0.setVisibility(8);
                    return;
                } else {
                    odVar2.getClass();
                    return;
                }
        }
    }
}
