package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class os implements MessagesStorage.IntCallback {
    public final int f36970a;
    public final ContactsActivity f36971b;

    public os(ContactsActivity contactsActivity, int i10) {
        this.f36970a = i10;
        this.f36971b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z4;
        switch (this.f36970a) {
            case 0:
                ContactsActivity contactsActivity = this.f36971b;
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
                ContactsActivity.W(this.f36971b, i10);
                return;
        }
    }
}
