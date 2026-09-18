package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class d80 implements Utilities.Callback2 {
    public final int f23232a;
    public final long f23233b;
    public final org.telegram.ui.ActionBar.g3 f23234c;
    public final Object d;

    public d80(za zaVar, Object obj, long j3, int i10) {
        this.f23232a = i10;
        this.f23234c = zaVar;
        this.d = obj;
        this.f23233b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f23232a) {
            case 0:
                g80.m((g80) this.f23234c, this.f23233b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                xh.g4.V((xh.g4) this.f23234c, (TL_stars.TL_starGiftUnique) this.d, this.f23233b, (yh.d3) obj, (nf.e) obj2);
                return;
            default:
                yh.j7.Q((yh.j7) this.f23234c, (j51) this.d, this.f23233b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public d80(g80 g80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f23232a = 0;
        this.f23234c = g80Var;
        this.f23233b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
