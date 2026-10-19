package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class eb0 extends org.telegram.ui.zt0 {
    public final ib0 f25892a;

    public eb0(ib0 ib0Var) {
        this.f25892a = ib0Var;
    }

    @Override
    public final org.telegram.ui.ju0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eb0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.ju0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            ib0 ib0Var = this.f25892a;
            if (i10 < ib0Var.P.size()) {
                ib0Var.f27193x.i((TLRPC.BotInlineResult) ib0Var.P.get(i10), z10, i11);
            }
        }
    }
}
