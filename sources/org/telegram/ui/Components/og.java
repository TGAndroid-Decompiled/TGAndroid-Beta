package org.telegram.ui.Components;
public final class og implements Runnable {
    public final int f38149a;
    public final qg f38150b;
    public final hi.u3 f38151c;

    public og(qg qgVar, hi.u3 u3Var, int i7) {
        this.f38149a = i7;
        this.f38150b = qgVar;
        this.f38151c = u3Var;
    }

    @Override
    public final void run() {
        switch (this.f38149a) {
            case 0:
                qg qgVar = this.f38150b;
                hi.u3 u3Var = this.f38151c;
                qgVar.removeView(u3Var);
                if (qgVar.f38837b == u3Var) {
                    qgVar.f38837b = null;
                    return;
                }
                return;
            case 1:
                this.f38150b.removeView(this.f38151c);
                return;
            case 2:
                this.f38150b.removeView(this.f38151c);
                return;
            default:
                qg qgVar2 = this.f38150b;
                hi.u3 u3Var2 = this.f38151c;
                qgVar2.removeView(u3Var2);
                if (qgVar2.f38835a == u3Var2) {
                    qgVar2.f38835a = null;
                    return;
                }
                return;
        }
    }
}
