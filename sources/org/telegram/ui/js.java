package org.telegram.ui;
public final class js implements Runnable {
    public final int f38328a;
    public final ContactsActivity f38329b;

    public js(ContactsActivity contactsActivity, int i10) {
        this.f38328a = i10;
        this.f38329b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f38328a) {
            case 0:
                this.f38329b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f38329b;
                contactsActivity.f33071f.postOnAnimation(new js(contactsActivity, 0));
                return;
        }
    }
}
