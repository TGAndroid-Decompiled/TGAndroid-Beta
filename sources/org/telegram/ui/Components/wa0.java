package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class wa0 extends org.telegram.ui.lu0 {
    public final ab0 f29973a;

    public wa0(ab0 ab0Var) {
        this.f29973a = ab0Var;
    }

    @Override
    public final org.telegram.ui.vu0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wa0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.vu0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            ab0 ab0Var = this.f29973a;
            if (i10 < ab0Var.P.size()) {
                ab0Var.f22598x.f((TLRPC.BotInlineResult) ab0Var.P.get(i10), z10, i11);
            }
        }
    }
}
