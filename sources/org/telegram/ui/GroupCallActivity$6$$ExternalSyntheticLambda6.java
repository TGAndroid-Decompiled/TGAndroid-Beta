package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class GroupCallActivity$6$$ExternalSyntheticLambda6 implements DialogInterface.OnShowListener {
    public final int $r8$classId;
    public final Object f$0;
    public final AlertDialog f$1;
    public final EditTextBoldCursor f$2;

    public GroupCallActivity$6$$ExternalSyntheticLambda6(Object obj, AlertDialog alertDialog, EditTextBoldCursor editTextBoldCursor, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = alertDialog;
        this.f$2 = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                ((GroupCallActivity.AnonymousClass6) this.f$0).lambda$onItemClick$6(this.f$1, this.f$2, dialogInterface);
                break;
            default:
                ((GroupCallActivity.AnonymousClass6.AnonymousClass1) this.f$0).lambda$onStartRecord$1(this.f$1, this.f$2, dialogInterface);
                break;
        }
    }
}
