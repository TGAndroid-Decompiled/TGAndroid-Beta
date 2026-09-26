package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f27609a;
    public final sg f27610b;
    public final ci.e4 f27611c;

    public qg(sg sgVar, ci.e4 e4Var, int i10) {
        this.f27609a = i10;
        this.f27610b = sgVar;
        this.f27611c = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f27609a) {
            case 0:
                sg sgVar = this.f27610b;
                ci.e4 e4Var = this.f27611c;
                sgVar.removeView(e4Var);
                if (sgVar.f28242b == e4Var) {
                    sgVar.f28242b = null;
                    return;
                }
                return;
            case 1:
                this.f27610b.removeView(this.f27611c);
                return;
            case 2:
                this.f27610b.removeView(this.f27611c);
                return;
            default:
                sg sgVar2 = this.f27610b;
                ci.e4 e4Var2 = this.f27611c;
                sgVar2.removeView(e4Var2);
                if (sgVar2.f28241a == e4Var2) {
                    sgVar2.f28241a = null;
                    return;
                }
                return;
        }
    }
}
