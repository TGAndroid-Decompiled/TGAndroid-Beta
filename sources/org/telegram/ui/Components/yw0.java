package org.telegram.ui.Components;
public final class yw0 extends v60 {
    public final ax0 d;

    public yw0(ax0 ax0Var) {
        this.d = ax0Var;
    }

    @Override
    public final CharSequence d() {
        ax0 ax0Var = this.d;
        int i10 = ax0Var.I;
        String[] strArr = ax0Var.F;
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
