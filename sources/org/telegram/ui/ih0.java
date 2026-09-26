package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ih0 implements qb0 {
    public final sh0 f34523a;

    public ih0(sh0 sh0Var) {
        this.f34523a = sh0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f34523a.e0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            sh0 sh0Var = this.f34523a;
            sh0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < sh0Var.f37780i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) sh0Var.f37780i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        jh0 f02 = sh0Var.f0();
                        sh0Var.f37780i0.remove(i10);
                        sh0Var.f37781j0.add(0, tL_chatInviteExported2);
                        sh0Var.h0(f02);
                        return;
                    }
                    sh0Var.f37780i0.set(i10, tL_chatInviteExported2);
                    sh0Var.i0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new n80(28, this, tLObject), 200L);
        }
    }
}
