package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class zv0 extends org.telegram.messenger.b3 {
    @Override
    public final void e(int i10, Object obj, org.telegram.messenger.j20 j20Var) {
        org.telegram.messenger.hs.a0(i10).f15938a.c(new ji0(i10, (Integer) obj, (org.telegram.messenger.z2) j20Var, 8));
    }

    @Override
    public final void f(int i10, Object obj, long j10, org.telegram.messenger.a3 a3Var) {
        TLRPC.TL_messages_getEmojiGroups tL_messages_getEmojiGroups;
        Integer num = (Integer) obj;
        if (num.intValue() == 1) {
            TLRPC.TL_messages_getEmojiStatusGroups tL_messages_getEmojiStatusGroups = new TLRPC.TL_messages_getEmojiStatusGroups();
            tL_messages_getEmojiStatusGroups.hash = (int) j10;
            tL_messages_getEmojiGroups = tL_messages_getEmojiStatusGroups;
        } else if (num.intValue() == 2) {
            TLRPC.TL_messages_getEmojiProfilePhotoGroups tL_messages_getEmojiProfilePhotoGroups = new TLRPC.TL_messages_getEmojiProfilePhotoGroups();
            tL_messages_getEmojiProfilePhotoGroups.hash = (int) j10;
            tL_messages_getEmojiGroups = tL_messages_getEmojiProfilePhotoGroups;
        } else if (num.intValue() == 3) {
            TLRPC.TL_messages_getEmojiStickerGroups tL_messages_getEmojiStickerGroups = new TLRPC.TL_messages_getEmojiStickerGroups();
            tL_messages_getEmojiStickerGroups.hash = (int) j10;
            tL_messages_getEmojiGroups = tL_messages_getEmojiStickerGroups;
        } else {
            TLRPC.TL_messages_getEmojiGroups tL_messages_getEmojiGroups2 = new TLRPC.TL_messages_getEmojiGroups();
            tL_messages_getEmojiGroups2.hash = (int) j10;
            tL_messages_getEmojiGroups = tL_messages_getEmojiGroups2;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getEmojiGroups, new yv0(a3Var, 0));
    }

    @Override
    public final void g(int i10, Object obj, Object obj2) {
        org.telegram.messenger.hs.a0(i10).f15938a.c(new ji0(i10, (TLRPC.TL_messages_emojiGroups) obj2, (Integer) obj, 9));
    }
}
