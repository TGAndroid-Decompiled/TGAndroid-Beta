package org.telegram.ui.Components;
public final class z10 extends qg.b {
    public final int f31224n;

    public z10(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, f6Var);
        this.f31224n = 0;
    }

    @Override
    public int D() {
        switch (this.f31224n) {
            case 0:
                if (a()) {
                    return 301989887;
                }
                return 536870912;
            default:
                return super.D();
        }
    }

    @Override
    public boolean a() {
        switch (this.f31224n) {
            case 1:
                return true;
            case 2:
                return true;
            default:
                return super.a();
        }
    }

    @Override
    public int e0() {
        switch (this.f31224n) {
            case 0:
                if (a()) {
                    return 83886079;
                }
                return 536870912;
            default:
                return super.e0();
        }
    }

    @Override
    public int x() {
        switch (this.f31224n) {
            case 0:
                if (a()) {
                    return 117440511;
                }
                return 285212672;
            default:
                return super.x();
        }
    }

    public z10(org.telegram.ui.ActionBar.f6 f6Var, int i10, float f10, int i11) {
        super(f6Var, i10, f10);
        this.f31224n = i11;
    }
}
