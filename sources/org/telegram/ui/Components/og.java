package org.telegram.ui.Components;
public final class og implements Runnable {
    public final int f29266a;
    public final qg f29267b;
    public final ei.x3 f29268c;

    public og(qg qgVar, ei.x3 x3Var, int i10) {
        this.f29266a = i10;
        this.f29267b = qgVar;
        this.f29268c = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f29266a) {
            case 0:
                qg qgVar = this.f29267b;
                ei.x3 x3Var = this.f29268c;
                qgVar.removeView(x3Var);
                if (qgVar.f29914b == x3Var) {
                    qgVar.f29914b = null;
                    return;
                }
                return;
            case 1:
                this.f29267b.removeView(this.f29268c);
                return;
            case 2:
                this.f29267b.removeView(this.f29268c);
                return;
            default:
                qg qgVar2 = this.f29267b;
                ei.x3 x3Var2 = this.f29268c;
                qgVar2.removeView(x3Var2);
                if (qgVar2.f29912a == x3Var2) {
                    qgVar2.f29912a = null;
                    return;
                }
                return;
        }
    }
}
