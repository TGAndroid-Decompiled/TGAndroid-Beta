package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class h30 extends org.telegram.ui.pq0 {
    public final ArrayList f34164a;
    public final k30 f34165b;

    public h30(k30 k30Var, ArrayList arrayList) {
        this.f34165b = k30Var;
        this.f34164a = arrayList;
    }

    @Override
    public final org.telegram.ui.yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        j30 j30Var = this.f34165b.f35219b;
        if (j30Var == null) {
            return null;
        }
        return j30Var.getCloseIntoObject();
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        this.f34165b.s((org.telegram.messenger.gf) this.f34164a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
