package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c30 extends org.telegram.ui.eq0 {
    public final ArrayList f32519a;
    public final f30 f32520b;

    public c30(f30 f30Var, ArrayList arrayList) {
        this.f32520b = f30Var;
        this.f32519a = arrayList;
    }

    @Override
    public final org.telegram.ui.mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        e30 e30Var = this.f32520b.f33682b;
        if (e30Var == null) {
            return null;
        }
        return e30Var.getCloseIntoObject();
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        this.f32520b.s((org.telegram.messenger.ye) this.f32519a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
