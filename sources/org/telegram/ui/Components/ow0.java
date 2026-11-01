package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ow0 implements Runnable {
    public final int f29238a;
    public final TLObject f29239b;
    public final org.telegram.messenger.r20 f29240c;

    public ow0(TLObject tLObject, org.telegram.messenger.r20 r20Var, int i10) {
        this.f29238a = i10;
        this.f29239b = tLObject;
        this.f29240c = r20Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f29238a) {
            case 0:
                TLObject tLObject = this.f29239b;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    z10 = true;
                    org.telegram.messenger.vi.b0(org.telegram.messenger.e20.f15506s0).I1(tL_messages_stickerSet, true);
                    if (!org.telegram.messenger.vi.b0(org.telegram.messenger.e20.f15506s0).B0(tL_messages_stickerSet.set.f19821id, true)) {
                        org.telegram.messenger.vi.b0(org.telegram.messenger.e20.f15506s0).f2(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                } else {
                    z10 = false;
                }
                this.f29240c.a(Boolean.valueOf(z10));
                return;
            default:
                TLObject tLObject2 = this.f29239b;
                boolean z11 = tLObject2 instanceof TL_account.paidMessagesRevenue;
                org.telegram.messenger.r20 r20Var = this.f29240c;
                if (z11) {
                    r20Var.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject2).stars_amount));
                    return;
                } else {
                    r20Var.a(0L);
                    return;
                }
        }
    }
}
