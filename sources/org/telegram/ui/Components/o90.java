package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class o90 extends org.telegram.ui.oq0 {
    public final s90 f38075a;

    public o90(s90 s90Var) {
        this.f38075a = s90Var;
    }

    @Override
    public final org.telegram.ui.wq0 E(org.telegram.messenger.fj r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o90.E(org.telegram.messenger.fj, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.wq0");
    }

    @Override
    public final void o(int i7, org.telegram.messenger.d20 d20Var, boolean z10, int i10, int i11, boolean z11) {
        if (i7 >= 0) {
            s90 s90Var = this.f38075a;
            if (i7 < s90Var.Q.size()) {
                s90Var.f39544y.a0((TLRPC.BotInlineResult) s90Var.Q.get(i7), z10, i10);
            }
        }
    }
}
