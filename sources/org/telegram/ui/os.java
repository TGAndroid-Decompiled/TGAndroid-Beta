package org.telegram.ui;
public final class os implements org.telegram.messenger.cs {
    public final int f40261a;
    public final ContactsActivity f40262b;

    public os(ContactsActivity contactsActivity, int i10) {
        this.f40261a = i10;
        this.f40262b = contactsActivity;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        switch (this.f40261a) {
            case 0:
                ContactsActivity contactsActivity = this.f40262b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.X = z10;
                if (i10 != 0) {
                    contactsActivity.h0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.a0(this.f40262b, i10);
                return;
        }
    }
}
