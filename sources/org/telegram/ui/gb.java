package org.telegram.ui;
public final class gb extends org.telegram.ui.ActionBar.o1 {
    public final wb f33940o;

    public gb(wb wbVar, fb fbVar) {
        super(fbVar, -2, -2);
        this.f33940o = wbVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        wb wbVar = this.f33940o;
        if (wbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.oc.e();
        wbVar.F0 = null;
    }
}
