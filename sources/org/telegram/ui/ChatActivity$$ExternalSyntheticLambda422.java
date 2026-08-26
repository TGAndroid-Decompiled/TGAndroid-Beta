package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class ChatActivity$$ExternalSyntheticLambda422 implements Runnable {
    public final int $r8$classId;
    public final EditTextBoldCursor f$0;

    public ChatActivity$$ExternalSyntheticLambda422(int i, EditTextBoldCursor editTextBoldCursor) {
        this.$r8$classId = i;
        this.f$0 = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.showKeyboard(this.f$0);
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f$0;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                break;
            case 2:
                AndroidUtilities.showKeyboard(this.f$0);
                break;
            case 3:
                EditTextBoldCursor editTextBoldCursor2 = this.f$0;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                break;
            case 4:
                EditTextBoldCursor editTextBoldCursor3 = this.f$0;
                editTextBoldCursor3.requestFocus();
                editTextBoldCursor3.setSelection(0, editTextBoldCursor3.length());
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                break;
            case 5:
                EditTextBoldCursor editTextBoldCursor4 = this.f$0;
                editTextBoldCursor4.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor4);
                break;
            case 6:
                EditTextBoldCursor editTextBoldCursor5 = this.f$0;
                editTextBoldCursor5.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor5);
                break;
            case 7:
                AndroidUtilities.showKeyboard(this.f$0);
                break;
            case 8:
                AndroidUtilities.showKeyboard(this.f$0);
                break;
            case 9:
                EditTextBoldCursor editTextBoldCursor6 = this.f$0;
                editTextBoldCursor6.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor6);
                break;
            default:
                AndroidUtilities.showKeyboard(this.f$0);
                break;
        }
    }
}
