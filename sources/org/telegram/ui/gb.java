package org.telegram.ui;
public final class gb extends org.telegram.ui.ActionBar.n1 {
    public final wb f36547o;

    public gb(wb wbVar, fb fbVar) {
        super(fbVar, -2, -2);
        this.f36547o = wbVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        wb wbVar = this.f36547o;
        if (wbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.rc.e();
        wbVar.F0 = null;
    }
}
