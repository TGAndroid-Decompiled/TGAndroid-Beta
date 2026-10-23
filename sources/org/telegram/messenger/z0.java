package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class z0 implements RequestDelegate {
    public final int f20206a;
    public final boolean f20207b;
    public final Object f20208c;
    public final Object d;

    public z0(Object obj, Object obj2, boolean z10, int i10) {
        this.f20206a = i10;
        this.f20208c = obj;
        this.d = obj2;
        this.f20207b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20206a) {
            case 0:
                ((ChatObject.Call) this.f20208c).lambda$loadMembers$3(this.f20207b, (TL_phone.getGroupParticipants) this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f20208c).lambda$loadAvatarConstructor$243((SharedPreferences) this.d, this.f20207b, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f20208c).lambda$loadStickersByEmojiOrName$85((String) this.d, this.f20207b, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f20208c).lambda$getBlockedPeers$112(this.f20207b, (TLRPC.TL_contacts_getBlocked) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController.CommonChatsList) this.f20208c).lambda$load$1((int[]) this.d, this.f20207b, tLObject, tL_error);
                return;
        }
    }

    public z0(Object obj, boolean z10, TLObject tLObject, int i10) {
        this.f20206a = i10;
        this.f20208c = obj;
        this.f20207b = z10;
        this.d = tLObject;
    }
}
