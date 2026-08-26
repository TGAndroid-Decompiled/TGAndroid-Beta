package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.RecyclerListView;

public final class FilterCreateActivity$$ExternalSyntheticLambda3 implements AlertDialog.OnButtonClickListener, RecyclerListView.OnItemLongClickListener {
    public final int $r8$classId;
    public final FilterCreateActivity f$0;

    public FilterCreateActivity$$ExternalSyntheticLambda3(FilterCreateActivity filterCreateActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = filterCreateActivity;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.processDone$15();
                break;
            case 1:
                FilterCreateActivity filterCreateActivity = this.f$0;
                AlertDialog alertDialog2 = null;
                if (filterCreateActivity.getParentActivity() != null) {
                    AlertDialog alertDialog3 = new AlertDialog(filterCreateActivity.getParentActivity(), 3, null);
                    alertDialog3.canCacnel = false;
                    alertDialog3.show();
                    alertDialog2 = alertDialog3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = filterCreateActivity.filter.id;
                filterCreateActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new LinkManager$$ExternalSyntheticLambda8(14, filterCreateActivity, alertDialog2));
                break;
            case 2:
                this.f$0.processDone$15();
                break;
            default:
                this.f$0.lambda$checkDiscard$21(alertDialog, i);
                break;
        }
    }

    @Override
    public boolean onItemClick(int i, View view) {
        FilterCreateActivity filterCreateActivity = this.f$0;
        FilterCreateActivity.ItemInner itemInner = (FilterCreateActivity.ItemInner) filterCreateActivity.items.get(i);
        if (itemInner == null || !(view instanceof UserCell)) {
            return false;
        }
        UserCell userCell = (UserCell) view;
        filterCreateActivity.showRemoveAlert(itemInner, userCell.getName(), userCell.getCurrentObject(), itemInner.include);
        return true;
    }
}
