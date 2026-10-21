package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f29574a;
    public final sg f29575b;
    public final ei.x3 f29576c;

    public qg(sg sgVar, ei.x3 x3Var, int i10) {
        this.f29574a = i10;
        this.f29575b = sgVar;
        this.f29576c = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f29574a) {
            case 0:
                sg sgVar = this.f29575b;
                ei.x3 x3Var = this.f29576c;
                sgVar.removeView(x3Var);
                if (sgVar.f30275b == x3Var) {
                    sgVar.f30275b = null;
                    return;
                }
                return;
            case 1:
                this.f29575b.removeView(this.f29576c);
                return;
            case 2:
                this.f29575b.removeView(this.f29576c);
                return;
            default:
                sg sgVar2 = this.f29575b;
                ei.x3 x3Var2 = this.f29576c;
                sgVar2.removeView(x3Var2);
                if (sgVar2.f30274a == x3Var2) {
                    sgVar2.f30274a = null;
                    return;
                }
                return;
        }
    }
}
