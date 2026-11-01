package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y30 extends org.telegram.ui.xr0 {
    public final ArrayList f32708a;
    public final b40 f32709b;

    public y30(b40 b40Var, ArrayList arrayList) {
        this.f32709b = b40Var;
        this.f32708a = arrayList;
    }

    @Override
    public final org.telegram.ui.fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        a40 a40Var = this.f32709b.f24619b;
        if (a40Var == null) {
            return null;
        }
        return a40Var.getCloseIntoObject();
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        this.f32709b.s((org.telegram.messenger.ff) this.f32708a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
