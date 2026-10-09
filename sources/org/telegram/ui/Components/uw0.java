package org.telegram.ui.Components;
public final class uw0 extends z60 {
    public final ww0 d;

    public uw0(ww0 ww0Var) {
        this.d = ww0Var;
    }

    @Override
    public final CharSequence d() {
        ww0 ww0Var = this.d;
        int i10 = ww0Var.I;
        String[] strArr = ww0Var.F;
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
