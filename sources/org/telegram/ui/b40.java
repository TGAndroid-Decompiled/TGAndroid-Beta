package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class b40 extends q4 {
    public final i60 U;

    public b40(i60 i60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = i60Var;
    }

    @Override
    public final void c() {
        i60 i60Var = this.U;
        AccountInstance accountInstance = i60Var.d;
        c40 c40Var = i60Var.f34412b;
        long dialogId = c40Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            c40Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
