package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class d90 extends org.telegram.ui.pq0 {
    public final h90 f32895a;

    public d90(h90 h90Var) {
        this.f32895a = h90Var;
    }

    @Override
    public final org.telegram.ui.yq0 E(org.telegram.messenger.ij r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d90.E(org.telegram.messenger.ij, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.yq0");
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        if (i7 >= 0) {
            h90 h90Var = this.f32895a;
            if (i7 < h90Var.P.size()) {
                h90Var.f34256y.M((TLRPC.BotInlineResult) h90Var.P.get(i7), z9, i10);
            }
        }
    }
}
