package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f29633a;
    public final sg f29634b;
    public final ei.x3 f29635c;

    public qg(sg sgVar, ei.x3 x3Var, int i10) {
        this.f29633a = i10;
        this.f29634b = sgVar;
        this.f29635c = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f29633a) {
            case 0:
                sg sgVar = this.f29634b;
                ei.x3 x3Var = this.f29635c;
                sgVar.removeView(x3Var);
                if (sgVar.f30251b == x3Var) {
                    sgVar.f30251b = null;
                    return;
                }
                return;
            case 1:
                this.f29634b.removeView(this.f29635c);
                return;
            case 2:
                this.f29634b.removeView(this.f29635c);
                return;
            default:
                sg sgVar2 = this.f29634b;
                ei.x3 x3Var2 = this.f29635c;
                sgVar2.removeView(x3Var2);
                if (sgVar2.f30250a == x3Var2) {
                    sgVar2.f30250a = null;
                    return;
                }
                return;
        }
    }
}
