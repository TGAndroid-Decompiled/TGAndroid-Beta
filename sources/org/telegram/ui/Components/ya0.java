package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class ya0 extends org.telegram.ui.lu0 {
    public final cb0 f30689a;

    public ya0(cb0 cb0Var) {
        this.f30689a = cb0Var;
    }

    @Override
    public final org.telegram.ui.vu0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ya0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.vu0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            cb0 cb0Var = this.f30689a;
            if (i10 < cb0Var.P.size()) {
                cb0Var.f23255x.f((TLRPC.BotInlineResult) cb0Var.P.get(i10), z10, i11);
            }
        }
    }
}
