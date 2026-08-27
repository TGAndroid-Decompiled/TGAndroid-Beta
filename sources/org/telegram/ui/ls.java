package org.telegram.ui;

public final class ls implements Runnable {

    public final int f40243a;

    public final ContactsActivity f40244b;

    public ls(ContactsActivity contactsActivity, int i10) {
        this.f40243a = i10;
        this.f40244b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f40243a) {
            case 0:
                this.f40244b.g0();
                break;
            default:
                ContactsActivity contactsActivity = this.f40244b;
                contactsActivity.f35423f.postOnAnimation(new ls(contactsActivity, 0));
                break;
        }
    }
}
