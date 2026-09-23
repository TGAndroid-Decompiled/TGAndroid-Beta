package org.telegram.ui;
public final class ps implements Runnable {
    public final int f36175a;
    public final ContactsActivity f36176b;

    public ps(ContactsActivity contactsActivity, int i10) {
        this.f36175a = i10;
        this.f36176b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f36175a) {
            case 0:
                this.f36176b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f36176b;
                contactsActivity.f30713f.postOnAnimation(new ps(contactsActivity, 0));
                return;
        }
    }
}
