package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qh0 implements yb0 {
    public final ai0 f36940a;

    public qh0(ai0 ai0Var) {
        this.f36940a = ai0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f36940a.e0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            ai0 ai0Var = this.f36940a;
            ai0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < ai0Var.f32104i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) ai0Var.f32104i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        rh0 f02 = ai0Var.f0();
                        ai0Var.f32104i0.remove(i10);
                        ai0Var.f32105j0.add(0, tL_chatInviteExported2);
                        ai0Var.h0(f02);
                        return;
                    }
                    ai0Var.f32104i0.set(i10, tL_chatInviteExported2);
                    ai0Var.i0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new r80(29, this, tLObject), 200L);
        }
    }
}
