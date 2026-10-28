package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bh0 implements eb0 {
    public final lh0 f38042a;

    public bh0(lh0 lh0Var) {
        this.f38042a = lh0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f38042a.g0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            lh0 lh0Var = this.f38042a;
            lh0Var.e0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < lh0Var.f41173i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) lh0Var.f41173i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        ch0 h02 = lh0Var.h0();
                        lh0Var.f41173i0.remove(i10);
                        lh0Var.f41174j0.add(0, tL_chatInviteExported2);
                        lh0Var.j0(h02);
                        return;
                    }
                    lh0Var.f41173i0.set(i10, tL_chatInviteExported2);
                    lh0Var.k0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new kb0(18, this, tLObject), 200L);
        }
    }
}
