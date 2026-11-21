package org.telegram.ui.Components;
public final class pg implements Runnable {
    public final int f38592a;
    public final rg f38593b;
    public final hi.l3 f38594c;

    public pg(rg rgVar, hi.l3 l3Var, int i7) {
        this.f38592a = i7;
        this.f38593b = rgVar;
        this.f38594c = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f38592a) {
            case 0:
                rg rgVar = this.f38593b;
                hi.l3 l3Var = this.f38594c;
                rgVar.removeView(l3Var);
                if (rgVar.f39182b == l3Var) {
                    rgVar.f39182b = null;
                    return;
                }
                return;
            case 1:
                this.f38593b.removeView(this.f38594c);
                return;
            case 2:
                this.f38593b.removeView(this.f38594c);
                return;
            default:
                rg rgVar2 = this.f38593b;
                hi.l3 l3Var2 = this.f38594c;
                rgVar2.removeView(l3Var2);
                if (rgVar2.f39180a == l3Var2) {
                    rgVar2.f39180a = null;
                    return;
                }
                return;
        }
    }
}
