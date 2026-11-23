package org.telegram.ui.Components;
public final class pg implements Runnable {
    public final int f38590a;
    public final rg f38591b;
    public final hi.l3 f38592c;

    public pg(rg rgVar, hi.l3 l3Var, int i7) {
        this.f38590a = i7;
        this.f38591b = rgVar;
        this.f38592c = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f38590a) {
            case 0:
                rg rgVar = this.f38591b;
                hi.l3 l3Var = this.f38592c;
                rgVar.removeView(l3Var);
                if (rgVar.f39191b == l3Var) {
                    rgVar.f39191b = null;
                    return;
                }
                return;
            case 1:
                this.f38591b.removeView(this.f38592c);
                return;
            case 2:
                this.f38591b.removeView(this.f38592c);
                return;
            default:
                rg rgVar2 = this.f38591b;
                hi.l3 l3Var2 = this.f38592c;
                rgVar2.removeView(l3Var2);
                if (rgVar2.f39189a == l3Var2) {
                    rgVar2.f39189a = null;
                    return;
                }
                return;
        }
    }
}
