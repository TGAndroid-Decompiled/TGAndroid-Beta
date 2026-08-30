package org.telegram.ui.Components;
public final class ad implements Runnable {
    public final int f23353a;
    public final bd f23354b;
    public final boolean f23355c;

    public ad(bd bdVar, boolean z4, int i10) {
        this.f23353a = i10;
        this.f23354b = bdVar;
        this.f23355c = z4;
    }

    @Override
    public final void run() {
        switch (this.f23353a) {
            case 0:
                boolean z4 = this.f23355c;
                bd bdVar = this.f23354b;
                if (!z4) {
                    bdVar.W0.setVisibility(8);
                    return;
                } else {
                    bdVar.getClass();
                    return;
                }
            default:
                boolean z10 = this.f23355c;
                bd bdVar2 = this.f23354b;
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
