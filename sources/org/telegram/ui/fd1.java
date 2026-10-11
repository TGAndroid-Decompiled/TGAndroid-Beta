package org.telegram.ui;
public final class fd1 extends wd1 {
    public final zn f37679k2;
    public final boolean f37680l2;

    public fd1(Object obj, zn znVar, boolean z10) {
        super(obj, null, true);
        this.f37679k2 = znVar;
        this.f37680l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        xn xnVar = this.f37679k2.f44796ea;
        xnVar.i(xnVar.f44149f, xnVar.h, false, Boolean.valueOf(this.f37680l2), false);
    }
}
