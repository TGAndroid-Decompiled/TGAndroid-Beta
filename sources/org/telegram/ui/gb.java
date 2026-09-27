package org.telegram.ui;
public final class gb extends org.telegram.ui.ActionBar.o1 {
    public final wb f33894o;

    public gb(wb wbVar, fb fbVar) {
        super(fbVar, -2, -2);
        this.f33894o = wbVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        wb wbVar = this.f33894o;
        if (wbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.qc.e();
        wbVar.F0 = null;
    }
}
