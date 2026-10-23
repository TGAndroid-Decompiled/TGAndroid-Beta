package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class e41 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.ol0 {
    public final b61 f36815a;

    public e41(b61 b61Var) {
        this.f36815a = b61Var;
    }

    @Override
    public void a() {
        this.f36815a.m();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        b61 b61Var = this.f36815a;
        int i11 = b61Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        b61Var.B(false, true, true);
    }
}
