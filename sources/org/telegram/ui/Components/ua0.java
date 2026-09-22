package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class ua0 extends org.telegram.ui.tu0 {
    public final ya0 f28706a;

    public ua0(ya0 ya0Var) {
        this.f28706a = ya0Var;
    }

    @Override
    public final org.telegram.ui.dv0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ua0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.dv0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            ya0 ya0Var = this.f28706a;
            if (i10 < ya0Var.P.size()) {
                ya0Var.f30623x.f((TLRPC.BotInlineResult) ya0Var.P.get(i10), z10, i11);
            }
        }
    }
}
