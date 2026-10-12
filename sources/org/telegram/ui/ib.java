package org.telegram.ui;
public final class ib extends org.telegram.ui.ActionBar.m1 {
    public final yb f38836o;

    public ib(yb ybVar, hb hbVar) {
        super(hbVar, -2, -2);
        this.f38836o = ybVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        yb ybVar = this.f38836o;
        if (ybVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.sc.e();
        ybVar.F0 = null;
    }
}
