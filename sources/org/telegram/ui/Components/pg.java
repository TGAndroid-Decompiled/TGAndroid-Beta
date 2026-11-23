package org.telegram.ui.Components;
public final class pg implements Runnable {
    public final int f38591a;
    public final rg f38592b;
    public final hi.l3 f38593c;

    public pg(rg rgVar, hi.l3 l3Var, int i7) {
        this.f38591a = i7;
        this.f38592b = rgVar;
        this.f38593c = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f38591a) {
            case 0:
                rg rgVar = this.f38592b;
                hi.l3 l3Var = this.f38593c;
                rgVar.removeView(l3Var);
                if (rgVar.f39192b == l3Var) {
                    rgVar.f39192b = null;
                    return;
                }
                return;
            case 1:
                this.f38592b.removeView(this.f38593c);
                return;
            case 2:
                this.f38592b.removeView(this.f38593c);
                return;
            default:
                rg rgVar2 = this.f38592b;
                hi.l3 l3Var2 = this.f38593c;
                rgVar2.removeView(l3Var2);
                if (rgVar2.f39190a == l3Var2) {
                    rgVar2.f39190a = null;
                    return;
                }
                return;
        }
    }
}
