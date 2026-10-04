package org.telegram.ui.Components;
public final class rg implements Runnable {
    public final int f30379a;
    public final tg f30380b;
    public final ci.e4 f30381c;

    public rg(tg tgVar, ci.e4 e4Var, int i10) {
        this.f30379a = i10;
        this.f30380b = tgVar;
        this.f30381c = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f30379a) {
            case 0:
                tg tgVar = this.f30380b;
                ci.e4 e4Var = this.f30381c;
                tgVar.removeView(e4Var);
                if (tgVar.f31051b == e4Var) {
                    tgVar.f31051b = null;
                    return;
                }
                return;
            case 1:
                this.f30380b.removeView(this.f30381c);
                return;
            case 2:
                this.f30380b.removeView(this.f30381c);
                return;
            default:
                tg tgVar2 = this.f30380b;
                ci.e4 e4Var2 = this.f30381c;
                tgVar2.removeView(e4Var2);
                if (tgVar2.f31050a == e4Var2) {
                    tgVar2.f31050a = null;
                    return;
                }
                return;
        }
    }
}
