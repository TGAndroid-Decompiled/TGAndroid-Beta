package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class e80 implements Utilities.Callback2 {
    public final int f23596a;
    public final long f23597b;
    public final org.telegram.ui.ActionBar.f3 f23598c;
    public final Object d;

    public e80(bb bbVar, Object obj, long j3, int i10) {
        this.f23596a = i10;
        this.f23598c = bbVar;
        this.d = obj;
        this.f23597b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f23596a) {
            case 0:
                h80.m((h80) this.f23598c, this.f23597b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                xh.h4.V((xh.h4) this.f23598c, (TL_stars.TL_starGiftUnique) this.d, this.f23597b, (yh.b3) obj, (nf.e) obj2);
                return;
            default:
                yh.h7.Q((yh.h7) this.f23598c, (h51) this.d, this.f23597b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public e80(h80 h80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f23596a = 0;
        this.f23598c = h80Var;
        this.f23597b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
