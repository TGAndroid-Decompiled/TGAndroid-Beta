package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f29746a;
    public final sg f29747b;
    public final di.f4 f29748c;

    public qg(sg sgVar, di.f4 f4Var, int i10) {
        this.f29746a = i10;
        this.f29747b = sgVar;
        this.f29748c = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f29746a) {
            case 0:
                sg sgVar = this.f29747b;
                di.f4 f4Var = this.f29748c;
                sgVar.removeView(f4Var);
                if (sgVar.f30307b == f4Var) {
                    sgVar.f30307b = null;
                    return;
                }
                return;
            case 1:
                this.f29747b.removeView(this.f29748c);
                return;
            case 2:
                this.f29747b.removeView(this.f29748c);
                return;
            default:
                sg sgVar2 = this.f29747b;
                di.f4 f4Var2 = this.f29748c;
                sgVar2.removeView(f4Var2);
                if (sgVar2.f30306a == f4Var2) {
                    sgVar2.f30306a = null;
                    return;
                }
                return;
        }
    }
}
