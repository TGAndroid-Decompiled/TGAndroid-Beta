package org.telegram.ui;
public final class ps implements Runnable {
    public final int f37506a;
    public final ContactsActivity f37507b;

    public ps(ContactsActivity contactsActivity, int i10) {
        this.f37506a = i10;
        this.f37507b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f37506a) {
            case 0:
                this.f37507b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f37507b;
                contactsActivity.f31543f.postOnAnimation(new ps(contactsActivity, 0));
                return;
        }
    }
}
