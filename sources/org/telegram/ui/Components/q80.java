package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q80 implements Utilities.Callback2 {
    public final int f27614a;
    public final long f27615b;
    public final org.telegram.ui.ActionBar.g3 f27616c;
    public final Object d;

    public q80(bb bbVar, Object obj, long j3, int i10) {
        this.f27614a = i10;
        this.f27616c = bbVar;
        this.d = obj;
        this.f27615b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f27614a) {
            case 0:
                t80.m((t80) this.f27616c, this.f27615b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                xh.i4.V((xh.i4) this.f27616c, (TL_stars.TL_starGiftUnique) this.d, this.f27615b, (yh.a3) obj, (nf.e) obj2);
                return;
            default:
                yh.g7.Q((yh.g7) this.f27616c, (x51) this.d, this.f27615b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public q80(t80 t80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f27614a = 0;
        this.f27616c = t80Var;
        this.f27615b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
