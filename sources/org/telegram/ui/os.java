package org.telegram.ui;
public final class os implements org.telegram.messenger.bs {
    public final int f40378a;
    public final ContactsActivity f40379b;

    public os(ContactsActivity contactsActivity, int i10) {
        this.f40378a = i10;
        this.f40379b = contactsActivity;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        switch (this.f40378a) {
            case 0:
                ContactsActivity contactsActivity = this.f40379b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.X = z10;
                if (i10 != 0) {
                    contactsActivity.g0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.Z(this.f40379b, i10);
                return;
        }
    }
}
