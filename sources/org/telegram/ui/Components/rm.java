package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class rm implements Utilities.Callback {
    public final int f27922a;
    public final un f27923b;
    public final int f27924c;

    public rm(un unVar, int i10, int i11) {
        this.f27922a = i11;
        this.f27923b = unVar;
        this.f27924c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27922a) {
            case 0:
                this.f27923b.e0(this.f27924c, (qh.e) obj);
                return;
            default:
                un unVar = this.f27923b;
                unVar.getClass();
                unVar.e0(this.f27924c, new rh.e((String) obj));
                return;
        }
    }
}
