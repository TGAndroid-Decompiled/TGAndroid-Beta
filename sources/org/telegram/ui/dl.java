package org.telegram.ui;
public final class dl implements Runnable {
    public final int f35838a;
    public final el f35839b;

    public dl(el elVar, int i10) {
        this.f35838a = i10;
        this.f35839b = elVar;
    }

    @Override
    public final void run() {
        switch (this.f35838a) {
            case 0:
                jk jkVar = this.f35839b.H.W;
                if (jkVar != null) {
                    jkVar.T0 = false;
                    org.telegram.ui.Components.fg fgVar = jkVar.U0;
                    if (fgVar != null) {
                        fgVar.u(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                jk jkVar2 = this.f35839b.H.W;
                if (jkVar2 != null) {
                    jkVar2.H0();
                    return;
                }
                return;
        }
    }
}
