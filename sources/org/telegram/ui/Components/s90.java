package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class s90 extends org.telegram.ui.rt0 {
    public final w90 f32405a;

    public s90(w90 w90Var) {
        this.f32405a = w90Var;
    }

    @Override
    public final org.telegram.ui.bu0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s90.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.bu0");
    }

    @Override
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        if (i9 >= 0) {
            w90 w90Var = this.f32405a;
            if (i9 < w90Var.L.size()) {
                w90Var.f34164x.a((TLRPC.BotInlineResult) w90Var.L.get(i9), z10, i10);
            }
        }
    }
}
