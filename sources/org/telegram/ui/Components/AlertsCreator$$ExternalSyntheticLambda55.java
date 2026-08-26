package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda422;

public final class AlertsCreator$$ExternalSyntheticLambda55 implements DialogInterface.OnShowListener {
    public final int $r8$classId;
    public final EditTextBoldCursor f$0;

    public AlertsCreator$$ExternalSyntheticLambda55(int i, EditTextBoldCursor editTextBoldCursor) {
        this.$r8$classId = i;
        this.f$0 = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda422(1, this.f$0));
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f$0;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                break;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f$0;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda422(3, this.f$0));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda422(5, this.f$0));
                break;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f$0;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                editTextBoldCursor3.setSelection(0, editTextBoldCursor3.length());
                break;
        }
    }
}
