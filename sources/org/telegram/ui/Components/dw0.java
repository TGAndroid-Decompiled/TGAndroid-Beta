package org.telegram.ui.Components;
public final class dw0 extends g60 {
    public final fw0 d;

    public dw0(fw0 fw0Var) {
        this.d = fw0Var;
    }

    @Override
    public final CharSequence d() {
        fw0 fw0Var = this.d;
        int i10 = fw0Var.I;
        String[] strArr = fw0Var.F;
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
