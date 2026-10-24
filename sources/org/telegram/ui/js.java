package org.telegram.ui;
public final class js implements Runnable {
    public final int f38680a;
    public final ContactsActivity f38681b;

    public js(ContactsActivity contactsActivity, int i10) {
        this.f38680a = i10;
        this.f38681b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f38680a) {
            case 0:
                this.f38681b.f0();
                return;
            default:
                ContactsActivity contactsActivity = this.f38681b;
                contactsActivity.f33387f.postOnAnimation(new js(contactsActivity, 0));
                return;
        }
    }
}
