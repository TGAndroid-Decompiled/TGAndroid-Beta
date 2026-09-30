package org.telegram.ui.Components;
public final class fw0 extends l60 {
    public final hw0 d;

    public fw0(hw0 hw0Var) {
        this.d = hw0Var;
    }

    @Override
    public final CharSequence d() {
        hw0 hw0Var = this.d;
        int i10 = hw0Var.I;
        String[] strArr = hw0Var.F;
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
