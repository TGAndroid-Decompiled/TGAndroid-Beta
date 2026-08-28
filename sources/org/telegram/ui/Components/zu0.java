package org.telegram.ui.Components;
public final class zu0 extends g50 {
    public final bv0 d;

    public zu0(bv0 bv0Var) {
        this.d = bv0Var;
    }

    @Override
    public final CharSequence d() {
        bv0 bv0Var = this.d;
        int i9 = bv0Var.E;
        String[] strArr = bv0Var.B;
        if (i9 < strArr.length) {
            return strArr[i9];
        }
        return null;
    }

    @Override
    public final int i() {
        return this.d.B.length - 1;
    }

    @Override
    public final int j() {
        return this.d.E;
    }

    @Override
    public final void k(int i9) {
        this.d.setOption(i9);
    }
}
