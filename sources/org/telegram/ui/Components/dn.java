package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class dn implements Utilities.Callback {
    public final int f27566a;
    public final go f27567b;
    public final int f27568c;

    public dn(go goVar, int i10, int i11) {
        this.f27566a = i11;
        this.f27567b = goVar;
        this.f27568c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27566a) {
            case 0:
                this.f27567b.h0(this.f27568c, (sh.e) obj);
                return;
            default:
                go goVar = this.f27567b;
                goVar.getClass();
                goVar.h0(this.f27568c, new th.e((String) obj));
                return;
        }
    }
}
