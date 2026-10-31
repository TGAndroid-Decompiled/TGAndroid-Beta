package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ag0 implements la0 {
    public final kg0 f35647a;

    public ag0(kg0 kg0Var) {
        this.f35647a = kg0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f35647a.j0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            kg0 kg0Var = this.f35647a;
            kg0Var.h0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < kg0Var.f38806i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) kg0Var.f38806i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        bg0 k02 = kg0Var.k0();
                        kg0Var.f38806i0.remove(i10);
                        kg0Var.f38807j0.add(0, tL_chatInviteExported2);
                        kg0Var.m0(k02);
                        return;
                    }
                    kg0Var.f38806i0.set(i10, tL_chatInviteExported2);
                    kg0Var.n0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            org.telegram.messenger.i0.h3(new uf0(1, this, tLObject), 200L);
        }
    }
}
