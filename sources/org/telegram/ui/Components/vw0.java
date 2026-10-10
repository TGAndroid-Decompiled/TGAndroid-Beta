package org.telegram.ui.Components;
public final class vw0 extends a70 {
    public final xw0 d;

    public vw0(xw0 xw0Var) {
        this.d = xw0Var;
    }

    @Override
    public final CharSequence d() {
        xw0 xw0Var = this.d;
        int i10 = xw0Var.I;
        String[] strArr = xw0Var.F;
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
