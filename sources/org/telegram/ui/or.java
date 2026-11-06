package org.telegram.ui;
public final class or implements org.telegram.messenger.sr {
    public final int f48534a;
    public final ContactsActivity f48535b;

    public or(ContactsActivity contactsActivity, int i7) {
        this.f48534a = i7;
        this.f48535b = contactsActivity;
    }

    @Override
    public final void a(int i7) {
        boolean z9;
        switch (this.f48534a) {
            case 0:
                ContactsActivity contactsActivity = this.f48535b;
                contactsActivity.getClass();
                if (i7 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                contactsActivity.X = z9;
                if (i7 != 0) {
                    contactsActivity.h0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.a0(this.f48535b, i7);
                return;
        }
    }
}
