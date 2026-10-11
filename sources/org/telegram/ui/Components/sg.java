package org.telegram.ui.Components;
public final class sg implements Runnable {
    public final int f30744a;
    public final ug f30745b;
    public final ci.d4 f30746c;

    public sg(ug ugVar, ci.d4 d4Var, int i10) {
        this.f30744a = i10;
        this.f30745b = ugVar;
        this.f30746c = d4Var;
    }

    @Override
    public final void run() {
        switch (this.f30744a) {
            case 0:
                ug ugVar = this.f30745b;
                ci.d4 d4Var = this.f30746c;
                ugVar.removeView(d4Var);
                if (ugVar.f31426b == d4Var) {
                    ugVar.f31426b = null;
                    return;
                }
                return;
            case 1:
                this.f30745b.removeView(this.f30746c);
                return;
            case 2:
                this.f30745b.removeView(this.f30746c);
                return;
            default:
                ug ugVar2 = this.f30745b;
                ci.d4 d4Var2 = this.f30746c;
                ugVar2.removeView(d4Var2);
                if (ugVar2.f31425a == d4Var2) {
                    ugVar2.f31425a = null;
                    return;
                }
                return;
        }
    }
}
