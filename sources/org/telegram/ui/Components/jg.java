package org.telegram.ui.Components;
public final class jg implements Runnable {
    public final int f29653a;
    public final lg f29654b;
    public final nh.t3 f29655c;

    public jg(lg lgVar, nh.t3 t3Var, int i10) {
        this.f29653a = i10;
        this.f29654b = lgVar;
        this.f29655c = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f29653a) {
            case 0:
                lg lgVar = this.f29654b;
                nh.t3 t3Var = this.f29655c;
                lgVar.removeView(t3Var);
                if (lgVar.f30305b == t3Var) {
                    lgVar.f30305b = null;
                    return;
                }
                return;
            case 1:
                this.f29654b.removeView(this.f29655c);
                return;
            case 2:
                this.f29654b.removeView(this.f29655c);
                return;
            default:
                lg lgVar2 = this.f29654b;
                nh.t3 t3Var2 = this.f29655c;
                lgVar2.removeView(t3Var2);
                if (lgVar2.f30304a == t3Var2) {
                    lgVar2.f30304a = null;
                    return;
                }
                return;
        }
    }
}
