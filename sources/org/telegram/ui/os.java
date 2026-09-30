package org.telegram.ui;
public final class os implements Runnable {
    public final int f36444a;
    public final ContactsActivity f36445b;

    public os(ContactsActivity contactsActivity, int i10) {
        this.f36444a = i10;
        this.f36445b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f36444a) {
            case 0:
                this.f36445b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f36445b;
                contactsActivity.f31102f.postOnAnimation(new os(contactsActivity, 0));
                return;
        }
    }
}
