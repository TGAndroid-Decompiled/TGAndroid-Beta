package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f29719a;
    public final sg f29720b;
    public final di.f4 f29721c;

    public qg(sg sgVar, di.f4 f4Var, int i10) {
        this.f29719a = i10;
        this.f29720b = sgVar;
        this.f29721c = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f29719a) {
            case 0:
                sg sgVar = this.f29720b;
                di.f4 f4Var = this.f29721c;
                sgVar.removeView(f4Var);
                if (sgVar.f30280b == f4Var) {
                    sgVar.f30280b = null;
                    return;
                }
                return;
            case 1:
                this.f29720b.removeView(this.f29721c);
                return;
            case 2:
                this.f29720b.removeView(this.f29721c);
                return;
            default:
                sg sgVar2 = this.f29720b;
                di.f4 f4Var2 = this.f29721c;
                sgVar2.removeView(f4Var2);
                if (sgVar2.f30279a == f4Var2) {
                    sgVar2.f30279a = null;
                    return;
                }
                return;
        }
    }
}
