package org.telegram.ui;
public final class gb extends org.telegram.ui.ActionBar.o1 {
    public final wb f39600o;

    public gb(wb wbVar, fb fbVar) {
        super(fbVar, -2, -2);
        this.f39600o = wbVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        wb wbVar = this.f39600o;
        if (wbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.qc.e();
        wbVar.F0 = null;
    }
}
