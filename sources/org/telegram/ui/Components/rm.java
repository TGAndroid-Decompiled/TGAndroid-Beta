package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class rm implements Utilities.Callback {
    public final int f27652a;
    public final un f27653b;
    public final int f27654c;

    public rm(un unVar, int i10, int i11) {
        this.f27652a = i11;
        this.f27653b = unVar;
        this.f27654c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27652a) {
            case 0:
                this.f27653b.e0(this.f27654c, (qh.e) obj);
                return;
            default:
                un unVar = this.f27653b;
                unVar.getClass();
                unVar.e0(this.f27654c, new rh.e((String) obj));
                return;
        }
    }
}
