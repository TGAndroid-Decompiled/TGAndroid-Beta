package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ms implements MessagesStorage.IntCallback {
    public final int f41563a;
    public final ContactsActivity f41564b;

    public ms(ContactsActivity contactsActivity, int i10) {
        this.f41563a = i10;
        this.f41564b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f41563a) {
            case 0:
                ContactsActivity contactsActivity = this.f41564b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.X = z10;
                if (i10 != 0) {
                    contactsActivity.d0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f41564b, i10);
                return;
        }
    }
}
