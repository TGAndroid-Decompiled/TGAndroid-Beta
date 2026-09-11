package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class ka0 extends org.telegram.ui.su0 {
    public final oa0 f27794a;

    public ka0(oa0 oa0Var) {
        this.f27794a = oa0Var;
    }

    @Override
    public final org.telegram.ui.cv0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ka0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.cv0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            oa0 oa0Var = this.f27794a;
            if (i10 < oa0Var.P.size()) {
                oa0Var.f29026x.f((TLRPC.BotInlineResult) oa0Var.P.get(i10), z10, i11);
            }
        }
    }
}
