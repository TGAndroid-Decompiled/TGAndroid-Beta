package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class u90 extends org.telegram.ui.xr0 {
    public final y90 f30909a;

    public u90(y90 y90Var) {
        this.f30909a = y90Var;
    }

    @Override
    public final org.telegram.ui.fs0 E(org.telegram.messenger.kj r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u90.E(org.telegram.messenger.kj, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.fs0");
    }

    @Override
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            y90 y90Var = this.f30909a;
            if (i10 < y90Var.P.size()) {
                y90Var.f32789y.m((TLRPC.BotInlineResult) y90Var.P.get(i10), z10, i11);
            }
        }
    }
}
