package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class JoinGroupAlert$$ExternalSyntheticLambda9 implements AlertDialog.OnButtonClickListener, MessagesController.ErrorDelegate {
    public final Object f$0;
    public final boolean f$1;

    public JoinGroupAlert$$ExternalSyntheticLambda9(Object obj, boolean z) {
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        AlertsCreator.lambda$createDrawOverlayPermissionDialog$211((Activity) this.f$0, this.f$1, alertDialog, i);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return ((JoinGroupAlert) this.f$0).lambda$new$3(this.f$1, tL_error);
    }
}
