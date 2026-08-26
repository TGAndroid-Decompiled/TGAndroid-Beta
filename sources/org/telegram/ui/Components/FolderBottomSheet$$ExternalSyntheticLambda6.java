package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class FolderBottomSheet$$ExternalSyntheticLambda6 implements ChatAttachAlertLocationLayout.LocationActivityDelegate, AlertDialog.OnButtonClickListener {
    public final Utilities.Callback f$0;

    public FolderBottomSheet$$ExternalSyntheticLambda6(Utilities.Callback callback) {
        this.f$0 = callback;
    }

    @Override
    public void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        ChatAttachAlertPollLayout.lambda$openPollAttachMenu$21(this.f$0, messageMedia, i, z, i2, j);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        FolderBottomSheet.lambda$showForDeletion$3(this.f$0, alertDialog, i);
    }
}
