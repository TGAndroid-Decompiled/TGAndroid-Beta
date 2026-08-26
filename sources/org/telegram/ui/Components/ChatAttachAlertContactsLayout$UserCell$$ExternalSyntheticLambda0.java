package org.telegram.ui.Components;

import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserObject$$ExternalSyntheticOutline0;

public final class ChatAttachAlertContactsLayout$UserCell$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlertContactsLayout.UserCell f$0;

    public ChatAttachAlertContactsLayout$UserCell$$ExternalSyntheticLambda0(ChatAttachAlertContactsLayout.UserCell userCell, int i) {
        this.$r8$classId = i;
        this.f$0 = userCell;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatAttachAlertContactsLayout.UserCell userCell = this.f$0;
                if (userCell.currentUser != null) {
                    userCell.formattedPhoneNumber = UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), userCell.currentUser.phone, PhoneFormat.getInstance());
                    userCell.formattedPhoneNumberUser = userCell.currentUser;
                    AndroidUtilities.runOnUIThread(new ChatAttachAlertContactsLayout$UserCell$$ExternalSyntheticLambda0(userCell, 1));
                }
                break;
            default:
                ChatAttachAlertContactsLayout.UserCell userCell2 = this.f$0;
                userCell2.statusTextView.setText(userCell2.formattedPhoneNumber, false);
                break;
        }
    }
}
