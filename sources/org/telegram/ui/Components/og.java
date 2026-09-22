package org.telegram.ui.Components;
public final class og implements Runnable {
    public final int f26774a;
    public final qg f26775b;
    public final ci.f4 f26776c;

    public og(qg qgVar, ci.f4 f4Var, int i10) {
        this.f26774a = i10;
        this.f26775b = qgVar;
        this.f26776c = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f26774a) {
            case 0:
                qg qgVar = this.f26775b;
                ci.f4 f4Var = this.f26776c;
                qgVar.removeView(f4Var);
                if (qgVar.f27330b == f4Var) {
                    qgVar.f27330b = null;
                    return;
                }
                return;
            case 1:
                this.f26775b.removeView(this.f26776c);
                return;
            case 2:
                this.f26775b.removeView(this.f26776c);
                return;
            default:
                qg qgVar2 = this.f26775b;
                ci.f4 f4Var2 = this.f26776c;
                qgVar2.removeView(f4Var2);
                if (qgVar2.f27329a == f4Var2) {
                    qgVar2.f27329a = null;
                    return;
                }
                return;
        }
    }
}
