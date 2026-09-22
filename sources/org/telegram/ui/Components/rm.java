package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class rm implements Utilities.Callback {
    public final int f27649a;
    public final un f27650b;
    public final int f27651c;

    public rm(un unVar, int i10, int i11) {
        this.f27649a = i11;
        this.f27650b = unVar;
        this.f27651c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27649a) {
            case 0:
                this.f27650b.e0(this.f27651c, (qh.e) obj);
                return;
            default:
                un unVar = this.f27650b;
                unVar.getClass();
                unVar.e0(this.f27651c, new rh.e((String) obj));
                return;
        }
    }
}
