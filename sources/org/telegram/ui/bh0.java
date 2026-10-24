package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bh0 implements fb0 {
    public final lh0 f36075a;

    public bh0(lh0 lh0Var) {
        this.f36075a = lh0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f36075a.f0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            lh0 lh0Var = this.f36075a;
            lh0Var.d0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < lh0Var.f39283i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) lh0Var.f39283i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        ch0 g02 = lh0Var.g0();
                        lh0Var.f39283i0.remove(i10);
                        lh0Var.f39284j0.add(0, tL_chatInviteExported2);
                        lh0Var.i0(g02);
                        return;
                    }
                    lh0Var.f39283i0.set(i10, tL_chatInviteExported2);
                    lh0Var.j0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new ah0(0, this, tLObject), 200L);
        }
    }
}
