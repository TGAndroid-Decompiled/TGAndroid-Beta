package org.telegram.ui.Components;
public final class qv0 extends x50 {
    public final sv0 d;

    public qv0(sv0 sv0Var) {
        this.d = sv0Var;
    }

    @Override
    public final CharSequence d() {
        sv0 sv0Var = this.d;
        int i10 = sv0Var.I;
        String[] strArr = sv0Var.F;
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
