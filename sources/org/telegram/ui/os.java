package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class os implements MessagesStorage.IntCallback {
    public final int f35950a;
    public final ContactsActivity f35951b;

    public os(ContactsActivity contactsActivity, int i10) {
        this.f35950a = i10;
        this.f35951b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f35950a) {
            case 0:
                ContactsActivity contactsActivity = this.f35951b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f30708b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f35951b, i10);
                return;
        }
    }
}
