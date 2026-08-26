package org.telegram.ui.Components;

import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.UserObject$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;

public final class ChatAttachAlertContactsLayout$ShareAdapter$$ExternalSyntheticLambda1 implements ChatAttachAlertContactsLayout.UserCell.CharSequenceCallback {
    public final int $r8$classId;
    public final TLRPC.User f$0;

    public ChatAttachAlertContactsLayout$ShareAdapter$$ExternalSyntheticLambda1(int i, TLRPC.User user) {
        this.$r8$classId = i;
        this.f$0 = user;
    }

    @Override
    public final String run() {
        switch (this.$r8$classId) {
            case 0:
                return UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), this.f$0.phone, PhoneFormat.getInstance());
            default:
                return UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), this.f$0.phone, PhoneFormat.getInstance());
        }
    }
}
