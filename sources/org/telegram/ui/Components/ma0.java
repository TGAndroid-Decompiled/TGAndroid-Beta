package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class ma0 extends org.telegram.ui.fu0 {
    public final qa0 f27005a;

    public ma0(qa0 qa0Var) {
        this.f27005a = qa0Var;
    }

    @Override
    public final org.telegram.ui.qu0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.qu0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        if (i10 >= 0) {
            qa0 qa0Var = this.f27005a;
            if (i10 < qa0Var.M.size()) {
                qa0Var.f28134x.a((TLRPC.BotInlineResult) qa0Var.M.get(i10), z4, i11);
            }
        }
    }
}
