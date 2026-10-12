package org.telegram.ui;
public final class ml implements Runnable {
    public final int f40091a;
    public final nl f40092b;

    public ml(nl nlVar, int i10) {
        this.f40091a = i10;
        this.f40092b = nlVar;
    }

    @Override
    public final void run() {
        switch (this.f40091a) {
            case 0:
                sk skVar = this.f40092b.H.Y;
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
                sk skVar2 = this.f40092b.H.Y;
                if (skVar2 != null) {
                    skVar2.J0();
                    return;
                }
                return;
        }
    }
}
