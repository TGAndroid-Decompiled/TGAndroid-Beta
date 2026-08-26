package org.telegram.ui.Stars;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.ChatAttachAlertLocationLayout;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaLocation;

public final class StarGiftSheet$$ExternalSyntheticLambda79 implements ChatAttachAlertLocationLayout.LocationActivityDelegate, AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final Utilities.Callback f$0;

    public StarGiftSheet$$ExternalSyntheticLambda79(int i, Utilities.Callback callback) {
        this.$r8$classId = i;
        this.f$0 = callback;
    }

    @Override
    public void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        this.f$0.run(new PollAttachedMediaLocation(messageMedia));
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run(alertDialog.makeButtonLoading(i, true, true));
                break;
            default:
                Utilities.Callback callback = this.f$0;
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                break;
        }
    }
}
