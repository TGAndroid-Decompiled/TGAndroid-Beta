package org.telegram.ui;
public final class ok extends org.telegram.ui.Components.ll0 {
    public final sn f39819l;

    public ok(sn snVar, pj pjVar, sj sjVar) {
        super(pjVar, sjVar);
        this.f39819l = snVar;
    }

    public final void e(int i10) {
        if (this.f39819l.Qa) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.f28257b = i10;
    }
}
