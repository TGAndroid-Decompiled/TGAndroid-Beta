package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ns implements MessagesStorage.IntCallback {
    public final int f35943a;
    public final ContactsActivity f35944b;

    public ns(ContactsActivity contactsActivity, int i10) {
        this.f35943a = i10;
        this.f35944b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f35943a) {
            case 0:
                ContactsActivity contactsActivity = this.f35944b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f31009b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f35944b, i10);
                return;
        }
    }
}
