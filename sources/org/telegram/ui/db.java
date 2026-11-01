package org.telegram.ui;
public final class db extends org.telegram.ui.ActionBar.k1 {
    public final sb f36548o;

    public db(sb sbVar, cb cbVar) {
        super(cbVar, -2, -2);
        this.f36548o = sbVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        sb sbVar = this.f36548o;
        if (sbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.wb.e();
        sbVar.F0 = null;
    }
}
