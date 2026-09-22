package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class rm implements Utilities.Callback {
    public final int f28011a;
    public final un f28012b;
    public final int f28013c;

    public rm(un unVar, int i10, int i11) {
        this.f28011a = i11;
        this.f28012b = unVar;
        this.f28013c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28011a) {
            case 0:
                this.f28012b.e0(this.f28013c, (qh.e) obj);
                return;
            default:
                un unVar = this.f28012b;
                unVar.getClass();
                unVar.e0(this.f28013c, new rh.e((String) obj));
                return;
        }
    }
}
