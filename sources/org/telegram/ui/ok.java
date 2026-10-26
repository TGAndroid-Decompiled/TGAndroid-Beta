package org.telegram.ui;
public final class ok extends org.telegram.ui.Components.pl0 {
    public final un f42237l;

    public ok(un unVar, oj ojVar, rj rjVar) {
        super(ojVar, rjVar);
        this.f42237l = unVar;
    }

    public final void e(int i10) {
        if (this.f42237l.f44218cb) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.f31597b = i10;
    }
}
