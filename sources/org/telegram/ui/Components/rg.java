package org.telegram.ui.Components;
public final class rg implements Runnable {
    public final int f30461a;
    public final tg f30462b;
    public final ci.e4 f30463c;

    public rg(tg tgVar, ci.e4 e4Var, int i10) {
        this.f30461a = i10;
        this.f30462b = tgVar;
        this.f30463c = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f30461a) {
            case 0:
                tg tgVar = this.f30462b;
                ci.e4 e4Var = this.f30463c;
                tgVar.removeView(e4Var);
                if (tgVar.f31138b == e4Var) {
                    tgVar.f31138b = null;
                    return;
                }
                return;
            case 1:
                this.f30462b.removeView(this.f30463c);
                return;
            case 2:
                this.f30462b.removeView(this.f30463c);
                return;
            default:
                tg tgVar2 = this.f30462b;
                ci.e4 e4Var2 = this.f30463c;
                tgVar2.removeView(e4Var2);
                if (tgVar2.f31137a == e4Var2) {
                    tgVar2.f31137a = null;
                    return;
                }
                return;
        }
    }
}
