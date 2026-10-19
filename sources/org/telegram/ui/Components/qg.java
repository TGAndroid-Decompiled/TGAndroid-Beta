package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f29631a;
    public final sg f29632b;
    public final ei.x3 f29633c;

    public qg(sg sgVar, ei.x3 x3Var, int i10) {
        this.f29631a = i10;
        this.f29632b = sgVar;
        this.f29633c = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f29631a) {
            case 0:
                sg sgVar = this.f29632b;
                ei.x3 x3Var = this.f29633c;
                sgVar.removeView(x3Var);
                if (sgVar.f30249b == x3Var) {
                    sgVar.f30249b = null;
                    return;
                }
                return;
            case 1:
                this.f29632b.removeView(this.f29633c);
                return;
            case 2:
                this.f29632b.removeView(this.f29633c);
                return;
            default:
                sg sgVar2 = this.f29632b;
                ei.x3 x3Var2 = this.f29633c;
                sgVar2.removeView(x3Var2);
                if (sgVar2.f30248a == x3Var2) {
                    sgVar2.f30248a = null;
                    return;
                }
                return;
        }
    }
}
