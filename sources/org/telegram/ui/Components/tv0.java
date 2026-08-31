package org.telegram.ui.Components;
public final class tv0 extends a60 {
    public final vv0 d;

    public tv0(vv0 vv0Var) {
        this.d = vv0Var;
    }

    @Override
    public final CharSequence d() {
        vv0 vv0Var = this.d;
        int i10 = vv0Var.F;
        String[] strArr = vv0Var.C;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    @Override
    public final int i() {
        return this.d.C.length - 1;
    }

    @Override
    public final int j() {
        return this.d.F;
    }

    @Override
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
