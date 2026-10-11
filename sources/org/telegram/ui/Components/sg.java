package org.telegram.ui.Components;
public final class sg implements Runnable {
    public final int f30859a;
    public final ug f30860b;
    public final ci.d4 f30861c;

    public sg(ug ugVar, ci.d4 d4Var, int i10) {
        this.f30859a = i10;
        this.f30860b = ugVar;
        this.f30861c = d4Var;
    }

    @Override
    public final void run() {
        switch (this.f30859a) {
            case 0:
                ug ugVar = this.f30860b;
                ci.d4 d4Var = this.f30861c;
                ugVar.removeView(d4Var);
                if (ugVar.f31576b == d4Var) {
                    ugVar.f31576b = null;
                    return;
                }
                return;
            case 1:
                this.f30860b.removeView(this.f30861c);
                return;
            case 2:
                this.f30860b.removeView(this.f30861c);
                return;
            default:
                ug ugVar2 = this.f30860b;
                ci.d4 d4Var2 = this.f30861c;
                ugVar2.removeView(d4Var2);
                if (ugVar2.f31575a == d4Var2) {
                    ugVar2.f31575a = null;
                    return;
                }
                return;
        }
    }
}
