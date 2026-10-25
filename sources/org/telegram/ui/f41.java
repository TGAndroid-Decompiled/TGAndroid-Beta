package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class f41 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.ol0 {
    public final c61 f39249a;

    public f41(c61 c61Var) {
        this.f39249a = c61Var;
    }

    @Override
    public void d() {
        this.f39249a.m();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        c61 c61Var = this.f39249a;
        int i11 = c61Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        c61Var.B(false, true, true);
    }
}
