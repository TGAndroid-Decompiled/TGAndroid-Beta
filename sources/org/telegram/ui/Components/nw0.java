package org.telegram.ui.Components;
public final class nw0 extends l60 {
    public final pw0 d;

    public nw0(pw0 pw0Var) {
        this.d = pw0Var;
    }

    @Override
    public final CharSequence d() {
        pw0 pw0Var = this.d;
        int i10 = pw0Var.I;
        String[] strArr = pw0Var.F;
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
