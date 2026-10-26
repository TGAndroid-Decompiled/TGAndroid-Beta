package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f31916a;
    public final sg f31917b;
    public final fi.v3 f31918c;

    public qg(sg sgVar, fi.v3 v3Var, int i10) {
        this.f31916a = i10;
        this.f31917b = sgVar;
        this.f31918c = v3Var;
    }

    @Override
    public final void run() {
        switch (this.f31916a) {
            case 0:
                sg sgVar = this.f31917b;
                fi.v3 v3Var = this.f31918c;
                sgVar.removeView(v3Var);
                if (sgVar.f32543b == v3Var) {
                    sgVar.f32543b = null;
                    return;
                }
                return;
            case 1:
                this.f31917b.removeView(this.f31918c);
                return;
            case 2:
                this.f31917b.removeView(this.f31918c);
                return;
            default:
                sg sgVar2 = this.f31917b;
                fi.v3 v3Var2 = this.f31918c;
                sgVar2.removeView(v3Var2);
                if (sgVar2.f32541a == v3Var2) {
                    sgVar2.f32541a = null;
                    return;
                }
                return;
        }
    }
}
