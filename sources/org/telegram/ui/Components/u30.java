package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class u30 extends org.telegram.ui.oq0 {
    public final ArrayList f40218a;
    public final x30 f40219b;

    public u30(x30 x30Var, ArrayList arrayList) {
        this.f40219b = x30Var;
        this.f40218a = arrayList;
    }

    @Override
    public final org.telegram.ui.wq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        w30 w30Var = this.f40219b.f41959b;
        if (w30Var == null) {
            return null;
        }
        return w30Var.getCloseIntoObject();
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        this.f40219b.s((org.telegram.messenger.ff) this.f40218a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
