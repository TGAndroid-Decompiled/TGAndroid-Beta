package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class ChatAttachAlertContactsLayout$$ExternalSyntheticLambda1 implements RecyclerListView.OnItemLongClickListener, ChatAttachAlertContactsLayout.PhonebookShareAlertDelegate {
    public final ChatAttachAlertContactsLayout f$0;

    public ChatAttachAlertContactsLayout$$ExternalSyntheticLambda1(ChatAttachAlertContactsLayout chatAttachAlertContactsLayout) {
        this.f$0 = chatAttachAlertContactsLayout;
    }

    @Override
    public void didSelectContact(TLRPC.User user, boolean z, int i, long j, boolean z2, long j2) {
        this.f$0.lambda$new$0(user, z, i, j, z2, j2);
    }

    @Override
    public void didSelectContacts(ArrayList arrayList, String str, boolean z, int i, long j, boolean z2, long j2) {
        ChatAttachAlertContactsLayout.PhonebookShareAlertDelegate.CC.$default$didSelectContacts(this, arrayList, str, z, i, j, z2, j2);
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return this.f$0.lambda$new$2(view, i);
    }
}
