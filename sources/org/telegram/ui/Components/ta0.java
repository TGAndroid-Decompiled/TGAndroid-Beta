package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class ta0 extends org.telegram.ui.tu0 {
    public final xa0 f27388a;

    public ta0(xa0 xa0Var) {
        this.f27388a = xa0Var;
    }

    @Override
    public final org.telegram.ui.ev0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ta0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.ev0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            xa0 xa0Var = this.f27388a;
            if (i10 < xa0Var.P.size()) {
                xa0Var.f28997x.d((TLRPC.BotInlineResult) xa0Var.P.get(i10), z10, i11);
            }
        }
    }
}
