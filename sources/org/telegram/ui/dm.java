package org.telegram.ui;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class dm extends tu0 {
    public final eo f31945a;

    public dm(eo eoVar) {
        this.f31945a = eoVar;
    }

    @Override
    public final org.telegram.ui.ev0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dm.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.ev0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            eo eoVar = this.f31945a;
            if (i10 < eoVar.Ha.size()) {
                eoVar.cb((TLRPC.BotInlineResult) eoVar.Ha.get(i10), z10, i11, 0L);
            }
        }
    }
}
