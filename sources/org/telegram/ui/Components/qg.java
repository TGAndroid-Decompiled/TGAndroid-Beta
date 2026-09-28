package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f27685a;
    public final sg f27686b;
    public final ci.e4 f27687c;

    public qg(sg sgVar, ci.e4 e4Var, int i10) {
        this.f27685a = i10;
        this.f27686b = sgVar;
        this.f27687c = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f27685a) {
            case 0:
                sg sgVar = this.f27686b;
                ci.e4 e4Var = this.f27687c;
                sgVar.removeView(e4Var);
                if (sgVar.f28217b == e4Var) {
                    sgVar.f28217b = null;
                    return;
                }
                return;
            case 1:
                this.f27686b.removeView(this.f27687c);
                return;
            case 2:
                this.f27686b.removeView(this.f27687c);
                return;
            default:
                sg sgVar2 = this.f27686b;
                ci.e4 e4Var2 = this.f27687c;
                sgVar2.removeView(e4Var2);
                if (sgVar2.f28216a == e4Var2) {
                    sgVar2.f28216a = null;
                    return;
                }
                return;
        }
    }
}
