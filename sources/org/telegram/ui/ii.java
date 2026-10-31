package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ii extends yr0 {
    public final un f38263a;

    public ii(un unVar) {
        this.f38263a = unVar;
    }

    @Override
    public final org.telegram.ui.gs0 E(org.telegram.messenger.jj r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ii.E(org.telegram.messenger.jj, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.gs0");
    }

    @Override
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            un unVar = this.f38263a;
            if (i10 < unVar.f42203bb.size()) {
                unVar.tb((TLRPC.BotInlineResult) unVar.f42203bb.get(i10), z10, i11, 0L);
            }
        }
    }
}
