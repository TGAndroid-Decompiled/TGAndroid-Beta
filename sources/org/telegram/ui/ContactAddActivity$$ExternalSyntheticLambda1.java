package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class ContactAddActivity$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final ContactAddActivity f$0;

    public ContactAddActivity$$ExternalSyntheticLambda1(ContactAddActivity contactAddActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = contactAddActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didUploadFailed$20();
                break;
            case 1:
                ContactAddActivity contactAddActivity = this.f$0;
                if (contactAddActivity.focusNotes) {
                    contactAddActivity.noteField.editText.requestFocus();
                    AndroidUtilities.showKeyboard(contactAddActivity.noteField.editText);
                }
                break;
            default:
                ContactAddActivity contactAddActivity2 = this.f$0;
                contactAddActivity2.presentFragment(ChatActivity.of(contactAddActivity2.user_id), true);
                break;
        }
    }
}
