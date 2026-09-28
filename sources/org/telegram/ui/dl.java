package org.telegram.ui;
public final class dl implements Runnable {
    public final int f33153a;
    public final el f33154b;

    public dl(el elVar, int i10) {
        this.f33153a = i10;
        this.f33154b = elVar;
    }

    @Override
    public final void run() {
        switch (this.f33153a) {
            case 0:
                jk jkVar = this.f33154b.H.Y;
                if (jkVar != null) {
                    jkVar.T0 = false;
                    org.telegram.ui.Components.eg egVar = jkVar.U0;
                    if (egVar != null) {
                        egVar.u(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                jk jkVar2 = this.f33154b.H.Y;
                if (jkVar2 != null) {
                    jkVar2.H0();
                    return;
                }
                return;
        }
    }
}
