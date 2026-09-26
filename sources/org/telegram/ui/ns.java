package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ns implements MessagesStorage.IntCallback {
    public final int f35966a;
    public final ContactsActivity f35967b;

    public ns(ContactsActivity contactsActivity, int i10) {
        this.f35966a = i10;
        this.f35967b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f35966a) {
            case 0:
                ContactsActivity contactsActivity = this.f35967b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f31022b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f35967b, i10);
                return;
        }
    }
}
