package org.telegram.ui;
public final class os implements Runnable {
    public final int f36340a;
    public final ContactsActivity f36341b;

    public os(ContactsActivity contactsActivity, int i10) {
        this.f36340a = i10;
        this.f36341b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f36340a) {
            case 0:
                this.f36341b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f36341b;
                contactsActivity.f31029f.postOnAnimation(new os(contactsActivity, 0));
                return;
        }
    }
}
