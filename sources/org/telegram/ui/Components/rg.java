package org.telegram.ui.Components;
public final class rg implements Runnable {
    public final int f27982a;
    public final tg f27983b;
    public final ci.e4 f27984c;

    public rg(tg tgVar, ci.e4 e4Var, int i10) {
        this.f27982a = i10;
        this.f27983b = tgVar;
        this.f27984c = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f27982a) {
            case 0:
                tg tgVar = this.f27983b;
                ci.e4 e4Var = this.f27984c;
                tgVar.removeView(e4Var);
                if (tgVar.f28505b == e4Var) {
                    tgVar.f28505b = null;
                    return;
                }
                return;
            case 1:
                this.f27983b.removeView(this.f27984c);
                return;
            case 2:
                this.f27983b.removeView(this.f27984c);
                return;
            default:
                tg tgVar2 = this.f27983b;
                ci.e4 e4Var2 = this.f27984c;
                tgVar2.removeView(e4Var2);
                if (tgVar2.f28504a == e4Var2) {
                    tgVar2.f28504a = null;
                    return;
                }
                return;
        }
    }
}
