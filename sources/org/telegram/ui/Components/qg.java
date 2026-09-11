package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f29718a;
    public final sg f29719b;
    public final di.f4 f29720c;

    public qg(sg sgVar, di.f4 f4Var, int i10) {
        this.f29718a = i10;
        this.f29719b = sgVar;
        this.f29720c = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f29718a) {
            case 0:
                sg sgVar = this.f29719b;
                di.f4 f4Var = this.f29720c;
                sgVar.removeView(f4Var);
                if (sgVar.f30279b == f4Var) {
                    sgVar.f30279b = null;
                    return;
                }
                return;
            case 1:
                this.f29719b.removeView(this.f29720c);
                return;
            case 2:
                this.f29719b.removeView(this.f29720c);
                return;
            default:
                sg sgVar2 = this.f29719b;
                di.f4 f4Var2 = this.f29720c;
                sgVar2.removeView(f4Var2);
                if (sgVar2.f30278a == f4Var2) {
                    sgVar2.f30278a = null;
                    return;
                }
                return;
        }
    }
}
