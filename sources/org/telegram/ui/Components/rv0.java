package org.telegram.ui.Components;
public final class rv0 extends x50 {
    public final tv0 d;

    public rv0(tv0 tv0Var) {
        this.d = tv0Var;
    }

    @Override
    public final CharSequence d() {
        tv0 tv0Var = this.d;
        int i10 = tv0Var.I;
        String[] strArr = tv0Var.F;
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
