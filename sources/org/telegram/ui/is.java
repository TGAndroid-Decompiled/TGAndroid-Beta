package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class is implements MessagesStorage.IntCallback {
    public final int f37970a;
    public final ContactsActivity f37971b;

    public is(ContactsActivity contactsActivity, int i10) {
        this.f37970a = i10;
        this.f37971b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f37970a) {
            case 0:
                ContactsActivity contactsActivity = this.f37971b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f33066b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f37971b, i10);
                return;
        }
    }
}
