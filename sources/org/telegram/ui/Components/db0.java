package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class db0 extends org.telegram.ui.bu0 {
    public final hb0 f25692a;

    public db0(hb0 hb0Var) {
        this.f25692a = hb0Var;
    }

    @Override
    public final org.telegram.ui.lu0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.db0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.lu0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            hb0 hb0Var = this.f25692a;
            if (i10 < hb0Var.P.size()) {
                hb0Var.f27000x.i((TLRPC.BotInlineResult) hb0Var.P.get(i10), z10, i11);
            }
        }
    }
}
