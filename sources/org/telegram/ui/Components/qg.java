package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f29682a;
    public final sg f29683b;
    public final ei.x3 f29684c;

    public qg(sg sgVar, ei.x3 x3Var, int i10) {
        this.f29682a = i10;
        this.f29683b = sgVar;
        this.f29684c = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f29682a) {
            case 0:
                sg sgVar = this.f29683b;
                ei.x3 x3Var = this.f29684c;
                sgVar.removeView(x3Var);
                if (sgVar.f30264b == x3Var) {
                    sgVar.f30264b = null;
                    return;
                }
                return;
            case 1:
                this.f29683b.removeView(this.f29684c);
                return;
            case 2:
                this.f29683b.removeView(this.f29684c);
                return;
            default:
                sg sgVar2 = this.f29683b;
                ei.x3 x3Var2 = this.f29684c;
                sgVar2.removeView(x3Var2);
                if (sgVar2.f30263a == x3Var2) {
                    sgVar2.f30263a = null;
                    return;
                }
                return;
        }
    }
}
