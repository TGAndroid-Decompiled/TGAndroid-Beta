package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class is implements MessagesStorage.IntCallback {
    public final int f38381a;
    public final ContactsActivity f38382b;

    public is(ContactsActivity contactsActivity, int i10) {
        this.f38381a = i10;
        this.f38382b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f38381a) {
            case 0:
                ContactsActivity contactsActivity = this.f38382b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f33382b0 = z10;
                if (i10 != 0) {
                    contactsActivity.e0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.V(this.f38382b, i10);
                return;
        }
    }
}
