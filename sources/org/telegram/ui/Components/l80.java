package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class l80 implements Utilities.Callback2 {
    public final int f26052a;
    public final long f26053b;
    public final org.telegram.ui.ActionBar.f3 f26054c;
    public final Object d;

    public l80(ab abVar, Object obj, long j3, int i10) {
        this.f26052a = i10;
        this.f26054c = abVar;
        this.d = obj;
        this.f26053b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f26052a) {
            case 0:
                o80.m((o80) this.f26054c, this.f26053b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                xh.h4.V((xh.h4) this.f26054c, (TL_stars.TL_starGiftUnique) this.d, this.f26053b, (yh.b3) obj, (nf.e) obj2);
                return;
            default:
                yh.h7.Q((yh.h7) this.f26054c, (w51) this.d, this.f26053b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public l80(o80 o80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f26052a = 0;
        this.f26054c = o80Var;
        this.f26053b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
