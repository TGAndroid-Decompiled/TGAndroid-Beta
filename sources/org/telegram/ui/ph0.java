package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ph0 implements ub0 {
    public final zh0 f40807a;

    public ph0(zh0 zh0Var) {
        this.f40807a = zh0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f40807a.e0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            zh0 zh0Var = this.f40807a;
            zh0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < zh0Var.f44646i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) zh0Var.f44646i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        qh0 f02 = zh0Var.f0();
                        zh0Var.f44646i0.remove(i10);
                        zh0Var.f44647j0.add(0, tL_chatInviteExported2);
                        zh0Var.h0(f02);
                        return;
                    }
                    zh0Var.f44646i0.set(i10, tL_chatInviteExported2);
                    zh0Var.i0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new tf0(6, this, tLObject), 200L);
        }
    }
}
