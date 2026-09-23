package org.telegram.ui.Components;
public final class pg implements Runnable {
    public final int f27021a;
    public final rg f27022b;
    public final ci.e4 f27023c;

    public pg(rg rgVar, ci.e4 e4Var, int i10) {
        this.f27021a = i10;
        this.f27022b = rgVar;
        this.f27023c = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f27021a) {
            case 0:
                rg rgVar = this.f27022b;
                ci.e4 e4Var = this.f27023c;
                rgVar.removeView(e4Var);
                if (rgVar.f27617b == e4Var) {
                    rgVar.f27617b = null;
                    return;
                }
                return;
            case 1:
                this.f27022b.removeView(this.f27023c);
                return;
            case 2:
                this.f27022b.removeView(this.f27023c);
                return;
            default:
                rg rgVar2 = this.f27022b;
                ci.e4 e4Var2 = this.f27023c;
                rgVar2.removeView(e4Var2);
                if (rgVar2.f27616a == e4Var2) {
                    rgVar2.f27616a = null;
                    return;
                }
                return;
        }
    }
}
