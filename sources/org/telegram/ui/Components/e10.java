package org.telegram.ui.Components;
public final class e10 extends wg.b {
    public final int f25609s;

    public e10(int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, p6Var);
        this.f25609s = 0;
    }

    @Override
    public int E() {
        switch (this.f25609s) {
            case 0:
                if (c()) {
                    return 301989887;
                }
                return 536870912;
            default:
                return super.E();
        }
    }

    @Override
    public boolean c() {
        switch (this.f25609s) {
            case 1:
                return true;
            case 2:
                return true;
            default:
                return super.c();
        }
    }

    @Override
    public int j0() {
        switch (this.f25609s) {
            case 0:
                if (c()) {
                    return 83886079;
                }
                return 536870912;
            default:
                return super.j0();
        }
    }

    @Override
    public int u() {
        switch (this.f25609s) {
            case 0:
                if (c()) {
                    return 117440511;
                }
                return 285212672;
            default:
                return super.u();
        }
    }

    public e10(org.telegram.ui.ActionBar.p6 p6Var, int i10, float f7, int i11) {
        super(p6Var, i10, f7);
        this.f25609s = i11;
    }
}
