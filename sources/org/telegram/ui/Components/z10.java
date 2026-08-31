package org.telegram.ui.Components;
public final class z10 extends rg.b {
    public final int f33691n;

    public z10(int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, g6Var);
        this.f33691n = 0;
    }

    @Override
    public int I() {
        switch (this.f33691n) {
            case 0:
                if (a()) {
                    return 83886079;
                }
                return 536870912;
            default:
                return super.I();
        }
    }

    @Override
    public boolean a() {
        switch (this.f33691n) {
            case 1:
                return true;
            case 2:
                return true;
            default:
                return super.a();
        }
    }

    @Override
    public int k() {
        switch (this.f33691n) {
            case 0:
                if (a()) {
                    return 117440511;
                }
                return 285212672;
            default:
                return super.k();
        }
    }

    @Override
    public int x() {
        switch (this.f33691n) {
            case 0:
                if (a()) {
                    return 301989887;
                }
                return 536870912;
            default:
                return super.x();
        }
    }

    public z10(org.telegram.ui.ActionBar.g6 g6Var, int i10, float f10, int i11) {
        super(g6Var, i10, f10);
        this.f33691n = i11;
    }
}
