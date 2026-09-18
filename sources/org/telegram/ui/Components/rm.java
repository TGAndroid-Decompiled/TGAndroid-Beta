package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class rm implements Utilities.Callback {
    public final int f27650a;
    public final un f27651b;
    public final int f27652c;

    public rm(un unVar, int i10, int i11) {
        this.f27650a = i11;
        this.f27651b = unVar;
        this.f27652c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27650a) {
            case 0:
                this.f27651b.e0(this.f27652c, (qh.e) obj);
                return;
            default:
                un unVar = this.f27651b;
                unVar.getClass();
                unVar.e0(this.f27652c, new rh.e((String) obj));
                return;
        }
    }
}
