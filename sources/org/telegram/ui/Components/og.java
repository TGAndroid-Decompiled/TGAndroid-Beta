package org.telegram.ui.Components;
public final class og implements Runnable {
    public final int f26777a;
    public final qg f26778b;
    public final ci.f4 f26779c;

    public og(qg qgVar, ci.f4 f4Var, int i10) {
        this.f26777a = i10;
        this.f26778b = qgVar;
        this.f26779c = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f26777a) {
            case 0:
                qg qgVar = this.f26778b;
                ci.f4 f4Var = this.f26779c;
                qgVar.removeView(f4Var);
                if (qgVar.f27333b == f4Var) {
                    qgVar.f27333b = null;
                    return;
                }
                return;
            case 1:
                this.f26778b.removeView(this.f26779c);
                return;
            case 2:
                this.f26778b.removeView(this.f26779c);
                return;
            default:
                qg qgVar2 = this.f26778b;
                ci.f4 f4Var2 = this.f26779c;
                qgVar2.removeView(f4Var2);
                if (qgVar2.f27332a == f4Var2) {
                    qgVar2.f27332a = null;
                    return;
                }
                return;
        }
    }
}
