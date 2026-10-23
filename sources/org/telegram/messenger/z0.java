package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class z0 implements RequestDelegate {
    public final int f20270a;
    public final boolean f20271b;
    public final Object f20272c;
    public final Object d;

    public z0(Object obj, Object obj2, boolean z10, int i10) {
        this.f20270a = i10;
        this.f20272c = obj;
        this.d = obj2;
        this.f20271b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20270a) {
            case 0:
                ((ChatObject.Call) this.f20272c).lambda$loadMembers$3(this.f20271b, (TL_phone.getGroupParticipants) this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f20272c).lambda$loadAvatarConstructor$243((SharedPreferences) this.d, this.f20271b, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f20272c).lambda$loadStickersByEmojiOrName$85((String) this.d, this.f20271b, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f20272c).lambda$getBlockedPeers$112(this.f20271b, (TLRPC.TL_contacts_getBlocked) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController.CommonChatsList) this.f20272c).lambda$load$1((int[]) this.d, this.f20271b, tLObject, tL_error);
                return;
        }
    }

    public z0(Object obj, boolean z10, TLObject tLObject, int i10) {
        this.f20270a = i10;
        this.f20272c = obj;
        this.f20271b = z10;
        this.d = tLObject;
    }
}
