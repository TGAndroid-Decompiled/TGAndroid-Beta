package org.telegram.ui;
public final class hs implements Runnable {
    public final int f37779a;
    public final ContactsActivity f37780b;

    public hs(ContactsActivity contactsActivity, int i10) {
        this.f37779a = i10;
        this.f37780b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f37779a) {
            case 0:
                this.f37780b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f37780b;
                contactsActivity.f33083f.postOnAnimation(new hs(contactsActivity, 0));
                return;
        }
    }
}
