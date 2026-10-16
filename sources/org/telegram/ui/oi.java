package org.telegram.ui;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class oi extends zu0 {
    public final fo f38676a;

    public oi(fo foVar) {
        this.f38676a = foVar;
    }

    @Override
    public final org.telegram.ui.jv0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oi.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.jv0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            fo foVar = this.f38676a;
            if (i10 < foVar.Ia.size()) {
                foVar.gb((TLRPC.BotInlineResult) foVar.Ia.get(i10), z10, i11, 0L);
            }
        }
    }
}
