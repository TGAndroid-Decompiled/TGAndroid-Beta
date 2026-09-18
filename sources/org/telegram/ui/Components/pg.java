package org.telegram.ui.Components;
public final class pg implements Runnable {
    public final int f27204a;
    public final rg f27205b;
    public final ci.f4 f27206c;

    public pg(rg rgVar, ci.f4 f4Var, int i10) {
        this.f27204a = i10;
        this.f27205b = rgVar;
        this.f27206c = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f27204a) {
            case 0:
                rg rgVar = this.f27205b;
                ci.f4 f4Var = this.f27206c;
                rgVar.removeView(f4Var);
                if (rgVar.f27886b == f4Var) {
                    rgVar.f27886b = null;
                    return;
                }
                return;
            case 1:
                this.f27205b.removeView(this.f27206c);
                return;
            case 2:
                this.f27205b.removeView(this.f27206c);
                return;
            default:
                rg rgVar2 = this.f27205b;
                ci.f4 f4Var2 = this.f27206c;
                rgVar2.removeView(f4Var2);
                if (rgVar2.f27885a == f4Var2) {
                    rgVar2.f27885a = null;
                    return;
                }
                return;
        }
    }
}
