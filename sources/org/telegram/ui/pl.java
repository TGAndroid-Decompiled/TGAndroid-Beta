package org.telegram.ui;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class pl extends rt0 {
    public final qn f41556a;

    public pl(qn qnVar) {
        this.f41556a = qnVar;
    }

    @Override
    public final org.telegram.ui.bu0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pl.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.bu0");
    }

    @Override
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        if (i9 >= 0) {
            qn qnVar = this.f41556a;
            if (i9 < qnVar.Da.size()) {
                qnVar.cb((TLRPC.BotInlineResult) qnVar.Da.get(i9), z10, i10, 0L);
            }
        }
    }
}
