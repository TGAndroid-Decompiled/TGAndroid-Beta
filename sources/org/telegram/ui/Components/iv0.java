package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class iv0 implements RequestDelegate {
    public final int f36324a;
    public final org.telegram.messenger.x2 f36325b;

    public iv0(org.telegram.messenger.x2 x2Var, int i7) {
        this.f36324a = i7;
        this.f36325b = x2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36324a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_messages_emojiGroupsNotModified;
                org.telegram.messenger.x2 x2Var = this.f36325b;
                if (z10) {
                    Boolean bool = Boolean.TRUE;
                    x2Var.a(bool, null, 0L, bool);
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_emojiGroups) {
                    TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) tLObject;
                    x2Var.a(Boolean.FALSE, tL_messages_emojiGroups, Long.valueOf(tL_messages_emojiGroups.hash), Boolean.TRUE);
                    return;
                } else {
                    x2Var.a(Boolean.FALSE, null, 0L, Boolean.TRUE);
                    return;
                }
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_emojiListNotModified;
                org.telegram.messenger.x2 x2Var2 = this.f36325b;
                if (z11) {
                    Boolean bool2 = Boolean.TRUE;
                    x2Var2.a(bool2, null, 0L, bool2);
                    return;
                } else if (tLObject instanceof TLRPC.TL_emojiList) {
                    TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) tLObject;
                    x2Var2.a(Boolean.FALSE, tL_emojiList, Long.valueOf(tL_emojiList.hash), Boolean.TRUE);
                    return;
                } else {
                    x2Var2.a(Boolean.FALSE, null, 0L, Boolean.TRUE);
                    return;
                }
        }
    }
}
