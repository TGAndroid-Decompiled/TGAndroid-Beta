package org.telegram.ui;
public final class mr implements org.telegram.messenger.kr {
    public final int f47768a;
    public final ContactsActivity f47769b;

    public mr(ContactsActivity contactsActivity, int i3) {
        this.f47768a = i3;
        this.f47769b = contactsActivity;
    }

    @Override
    public final void a(int i3) {
        boolean z10;
        switch (this.f47768a) {
            case 0:
                ContactsActivity contactsActivity = this.f47769b;
                contactsActivity.getClass();
                if (i3 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.Y = z10;
                if (i3 != 0) {
                    contactsActivity.h0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.a0(this.f47769b, i3);
                return;
        }
    }
}
