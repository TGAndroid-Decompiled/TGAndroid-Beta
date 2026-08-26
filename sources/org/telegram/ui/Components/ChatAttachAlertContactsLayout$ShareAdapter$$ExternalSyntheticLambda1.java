package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

public final class ChatAttachAlertContactsLayout$ShareAdapter$$ExternalSyntheticLambda1 implements ChatAttachAlertContactsLayout.UserCell.CharSequenceCallback {
    public final int $r8$classId;
    public final TLRPC.User f$0;

    public ChatAttachAlertContactsLayout$ShareAdapter$$ExternalSyntheticLambda1(TLRPC.User user, int i) {
        this.$r8$classId = i;
        this.f$0 = user;
    }

    @Override
    public final CharSequence run() {
        switch (this.$r8$classId) {
            case 0:
                return ChatAttachAlertContactsLayout.ShareAdapter.lambda$onBindViewHolder$1(this.f$0);
            default:
                return ChatAttachAlertContactsLayout.ShareSearchAdapter.lambda$onBindViewHolder$5(this.f$0);
        }
    }
}
