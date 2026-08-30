package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class la0 extends org.telegram.ui.yt0 {
    public final pa0 f26608a;

    public la0(pa0 pa0Var) {
        this.f26608a = pa0Var;
    }

    @Override
    public final org.telegram.ui.ju0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.la0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.ju0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        if (i10 >= 0) {
            pa0 pa0Var = this.f26608a;
            if (i10 < pa0Var.M.size()) {
                pa0Var.f27808x.a((TLRPC.BotInlineResult) pa0Var.M.get(i10), z4, i11);
            }
        }
    }
}
