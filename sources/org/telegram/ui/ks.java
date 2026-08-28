package org.telegram.ui;
public final class ks implements Runnable {
    public final int f39914a;
    public final ContactsActivity f39915b;

    public ks(ContactsActivity contactsActivity, int i9) {
        this.f39914a = i9;
        this.f39915b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f39914a) {
            case 0:
                this.f39915b.f0();
                return;
            default:
                ContactsActivity contactsActivity = this.f39915b;
                contactsActivity.f35420f.postOnAnimation(new ks(contactsActivity, 0));
                return;
        }
    }
}
