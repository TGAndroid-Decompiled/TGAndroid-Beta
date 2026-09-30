package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ns implements MessagesStorage.IntCallback {
    public final int f36105a;
    public final ContactsActivity f36106b;

    public ns(ContactsActivity contactsActivity, int i10) {
        this.f36105a = i10;
        this.f36106b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f36105a) {
            case 0:
                ContactsActivity contactsActivity = this.f36106b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f31097b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f36106b, i10);
                return;
        }
    }
}
