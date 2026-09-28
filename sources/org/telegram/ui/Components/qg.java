package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f27686a;
    public final sg f27687b;
    public final ci.e4 f27688c;

    public qg(sg sgVar, ci.e4 e4Var, int i10) {
        this.f27686a = i10;
        this.f27687b = sgVar;
        this.f27688c = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f27686a) {
            case 0:
                sg sgVar = this.f27687b;
                ci.e4 e4Var = this.f27688c;
                sgVar.removeView(e4Var);
                if (sgVar.f28218b == e4Var) {
                    sgVar.f28218b = null;
                    return;
                }
                return;
            case 1:
                this.f27687b.removeView(this.f27688c);
                return;
            case 2:
                this.f27687b.removeView(this.f27688c);
                return;
            default:
                sg sgVar2 = this.f27687b;
                ci.e4 e4Var2 = this.f27688c;
                sgVar2.removeView(e4Var2);
                if (sgVar2.f28217a == e4Var2) {
                    sgVar2.f28217a = null;
                    return;
                }
                return;
        }
    }
}
