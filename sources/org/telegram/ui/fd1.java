package org.telegram.ui;
public final class fd1 extends wd1 {
    public final zn f37645k2;
    public final boolean f37646l2;

    public fd1(Object obj, zn znVar, boolean z10) {
        super(obj, null, true);
        this.f37645k2 = znVar;
        this.f37646l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        xn xnVar = this.f37645k2.f44762ea;
        xnVar.i(xnVar.f44115f, xnVar.h, false, Boolean.valueOf(this.f37646l2), false);
    }
}
