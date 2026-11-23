package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qh extends pq0 {
    public final bn f51216a;

    public qh(bn bnVar) {
        this.f51216a = bnVar;
    }

    @Override
    public final org.telegram.ui.xq0 E(org.telegram.messenger.gj r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qh.E(org.telegram.messenger.gj, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.xq0");
    }

    @Override
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        if (i7 >= 0) {
            bn bnVar = this.f51216a;
            if (i7 < bnVar.f45983fb.size()) {
                bnVar.Hb((TLRPC.BotInlineResult) bnVar.f45983fb.get(i7), z10, i10, 0L);
            }
        }
    }
}
