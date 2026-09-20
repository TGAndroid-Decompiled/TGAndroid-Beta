package org.telegram.ui.Components;
public final class pg implements Runnable {
    public final int f27293a;
    public final rg f27294b;
    public final ci.f4 f27295c;

    public pg(rg rgVar, ci.f4 f4Var, int i10) {
        this.f27293a = i10;
        this.f27294b = rgVar;
        this.f27295c = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f27293a) {
            case 0:
                rg rgVar = this.f27294b;
                ci.f4 f4Var = this.f27295c;
                rgVar.removeView(f4Var);
                if (rgVar.f27892b == f4Var) {
                    rgVar.f27892b = null;
                    return;
                }
                return;
            case 1:
                this.f27294b.removeView(this.f27295c);
                return;
            case 2:
                this.f27294b.removeView(this.f27295c);
                return;
            default:
                rg rgVar2 = this.f27294b;
                ci.f4 f4Var2 = this.f27295c;
                rgVar2.removeView(f4Var2);
                if (rgVar2.f27891a == f4Var2) {
                    rgVar2.f27891a = null;
                    return;
                }
                return;
        }
    }
}
