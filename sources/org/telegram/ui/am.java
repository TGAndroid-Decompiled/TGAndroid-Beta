package org.telegram.ui;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class am extends fu0 {
    public final zn f32610a;

    public am(zn znVar) {
        this.f32610a = znVar;
    }

    @Override
    public final org.telegram.ui.qu0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.am.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.qu0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        if (i10 >= 0) {
            zn znVar = this.f32610a;
            if (i10 < znVar.Ea.size()) {
                znVar.cb((TLRPC.BotInlineResult) znVar.Ea.get(i10), z4, i11, 0L);
            }
        }
    }
}
