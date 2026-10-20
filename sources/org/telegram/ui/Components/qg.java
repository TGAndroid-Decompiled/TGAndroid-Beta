package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f29573a;
    public final sg f29574b;
    public final ei.x3 f29575c;

    public qg(sg sgVar, ei.x3 x3Var, int i10) {
        this.f29573a = i10;
        this.f29574b = sgVar;
        this.f29575c = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f29573a) {
            case 0:
                sg sgVar = this.f29574b;
                ei.x3 x3Var = this.f29575c;
                sgVar.removeView(x3Var);
                if (sgVar.f30274b == x3Var) {
                    sgVar.f30274b = null;
                    return;
                }
                return;
            case 1:
                this.f29574b.removeView(this.f29575c);
                return;
            case 2:
                this.f29574b.removeView(this.f29575c);
                return;
            default:
                sg sgVar2 = this.f29574b;
                ei.x3 x3Var2 = this.f29575c;
                sgVar2.removeView(x3Var2);
                if (sgVar2.f30273a == x3Var2) {
                    sgVar2.f30273a = null;
                    return;
                }
                return;
        }
    }
}
