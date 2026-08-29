package org.telegram.ui;
public final class js implements Runnable {
    public final int f39682a;
    public final ContactsActivity f39683b;

    public js(ContactsActivity contactsActivity, int i10) {
        this.f39682a = i10;
        this.f39683b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f39682a) {
            case 0:
                this.f39683b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f39683b;
                contactsActivity.f35487f.postOnAnimation(new js(contactsActivity, 0));
                return;
        }
    }
}
