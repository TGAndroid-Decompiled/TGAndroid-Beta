package org.telegram.ui.Components;
public final class cw0 extends g60 {
    public final ew0 d;

    public cw0(ew0 ew0Var) {
        this.d = ew0Var;
    }

    @Override
    public final CharSequence d() {
        ew0 ew0Var = this.d;
        int i10 = ew0Var.I;
        String[] strArr = ew0Var.F;
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
