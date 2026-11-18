package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class r30 extends org.telegram.ui.oq0 {
    public final ArrayList f38997a;
    public final u30 f38998b;

    public r30(u30 u30Var, ArrayList arrayList) {
        this.f38998b = u30Var;
        this.f38997a = arrayList;
    }

    @Override
    public final org.telegram.ui.wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        t30 t30Var = this.f38998b.f40196b;
        if (t30Var == null) {
            return null;
        }
        return t30Var.getCloseIntoObject();
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        this.f38998b.s((org.telegram.messenger.ef) this.f38997a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
