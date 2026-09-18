package org.telegram.ui.Components;
public final class og implements Runnable {
    public final int f26728a;
    public final qg f26729b;
    public final ci.f4 f26730c;

    public og(qg qgVar, ci.f4 f4Var, int i10) {
        this.f26728a = i10;
        this.f26729b = qgVar;
        this.f26730c = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f26728a) {
            case 0:
                qg qgVar = this.f26729b;
                ci.f4 f4Var = this.f26730c;
                qgVar.removeView(f4Var);
                if (qgVar.f27292b == f4Var) {
                    qgVar.f27292b = null;
                    return;
                }
                return;
            case 1:
                this.f26729b.removeView(this.f26730c);
                return;
            case 2:
                this.f26729b.removeView(this.f26730c);
                return;
            default:
                qg qgVar2 = this.f26729b;
                ci.f4 f4Var2 = this.f26730c;
                qgVar2.removeView(f4Var2);
                if (qgVar2.f27291a == f4Var2) {
                    qgVar2.f27291a = null;
                    return;
                }
                return;
        }
    }
}
