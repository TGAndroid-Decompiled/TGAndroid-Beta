package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class i30 extends w4 {
    public final q50 U;

    public i30(q50 q50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = q50Var;
    }

    @Override
    public final void c() {
        q50 q50Var = this.U;
        AccountInstance accountInstance = q50Var.d;
        j30 j30Var = q50Var.f40378b;
        long dialogId = j30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            j30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
