package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class n30 extends u4 {
    public final v50 U;

    public n30(v50 v50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = v50Var;
    }

    @Override
    public final void c() {
        v50 v50Var = this.U;
        AccountInstance accountInstance = v50Var.d;
        o30 o30Var = v50Var.f44612b;
        long dialogId = o30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            o30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
