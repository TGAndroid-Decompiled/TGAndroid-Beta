package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class o80 implements Utilities.Callback2 {
    public final int f27008a;
    public final long f27009b;
    public final org.telegram.ui.ActionBar.f3 f27010c;
    public final Object d;

    public o80(ab abVar, Object obj, long j3, int i10) {
        this.f27008a = i10;
        this.f27010c = abVar;
        this.d = obj;
        this.f27009b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f27008a) {
            case 0:
                r80.m((r80) this.f27010c, this.f27009b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                xh.h4.V((xh.h4) this.f27010c, (TL_stars.TL_starGiftUnique) this.d, this.f27009b, (yh.b3) obj, (nf.e) obj2);
                return;
            default:
                yh.h7.Q((yh.h7) this.f27010c, (y51) this.d, this.f27009b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public o80(r80 r80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f27008a = 0;
        this.f27010c = r80Var;
        this.f27009b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
