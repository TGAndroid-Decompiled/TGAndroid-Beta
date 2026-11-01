package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ii extends xr0 {
    public final un f38092a;

    public ii(un unVar) {
        this.f38092a = unVar;
    }

    @Override
    public final org.telegram.ui.fs0 E(org.telegram.messenger.kj r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ii.E(org.telegram.messenger.kj, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.fs0");
    }

    @Override
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            un unVar = this.f38092a;
            if (i10 < unVar.f42014bb.size()) {
                unVar.yb((TLRPC.BotInlineResult) unVar.f42014bb.get(i10), z10, i11, 0L);
            }
        }
    }
}
