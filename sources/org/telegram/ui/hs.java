package org.telegram.ui;
public final class hs implements Runnable {
    public final int f37783a;
    public final ContactsActivity f37784b;

    public hs(ContactsActivity contactsActivity, int i10) {
        this.f37783a = i10;
        this.f37784b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f37783a) {
            case 0:
                this.f37784b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f37784b;
                contactsActivity.f33087f.postOnAnimation(new hs(contactsActivity, 0));
                return;
        }
    }
}
