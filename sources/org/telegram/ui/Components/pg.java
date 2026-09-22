package org.telegram.ui.Components;
public final class pg implements Runnable {
    public final int f27347a;
    public final rg f27348b;
    public final ci.f4 f27349c;

    public pg(rg rgVar, ci.f4 f4Var, int i10) {
        this.f27347a = i10;
        this.f27348b = rgVar;
        this.f27349c = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f27347a) {
            case 0:
                rg rgVar = this.f27348b;
                ci.f4 f4Var = this.f27349c;
                rgVar.removeView(f4Var);
                if (rgVar.f27949b == f4Var) {
                    rgVar.f27949b = null;
                    return;
                }
                return;
            case 1:
                this.f27348b.removeView(this.f27349c);
                return;
            case 2:
                this.f27348b.removeView(this.f27349c);
                return;
            default:
                rg rgVar2 = this.f27348b;
                ci.f4 f4Var2 = this.f27349c;
                rgVar2.removeView(f4Var2);
                if (rgVar2.f27948a == f4Var2) {
                    rgVar2.f27948a = null;
                    return;
                }
                return;
        }
    }
}
