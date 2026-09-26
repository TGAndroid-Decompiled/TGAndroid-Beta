package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f27667a;
    public final sg f27668b;
    public final ci.e4 f27669c;

    public qg(sg sgVar, ci.e4 e4Var, int i10) {
        this.f27667a = i10;
        this.f27668b = sgVar;
        this.f27669c = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f27667a) {
            case 0:
                sg sgVar = this.f27668b;
                ci.e4 e4Var = this.f27669c;
                sgVar.removeView(e4Var);
                if (sgVar.f28271b == e4Var) {
                    sgVar.f28271b = null;
                    return;
                }
                return;
            case 1:
                this.f27668b.removeView(this.f27669c);
                return;
            case 2:
                this.f27668b.removeView(this.f27669c);
                return;
            default:
                sg sgVar2 = this.f27668b;
                ci.e4 e4Var2 = this.f27669c;
                sgVar2.removeView(e4Var2);
                if (sgVar2.f28270a == e4Var2) {
                    sgVar2.f28270a = null;
                    return;
                }
                return;
        }
    }
}
