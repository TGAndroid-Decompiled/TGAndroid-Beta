package org.telegram.ui.Components;

import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.ContactsController;

public final class ChatAttachAlertContactsLayout$ShareAdapter$$ExternalSyntheticLambda0 implements ChatAttachAlertContactsLayout.UserCell.CharSequenceCallback {
    public final int $r8$classId;
    public final ContactsController.Contact f$0;

    public ChatAttachAlertContactsLayout$ShareAdapter$$ExternalSyntheticLambda0(ContactsController.Contact contact, int i) {
        this.$r8$classId = i;
        this.f$0 = contact;
    }

    @Override
    public final String run() {
        switch (this.$r8$classId) {
            case 0:
                ContactsController.Contact contact = this.f$0;
                return contact.phones.isEmpty() ? "" : PhoneFormat.getInstance().format(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f$0;
                return contact2.phones.isEmpty() ? "" : PhoneFormat.getInstance().format(contact2.phones.get(0));
        }
    }
}
