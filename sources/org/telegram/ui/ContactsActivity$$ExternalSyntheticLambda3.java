package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

public final class ContactsActivity$$ExternalSyntheticLambda3 implements MessagesStorage.IntCallback {
    public final int $r8$classId;
    public final ContactsActivity f$0;

    public ContactsActivity$$ExternalSyntheticLambda3(ContactsActivity contactsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = contactsActivity;
    }

    @Override
    public final void run(int i) {
        switch (this.$r8$classId) {
            case 0:
                ContactsActivity contactsActivity = this.f$0;
                contactsActivity.getClass();
                contactsActivity.askAboutContacts = i != 0;
                if (i != 0) {
                    contactsActivity.askForPermissons(false);
                    break;
                }
                break;
            default:
                this.f$0.lambda$askForPermissons$13(i);
                break;
        }
    }
}
