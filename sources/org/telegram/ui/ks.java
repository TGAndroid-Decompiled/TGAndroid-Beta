package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

public final class ks implements MessagesStorage.IntCallback {

    public final int f39849a;

    public final ContactsActivity f39850b;

    public ks(ContactsActivity contactsActivity, int i10) {
        this.f39849a = i10;
        this.f39850b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        switch (this.f39849a) {
            case 0:
                ContactsActivity contactsActivity = this.f39850b;
                contactsActivity.getClass();
                contactsActivity.X = i10 != 0;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    break;
                }
                break;
            default:
                ContactsActivity.W(this.f39850b, i10);
                break;
        }
    }
}
