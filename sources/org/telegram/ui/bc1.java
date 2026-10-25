package org.telegram.ui;
public final class bc1 extends tc1 {
    public final un f38030l2;
    public final boolean f38031m2;

    public bc1(Object obj, un unVar, boolean z10) {
        super(obj, null, true);
        this.f38030l2 = unVar;
        this.f38031m2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        sn snVar = this.f38030l2.f44385qa;
        snVar.q(snVar.f43542f, snVar.f43543g, false, Boolean.valueOf(this.f38031m2), false);
    }
}
