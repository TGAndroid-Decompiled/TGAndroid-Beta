package org.telegram.ui;
public final class hs implements Runnable {
    public final int f37802a;
    public final ContactsActivity f37803b;

    public hs(ContactsActivity contactsActivity, int i10) {
        this.f37802a = i10;
        this.f37803b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f37802a) {
            case 0:
                this.f37803b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f37803b;
                contactsActivity.f33077f.postOnAnimation(new hs(contactsActivity, 0));
                return;
        }
    }
}
