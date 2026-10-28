package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class dn implements Utilities.Callback {
    public final int f27486a;
    public final go f27487b;
    public final int f27488c;

    public dn(go goVar, int i10, int i11) {
        this.f27486a = i11;
        this.f27487b = goVar;
        this.f27488c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27486a) {
            case 0:
                this.f27487b.h0(this.f27488c, (sh.e) obj);
                return;
            default:
                go goVar = this.f27487b;
                goVar.getClass();
                goVar.h0(this.f27488c, new th.e((String) obj));
                return;
        }
    }
}
