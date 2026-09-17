package org.telegram.ui;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class bm extends vu0 {
    public final bo f32204a;

    public bm(bo boVar) {
        this.f32204a = boVar;
    }

    @Override
    public final org.telegram.ui.fv0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bm.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.fv0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            bo boVar = this.f32204a;
            if (i10 < boVar.Ha.size()) {
                boVar.cb((TLRPC.BotInlineResult) boVar.Ha.get(i10), z10, i11, 0L);
            }
        }
    }
}
