package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class ChatAttachAlertContactsLayout$$ExternalSyntheticLambda1 implements RecyclerListView.OnItemLongClickListener, ChatAttachAlertContactsLayout.PhonebookShareAlertDelegate {
    public final ChatAttachAlertContactsLayout f$0;

    public ChatAttachAlertContactsLayout$$ExternalSyntheticLambda1(ChatAttachAlertContactsLayout chatAttachAlertContactsLayout) {
        this.f$0 = chatAttachAlertContactsLayout;
    }

    @Override
    public void didSelectContact(TLRPC.TL_userContact_old2 tL_userContact_old2, boolean z, int i, long j) {
        ChatAttachAlertContactsLayout chatAttachAlertContactsLayout = this.f$0;
        chatAttachAlertContactsLayout.parentAlert.dismiss(true);
        chatAttachAlertContactsLayout.delegate.didSelectContact(tL_userContact_old2, z, i, j);
    }

    @Override
    public void didSelectContacts(ArrayList arrayList, String str, boolean z, int i, long j, boolean z2) {
    }

    @Override
    public boolean onItemClick(int i, View view) {
        Object item;
        ChatAttachAlertContactsLayout chatAttachAlertContactsLayout = this.f$0;
        RecyclerView.Adapter adapter = chatAttachAlertContactsLayout.listView.getAdapter();
        ChatAttachAlertContactsLayout.ShareSearchAdapter shareSearchAdapter = chatAttachAlertContactsLayout.searchAdapter;
        if (adapter == shareSearchAdapter) {
            int i2 = i - 1;
            if (i2 < 0) {
                shareSearchAdapter.getClass();
            } else if (i2 < shareSearchAdapter.searchResult.size()) {
                item = shareSearchAdapter.searchResult.get(i2);
            }
            item = null;
        } else {
            ChatAttachAlertContactsLayout.ShareAdapter shareAdapter = chatAttachAlertContactsLayout.listAdapter;
            item = shareAdapter.getItem(shareAdapter.getSectionForPosition(i), shareAdapter.getPositionInSectionForPosition(i));
        }
        if (item == null) {
            return false;
        }
        chatAttachAlertContactsLayout.addOrRemoveSelectedContact((ChatAttachAlertContactsLayout.UserCell) view, item);
        return true;
    }
}
