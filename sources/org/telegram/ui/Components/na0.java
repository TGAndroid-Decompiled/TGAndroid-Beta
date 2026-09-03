package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class na0 extends org.telegram.ui.fu0 {
    public final ra0 f29425a;

    public na0(ra0 ra0Var) {
        this.f29425a = ra0Var;
    }

    @Override
    public final org.telegram.ui.qu0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.na0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.qu0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        if (i10 >= 0) {
            ra0 ra0Var = this.f29425a;
            if (i10 < ra0Var.M.size()) {
                ra0Var.f30715x.l((TLRPC.BotInlineResult) ra0Var.M.get(i10), z4, i11);
            }
        }
    }
}
