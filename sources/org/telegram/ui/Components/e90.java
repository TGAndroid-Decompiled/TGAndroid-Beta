package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class e90 extends org.telegram.ui.mq0 {
    public final i90 f34262a;

    public e90(i90 i90Var) {
        this.f34262a = i90Var;
    }

    @Override
    public final org.telegram.ui.uq0 E(org.telegram.messenger.gj r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e90.E(org.telegram.messenger.gj, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.uq0");
    }

    @Override
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        if (i7 >= 0) {
            i90 i90Var = this.f34262a;
            if (i7 < i90Var.Q.size()) {
                i90Var.f35529y.r((TLRPC.BotInlineResult) i90Var.Q.get(i7), z10, i10);
            }
        }
    }
}
