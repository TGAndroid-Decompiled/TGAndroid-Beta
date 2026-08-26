package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.RecyclerListView;

public final class ManageLinksActivity$$ExternalSyntheticLambda4 implements RecyclerListView.OnItemLongClickListener, AlertDialog.OnButtonClickListener {
    public final ManageLinksActivity f$0;

    public ManageLinksActivity$$ExternalSyntheticLambda4(ManageLinksActivity manageLinksActivity) {
        this.f$0 = manageLinksActivity;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$createView$8(alertDialog, i);
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return this.f$0.lambda$createView$10(view, i);
    }
}
