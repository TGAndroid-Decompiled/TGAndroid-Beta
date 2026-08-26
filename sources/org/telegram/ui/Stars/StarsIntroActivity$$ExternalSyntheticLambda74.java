package org.telegram.ui.Stars;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda422;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class StarsIntroActivity$$ExternalSyntheticLambda74 implements Runnable {
    public final int $r8$classId;
    public final BottomSheet[] f$0;
    public final EditTextBoldCursor f$1;

    public StarsIntroActivity$$ExternalSyntheticLambda74(EditTextBoldCursor editTextBoldCursor, BottomSheet[] bottomSheetArr, int i) {
        this.$r8$classId = i;
        this.f$1 = editTextBoldCursor;
        this.f$0 = bottomSheetArr;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f$1;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda422(10, editTextBoldCursor));
                break;
            case 1:
                AndroidUtilities.hideKeyboard(this.f$1);
                this.f$0[0].lambda$showGiftOfferSheet$15();
                break;
            default:
                AndroidUtilities.hideKeyboard(this.f$1);
                this.f$0[0].lambda$showGiftOfferSheet$15();
                break;
        }
    }

    public StarsIntroActivity$$ExternalSyntheticLambda74(BottomSheet[] bottomSheetArr, EditTextBoldCursor editTextBoldCursor) {
        this.$r8$classId = 0;
        this.f$0 = bottomSheetArr;
        this.f$1 = editTextBoldCursor;
    }
}
