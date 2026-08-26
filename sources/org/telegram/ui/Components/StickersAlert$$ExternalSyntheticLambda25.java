package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog;

public final class StickersAlert$$ExternalSyntheticLambda25 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final EditTextBoldCursor f$0;

    public StickersAlert$$ExternalSyntheticLambda25(int i, EditTextBoldCursor editTextBoldCursor) {
        this.$r8$classId = i;
        this.f$0 = editTextBoldCursor;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f$0);
                break;
            default:
                StickersDialogs.lambda$showNameEditorDialog$3(this.f$0, alertDialog, i);
                break;
        }
    }
}
