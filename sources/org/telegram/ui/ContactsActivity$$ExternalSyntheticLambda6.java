package org.telegram.ui;

public final class ContactsActivity$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final ContactsActivity f$0;

    public ContactsActivity$$ExternalSyntheticLambda6(ContactsActivity contactsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ContactsActivity contactsActivity = this.f$0;
                contactsActivity.listView.postOnAnimation(new ContactsActivity$$ExternalSyntheticLambda6(contactsActivity, 1));
                break;
            default:
                this.f$0.blur3_InvalidateBlur$3();
                break;
        }
    }
}
