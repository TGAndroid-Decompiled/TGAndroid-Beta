package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vu0 implements RequestDelegate {
    public final int f39731a;
    public final org.telegram.messenger.w2 f39732b;

    public vu0(org.telegram.messenger.w2 w2Var, int i7) {
        this.f39731a = i7;
        this.f39732b = w2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39731a) {
            case 0:
                boolean z9 = tLObject instanceof TLRPC.TL_messages_emojiGroupsNotModified;
                org.telegram.messenger.w2 w2Var = this.f39732b;
                if (z9) {
                    Boolean bool = Boolean.TRUE;
                    w2Var.a(bool, null, 0L, bool);
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_emojiGroups) {
                    TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) tLObject;
                    w2Var.a(Boolean.FALSE, tL_messages_emojiGroups, Long.valueOf(tL_messages_emojiGroups.hash), Boolean.TRUE);
                    return;
                } else {
                    w2Var.a(Boolean.FALSE, null, 0L, Boolean.TRUE);
                    return;
                }
            default:
                boolean z10 = tLObject instanceof TLRPC.TL_emojiListNotModified;
                org.telegram.messenger.w2 w2Var2 = this.f39732b;
                if (z10) {
                    Boolean bool2 = Boolean.TRUE;
                    w2Var2.a(bool2, null, 0L, bool2);
                    return;
                } else if (tLObject instanceof TLRPC.TL_emojiList) {
                    TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) tLObject;
                    w2Var2.a(Boolean.FALSE, tL_emojiList, Long.valueOf(tL_emojiList.hash), Boolean.TRUE);
                    return;
                } else {
                    w2Var2.a(Boolean.FALSE, null, 0L, Boolean.TRUE);
                    return;
                }
        }
    }
}
