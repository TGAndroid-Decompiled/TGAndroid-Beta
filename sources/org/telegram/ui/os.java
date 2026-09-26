package org.telegram.ui;
public final class os implements Runnable {
    public final int f36338a;
    public final ContactsActivity f36339b;

    public os(ContactsActivity contactsActivity, int i10) {
        this.f36338a = i10;
        this.f36339b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f36338a) {
            case 0:
                this.f36339b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f36339b;
                contactsActivity.f31027f.postOnAnimation(new os(contactsActivity, 0));
                return;
        }
    }
}
