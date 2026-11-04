package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oe0 implements d90 {
    public final xe0 f48278a;

    public oe0(xe0 xe0Var) {
        this.f48278a = xe0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f48278a.k0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            xe0 xe0Var = this.f48278a;
            xe0Var.i0(tL_chatInviteExported2);
            for (int i3 = 0; i3 < xe0Var.f51997j0.size(); i3++) {
                if (((TLRPC.TL_chatInviteExported) xe0Var.f51997j0.get(i3)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        pe0 l02 = xe0Var.l0();
                        xe0Var.f51997j0.remove(i3);
                        xe0Var.f51998k0.add(0, tL_chatInviteExported2);
                        xe0Var.n0(l02);
                        return;
                    }
                    xe0Var.f51997j0.set(i3, tL_chatInviteExported2);
                    xe0Var.o0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            org.telegram.messenger.g0.i3(new tb0(13, this, tLObject), 200L);
        }
    }
}
