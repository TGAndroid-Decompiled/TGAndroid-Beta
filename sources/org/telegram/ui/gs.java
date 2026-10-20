package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class gs implements MessagesStorage.IntCallback {
    public final int f37408a;
    public final ContactsActivity f37409b;

    public gs(ContactsActivity contactsActivity, int i10) {
        this.f37408a = i10;
        this.f37409b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f37408a) {
            case 0:
                ContactsActivity contactsActivity = this.f37409b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f33078b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f37409b, i10);
                return;
        }
    }
}
