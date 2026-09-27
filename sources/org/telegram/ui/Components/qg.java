package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f27722a;
    public final sg f27723b;
    public final ci.e4 f27724c;

    public qg(sg sgVar, ci.e4 e4Var, int i10) {
        this.f27722a = i10;
        this.f27723b = sgVar;
        this.f27724c = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f27722a) {
            case 0:
                sg sgVar = this.f27723b;
                ci.e4 e4Var = this.f27724c;
                sgVar.removeView(e4Var);
                if (sgVar.f28236b == e4Var) {
                    sgVar.f28236b = null;
                    return;
                }
                return;
            case 1:
                this.f27723b.removeView(this.f27724c);
                return;
            case 2:
                this.f27723b.removeView(this.f27724c);
                return;
            default:
                sg sgVar2 = this.f27723b;
                ci.e4 e4Var2 = this.f27724c;
                sgVar2.removeView(e4Var2);
                if (sgVar2.f28235a == e4Var2) {
                    sgVar2.f28235a = null;
                    return;
                }
                return;
        }
    }
}
