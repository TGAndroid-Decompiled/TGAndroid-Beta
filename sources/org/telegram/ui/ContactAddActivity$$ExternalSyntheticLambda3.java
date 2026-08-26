package org.telegram.ui;

public final class ContactAddActivity$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final ContactAddActivity f$0;

    public ContactAddActivity$$ExternalSyntheticLambda3(ContactAddActivity contactAddActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = contactAddActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$fillItems$16();
                break;
            case 1:
                this.f$0.lambda$createView$11();
                break;
            default:
                this.f$0.lambda$didUploadFailed$20();
                break;
        }
    }
}
