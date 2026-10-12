package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class d90 implements Utilities.Callback2 {
    public final int f24324a;
    public final long f24325b;
    public final org.telegram.ui.ActionBar.e3 f24326c;
    public final Object d;

    public d90(db dbVar, Object obj, long j10, int i10) {
        this.f24324a = i10;
        this.f24326c = dbVar;
        this.d = obj;
        this.f24325b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f24324a) {
            case 0:
                g90.n((g90) this.f24326c, this.f24325b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                yh.f4.W((yh.f4) this.f24326c, (TL_stars.TL_starGiftUnique) this.d, this.f24325b, (zh.v2) obj, (pf.c) obj2);
                return;
            default:
                zh.a7.R((zh.a7) this.f24326c, (l61) this.d, this.f24325b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public d90(g90 g90Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f24324a = 0;
        this.f24326c = g90Var;
        this.f24325b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
