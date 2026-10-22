package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class a41 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.ll0 {
    public final x51 f35276a;

    public a41(x51 x51Var) {
        this.f35276a = x51Var;
    }

    @Override
    public void b() {
        this.f35276a.m();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        x51 x51Var = this.f35276a;
        int i11 = x51Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        x51Var.B(false, true, true);
    }
}
