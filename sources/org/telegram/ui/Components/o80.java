package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class o80 implements Utilities.Callback2 {
    public final int f26961a;
    public final long f26962b;
    public final org.telegram.ui.ActionBar.e3 f26963c;
    public final Object d;

    public o80(bb bbVar, Object obj, long j3, int i10) {
        this.f26961a = i10;
        this.f26963c = bbVar;
        this.d = obj;
        this.f26962b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f26961a) {
            case 0:
                r80.m((r80) this.f26963c, this.f26962b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                xh.h4.V((xh.h4) this.f26963c, (TL_stars.TL_starGiftUnique) this.d, this.f26962b, (yh.a3) obj, (nf.e) obj2);
                return;
            default:
                yh.h7.Q((yh.h7) this.f26963c, (v51) this.d, this.f26962b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public o80(r80 r80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f26961a = 0;
        this.f26963c = r80Var;
        this.f26962b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
