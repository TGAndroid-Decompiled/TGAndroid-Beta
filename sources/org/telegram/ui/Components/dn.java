package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class dn implements Utilities.Callback {
    public final int f27564a;
    public final go f27565b;
    public final int f27566c;

    public dn(go goVar, int i10, int i11) {
        this.f27564a = i11;
        this.f27565b = goVar;
        this.f27566c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27564a) {
            case 0:
                this.f27565b.h0(this.f27566c, (sh.e) obj);
                return;
            default:
                go goVar = this.f27565b;
                goVar.getClass();
                goVar.h0(this.f27566c, new th.e((String) obj));
                return;
        }
    }
}
