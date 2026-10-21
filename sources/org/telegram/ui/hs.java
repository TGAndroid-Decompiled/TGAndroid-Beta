package org.telegram.ui;
public final class hs implements Runnable {
    public final int f37780a;
    public final ContactsActivity f37781b;

    public hs(ContactsActivity contactsActivity, int i10) {
        this.f37780a = i10;
        this.f37781b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f37780a) {
            case 0:
                this.f37781b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f37781b;
                contactsActivity.f33084f.postOnAnimation(new hs(contactsActivity, 0));
                return;
        }
    }
}
