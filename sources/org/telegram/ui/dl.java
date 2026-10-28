package org.telegram.ui;
public final class dl implements Runnable {
    public final int f38636a;
    public final el f38637b;

    public dl(el elVar, int i10) {
        this.f38636a = i10;
        this.f38637b = elVar;
    }

    @Override
    public final void run() {
        switch (this.f38636a) {
            case 0:
                jk jkVar = this.f38637b.H.Y;
                if (jkVar != null) {
                    jkVar.T0 = false;
                    org.telegram.ui.Components.dg dgVar = jkVar.U0;
                    if (dgVar != null) {
                        dgVar.u(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                jk jkVar2 = this.f38637b.H.Y;
                if (jkVar2 != null) {
                    jkVar2.E0();
                    return;
                }
                return;
        }
    }
}
