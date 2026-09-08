package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f29745a;
    public final sg f29746b;
    public final di.f4 f29747c;

    public qg(sg sgVar, di.f4 f4Var, int i10) {
        this.f29745a = i10;
        this.f29746b = sgVar;
        this.f29747c = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f29745a) {
            case 0:
                sg sgVar = this.f29746b;
                di.f4 f4Var = this.f29747c;
                sgVar.removeView(f4Var);
                if (sgVar.f30306b == f4Var) {
                    sgVar.f30306b = null;
                    return;
                }
                return;
            case 1:
                this.f29746b.removeView(this.f29747c);
                return;
            case 2:
                this.f29746b.removeView(this.f29747c);
                return;
            default:
                sg sgVar2 = this.f29746b;
                di.f4 f4Var2 = this.f29747c;
                sgVar2.removeView(f4Var2);
                if (sgVar2.f30305a == f4Var2) {
                    sgVar2.f30305a = null;
                    return;
                }
                return;
        }
    }
}
