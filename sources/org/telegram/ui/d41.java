package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class d41 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.nl0 {
    public final a61 f36466a;

    public d41(a61 a61Var) {
        this.f36466a = a61Var;
    }

    @Override
    public void a() {
        this.f36466a.m();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        a61 a61Var = this.f36466a;
        int i11 = a61Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        a61Var.B(false, true, true);
    }
}
