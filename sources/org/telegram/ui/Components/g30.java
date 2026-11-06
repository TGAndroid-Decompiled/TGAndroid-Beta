package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class g30 extends org.telegram.ui.mq0 {
    public final ArrayList f33814a;
    public final j30 f33815b;

    public g30(j30 j30Var, ArrayList arrayList) {
        this.f33815b = j30Var;
        this.f33814a = arrayList;
    }

    @Override
    public final org.telegram.ui.vq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        i30 i30Var = this.f33815b.f34865b;
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
        this.f33815b.s((org.telegram.messenger.gf) this.f33814a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
