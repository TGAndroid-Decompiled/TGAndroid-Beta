package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class g30 extends org.telegram.ui.nq0 {
    public final ArrayList f33744a;
    public final j30 f33745b;

    public g30(j30 j30Var, ArrayList arrayList) {
        this.f33745b = j30Var;
        this.f33744a = arrayList;
    }

    @Override
    public final org.telegram.ui.wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        i30 i30Var = this.f33745b.f34844b;
        if (i30Var == null) {
            return null;
        }
        return i30Var.getCloseIntoObject();
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        this.f33745b.s((org.telegram.messenger.gf) this.f33744a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
