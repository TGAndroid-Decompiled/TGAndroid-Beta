package org.telegram.ui.Components;
public final class pw0 extends r60 {
    public final rw0 d;

    public pw0(rw0 rw0Var) {
        this.d = rw0Var;
    }

    @Override
    public final CharSequence d() {
        rw0 rw0Var = this.d;
        int i10 = rw0Var.I;
        String[] strArr = rw0Var.F;
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
