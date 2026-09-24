package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f27603a;
    public final sg f27604b;
    public final ci.e4 f27605c;

    public qg(sg sgVar, ci.e4 e4Var, int i10) {
        this.f27603a = i10;
        this.f27604b = sgVar;
        this.f27605c = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f27603a) {
            case 0:
                sg sgVar = this.f27604b;
                ci.e4 e4Var = this.f27605c;
                sgVar.removeView(e4Var);
                if (sgVar.f28235b == e4Var) {
                    sgVar.f28235b = null;
                    return;
                }
                return;
            case 1:
                this.f27604b.removeView(this.f27605c);
                return;
            case 2:
                this.f27604b.removeView(this.f27605c);
                return;
            default:
                sg sgVar2 = this.f27604b;
                ci.e4 e4Var2 = this.f27605c;
                sgVar2.removeView(e4Var2);
                if (sgVar2.f28234a == e4Var2) {
                    sgVar2.f28234a = null;
                    return;
                }
                return;
        }
    }
}
