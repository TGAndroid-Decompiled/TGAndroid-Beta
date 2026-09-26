package org.telegram.ui;
public final class os implements Runnable {
    public final int f36339a;
    public final ContactsActivity f36340b;

    public os(ContactsActivity contactsActivity, int i10) {
        this.f36339a = i10;
        this.f36340b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f36339a) {
            case 0:
                this.f36340b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f36340b;
                contactsActivity.f31028f.postOnAnimation(new os(contactsActivity, 0));
                return;
        }
    }
}
