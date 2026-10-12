package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class kb0 extends org.telegram.ui.av0 {
    public final ob0 f26663a;

    public kb0(ob0 ob0Var) {
        this.f26663a = ob0Var;
    }

    @Override
    public final org.telegram.ui.kv0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kb0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.kv0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            ob0 ob0Var = this.f26663a;
            if (i10 < ob0Var.P.size()) {
                ob0Var.f27934x.g((TLRPC.BotInlineResult) ob0Var.P.get(i10), z10, i11);
            }
        }
    }
}
