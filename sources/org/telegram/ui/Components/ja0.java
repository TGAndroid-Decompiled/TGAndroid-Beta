package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class ja0 extends org.telegram.ui.tu0 {
    public final na0 f25272a;

    public ja0(na0 na0Var) {
        this.f25272a = na0Var;
    }

    @Override
    public final org.telegram.ui.dv0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ja0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.dv0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            na0 na0Var = this.f25272a;
            if (i10 < na0Var.P.size()) {
                na0Var.f26429x.f((TLRPC.BotInlineResult) na0Var.P.get(i10), z10, i11);
            }
        }
    }
}
