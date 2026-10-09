package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class f90 implements Utilities.Callback2 {
    public final int f26317a;
    public final long f26318b;
    public final org.telegram.ui.ActionBar.f3 f26319c;
    public final Object d;

    public f90(eb ebVar, Object obj, long j3, int i10) {
        this.f26317a = i10;
        this.f26319c = ebVar;
        this.d = obj;
        this.f26318b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f26317a) {
            case 0:
                i90.o((i90) this.f26319c, this.f26318b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                xh.h4.W((xh.h4) this.f26319c, (TL_stars.TL_starGiftUnique) this.d, this.f26318b, (yh.w2) obj, (of.e) obj2);
                return;
            default:
                yh.a7.R((yh.a7) this.f26319c, (p61) this.d, this.f26318b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public f90(i90 i90Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f26317a = 0;
        this.f26319c = i90Var;
        this.f26318b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
