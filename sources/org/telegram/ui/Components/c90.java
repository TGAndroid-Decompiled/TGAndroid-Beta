package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class c90 implements Utilities.Callback2 {
    public final int f23656a;
    public final long f23657b;
    public final org.telegram.ui.ActionBar.e3 f23658c;
    public final Object d;

    public c90(db dbVar, Object obj, long j10, int i10) {
        this.f23656a = i10;
        this.f23658c = dbVar;
        this.d = obj;
        this.f23657b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f23656a) {
            case 0:
                f90.n((f90) this.f23658c, this.f23657b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                yh.f4.W((yh.f4) this.f23658c, (TL_stars.TL_starGiftUnique) this.d, this.f23657b, (zh.v2) obj, (pf.c) obj2);
                return;
            default:
                zh.a7.R((zh.a7) this.f23658c, (m61) this.d, this.f23657b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public c90(f90 f90Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f23656a = 0;
        this.f23658c = f90Var;
        this.f23657b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
