package org.telegram.ui.Components;
public final class rg implements Runnable {
    public final int f30372a;
    public final tg f30373b;
    public final ci.e4 f30374c;

    public rg(tg tgVar, ci.e4 e4Var, int i10) {
        this.f30372a = i10;
        this.f30373b = tgVar;
        this.f30374c = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f30372a) {
            case 0:
                tg tgVar = this.f30373b;
                ci.e4 e4Var = this.f30374c;
                tgVar.removeView(e4Var);
                if (tgVar.f31044b == e4Var) {
                    tgVar.f31044b = null;
                    return;
                }
                return;
            case 1:
                this.f30373b.removeView(this.f30374c);
                return;
            case 2:
                this.f30373b.removeView(this.f30374c);
                return;
            default:
                tg tgVar2 = this.f30373b;
                ci.e4 e4Var2 = this.f30374c;
                tgVar2.removeView(e4Var2);
                if (tgVar2.f31043a == e4Var2) {
                    tgVar2.f31043a = null;
                    return;
                }
                return;
        }
    }
}
