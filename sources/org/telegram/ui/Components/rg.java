package org.telegram.ui.Components;
public final class rg implements Runnable {
    public final int f30373a;
    public final tg f30374b;
    public final ci.e4 f30375c;

    public rg(tg tgVar, ci.e4 e4Var, int i10) {
        this.f30373a = i10;
        this.f30374b = tgVar;
        this.f30375c = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f30373a) {
            case 0:
                tg tgVar = this.f30374b;
                ci.e4 e4Var = this.f30375c;
                tgVar.removeView(e4Var);
                if (tgVar.f31045b == e4Var) {
                    tgVar.f31045b = null;
                    return;
                }
                return;
            case 1:
                this.f30374b.removeView(this.f30375c);
                return;
            case 2:
                this.f30374b.removeView(this.f30375c);
                return;
            default:
                tg tgVar2 = this.f30374b;
                ci.e4 e4Var2 = this.f30375c;
                tgVar2.removeView(e4Var2);
                if (tgVar2.f31044a == e4Var2) {
                    tgVar2.f31044a = null;
                    return;
                }
                return;
        }
    }
}
