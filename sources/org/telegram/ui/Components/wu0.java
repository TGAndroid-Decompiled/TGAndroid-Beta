package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class wu0 extends org.telegram.messenger.x2 {
    @Override
    public final void e(int i7, Object obj, org.telegram.messenger.v10 v10Var) {
        org.telegram.messenger.yr.a0(i7).f26688a.c(new org.telegram.ui.q8(i7, (Integer) obj, (org.telegram.messenger.v2) v10Var, 21));
    }

    @Override
    public final void f(int i7, Object obj, long j3, org.telegram.messenger.w2 w2Var) {
        TLRPC.TL_messages_getEmojiGroups tL_messages_getEmojiGroups;
        Integer num = (Integer) obj;
        if (num.intValue() == 1) {
            TLRPC.TL_messages_getEmojiStatusGroups tL_messages_getEmojiStatusGroups = new TLRPC.TL_messages_getEmojiStatusGroups();
            tL_messages_getEmojiStatusGroups.hash = (int) j3;
            tL_messages_getEmojiGroups = tL_messages_getEmojiStatusGroups;
        } else if (num.intValue() == 2) {
            TLRPC.TL_messages_getEmojiProfilePhotoGroups tL_messages_getEmojiProfilePhotoGroups = new TLRPC.TL_messages_getEmojiProfilePhotoGroups();
            tL_messages_getEmojiProfilePhotoGroups.hash = (int) j3;
            tL_messages_getEmojiGroups = tL_messages_getEmojiProfilePhotoGroups;
        } else if (num.intValue() == 3) {
            TLRPC.TL_messages_getEmojiStickerGroups tL_messages_getEmojiStickerGroups = new TLRPC.TL_messages_getEmojiStickerGroups();
            tL_messages_getEmojiStickerGroups.hash = (int) j3;
            tL_messages_getEmojiGroups = tL_messages_getEmojiStickerGroups;
        } else {
            TLRPC.TL_messages_getEmojiGroups tL_messages_getEmojiGroups2 = new TLRPC.TL_messages_getEmojiGroups();
            tL_messages_getEmojiGroups2.hash = (int) j3;
            tL_messages_getEmojiGroups = tL_messages_getEmojiGroups2;
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getEmojiGroups, new vu0(w2Var, 0));
    }

    @Override
    public final void g(int i7, Object obj, Object obj2) {
        org.telegram.messenger.yr.a0(i7).f26688a.c(new org.telegram.ui.q8(i7, (TLRPC.TL_messages_emojiGroups) obj2, (Integer) obj, 22));
    }
}
