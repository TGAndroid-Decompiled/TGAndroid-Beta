package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class j30 extends org.telegram.ui.mq0 {
    public final ArrayList f35847a;
    public final m30 f35848b;

    public j30(m30 m30Var, ArrayList arrayList) {
        this.f35848b = m30Var;
        this.f35847a = arrayList;
    }

    @Override
    public final org.telegram.ui.uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        l30 l30Var = this.f35848b.f37041b;
        if (l30Var == null) {
            return null;
        }
        return l30Var.getCloseIntoObject();
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        this.f35848b.s((org.telegram.messenger.ff) this.f35847a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
