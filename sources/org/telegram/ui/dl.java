package org.telegram.ui;
public final class dl implements Runnable {
    public final int f35793a;
    public final el f35794b;

    public dl(el elVar, int i10) {
        this.f35793a = i10;
        this.f35794b = elVar;
    }

    @Override
    public final void run() {
        switch (this.f35793a) {
            case 0:
                jk jkVar = this.f35794b.H.W;
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
                jk jkVar2 = this.f35794b.H.W;
                if (jkVar2 != null) {
                    jkVar2.H0();
                    return;
                }
                return;
        }
    }
}
