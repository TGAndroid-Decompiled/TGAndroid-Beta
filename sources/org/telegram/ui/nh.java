package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class nh extends eq0 {
    public final wm f48002a;

    public nh(wm wmVar) {
        this.f48002a = wmVar;
    }

    @Override
    public final org.telegram.ui.mq0 E(org.telegram.messenger.zi r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nh.E(org.telegram.messenger.zi, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.mq0");
    }

    @Override
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        if (i3 >= 0) {
            wm wmVar = this.f48002a;
            if (i3 < wmVar.f51276cb.size()) {
                wmVar.Db((TLRPC.BotInlineResult) wmVar.f51276cb.get(i3), z10, i10, 0L);
            }
        }
    }
}
