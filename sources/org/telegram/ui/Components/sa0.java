package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class sa0 extends org.telegram.ui.tu0 {
    public final wa0 f28112a;

    public sa0(wa0 wa0Var) {
        this.f28112a = wa0Var;
    }

    @Override
    public final org.telegram.ui.dv0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sa0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.dv0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            wa0 wa0Var = this.f28112a;
            if (i10 < wa0Var.P.size()) {
                wa0Var.f30011x.f((TLRPC.BotInlineResult) wa0Var.P.get(i10), z10, i11);
            }
        }
    }
}
