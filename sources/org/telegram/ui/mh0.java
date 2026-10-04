package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh0 implements ub0 {
    public final wh0 f38596a;

    public mh0(wh0 wh0Var) {
        this.f38596a = wh0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f38596a.e0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            wh0 wh0Var = this.f38596a;
            wh0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < wh0Var.f42479i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) wh0Var.f42479i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        nh0 f02 = wh0Var.f0();
                        wh0Var.f42479i0.remove(i10);
                        wh0Var.f42480j0.add(0, tL_chatInviteExported2);
                        wh0Var.h0(f02);
                        return;
                    }
                    wh0Var.f42479i0.set(i10, tL_chatInviteExported2);
                    wh0Var.i0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new h90(26, this, tLObject), 200L);
        }
    }
}
