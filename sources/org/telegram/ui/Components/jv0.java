package org.telegram.ui.Components;
public final class jv0 extends t50 {
    public final lv0 d;

    public jv0(lv0 lv0Var) {
        this.d = lv0Var;
    }

    @Override
    public final CharSequence d() {
        lv0 lv0Var = this.d;
        int i10 = lv0Var.E;
        String[] strArr = lv0Var.B;
        if (i10 < strArr.length) {
            return strArr[i10];
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
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
