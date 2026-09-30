package org.telegram.ui;
public final class dl implements Runnable {
    public final int f33230a;
    public final el f33231b;

    public dl(el elVar, int i10) {
        this.f33230a = i10;
        this.f33231b = elVar;
    }

    @Override
    public final void run() {
        switch (this.f33230a) {
            case 0:
                jk jkVar = this.f33231b.H.Y;
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
                jk jkVar2 = this.f33231b.H.Y;
                if (jkVar2 != null) {
                    jkVar2.H0();
                    return;
                }
                return;
        }
    }
}
