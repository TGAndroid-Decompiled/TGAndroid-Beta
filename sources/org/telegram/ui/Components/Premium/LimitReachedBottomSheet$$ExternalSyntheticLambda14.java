package org.telegram.ui.Components.Premium;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.RecyclerListView;

public final class LimitReachedBottomSheet$$ExternalSyntheticLambda14 implements AlertDialog.OnButtonClickListener, RecyclerListView.OnItemLongClickListener {
    public final int $r8$classId;
    public final LimitReachedBottomSheet f$0;

    public LimitReachedBottomSheet$$ExternalSyntheticLambda14(LimitReachedBottomSheet limitReachedBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = limitReachedBottomSheet;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onViewCreated$7(alertDialog, i);
                break;
            default:
                this.f$0.lambda$onViewCreated$10(alertDialog, i);
                break;
        }
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return this.f$0.lambda$onViewCreated$6(view, i);
    }
}
