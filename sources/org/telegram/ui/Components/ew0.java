package org.telegram.ui.Components;
public final class ew0 extends i60 {
    public final gw0 d;

    public ew0(gw0 gw0Var) {
        this.d = gw0Var;
    }

    @Override
    public final CharSequence d() {
        gw0 gw0Var = this.d;
        int i10 = gw0Var.I;
        String[] strArr = gw0Var.F;
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
