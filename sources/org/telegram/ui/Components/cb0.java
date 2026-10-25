package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class cb0 extends org.telegram.ui.gu0 {
    public final gb0 f27107a;

    public cb0(gb0 gb0Var) {
        this.f27107a = gb0Var;
    }

    @Override
    public final org.telegram.ui.qu0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cb0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.qu0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            gb0 gb0Var = this.f27107a;
            if (i10 < gb0Var.P.size()) {
                gb0Var.f28525x.j((TLRPC.BotInlineResult) gb0Var.P.get(i10), z10, i11);
            }
        }
    }
}
