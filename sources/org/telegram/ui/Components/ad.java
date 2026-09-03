package org.telegram.ui.Components;
public final class ad implements Runnable {
    public final int f23360a;
    public final bd f23361b;
    public final boolean f23362c;

    public ad(bd bdVar, boolean z4, int i10) {
        this.f23360a = i10;
        this.f23361b = bdVar;
        this.f23362c = z4;
    }

    @Override
    public final void run() {
        switch (this.f23360a) {
            case 0:
                boolean z4 = this.f23362c;
                bd bdVar = this.f23361b;
                if (!z4) {
                    bdVar.W0.setVisibility(8);
                    return;
                } else {
                    bdVar.getClass();
                    return;
                }
            default:
                boolean z10 = this.f23362c;
                bd bdVar2 = this.f23361b;
                if (!z10) {
                    bdVar2.S0.setVisibility(8);
                    return;
                } else {
                    bdVar2.getClass();
                    return;
                }
        }
    }
}
