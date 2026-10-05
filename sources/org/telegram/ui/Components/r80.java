package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r80 implements Utilities.Callback2 {
    public final int f30375a;
    public final long f30376b;
    public final org.telegram.ui.ActionBar.f3 f30377c;
    public final Object d;

    public r80(cb cbVar, Object obj, long j3, int i10) {
        this.f30375a = i10;
        this.f30377c = cbVar;
        this.d = obj;
        this.f30376b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f30375a) {
            case 0:
                u80.m((u80) this.f30377c, this.f30376b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                xh.h4.T((xh.h4) this.f30377c, (TL_stars.TL_starGiftUnique) this.d, this.f30376b, (yh.b3) obj, (nf.e) obj2);
                return;
            default:
                yh.j7.O((yh.j7) this.f30377c, (h61) this.d, this.f30376b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public r80(u80 u80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f30375a = 0;
        this.f30377c = u80Var;
        this.f30376b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
