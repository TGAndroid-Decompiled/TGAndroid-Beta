package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class f90 implements Utilities.Callback2 {
    public final int f26398a;
    public final long f26399b;
    public final org.telegram.ui.ActionBar.e3 f26400c;
    public final Object d;

    public f90(db dbVar, Object obj, long j3, int i10) {
        this.f26398a = i10;
        this.f26400c = dbVar;
        this.d = obj;
        this.f26399b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f26398a) {
            case 0:
                i90.o((i90) this.f26400c, this.f26399b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                xh.h4.W((xh.h4) this.f26400c, (TL_stars.TL_starGiftUnique) this.d, this.f26399b, (yh.w2) obj, (of.e) obj2);
                return;
            default:
                yh.a7.R((yh.a7) this.f26400c, (q61) this.d, this.f26399b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public f90(i90 i90Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f26398a = 0;
        this.f26400c = i90Var;
        this.f26399b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
