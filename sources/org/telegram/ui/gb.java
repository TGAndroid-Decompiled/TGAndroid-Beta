package org.telegram.ui;
public final class gb extends org.telegram.ui.ActionBar.p1 {
    public final wb f33052o;

    public gb(wb wbVar, fb fbVar) {
        super(fbVar, -2, -2);
        this.f33052o = wbVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        wb wbVar = this.f33052o;
        if (wbVar.J0 != this) {
            return;
        }
        org.telegram.ui.Components.pc.e();
        wbVar.J0 = null;
    }
}
