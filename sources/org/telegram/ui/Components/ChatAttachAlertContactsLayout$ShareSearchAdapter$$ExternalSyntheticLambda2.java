package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.iv.RichCaptionController$1$$ExternalSyntheticLambda0;

public final class ChatAttachAlertContactsLayout$ShareSearchAdapter$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlertContactsLayout.ShareSearchAdapter f$0;
    public final String f$1;
    public final int f$2;

    public ChatAttachAlertContactsLayout$ShareSearchAdapter$$ExternalSyntheticLambda2(ChatAttachAlertContactsLayout.ShareSearchAdapter shareSearchAdapter, String str, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = shareSearchAdapter;
        this.f$1 = str;
        this.f$2 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatAttachAlertContactsLayout.ShareSearchAdapter shareSearchAdapter = this.f$0;
                shareSearchAdapter.getClass();
                AndroidUtilities.runOnUIThread(new ChatAttachAlertContactsLayout$ShareSearchAdapter$$ExternalSyntheticLambda2(shareSearchAdapter, this.f$1, this.f$2, 1));
                break;
            default:
                ChatAttachAlertContactsLayout.ShareSearchAdapter shareSearchAdapter2 = this.f$0;
                String str = this.f$1;
                int i = this.f$2;
                shareSearchAdapter2.getClass();
                int i2 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new RichCaptionController$1$$ExternalSyntheticLambda0(shareSearchAdapter2, str, new ArrayList(ContactsController.getInstance(i2).contactsBook.values()), new ArrayList(ContactsController.getInstance(i2).contacts), i2, i));
                break;
        }
    }
}
