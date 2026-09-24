package org.telegram.ui;
public final class os implements Runnable {
    public final int f36329a;
    public final ContactsActivity f36330b;

    public os(ContactsActivity contactsActivity, int i10) {
        this.f36329a = i10;
        this.f36330b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f36329a) {
            case 0:
                this.f36330b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f36330b;
                contactsActivity.f31014f.postOnAnimation(new os(contactsActivity, 0));
                return;
        }
    }
}
