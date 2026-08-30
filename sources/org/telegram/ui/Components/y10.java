package org.telegram.ui.Components;
public final class y10 extends qg.b {
    public final int f30822n;

    public y10(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, f6Var);
        this.f30822n = 0;
    }

    @Override
    public int W1() {
        switch (this.f30822n) {
            case 0:
                if (a()) {
                    return 83886079;
                }
                return 536870912;
            default:
                return super.W1();
        }
    }

    @Override
    public int X0() {
        switch (this.f30822n) {
            case 0:
                if (a()) {
                    return 301989887;
                }
                return 536870912;
            default:
                return super.X0();
        }
    }

    @Override
    public boolean a() {
        switch (this.f30822n) {
            case 1:
                return true;
            case 2:
                return true;
            default:
                return super.a();
        }
    }

    @Override
    public int x0() {
        switch (this.f30822n) {
            case 0:
                if (a()) {
                    return 117440511;
                }
                return 285212672;
            default:
                return super.x0();
        }
    }

    public y10(org.telegram.ui.ActionBar.f6 f6Var, int i10, float f10, int i11) {
        super(f6Var, i10, f10);
        this.f30822n = i11;
    }
}
