package org.telegram.ui;
public final class js implements Runnable {
    public final int f38337a;
    public final ContactsActivity f38338b;

    public js(ContactsActivity contactsActivity, int i10) {
        this.f38337a = i10;
        this.f38338b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f38337a) {
            case 0:
                this.f38338b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f38338b;
                contactsActivity.f33078f.postOnAnimation(new js(contactsActivity, 0));
                return;
        }
    }
}
