package org.telegram.ui;
public final class hs implements Runnable {
    public final int f37784a;
    public final ContactsActivity f37785b;

    public hs(ContactsActivity contactsActivity, int i10) {
        this.f37784a = i10;
        this.f37785b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f37784a) {
            case 0:
                this.f37785b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f37785b;
                contactsActivity.f33088f.postOnAnimation(new hs(contactsActivity, 0));
                return;
        }
    }
}
