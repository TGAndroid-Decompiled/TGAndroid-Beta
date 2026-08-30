package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fh0 implements mb0 {
    public final ph0 f34259a;

    public fh0(ph0 ph0Var) {
        this.f34259a = ph0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f34259a.e0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            ph0 ph0Var = this.f34259a;
            ph0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < ph0Var.f37326f0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) ph0Var.f37326f0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        gh0 f02 = ph0Var.f0();
                        ph0Var.f37326f0.remove(i10);
                        ph0Var.f37327g0.add(0, tL_chatInviteExported2);
                        ph0Var.h0(f02);
                        return;
                    }
                    ph0Var.f37326f0.set(i10, tL_chatInviteExported2);
                    ph0Var.i0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new fe0(11, this, tLObject), 200L);
        }
    }
}
