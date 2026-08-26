package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class EditTextEmoji$$ExternalSyntheticLambda2 implements Utilities.Callback {
    public final int $r8$classId;
    public final EditTextCaption f$0;

    public EditTextEmoji$$ExternalSyntheticLambda2(EditTextCaption editTextCaption, int i) {
        this.$r8$classId = i;
        this.f$0 = editTextCaption;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.performMenuAction(((Integer) obj).intValue());
                break;
            default:
                AndroidUtilities.hideKeyboard(this.f$0);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
        }
    }
}
