package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ps implements MessagesStorage.IntCallback {
    public final int f40151a;
    public final ContactsActivity f40152b;

    public ps(ContactsActivity contactsActivity, int i10) {
        this.f40151a = i10;
        this.f40152b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z4;
        switch (this.f40151a) {
            case 0:
                ContactsActivity contactsActivity = this.f40152b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                contactsActivity.Y = z4;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f40152b, i10);
                return;
        }
    }
}
