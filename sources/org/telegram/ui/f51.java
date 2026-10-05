package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class f51 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.al0 {
    public final a71 f36206a;

    public f51(a71 a71Var) {
        this.f36206a = a71Var;
    }

    @Override
    public void e() {
        this.f36206a.m();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        a71 a71Var = this.f36206a;
        int i11 = a71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        a71Var.B(false, true, true);
    }
}
