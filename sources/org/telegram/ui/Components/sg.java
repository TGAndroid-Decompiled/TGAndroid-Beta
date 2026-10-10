package org.telegram.ui.Components;
public final class sg implements Runnable {
    public final int f30779a;
    public final ug f30780b;
    public final ci.d4 f30781c;

    public sg(ug ugVar, ci.d4 d4Var, int i10) {
        this.f30779a = i10;
        this.f30780b = ugVar;
        this.f30781c = d4Var;
    }

    @Override
    public final void run() {
        switch (this.f30779a) {
            case 0:
                ug ugVar = this.f30780b;
                ci.d4 d4Var = this.f30781c;
                ugVar.removeView(d4Var);
                if (ugVar.f31494b == d4Var) {
                    ugVar.f31494b = null;
                    return;
                }
                return;
            case 1:
                this.f30780b.removeView(this.f30781c);
                return;
            case 2:
                this.f30780b.removeView(this.f30781c);
                return;
            default:
                ug ugVar2 = this.f30780b;
                ci.d4 d4Var2 = this.f30781c;
                ugVar2.removeView(d4Var2);
                if (ugVar2.f31493a == d4Var2) {
                    ugVar2.f31493a = null;
                    return;
                }
                return;
        }
    }
}
