package org.telegram.ui;
public final class jb extends org.telegram.ui.ActionBar.m1 {
    public final ac f37337o;

    public jb(ac acVar, ib ibVar) {
        super(ibVar, -2, -2);
        this.f37337o = acVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ac acVar = this.f37337o;
        if (acVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.sc.e();
        acVar.F0 = null;
    }
}
