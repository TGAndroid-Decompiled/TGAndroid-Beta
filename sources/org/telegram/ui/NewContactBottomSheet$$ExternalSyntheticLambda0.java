package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class NewContactBottomSheet$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final NewContactBottomSheet f$0;

    public NewContactBottomSheet$$ExternalSyntheticLambda0(NewContactBottomSheet newContactBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = newContactBottomSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f$0.contentLayout);
                break;
            default:
                AndroidUtilities.showKeyboard(this.f$0.firstNameField.getEditText());
                break;
        }
    }
}
