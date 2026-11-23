package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class r90 extends org.telegram.ui.oq0 {
    public final v90 f39129a;

    public r90(v90 v90Var) {
        this.f39129a = v90Var;
    }

    @Override
    public final org.telegram.ui.wq0 E(org.telegram.messenger.gj r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r90.E(org.telegram.messenger.gj, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.wq0");
    }

    @Override
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        if (i7 >= 0) {
            v90 v90Var = this.f39129a;
            if (i7 < v90Var.Q.size()) {
                v90Var.f40752y.g((TLRPC.BotInlineResult) v90Var.Q.get(i7), z10, i10);
            }
        }
    }
}
