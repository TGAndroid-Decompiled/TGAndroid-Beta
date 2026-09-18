package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class rm implements Utilities.Callback {
    public final int f27929a;
    public final un f27930b;
    public final int f27931c;

    public rm(un unVar, int i10, int i11) {
        this.f27929a = i11;
        this.f27930b = unVar;
        this.f27931c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27929a) {
            case 0:
                this.f27930b.e0(this.f27931c, (qh.e) obj);
                return;
            default:
                un unVar = this.f27930b;
                unVar.getClass();
                unVar.e0(this.f27931c, new rh.e((String) obj));
                return;
        }
    }
}
