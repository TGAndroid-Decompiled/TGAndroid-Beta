package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class n80 implements Utilities.Callback2 {
    public final int f25451a;
    public final long f25452b;
    public final org.telegram.ui.ActionBar.h3 f25453c;
    public final Object d;

    public n80(ab abVar, Object obj, long j3, int i10) {
        this.f25451a = i10;
        this.f25453c = abVar;
        this.d = obj;
        this.f25452b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f25451a) {
            case 0:
                q80.m((q80) this.f25453c, this.f25452b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                wh.g4.V((wh.g4) this.f25453c, (TL_stars.TL_starGiftUnique) this.d, this.f25452b, (xh.a3) obj, (nf.e) obj2);
                return;
            default:
                xh.k7.Q((xh.k7) this.f25453c, (v51) this.d, this.f25452b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public n80(q80 q80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f25451a = 0;
        this.f25453c = q80Var;
        this.f25452b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
