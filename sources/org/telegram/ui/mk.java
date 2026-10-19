package org.telegram.ui;
public final class mk extends org.telegram.ui.Components.ll0 {
    public final qn f39302l;

    public mk(qn qnVar, nj njVar, qj qjVar) {
        super(njVar, qjVar);
        this.f39302l = qnVar;
    }

    public final void e(int i10) {
        if (this.f39302l.Qa) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.f28244b = i10;
    }
}
