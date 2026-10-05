package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class b40 extends r4 {
    public final h60 U;

    public b40(h60 h60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = h60Var;
    }

    @Override
    public final void c() {
        h60 h60Var = this.U;
        AccountInstance accountInstance = h60Var.d;
        c40 c40Var = h60Var.f36908b;
        long dialogId = c40Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            c40Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
