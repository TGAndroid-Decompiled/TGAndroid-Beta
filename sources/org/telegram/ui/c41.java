package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class c41 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.kl0 {
    public final z51 f35826a;

    public c41(z51 z51Var) {
        this.f35826a = z51Var;
    }

    @Override
    public void b() {
        this.f35826a.m();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        z51 z51Var = this.f35826a;
        int i11 = z51Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        z51Var.B(false, true, true);
    }
}
