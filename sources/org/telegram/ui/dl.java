package org.telegram.ui;
public final class dl implements Runnable {
    public final int f33152a;
    public final el f33153b;

    public dl(el elVar, int i10) {
        this.f33152a = i10;
        this.f33153b = elVar;
    }

    @Override
    public final void run() {
        switch (this.f33152a) {
            case 0:
                jk jkVar = this.f33153b.H.Y;
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
                jk jkVar2 = this.f33153b.H.Y;
                if (jkVar2 != null) {
                    jkVar2.H0();
                    return;
                }
                return;
        }
    }
}
