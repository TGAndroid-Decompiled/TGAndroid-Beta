package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f29578a;
    public final sg f29579b;
    public final ei.x3 f29580c;

    public qg(sg sgVar, ei.x3 x3Var, int i10) {
        this.f29578a = i10;
        this.f29579b = sgVar;
        this.f29580c = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f29578a) {
            case 0:
                sg sgVar = this.f29579b;
                ei.x3 x3Var = this.f29580c;
                sgVar.removeView(x3Var);
                if (sgVar.f30279b == x3Var) {
                    sgVar.f30279b = null;
                    return;
                }
                return;
            case 1:
                this.f29579b.removeView(this.f29580c);
                return;
            case 2:
                this.f29579b.removeView(this.f29580c);
                return;
            default:
                sg sgVar2 = this.f29579b;
                ei.x3 x3Var2 = this.f29580c;
                sgVar2.removeView(x3Var2);
                if (sgVar2.f30278a == x3Var2) {
                    sgVar2.f30278a = null;
                    return;
                }
                return;
        }
    }
}
