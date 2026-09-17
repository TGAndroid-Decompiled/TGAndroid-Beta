package org.telegram.ui.Components;
public final class og implements Runnable {
    public final int f26725a;
    public final qg f26726b;
    public final ci.f4 f26727c;

    public og(qg qgVar, ci.f4 f4Var, int i10) {
        this.f26725a = i10;
        this.f26726b = qgVar;
        this.f26727c = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f26725a) {
            case 0:
                qg qgVar = this.f26726b;
                ci.f4 f4Var = this.f26727c;
                qgVar.removeView(f4Var);
                if (qgVar.f27289b == f4Var) {
                    qgVar.f27289b = null;
                    return;
                }
                return;
            case 1:
                this.f26726b.removeView(this.f26727c);
                return;
            case 2:
                this.f26726b.removeView(this.f26727c);
                return;
            default:
                qg qgVar2 = this.f26726b;
                ci.f4 f4Var2 = this.f26727c;
                qgVar2.removeView(f4Var2);
                if (qgVar2.f27288a == f4Var2) {
                    qgVar2.f27288a = null;
                    return;
                }
                return;
        }
    }
}
