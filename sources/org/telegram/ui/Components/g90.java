package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class g90 implements Utilities.Callback2 {
    public final int f26646a;
    public final long f26647b;
    public final org.telegram.ui.ActionBar.e3 f26648c;
    public final Object d;

    public g90(db dbVar, Object obj, long j3, int i10) {
        this.f26646a = i10;
        this.f26648c = dbVar;
        this.d = obj;
        this.f26647b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f26646a) {
            case 0:
                j90.o((j90) this.f26648c, this.f26647b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                xh.h4.W((xh.h4) this.f26648c, (TL_stars.TL_starGiftUnique) this.d, this.f26647b, (yh.w2) obj, (of.e) obj2);
                return;
            default:
                yh.a7.R((yh.a7) this.f26648c, (r61) this.d, this.f26647b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public g90(j90 j90Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f26646a = 0;
        this.f26648c = j90Var;
        this.f26647b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
