package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r80 implements Utilities.Callback2 {
    public final int f27868a;
    public final long f27869b;
    public final org.telegram.ui.ActionBar.e3 f27870c;
    public final Object d;

    public r80(cb cbVar, Object obj, long j3, int i10) {
        this.f27868a = i10;
        this.f27870c = cbVar;
        this.d = obj;
        this.f27869b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f27868a) {
            case 0:
                u80.m((u80) this.f27870c, this.f27869b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                xh.h4.V((xh.h4) this.f27870c, (TL_stars.TL_starGiftUnique) this.d, this.f27869b, (yh.a3) obj, (nf.e) obj2);
                return;
            default:
                yh.h7.Q((yh.h7) this.f27870c, (y51) this.d, this.f27869b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public r80(u80 u80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f27868a = 0;
        this.f27870c = u80Var;
        this.f27869b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
