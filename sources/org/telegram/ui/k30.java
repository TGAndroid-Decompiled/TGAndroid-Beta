package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class k30 extends r4 {
    public final r50 Q;

    public k30(r50 r50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.Q = r50Var;
    }

    @Override
    public final void c() {
        r50 r50Var = this.Q;
        AccountInstance accountInstance = r50Var.d;
        l30 l30Var = r50Var.f41871b;
        long dialogId = l30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            l30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
