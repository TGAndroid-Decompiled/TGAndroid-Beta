package org.telegram.ui.Cells;

import org.telegram.messenger.AndroidUtilities;

public final class EditTextCell$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final EditTextCell f$0;

    public EditTextCell$$ExternalSyntheticLambda0(EditTextCell editTextCell, int i) {
        this.$r8$classId = i;
        this.f$0 = editTextCell;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$hideKeyboardOnEnter$0();
                break;
            default:
                EditTextCell editTextCell = this.f$0;
                editTextCell.editText.requestFocus();
                AndroidUtilities.showKeyboard(editTextCell.editText);
                break;
        }
    }
}
