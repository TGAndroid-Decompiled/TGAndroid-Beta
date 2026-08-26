package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog;

public final class GroupCallActivity$6$$ExternalSyntheticLambda3 implements TextView.OnEditorActionListener {
    public final int $r8$classId;
    public final AlertDialog.Builder f$0;

    public GroupCallActivity$6$$ExternalSyntheticLambda3(int i, AlertDialog.Builder builder) {
        this.$r8$classId = i;
        this.f$0 = builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f$0.alertDialog.getButton(-1).callOnClick();
                return false;
            case 1:
                if (i != 5) {
                    return false;
                }
                this.f$0.alertDialog.getButton(-1).callOnClick();
                return true;
            case 2:
                AndroidUtilities.hideKeyboard(textView);
                this.f$0.alertDialog.getButton(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f$0.alertDialog.getButton(-1).callOnClick();
                return false;
        }
    }
}
