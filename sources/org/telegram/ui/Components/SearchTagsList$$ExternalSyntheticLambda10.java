package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Business.QuickRepliesActivity;

public final class SearchTagsList$$ExternalSyntheticLambda10 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final View f$0;

    public SearchTagsList$$ExternalSyntheticLambda10(int i, View view) {
        this.$r8$classId = i;
        this.f$0 = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                SearchTagsList.currentDialog = null;
                this.f$0.requestFocus();
                break;
            case 1:
                BusinessLinksActivity.currentDialog = null;
                View view = this.f$0;
                if (view != null) {
                    view.requestFocus();
                }
                break;
            default:
                QuickRepliesActivity.currentDialog = null;
                View view2 = this.f$0;
                if (view2 != null) {
                    view2.requestFocus();
                }
                break;
        }
    }
}
