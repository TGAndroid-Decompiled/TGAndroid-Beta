package org.telegram.ui.Components;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class va0 extends org.telegram.ui.lu0 {
    public final za0 f29108a;

    public va0(za0 za0Var) {
        this.f29108a = za0Var;
    }

    @Override
    public final org.telegram.ui.vu0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.va0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.vu0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            za0 za0Var = this.f29108a;
            if (i10 < za0Var.P.size()) {
                za0Var.f30821x.f((TLRPC.BotInlineResult) za0Var.P.get(i10), z10, i11);
            }
        }
    }
}
