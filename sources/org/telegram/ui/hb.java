package org.telegram.ui;
public final class hb extends org.telegram.ui.ActionBar.m1 {
    public final xb f37511o;

    public hb(xb xbVar, gb gbVar) {
        super(gbVar, -2, -2);
        this.f37511o = xbVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        xb xbVar = this.f37511o;
        if (xbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.qc.e();
        xbVar.F0 = null;
    }
}
