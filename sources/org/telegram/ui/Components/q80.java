package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q80 implements Utilities.Callback2 {
    public final int f27571a;
    public final long f27572b;
    public final org.telegram.ui.ActionBar.e3 f27573c;
    public final Object d;

    public q80(bb bbVar, Object obj, long j3, int i10) {
        this.f27571a = i10;
        this.f27573c = bbVar;
        this.d = obj;
        this.f27572b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f27571a) {
            case 0:
                t80.m((t80) this.f27573c, this.f27572b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                xh.h4.V((xh.h4) this.f27573c, (TL_stars.TL_starGiftUnique) this.d, this.f27572b, (yh.a3) obj, (nf.e) obj2);
                return;
            default:
                yh.h7.Q((yh.h7) this.f27573c, (x51) this.d, this.f27572b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public q80(t80 t80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f27571a = 0;
        this.f27573c = t80Var;
        this.f27572b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
