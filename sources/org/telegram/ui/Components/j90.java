package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class j90 implements Utilities.Callback2 {
    public final int f27413a;
    public final long f27414b;
    public final org.telegram.ui.ActionBar.e3 f27415c;
    public final Object d;

    public j90(db dbVar, Object obj, long j3, int i10) {
        this.f27413a = i10;
        this.f27415c = dbVar;
        this.d = obj;
        this.f27414b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f27413a) {
            case 0:
                m90.o((m90) this.f27415c, this.f27414b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                xh.g4.W((xh.g4) this.f27415c, (TL_stars.TL_starGiftUnique) this.d, this.f27414b, (yh.w2) obj, (of.e) obj2);
                return;
            default:
                yh.a7.R((yh.a7) this.f27415c, (u61) this.d, this.f27414b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public j90(m90 m90Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f27413a = 0;
        this.f27415c = m90Var;
        this.f27414b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
