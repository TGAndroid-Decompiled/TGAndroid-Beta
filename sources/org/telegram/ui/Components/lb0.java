package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class lb0 extends org.telegram.ui.tu0 {
    public final pb0 f28337a;

    public lb0(pb0 pb0Var) {
        this.f28337a = pb0Var;
    }

    @Override
    public final org.telegram.ui.dv0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lb0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.dv0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            pb0 pb0Var = this.f28337a;
            if (i10 < pb0Var.P.size()) {
                pb0Var.f29837x.e((TLRPC.BotInlineResult) pb0Var.P.get(i10), z10, i11);
            }
        }
    }
}
