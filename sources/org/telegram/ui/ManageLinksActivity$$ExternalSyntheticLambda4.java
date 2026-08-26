package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.RecyclerListView;

public final class ManageLinksActivity$$ExternalSyntheticLambda4 implements RecyclerListView.OnItemLongClickListener, AlertDialog.OnButtonClickListener {
    public final ManageLinksActivity f$0;

    public ManageLinksActivity$$ExternalSyntheticLambda4(ManageLinksActivity manageLinksActivity) {
        this.f$0 = manageLinksActivity;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        ManageLinksActivity manageLinksActivity = this.f$0;
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        tL_messages_deleteRevokedExportedChatInvites.peer = manageLinksActivity.getMessagesController().getInputPeer(-manageLinksActivity.currentChatId);
        long clientUserId = manageLinksActivity.getUserConfig().getClientUserId();
        long j = manageLinksActivity.adminId;
        if (j == clientUserId) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = manageLinksActivity.getMessagesController().getInputUser(manageLinksActivity.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = manageLinksActivity.getMessagesController().getInputUser(j);
        }
        manageLinksActivity.deletingRevokedLinks = true;
        manageLinksActivity.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new ManageLinksActivity$$ExternalSyntheticLambda0(manageLinksActivity, 1));
    }

    @Override
    public boolean onItemClick(int i, View view) {
        ManageLinksActivity manageLinksActivity = this.f$0;
        if ((i < manageLinksActivity.linksStartRow || i >= manageLinksActivity.linksEndRow) && (i < manageLinksActivity.revokedLinksStartRow || i >= manageLinksActivity.revokedLinksEndRow)) {
            return false;
        }
        ((ManageLinksActivity.LinkCell) view).optionsView.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }
}
