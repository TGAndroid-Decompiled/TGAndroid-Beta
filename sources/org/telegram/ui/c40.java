package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class c40 extends r4 {
    public final j60 U;

    public c40(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = j60Var;
    }

    @Override
    public final void c() {
        j60 j60Var = this.U;
        AccountInstance accountInstance = j60Var.d;
        d40 d40Var = j60Var.f33938b;
        long dialogId = d40Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            d40Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
