package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.RecyclerListView;

public final class FilterCreateActivity$$ExternalSyntheticLambda9 implements AlertDialog.OnButtonClickListener, RecyclerListView.OnItemLongClickListener {
    public final int $r8$classId;
    public final FilterCreateActivity f$0;

    public FilterCreateActivity$$ExternalSyntheticLambda9(FilterCreateActivity filterCreateActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = filterCreateActivity;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$deleteFolder$17(alertDialog, i);
                break;
            case 1:
                this.f$0.lambda$checkDiscard$19(alertDialog, i);
                break;
            case 2:
                this.f$0.lambda$checkDiscard$20(alertDialog, i);
                break;
            default:
                this.f$0.lambda$checkDiscard$21(alertDialog, i);
                break;
        }
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return this.f$0.lambda$createView$9(view, i);
    }
}
