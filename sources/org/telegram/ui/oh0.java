package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oh0 implements wb0 {
    public final yh0 f39277a;

    public oh0(yh0 yh0Var) {
        this.f39277a = yh0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f39277a.e0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            yh0 yh0Var = this.f39277a;
            yh0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < yh0Var.f43159i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) yh0Var.f43159i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        ph0 f02 = yh0Var.f0();
                        yh0Var.f43159i0.remove(i10);
                        yh0Var.f43160j0.add(0, tL_chatInviteExported2);
                        yh0Var.h0(f02);
                        return;
                    }
                    yh0Var.f43159i0.set(i10, tL_chatInviteExported2);
                    yh0Var.i0(true);
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
