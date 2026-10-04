package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class xa0 extends org.telegram.ui.ou0 {
    public final bb0 f32753a;

    public xa0(bb0 bb0Var) {
        this.f32753a = bb0Var;
    }

    @Override
    public final org.telegram.ui.yu0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xa0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.yu0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            bb0 bb0Var = this.f32753a;
            if (i10 < bb0Var.P.size()) {
                bb0Var.f24915x.g((TLRPC.BotInlineResult) bb0Var.P.get(i10), z10, i11);
            }
        }
    }
}
