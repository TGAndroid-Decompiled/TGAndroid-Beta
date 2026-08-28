package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class h30 extends q4 {
    public final o50 Q;

    public h30(o50 o50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.Q = o50Var;
    }

    @Override
    public final void c() {
        o50 o50Var = this.Q;
        AccountInstance accountInstance = o50Var.d;
        i30 i30Var = o50Var.f40883b;
        long dialogId = i30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            i30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
