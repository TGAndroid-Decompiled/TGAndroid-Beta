package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lh0 implements tb0 {
    public final vh0 f35352a;

    public lh0(vh0 vh0Var) {
        this.f35352a = vh0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f35352a.e0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            vh0 vh0Var = this.f35352a;
            vh0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < vh0Var.f38594i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) vh0Var.f38594i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        mh0 f02 = vh0Var.f0();
                        vh0Var.f38594i0.remove(i10);
                        vh0Var.f38595j0.add(0, tL_chatInviteExported2);
                        vh0Var.h0(f02);
                        return;
                    }
                    vh0Var.f38594i0.set(i10, tL_chatInviteExported2);
                    vh0Var.i0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new ea0(24, this, tLObject), 200L);
        }
    }
}
