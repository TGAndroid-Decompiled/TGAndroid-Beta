package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class rm implements Utilities.Callback {
    public final int f27647a;
    public final un f27648b;
    public final int f27649c;

    public rm(un unVar, int i10, int i11) {
        this.f27647a = i11;
        this.f27648b = unVar;
        this.f27649c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27647a) {
            case 0:
                this.f27648b.e0(this.f27649c, (qh.e) obj);
                return;
            default:
                un unVar = this.f27648b;
                unVar.getClass();
                unVar.e0(this.f27649c, new rh.e((String) obj));
                return;
        }
    }
}
