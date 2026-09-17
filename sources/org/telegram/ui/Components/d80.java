package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class d80 implements Utilities.Callback2 {
    public final int f25319a;
    public final long f25320b;
    public final org.telegram.ui.ActionBar.f3 f25321c;
    public final Object d;

    public d80(bb bbVar, Object obj, long j3, int i10) {
        this.f25319a = i10;
        this.f25321c = bbVar;
        this.d = obj;
        this.f25320b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f25319a) {
            case 0:
                g80.m((g80) this.f25321c, this.f25320b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                yh.f4.V((yh.f4) this.f25321c, (TL_stars.TL_starGiftUnique) this.d, this.f25320b, (zh.a3) obj, (of.e) obj2);
                return;
            default:
                zh.g7.Q((zh.g7) this.f25321c, (h51) this.d, this.f25320b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public d80(g80 g80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f25319a = 0;
        this.f25321c = g80Var;
        this.f25320b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
