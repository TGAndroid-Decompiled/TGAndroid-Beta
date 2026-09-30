package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f27677a;
    public final sg f27678b;
    public final ci.e4 f27679c;

    public qg(sg sgVar, ci.e4 e4Var, int i10) {
        this.f27677a = i10;
        this.f27678b = sgVar;
        this.f27679c = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f27677a) {
            case 0:
                sg sgVar = this.f27678b;
                ci.e4 e4Var = this.f27679c;
                sgVar.removeView(e4Var);
                if (sgVar.f28215b == e4Var) {
                    sgVar.f28215b = null;
                    return;
                }
                return;
            case 1:
                this.f27678b.removeView(this.f27679c);
                return;
            case 2:
                this.f27678b.removeView(this.f27679c);
                return;
            default:
                sg sgVar2 = this.f27678b;
                ci.e4 e4Var2 = this.f27679c;
                sgVar2.removeView(e4Var2);
                if (sgVar2.f28214a == e4Var2) {
                    sgVar2.f28214a = null;
                    return;
                }
                return;
        }
    }
}
