package org.telegram.ui.Components;
public final class ax0 extends c70 {
    public final cx0 d;

    public ax0(cx0 cx0Var) {
        this.d = cx0Var;
    }

    @Override
    public final CharSequence d() {
        cx0 cx0Var = this.d;
        int i10 = cx0Var.I;
        String[] strArr = cx0Var.F;
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
