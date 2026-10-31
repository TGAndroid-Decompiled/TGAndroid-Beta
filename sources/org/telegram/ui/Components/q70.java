package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q70 implements org.telegram.messenger.j20 {
    public final int f29548a;
    public final long f29549b;
    public final org.telegram.ui.ActionBar.z2 f29550c;
    public final Object d;

    public q70(ha haVar, Object obj, long j10, int i10) {
        this.f29548a = i10;
        this.f29550c = haVar;
        this.d = obj;
        this.f29549b = j10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        switch (this.f29548a) {
            case 0:
                u70 u70Var = (u70) this.f29550c;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.d;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    org.telegram.messenger.vp.r1(u70Var.f21583a).L3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.i0.g3(new n70(u70Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, this.f29549b, 1));
                    }
                    updates = null;
                }
                org.telegram.messenger.i0.g3(new org.telegram.ui.fp((Object) u70Var, (Object) tL_error, (Object) updates, (Object) tL_messages_importChatInvite, 14));
                return;
            case 1:
                ph.q3 q3Var = (ph.q3) this.f29550c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                rh.d3 d3Var = (rh.d3) obj;
                gf.e eVar = (gf.e) obj2;
                eVar.d();
                rh.e6.x(q3Var.f21583a, d3Var.f46756a).h(d3Var.f46757b, tL_starGiftUnique, this.f29549b, null, true, new org.telegram.tgnet.e(q3Var, eVar, tL_starGiftUnique, 6));
                return;
            default:
                rh.t7.d1((rh.t7) this.f29550c, (a51) this.d, this.f29549b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public q70(u70 u70Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f29548a = 0;
        this.f29550c = u70Var;
        this.f29549b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
