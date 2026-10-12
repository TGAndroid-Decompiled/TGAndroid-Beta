package org.telegram.ui;
public final class ml implements Runnable {
    public final int f40088a;
    public final nl f40089b;

    public ml(nl nlVar, int i10) {
        this.f40088a = i10;
        this.f40089b = nlVar;
    }

    @Override
    public final void run() {
        switch (this.f40088a) {
            case 0:
                sk skVar = this.f40089b.H.Y;
                if (skVar != null) {
                    skVar.T0 = false;
                    org.telegram.ui.Components.ig igVar = skVar.U0;
                    if (igVar != null) {
                        igVar.v(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                sk skVar2 = this.f40089b.H.Y;
                if (skVar2 != null) {
                    skVar2.J0();
                    return;
                }
                return;
        }
    }
}
