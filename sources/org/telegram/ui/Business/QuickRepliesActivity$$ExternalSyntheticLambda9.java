package org.telegram.ui.Business;

import android.content.DialogInterface;
import android.view.View;

public final class QuickRepliesActivity$$ExternalSyntheticLambda9 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final View f$0;

    public QuickRepliesActivity$$ExternalSyntheticLambda9(View view, int i) {
        this.$r8$classId = i;
        this.f$0 = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                QuickRepliesActivity.currentDialog = null;
                View view = this.f$0;
                if (view != null) {
                    view.requestFocus();
                }
                break;
            default:
                BusinessLinksActivity.currentDialog = null;
                View view2 = this.f$0;
                if (view2 != null) {
                    view2.requestFocus();
                }
                break;
        }
    }
}
