package org.telegram.ui;
public final class gb extends org.telegram.ui.ActionBar.n1 {
    public final wb f36583o;

    public gb(wb wbVar, fb fbVar) {
        super(fbVar, -2, -2);
        this.f36583o = wbVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        wb wbVar = this.f36583o;
        if (wbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.rc.e();
        wbVar.F0 = null;
    }
}
