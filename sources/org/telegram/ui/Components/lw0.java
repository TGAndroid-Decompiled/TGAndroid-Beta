package org.telegram.ui.Components;
public final class lw0 extends s60 {
    public final nw0 d;

    public lw0(nw0 nw0Var) {
        this.d = nw0Var;
    }

    @Override
    public final CharSequence d() {
        nw0 nw0Var = this.d;
        int i10 = nw0Var.I;
        String[] strArr = nw0Var.F;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    @Override
    public final int i() {
        return this.d.F.length - 1;
    }

    @Override
    public final int j() {
        return this.d.I;
    }

    @Override
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
