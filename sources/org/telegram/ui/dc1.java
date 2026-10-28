package org.telegram.ui;
public final class dc1 extends vc1 {
    public final wn f38584l2;
    public final boolean f38585m2;

    public dc1(Object obj, wn wnVar, boolean z10) {
        super(obj, null, true);
        this.f38584l2 = wnVar;
        this.f38585m2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        un unVar = this.f38584l2.f45309ua;
        unVar.q(unVar.f44059f, unVar.f44060g, false, Boolean.valueOf(this.f38585m2), false);
    }
}
