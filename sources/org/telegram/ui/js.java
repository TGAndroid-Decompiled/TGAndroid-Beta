package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class js implements MessagesStorage.IntCallback {
    public final int f39621a;
    public final ContactsActivity f39622b;

    public js(ContactsActivity contactsActivity, int i9) {
        this.f39621a = i9;
        this.f39622b = contactsActivity;
    }

    @Override
    public final void run(int i9) {
        boolean z10;
        switch (this.f39621a) {
            case 0:
                ContactsActivity contactsActivity = this.f39622b;
                contactsActivity.getClass();
                if (i9 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.X = z10;
                if (i9 != 0) {
                    contactsActivity.e0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.V(this.f39622b, i9);
                return;
        }
    }
}
