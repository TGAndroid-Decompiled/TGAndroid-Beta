package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class is implements MessagesStorage.IntCallback {
    public final int f39333a;
    public final ContactsActivity f39334b;

    public is(ContactsActivity contactsActivity, int i10) {
        this.f39333a = i10;
        this.f39334b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f39333a) {
            case 0:
                ContactsActivity contactsActivity = this.f39334b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.X = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f39334b, i10);
                return;
        }
    }
}
