package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class d40 extends q4 {
    public final k60 U;

    public d40(k60 k60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = k60Var;
    }

    @Override
    public final void c() {
        k60 k60Var = this.U;
        AccountInstance accountInstance = k60Var.d;
        e40 e40Var = k60Var.f35014b;
        long dialogId = e40Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            e40Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
