package org.telegram.ui.Components;
public final class sv0 extends x50 {
    public final uv0 d;

    public sv0(uv0 uv0Var) {
        this.d = uv0Var;
    }

    @Override
    public final CharSequence d() {
        uv0 uv0Var = this.d;
        int i10 = uv0Var.I;
        String[] strArr = uv0Var.F;
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
