package org.telegram.ui;
public final class hs implements Runnable {
    public final int f37773a;
    public final ContactsActivity f37774b;

    public hs(ContactsActivity contactsActivity, int i10) {
        this.f37773a = i10;
        this.f37774b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f37773a) {
            case 0:
                this.f37774b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f37774b;
                contactsActivity.f33077f.postOnAnimation(new hs(contactsActivity, 0));
                return;
        }
    }
}
