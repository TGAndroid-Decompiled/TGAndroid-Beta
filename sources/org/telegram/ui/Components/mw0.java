package org.telegram.ui.Components;
public final class mw0 extends s60 {
    public final ow0 d;

    public mw0(ow0 ow0Var) {
        this.d = ow0Var;
    }

    @Override
    public final CharSequence d() {
        ow0 ow0Var = this.d;
        int i10 = ow0Var.I;
        String[] strArr = ow0Var.F;
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
