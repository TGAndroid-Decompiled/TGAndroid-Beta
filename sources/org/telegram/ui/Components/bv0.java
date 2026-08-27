package org.telegram.ui.Components;

public final class bv0 extends l50 {
    public final dv0 d;

    public bv0(dv0 dv0Var) {
        this.d = dv0Var;
    }

    @Override
    public final CharSequence d() {
        dv0 dv0Var = this.d;
        int i10 = dv0Var.E;
        String[] strArr = dv0Var.B;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    @Override
    public final int i() {
        return this.d.B.length - 1;
    }

    @Override
    public final int j() {
        return this.d.E;
    }

    @Override
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
