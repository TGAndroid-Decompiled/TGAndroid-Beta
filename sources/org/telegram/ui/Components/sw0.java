package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sw0 implements RequestDelegate {
    public final int f30433a;
    public final Utilities.Callback4 f30434b;

    public sw0(Utilities.Callback4 callback4, int i10) {
        this.f30433a = i10;
        this.f30434b = callback4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f30433a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_messages_emojiGroupsNotModified;
                Utilities.Callback4 callback4 = this.f30434b;
                if (z10) {
                    Boolean bool = Boolean.TRUE;
                    callback4.run(bool, null, 0L, bool);
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_emojiGroups) {
                    TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) tLObject;
                    callback4.run(Boolean.FALSE, tL_messages_emojiGroups, Long.valueOf(tL_messages_emojiGroups.hash), Boolean.TRUE);
                    return;
                } else {
                    callback4.run(Boolean.FALSE, null, 0L, Boolean.TRUE);
                    return;
                }
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_emojiListNotModified;
                Utilities.Callback4 callback42 = this.f30434b;
                if (z11) {
                    Boolean bool2 = Boolean.TRUE;
                    callback42.run(bool2, null, 0L, bool2);
                    return;
                } else if (tLObject instanceof TLRPC.TL_emojiList) {
                    TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) tLObject;
                    callback42.run(Boolean.FALSE, tL_emojiList, Long.valueOf(tL_emojiList.hash), Boolean.TRUE);
                    return;
                } else {
                    callback42.run(Boolean.FALSE, null, 0L, Boolean.TRUE);
                    return;
                }
        }
    }
}
