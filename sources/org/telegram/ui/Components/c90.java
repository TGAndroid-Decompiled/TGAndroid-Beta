package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class c90 extends org.telegram.ui.mq0 {
    public final g90 f32478a;

    public c90(g90 g90Var) {
        this.f32478a = g90Var;
    }

    @Override
    public final org.telegram.ui.vq0 E(org.telegram.messenger.ij r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c90.E(org.telegram.messenger.ij, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.vq0");
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        if (i7 >= 0) {
            g90 g90Var = this.f32478a;
            if (i7 < g90Var.P.size()) {
                g90Var.f33921y.M((TLRPC.BotInlineResult) g90Var.P.get(i7), z9, i10);
            }
        }
    }
}
