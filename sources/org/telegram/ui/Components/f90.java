package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class f90 extends org.telegram.ui.mq0 {
    public final j90 f34550a;

    public f90(j90 j90Var) {
        this.f34550a = j90Var;
    }

    @Override
    public final org.telegram.ui.uq0 E(org.telegram.messenger.gj r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f90.E(org.telegram.messenger.gj, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.uq0");
    }

    @Override
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        if (i7 >= 0) {
            j90 j90Var = this.f34550a;
            if (i7 < j90Var.Q.size()) {
                j90Var.f35929y.r((TLRPC.BotInlineResult) j90Var.Q.get(i7), z10, i10);
            }
        }
    }
}
