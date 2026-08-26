package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;

public final class ChatAttachAlertContactsLayout$ShareAdapter$$ExternalSyntheticLambda0 implements ChatAttachAlertContactsLayout.UserCell.CharSequenceCallback {
    public final int $r8$classId;
    public final ContactsController.Contact f$0;

    public ChatAttachAlertContactsLayout$ShareAdapter$$ExternalSyntheticLambda0(ContactsController.Contact contact, int i) {
        this.$r8$classId = i;
        this.f$0 = contact;
    }

    @Override
    public final CharSequence run() {
        switch (this.$r8$classId) {
            case 0:
                return ChatAttachAlertContactsLayout.ShareAdapter.lambda$onBindViewHolder$0(this.f$0);
            default:
                return ChatAttachAlertContactsLayout.ShareSearchAdapter.lambda$onBindViewHolder$4(this.f$0);
        }
    }
}
