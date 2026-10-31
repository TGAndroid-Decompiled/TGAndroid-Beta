package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class nw0 implements Runnable {
    public final int f28898a;
    public final TLObject f28899b;
    public final org.telegram.messenger.q20 f28900c;

    public nw0(TLObject tLObject, org.telegram.messenger.q20 q20Var, int i10) {
        this.f28898a = i10;
        this.f28899b = tLObject;
        this.f28900c = q20Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f28898a) {
            case 0:
                TLObject tLObject = this.f28899b;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    z10 = true;
                    org.telegram.messenger.ui.b0(org.telegram.messenger.d20.f15147s0).I1(tL_messages_stickerSet, true);
                    if (!org.telegram.messenger.ui.b0(org.telegram.messenger.d20.f15147s0).B0(tL_messages_stickerSet.set.f19820id, true)) {
                        org.telegram.messenger.ui.b0(org.telegram.messenger.d20.f15147s0).f2(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                } else {
                    z10 = false;
                }
                this.f28900c.a(Boolean.valueOf(z10));
                return;
            default:
                TLObject tLObject2 = this.f28899b;
                boolean z11 = tLObject2 instanceof TL_account.paidMessagesRevenue;
                org.telegram.messenger.q20 q20Var = this.f28900c;
                if (z11) {
                    q20Var.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject2).stars_amount));
                    return;
                } else {
                    q20Var.a(0L);
                    return;
                }
        }
    }
}
