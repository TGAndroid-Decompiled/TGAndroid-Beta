package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class ra0 extends org.telegram.ui.tu0 {
    public final va0 f27830a;

    public ra0(va0 va0Var) {
        this.f27830a = va0Var;
    }

    @Override
    public final org.telegram.ui.dv0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ra0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.dv0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            va0 va0Var = this.f27830a;
            if (i10 < va0Var.P.size()) {
                va0Var.f29053x.f((TLRPC.BotInlineResult) va0Var.P.get(i10), z10, i11);
            }
        }
    }
}
