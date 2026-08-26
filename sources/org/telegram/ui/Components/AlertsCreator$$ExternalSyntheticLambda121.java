package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;

public final class AlertsCreator$$ExternalSyntheticLambda121 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final EditText f$0;

    public AlertsCreator$$ExternalSyntheticLambda121(EditText editText, int i) {
        this.$r8$classId = i;
        this.f$0 = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f$0);
                break;
            default:
                AndroidUtilities.hideKeyboard(this.f$0);
                break;
        }
    }
}
