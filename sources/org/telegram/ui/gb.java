package org.telegram.ui;
public final class gb extends org.telegram.ui.ActionBar.n1 {
    public final wb f36546o;

    public gb(wb wbVar, fb fbVar) {
        super(fbVar, -2, -2);
        this.f36546o = wbVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        wb wbVar = this.f36546o;
        if (wbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.rc.e();
        wbVar.F0 = null;
    }
}
