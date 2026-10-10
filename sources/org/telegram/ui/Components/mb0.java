package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class mb0 extends org.telegram.ui.uu0 {
    public final qb0 f28757a;

    public mb0(qb0 qb0Var) {
        this.f28757a = qb0Var;
    }

    @Override
    public final org.telegram.ui.ev0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mb0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.ev0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            qb0 qb0Var = this.f28757a;
            if (i10 < qb0Var.P.size()) {
                qb0Var.f30172x.e((TLRPC.BotInlineResult) qb0Var.P.get(i10), z10, i11);
            }
        }
    }
}
