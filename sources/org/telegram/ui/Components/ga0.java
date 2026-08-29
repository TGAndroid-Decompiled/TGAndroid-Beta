package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class ga0 extends org.telegram.ui.pt0 {
    public final ka0 f28862a;

    public ga0(ka0 ka0Var) {
        this.f28862a = ka0Var;
    }

    @Override
    public final org.telegram.ui.zt0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ga0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.zt0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            ka0 ka0Var = this.f28862a;
            if (i10 < ka0Var.L.size()) {
                ka0Var.f30004x.b((TLRPC.BotInlineResult) ka0Var.L.get(i10), z10, i11);
            }
        }
    }
}
