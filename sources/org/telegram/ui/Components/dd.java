package org.telegram.ui.Components;
public final class dd implements Runnable {
    public final int f27744a;
    public final ed f27745b;
    public final boolean f27746c;

    public dd(ed edVar, boolean z10, int i10) {
        this.f27744a = i10;
        this.f27745b = edVar;
        this.f27746c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27744a) {
            case 0:
                boolean z10 = this.f27746c;
                ed edVar = this.f27745b;
                if (!z10) {
                    edVar.V0.setVisibility(8);
                    return;
                } else {
                    edVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f27746c;
                ed edVar2 = this.f27745b;
                if (!z11) {
                    edVar2.R0.setVisibility(8);
                    return;
                } else {
                    edVar2.getClass();
                    return;
                }
        }
    }
}
