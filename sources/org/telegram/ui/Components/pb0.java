package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class pb0 extends org.telegram.ui.wu0 {
    public final tb0 f29482a;

    public pb0(tb0 tb0Var) {
        this.f29482a = tb0Var;
    }

    @Override
    public final org.telegram.ui.gv0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pb0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.gv0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            tb0 tb0Var = this.f29482a;
            if (i10 < tb0Var.P.size()) {
                tb0Var.f30850x.a((TLRPC.BotInlineResult) tb0Var.P.get(i10), z10, i11);
            }
        }
    }
}
