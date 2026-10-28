package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f31884a;
    public final sg f31885b;
    public final fi.v3 f31886c;

    public qg(sg sgVar, fi.v3 v3Var, int i10) {
        this.f31884a = i10;
        this.f31885b = sgVar;
        this.f31886c = v3Var;
    }

    @Override
    public final void run() {
        switch (this.f31884a) {
            case 0:
                sg sgVar = this.f31885b;
                fi.v3 v3Var = this.f31886c;
                sgVar.removeView(v3Var);
                if (sgVar.f32582b == v3Var) {
                    sgVar.f32582b = null;
                    return;
                }
                return;
            case 1:
                this.f31885b.removeView(this.f31886c);
                return;
            case 2:
                this.f31885b.removeView(this.f31886c);
                return;
            default:
                sg sgVar2 = this.f31885b;
                fi.v3 v3Var2 = this.f31886c;
                sgVar2.removeView(v3Var2);
                if (sgVar2.f32580a == v3Var2) {
                    sgVar2.f32580a = null;
                    return;
                }
                return;
        }
    }
}
