package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hh0 implements ob0 {
    public final rh0 f34675a;

    public hh0(rh0 rh0Var) {
        this.f34675a = rh0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f34675a.e0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            rh0 rh0Var = this.f34675a;
            rh0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < rh0Var.f37851f0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) rh0Var.f37851f0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        ih0 f02 = rh0Var.f0();
                        rh0Var.f37851f0.remove(i10);
                        rh0Var.f37852g0.add(0, tL_chatInviteExported2);
                        rh0Var.h0(f02);
                        return;
                    }
                    rh0Var.f37851f0.set(i10, tL_chatInviteExported2);
                    rh0Var.i0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new ie0(10, this, tLObject), 200L);
        }
    }
}
