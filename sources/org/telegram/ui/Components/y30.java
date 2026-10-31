package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y30 extends org.telegram.ui.yr0 {
    public final ArrayList f32620a;
    public final b40 f32621b;

    public y30(b40 b40Var, ArrayList arrayList) {
        this.f32621b = b40Var;
        this.f32620a = arrayList;
    }

    @Override
    public final org.telegram.ui.gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        a40 a40Var = this.f32621b.f24524b;
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
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        this.f32621b.s((org.telegram.messenger.ef) this.f32620a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
