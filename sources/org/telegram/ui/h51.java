package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class h51 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.al0 {
    public final c71 f36869a;

    public h51(c71 c71Var) {
        this.f36869a = c71Var;
    }

    @Override
    public void e() {
        this.f36869a.m();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        c71 c71Var = this.f36869a;
        int i11 = c71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        c71Var.B(false, true, true);
    }
}
