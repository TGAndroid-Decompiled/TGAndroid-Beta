package org.telegram.ui.Components;
public final class rg implements Runnable {
    public final int f28520a;
    public final tg f28521b;
    public final di.d4 f28522c;

    public rg(tg tgVar, di.d4 d4Var, int i10) {
        this.f28520a = i10;
        this.f28521b = tgVar;
        this.f28522c = d4Var;
    }

    @Override
    public final void run() {
        switch (this.f28520a) {
            case 0:
                tg tgVar = this.f28521b;
                di.d4 d4Var = this.f28522c;
                tgVar.removeView(d4Var);
                if (tgVar.f29056b == d4Var) {
                    tgVar.f29056b = null;
                    return;
                }
                return;
            case 1:
                this.f28521b.removeView(this.f28522c);
                return;
            case 2:
                this.f28521b.removeView(this.f28522c);
                return;
            default:
                tg tgVar2 = this.f28521b;
                di.d4 d4Var2 = this.f28522c;
                tgVar2.removeView(d4Var2);
                if (tgVar2.f29055a == d4Var2) {
                    tgVar2.f29055a = null;
                    return;
                }
                return;
        }
    }
}
