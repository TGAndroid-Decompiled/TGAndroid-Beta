package org.telegram.ui.Components;
public final class xw0 extends u60 {
    public final zw0 d;

    public xw0(zw0 zw0Var) {
        this.d = zw0Var;
    }

    @Override
    public final CharSequence d() {
        zw0 zw0Var = this.d;
        int i10 = zw0Var.I;
        String[] strArr = zw0Var.F;
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
