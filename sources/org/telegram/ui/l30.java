package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class l30 extends v4 {
    public final u50 U;

    public l30(u50 u50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = u50Var;
    }

    @Override
    public final void c() {
        u50 u50Var = this.U;
        AccountInstance accountInstance = u50Var.d;
        m30 m30Var = u50Var.f42173b;
        long dialogId = m30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            m30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
