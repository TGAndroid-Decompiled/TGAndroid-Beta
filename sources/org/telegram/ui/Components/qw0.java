package org.telegram.ui.Components;
public final class qw0 extends v60 {
    public final sw0 d;

    public qw0(sw0 sw0Var) {
        this.d = sw0Var;
    }

    @Override
    public final CharSequence d() {
        sw0 sw0Var = this.d;
        int i10 = sw0Var.I;
        String[] strArr = sw0Var.F;
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
