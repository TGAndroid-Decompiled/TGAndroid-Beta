package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f29577a;
    public final sg f29578b;
    public final ei.x3 f29579c;

    public qg(sg sgVar, ei.x3 x3Var, int i10) {
        this.f29577a = i10;
        this.f29578b = sgVar;
        this.f29579c = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f29577a) {
            case 0:
                sg sgVar = this.f29578b;
                ei.x3 x3Var = this.f29579c;
                sgVar.removeView(x3Var);
                if (sgVar.f30278b == x3Var) {
                    sgVar.f30278b = null;
                    return;
                }
                return;
            case 1:
                this.f29578b.removeView(this.f29579c);
                return;
            case 2:
                this.f29578b.removeView(this.f29579c);
                return;
            default:
                sg sgVar2 = this.f29578b;
                ei.x3 x3Var2 = this.f29579c;
                sgVar2.removeView(x3Var2);
                if (sgVar2.f30277a == x3Var2) {
                    sgVar2.f30277a = null;
                    return;
                }
                return;
        }
    }
}
