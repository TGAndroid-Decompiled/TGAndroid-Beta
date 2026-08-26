package org.telegram.ui;

public final class ContactsActivity$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final ContactsActivity f$0;

    public ContactsActivity$$ExternalSyntheticLambda4(ContactsActivity contactsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$2();
                break;
            default:
                this.f$0.lambda$createView$3();
                break;
        }
    }
}
