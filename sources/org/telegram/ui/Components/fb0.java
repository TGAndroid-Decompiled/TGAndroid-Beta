package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class fb0 extends org.telegram.ui.cu0 {
    public final jb0 f26278a;

    public fb0(jb0 jb0Var) {
        this.f26278a = jb0Var;
    }

    @Override
    public final org.telegram.ui.mu0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fb0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.mu0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            jb0 jb0Var = this.f26278a;
            if (i10 < jb0Var.P.size()) {
                jb0Var.f27660x.i((TLRPC.BotInlineResult) jb0Var.P.get(i10), z10, i11);
            }
        }
    }
}
