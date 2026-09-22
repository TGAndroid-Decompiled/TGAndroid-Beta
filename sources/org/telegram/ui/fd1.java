package org.telegram.ui;
public final class fd1 extends wd1 {
    public final bo f33572k2;
    public final boolean f33573l2;

    public fd1(Object obj, bo boVar, boolean z10) {
        super(obj, null, true);
        this.f33572k2 = boVar;
        this.f33573l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        zn znVar = this.f33572k2.f32293ea;
        znVar.i(znVar.f40237f, znVar.h, false, Boolean.valueOf(this.f33573l2), false);
    }
}
