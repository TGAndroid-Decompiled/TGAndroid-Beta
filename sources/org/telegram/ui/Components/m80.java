package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class m80 implements Utilities.Callback2 {
    public final int f26353a;
    public final long f26354b;
    public final org.telegram.ui.ActionBar.f3 f26355c;
    public final Object d;

    public m80(bb bbVar, Object obj, long j3, int i10) {
        this.f26353a = i10;
        this.f26355c = bbVar;
        this.d = obj;
        this.f26354b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f26353a) {
            case 0:
                p80.m((p80) this.f26355c, this.f26354b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                xh.h4.V((xh.h4) this.f26355c, (TL_stars.TL_starGiftUnique) this.d, this.f26354b, (yh.b3) obj, (nf.e) obj2);
                return;
            default:
                yh.g7.Q((yh.g7) this.f26355c, (x51) this.d, this.f26354b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public m80(p80 p80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f26353a = 0;
        this.f26355c = p80Var;
        this.f26354b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
