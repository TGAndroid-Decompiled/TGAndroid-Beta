package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class p30 extends u4 {
    public final x50 U;

    public p30(x50 x50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = x50Var;
    }

    @Override
    public final void c() {
        x50 x50Var = this.U;
        AccountInstance accountInstance = x50Var.d;
        q30 q30Var = x50Var.f45493b;
        long dialogId = q30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            q30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
