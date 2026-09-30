package org.telegram.ui;
public final class os implements Runnable {
    public final int f36341a;
    public final ContactsActivity f36342b;

    public os(ContactsActivity contactsActivity, int i10) {
        this.f36341a = i10;
        this.f36342b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f36341a) {
            case 0:
                this.f36342b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f36342b;
                contactsActivity.f31030f.postOnAnimation(new os(contactsActivity, 0));
                return;
        }
    }
}
