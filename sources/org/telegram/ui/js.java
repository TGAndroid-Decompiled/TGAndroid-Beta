package org.telegram.ui;
public final class js implements Runnable {
    public final int f38694a;
    public final ContactsActivity f38695b;

    public js(ContactsActivity contactsActivity, int i10) {
        this.f38694a = i10;
        this.f38695b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f38694a) {
            case 0:
                this.f38695b.f0();
                return;
            default:
                ContactsActivity contactsActivity = this.f38695b;
                contactsActivity.f33385f.postOnAnimation(new js(contactsActivity, 0));
                return;
        }
    }
}
