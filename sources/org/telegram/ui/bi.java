package org.telegram.ui;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class bi extends cu0 {
    public final sn f36117a;

    public bi(sn snVar) {
        this.f36117a = snVar;
    }

    @Override
    public final org.telegram.ui.mu0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bi.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.mu0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            sn snVar = this.f36117a;
            if (i10 < snVar.Ua.size()) {
                snVar.hb((TLRPC.BotInlineResult) snVar.Ua.get(i10), z10, i11, 0L);
            }
        }
    }
}
