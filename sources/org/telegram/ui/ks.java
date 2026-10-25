package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ks implements MessagesStorage.IntCallback {
    public final int f41062a;
    public final ContactsActivity f41063b;

    public ks(ContactsActivity contactsActivity, int i10) {
        this.f41062a = i10;
        this.f41063b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f41062a) {
            case 0:
                ContactsActivity contactsActivity = this.f41063b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.X = z10;
                if (i10 != 0) {
                    contactsActivity.d0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f41063b, i10);
                return;
        }
    }
}
