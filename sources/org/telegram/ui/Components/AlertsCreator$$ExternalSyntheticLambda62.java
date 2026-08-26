package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;

public final class AlertsCreator$$ExternalSyntheticLambda62 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final EditTextBoldCursor f$0;

    public AlertsCreator$$ExternalSyntheticLambda62(int i, EditTextBoldCursor editTextBoldCursor) {
        this.$r8$classId = i;
        this.f$0 = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f$0);
                break;
            case 1:
                AndroidUtilities.hideKeyboard(this.f$0);
                break;
            default:
                AndroidUtilities.hideKeyboard(this.f$0);
                break;
        }
    }
}
