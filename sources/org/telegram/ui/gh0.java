package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gh0 implements nb0 {
    public final qh0 f37105a;

    public gh0(qh0 qh0Var) {
        this.f37105a = qh0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f37105a.e0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            qh0 qh0Var = this.f37105a;
            qh0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < qh0Var.f40491f0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) qh0Var.f40491f0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        hh0 f02 = qh0Var.f0();
                        qh0Var.f40491f0.remove(i10);
                        qh0Var.f40492g0.add(0, tL_chatInviteExported2);
                        qh0Var.h0(f02);
                        return;
                    }
                    qh0Var.f40491f0.set(i10, tL_chatInviteExported2);
                    qh0Var.i0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new ue0(9, this, tLObject), 200L);
        }
    }
}
