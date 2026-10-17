package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f29676a;
    public final sg f29677b;
    public final ei.x3 f29678c;

    public qg(sg sgVar, ei.x3 x3Var, int i10) {
        this.f29676a = i10;
        this.f29677b = sgVar;
        this.f29678c = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f29676a) {
            case 0:
                sg sgVar = this.f29677b;
                ei.x3 x3Var = this.f29678c;
                sgVar.removeView(x3Var);
                if (sgVar.f30257b == x3Var) {
                    sgVar.f30257b = null;
                    return;
                }
                return;
            case 1:
                this.f29677b.removeView(this.f29678c);
                return;
            case 2:
                this.f29677b.removeView(this.f29678c);
                return;
            default:
                sg sgVar2 = this.f29677b;
                ei.x3 x3Var2 = this.f29678c;
                sgVar2.removeView(x3Var2);
                if (sgVar2.f30256a == x3Var2) {
                    sgVar2.f30256a = null;
                    return;
                }
                return;
        }
    }
}
