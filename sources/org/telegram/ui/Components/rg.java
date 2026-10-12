package org.telegram.ui.Components;
public final class rg implements Runnable {
    public final int f28830a;
    public final tg f28831b;
    public final di.d4 f28832c;

    public rg(tg tgVar, di.d4 d4Var, int i10) {
        this.f28830a = i10;
        this.f28831b = tgVar;
        this.f28832c = d4Var;
    }

    @Override
    public final void run() {
        switch (this.f28830a) {
            case 0:
                tg tgVar = this.f28831b;
                di.d4 d4Var = this.f28832c;
                tgVar.removeView(d4Var);
                if (tgVar.f29379b == d4Var) {
                    tgVar.f29379b = null;
                    return;
                }
                return;
            case 1:
                this.f28831b.removeView(this.f28832c);
                return;
            case 2:
                this.f28831b.removeView(this.f28832c);
                return;
            default:
                tg tgVar2 = this.f28831b;
                di.d4 d4Var2 = this.f28832c;
                tgVar2.removeView(d4Var2);
                if (tgVar2.f29378a == d4Var2) {
                    tgVar2.f29378a = null;
                    return;
                }
                return;
        }
    }
}
