package org.telegram.ui;

import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.EditTextCell;

public final class ContactAddActivity$$ExternalSyntheticLambda13 implements Runnable {
    public final int $r8$classId;
    public final ContactAddActivity f$0;
    public final TLRPC.User f$1;

    public ContactAddActivity$$ExternalSyntheticLambda13(ContactAddActivity contactAddActivity, TLRPC.User user, int i) {
        this.$r8$classId = i;
        this.f$0 = contactAddActivity;
        this.f$1 = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$9(this.f$1);
                break;
            default:
                ContactAddActivity contactAddActivity = this.f$0;
                TLRPC.User user = this.f$1;
                if (user != null && contactAddActivity.firstNameFromCard == null && contactAddActivity.lastNameFromCard == null) {
                    if (user.phone == null && (str = contactAddActivity.phone) != null) {
                        user.phone = PhoneFormat.stripExceptNumbers(str, false);
                    }
                    contactAddActivity.firstNameField.setText(user.first_name);
                    EditTextCell.AnonymousClass2 anonymousClass2 = contactAddActivity.firstNameField.editText;
                    anonymousClass2.setSelection(anonymousClass2.length());
                    contactAddActivity.lastNameField.setText(user.last_name);
                }
                TLRPC.UserFull userFull = contactAddActivity.getMessagesController().getUserFull(contactAddActivity.user_id);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        contactAddActivity.noteField.setText(tL_textWithEntities);
                    } else {
                        contactAddActivity.noteField.setText("");
                    }
                }
                if (contactAddActivity.focusNotes) {
                    contactAddActivity.noteField.editText.requestFocus();
                    AndroidUtilities.showKeyboard(contactAddActivity.noteField.editText);
                }
                break;
        }
    }
}
