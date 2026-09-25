package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f27610a;
    public final sg f27611b;
    public final ci.e4 f27612c;

    public qg(sg sgVar, ci.e4 e4Var, int i10) {
        this.f27610a = i10;
        this.f27611b = sgVar;
        this.f27612c = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f27610a) {
            case 0:
                sg sgVar = this.f27611b;
                ci.e4 e4Var = this.f27612c;
                sgVar.removeView(e4Var);
                if (sgVar.f28243b == e4Var) {
                    sgVar.f28243b = null;
                    return;
                }
                return;
            case 1:
                this.f27611b.removeView(this.f27612c);
                return;
            case 2:
                this.f27611b.removeView(this.f27612c);
                return;
            default:
                sg sgVar2 = this.f27611b;
                ci.e4 e4Var2 = this.f27612c;
                sgVar2.removeView(e4Var2);
                if (sgVar2.f28242a == e4Var2) {
                    sgVar2.f28242a = null;
                    return;
                }
                return;
        }
    }
}
