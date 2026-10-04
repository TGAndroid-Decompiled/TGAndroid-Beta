package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r80 implements Utilities.Callback2 {
    public final int f30299a;
    public final long f30300b;
    public final org.telegram.ui.ActionBar.f3 f30301c;
    public final Object d;

    public r80(cb cbVar, Object obj, long j3, int i10) {
        this.f30299a = i10;
        this.f30301c = cbVar;
        this.d = obj;
        this.f30300b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f30299a) {
            case 0:
                u80.m((u80) this.f30301c, this.f30300b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                xh.h4.T((xh.h4) this.f30301c, (TL_stars.TL_starGiftUnique) this.d, this.f30300b, (yh.a3) obj, (nf.e) obj2);
                return;
            default:
                yh.i7.O((yh.i7) this.f30301c, (g61) this.d, this.f30300b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public r80(u80 u80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f30299a = 0;
        this.f30301c = u80Var;
        this.f30300b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
