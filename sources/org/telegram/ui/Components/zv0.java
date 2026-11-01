package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zv0 implements RequestDelegate {
    public final int f33239a;
    public final org.telegram.messenger.a3 f33240b;

    public zv0(org.telegram.messenger.a3 a3Var, int i10) {
        this.f33239a = i10;
        this.f33240b = a3Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33239a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_messages_emojiGroupsNotModified;
                org.telegram.messenger.a3 a3Var = this.f33240b;
                if (z10) {
                    Boolean bool = Boolean.TRUE;
                    a3Var.a(bool, null, 0L, bool);
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_emojiGroups) {
                    TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) tLObject;
                    a3Var.a(Boolean.FALSE, tL_messages_emojiGroups, Long.valueOf(tL_messages_emojiGroups.hash), Boolean.TRUE);
                    return;
                } else {
                    a3Var.a(Boolean.FALSE, null, 0L, Boolean.TRUE);
                    return;
                }
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_emojiListNotModified;
                org.telegram.messenger.a3 a3Var2 = this.f33240b;
                if (z11) {
                    Boolean bool2 = Boolean.TRUE;
                    a3Var2.a(bool2, null, 0L, bool2);
                    return;
                } else if (tLObject instanceof TLRPC.TL_emojiList) {
                    TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) tLObject;
                    a3Var2.a(Boolean.FALSE, tL_emojiList, Long.valueOf(tL_emojiList.hash), Boolean.TRUE);
                    return;
                } else {
                    a3Var2.a(Boolean.FALSE, null, 0L, Boolean.TRUE);
                    return;
                }
        }
    }
}
