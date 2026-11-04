package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class y80 extends org.telegram.ui.eq0 {
    public final c90 f40655a;

    public y80(c90 c90Var) {
        this.f40655a = c90Var;
    }

    @Override
    public final org.telegram.ui.mq0 E(org.telegram.messenger.zi r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y80.E(org.telegram.messenger.zi, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.mq0");
    }

    @Override
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        if (i3 >= 0) {
            c90 c90Var = this.f40655a;
            if (i3 < c90Var.Q.size()) {
                c90Var.f32620y.e((TLRPC.BotInlineResult) c90Var.Q.get(i3), z10, i10);
            }
        }
    }
}
