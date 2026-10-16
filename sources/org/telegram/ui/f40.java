package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class f40 extends v4 {
    public final n60 U;

    public f40(n60 n60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = n60Var;
    }

    @Override
    public final void c() {
        n60 n60Var = this.U;
        AccountInstance accountInstance = n60Var.d;
        g40 g40Var = n60Var.f38159b;
        long dialogId = g40Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            g40Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
