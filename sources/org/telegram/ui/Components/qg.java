package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f31914a;
    public final sg f31915b;
    public final fi.v3 f31916c;

    public qg(sg sgVar, fi.v3 v3Var, int i10) {
        this.f31914a = i10;
        this.f31915b = sgVar;
        this.f31916c = v3Var;
    }

    @Override
    public final void run() {
        switch (this.f31914a) {
            case 0:
                sg sgVar = this.f31915b;
                fi.v3 v3Var = this.f31916c;
                sgVar.removeView(v3Var);
                if (sgVar.f32541b == v3Var) {
                    sgVar.f32541b = null;
                    return;
                }
                return;
            case 1:
                this.f31915b.removeView(this.f31916c);
                return;
            case 2:
                this.f31915b.removeView(this.f31916c);
                return;
            default:
                sg sgVar2 = this.f31915b;
                fi.v3 v3Var2 = this.f31916c;
                sgVar2.removeView(v3Var2);
                if (sgVar2.f32539a == v3Var2) {
                    sgVar2.f32539a = null;
                    return;
                }
                return;
        }
    }
}
