package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class p90 extends org.telegram.ui.oq0 {
    public final t90 f38328a;

    public p90(t90 t90Var) {
        this.f38328a = t90Var;
    }

    @Override
    public final org.telegram.ui.wq0 E(org.telegram.messenger.fj r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p90.E(org.telegram.messenger.fj, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.wq0");
    }

    @Override
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        if (i7 >= 0) {
            t90 t90Var = this.f38328a;
            if (i7 < t90Var.Q.size()) {
                t90Var.f39955y.g((TLRPC.BotInlineResult) t90Var.Q.get(i7), z10, i10);
            }
        }
    }
}
