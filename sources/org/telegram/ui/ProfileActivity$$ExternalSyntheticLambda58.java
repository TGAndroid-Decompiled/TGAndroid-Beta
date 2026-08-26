package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ProfileActivity$$ExternalSyntheticLambda58 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;

    public ProfileActivity$$ExternalSyntheticLambda58(Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
    }

    @Override
    public final void run(Object obj) {
        int i;
        switch (this.$r8$classId) {
            case 0:
                ((ProfileActivity) this.f$0).lambda$createView$19((Context) this.f$1, this.f$2, (TL_payments.connectedBotStarRef) obj);
                break;
            case 1:
                Long l = (Long) obj;
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f$0;
                dataSettingsActivity.getClass();
                AndroidUtilities.cancelRunOnUIThread((DataSettingsActivity$$ExternalSyntheticLambda1) this.f$1);
                dataSettingsActivity.updateStorageUsageAnimated = dataSettingsActivity.updateStorageUsageAnimated || System.currentTimeMillis() - this.f$2 > 120;
                dataSettingsActivity.storageUsageSize = l.longValue();
                dataSettingsActivity.storageUsageLoading = false;
                if (dataSettingsActivity.listAdapter != null && (i = dataSettingsActivity.storageUsageRow) >= 0) {
                    dataSettingsActivity.rebind$1(i);
                    break;
                }
                break;
            default:
                Runnable runnable = (Runnable) obj;
                DialogsActivity.AnonymousClass30 anonymousClass30 = (DialogsActivity.AnonymousClass30) this.f$0;
                anonymousClass30.getClass();
                ((AlertDialog) this.f$1).showDelayed(150L);
                DialogsActivity dialogsActivity = DialogsActivity.this;
                Boolean bool = dialogsActivity.requestPeerType.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    dialogsActivity.getMessagesController().addUserToChat(this.f$2, dialogsActivity.getMessagesController().getUser(Long.valueOf(dialogsActivity.requestPeerBotId)), 0, null, DialogsActivity.this, false, runnable, new ChatActivity$$ExternalSyntheticLambda177(14, runnable));
                } else {
                    runnable.run();
                }
                break;
        }
    }
}
