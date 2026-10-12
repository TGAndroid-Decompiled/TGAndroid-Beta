package org.telegram.ui;
public final class ml implements Runnable {
    public final int f38283a;
    public final nl f38284b;

    public ml(nl nlVar, int i10) {
        this.f38283a = i10;
        this.f38284b = nlVar;
    }

    @Override
    public final void run() {
        switch (this.f38283a) {
            case 0:
                sk skVar = this.f38284b.H.Y;
                if (skVar != null) {
                    skVar.T0 = false;
                    org.telegram.ui.Components.fg fgVar = skVar.U0;
                    if (fgVar != null) {
                        fgVar.v(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                sk skVar2 = this.f38284b.H.Y;
                if (skVar2 != null) {
                    skVar2.F0();
                    return;
                }
                return;
        }
    }
}
