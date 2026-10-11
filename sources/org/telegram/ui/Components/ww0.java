package org.telegram.ui.Components;
public final class ww0 extends a70 {
    public final yw0 d;

    public ww0(yw0 yw0Var) {
        this.d = yw0Var;
    }

    @Override
    public final CharSequence d() {
        yw0 yw0Var = this.d;
        int i10 = yw0Var.I;
        String[] strArr = yw0Var.F;
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
