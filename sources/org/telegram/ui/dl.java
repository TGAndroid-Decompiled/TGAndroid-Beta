package org.telegram.ui;
public final class dl implements Runnable {
    public final int f35799a;
    public final el f35800b;

    public dl(el elVar, int i10) {
        this.f35799a = i10;
        this.f35800b = elVar;
    }

    @Override
    public final void run() {
        switch (this.f35799a) {
            case 0:
                jk jkVar = this.f35800b.H.W;
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
                jk jkVar2 = this.f35800b.H.W;
                if (jkVar2 != null) {
                    jkVar2.H0();
                    return;
                }
                return;
        }
    }
}
