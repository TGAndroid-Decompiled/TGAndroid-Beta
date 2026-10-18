package org.telegram.ui;
public final class js implements Runnable {
    public final int f38322a;
    public final ContactsActivity f38323b;

    public js(ContactsActivity contactsActivity, int i10) {
        this.f38322a = i10;
        this.f38323b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f38322a) {
            case 0:
                this.f38323b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f38323b;
                contactsActivity.f33071f.postOnAnimation(new js(contactsActivity, 0));
                return;
        }
    }
}
