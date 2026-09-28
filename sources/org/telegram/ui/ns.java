package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ns implements MessagesStorage.IntCallback {
    public final int f35967a;
    public final ContactsActivity f35968b;

    public ns(ContactsActivity contactsActivity, int i10) {
        this.f35967a = i10;
        this.f35968b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f35967a) {
            case 0:
                ContactsActivity contactsActivity = this.f35968b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f31023b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f35968b, i10);
                return;
        }
    }
}
