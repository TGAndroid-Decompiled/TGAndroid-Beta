package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ps implements MessagesStorage.IntCallback {
    public final int f40120a;
    public final ContactsActivity f40121b;

    public ps(ContactsActivity contactsActivity, int i10) {
        this.f40120a = i10;
        this.f40121b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z4;
        switch (this.f40120a) {
            case 0:
                ContactsActivity contactsActivity = this.f40121b;
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
                ContactsActivity.W(this.f40121b, i10);
                return;
        }
    }
}
