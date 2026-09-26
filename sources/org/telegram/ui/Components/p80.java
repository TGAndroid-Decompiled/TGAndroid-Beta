package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class p80 implements Utilities.Callback2 {
    public final int f27244a;
    public final long f27245b;
    public final org.telegram.ui.ActionBar.e3 f27246c;
    public final Object d;

    public p80(bb bbVar, Object obj, long j3, int i10) {
        this.f27244a = i10;
        this.f27246c = bbVar;
        this.d = obj;
        this.f27245b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f27244a) {
            case 0:
                s80.m((s80) this.f27246c, this.f27245b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                xh.h4.V((xh.h4) this.f27246c, (TL_stars.TL_starGiftUnique) this.d, this.f27245b, (yh.a3) obj, (nf.e) obj2);
                return;
            default:
                yh.h7.Q((yh.h7) this.f27246c, (w51) this.d, this.f27245b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public p80(s80 s80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f27244a = 0;
        this.f27246c = s80Var;
        this.f27245b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
