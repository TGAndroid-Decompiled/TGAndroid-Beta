package org.telegram.ui.Components;
public final class ow0 extends l60 {
    public final qw0 d;

    public ow0(qw0 qw0Var) {
        this.d = qw0Var;
    }

    @Override
    public final CharSequence d() {
        qw0 qw0Var = this.d;
        int i10 = qw0Var.I;
        String[] strArr = qw0Var.F;
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
