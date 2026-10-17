package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ah0 implements bb0 {
    public final kh0 f35436a;

    public ah0(kh0 kh0Var) {
        this.f35436a = kh0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f35436a.e0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            kh0 kh0Var = this.f35436a;
            kh0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < kh0Var.f38538i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) kh0Var.f38538i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        bh0 f02 = kh0Var.f0();
                        kh0Var.f38538i0.remove(i10);
                        kh0Var.f38539j0.add(0, tL_chatInviteExported2);
                        kh0Var.h0(f02);
                        return;
                    }
                    kh0Var.f38538i0.set(i10, tL_chatInviteExported2);
                    kh0Var.i0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new zg0(0, this, tLObject), 200L);
        }
    }
}
