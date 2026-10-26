package org.telegram.ui;
public final class bc1 extends tc1 {
    public final un f38033l2;
    public final boolean f38034m2;

    public bc1(Object obj, un unVar, boolean z10) {
        super(obj, null, true);
        this.f38033l2 = unVar;
        this.f38034m2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        sn snVar = this.f38033l2.f44388qa;
        snVar.q(snVar.f43545f, snVar.f43546g, false, Boolean.valueOf(this.f38034m2), false);
    }
}
