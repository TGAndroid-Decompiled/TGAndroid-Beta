package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class dw0 implements RequestDelegate {

    public final int f27858a;

    public final Utilities.Callback4 f27859b;

    public dw0(Utilities.Callback4 callback4, int i10) {
        this.f27858a = i10;
        this.f27859b = callback4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27858a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_messages_emojiGroupsNotModified;
                Utilities.Callback4 callback4 = this.f27859b;
                if (z10) {
                    Boolean bool = Boolean.TRUE;
                    callback4.run(bool, null, 0L, bool);
                } else if (!(tLObject instanceof TLRPC.TL_messages_emojiGroups)) {
                    callback4.run(Boolean.FALSE, null, 0L, Boolean.TRUE);
                } else {
                    TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) tLObject;
                    callback4.run(Boolean.FALSE, tL_messages_emojiGroups, Long.valueOf(tL_messages_emojiGroups.hash), Boolean.TRUE);
                }
                break;
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_emojiListNotModified;
                Utilities.Callback4 callback5 = this.f27859b;
                if (z11) {
                    Boolean bool2 = Boolean.TRUE;
                    callback5.run(bool2, null, 0L, bool2);
                } else if (!(tLObject instanceof TLRPC.TL_emojiList)) {
                    callback5.run(Boolean.FALSE, null, 0L, Boolean.TRUE);
                } else {
                    TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) tLObject;
                    callback5.run(Boolean.FALSE, tL_emojiList, Long.valueOf(tL_emojiList.hash), Boolean.TRUE);
                }
                break;
        }
    }
}
