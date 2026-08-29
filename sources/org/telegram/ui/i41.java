package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class i41 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.nk0 {
    public final d61 f39124a;

    public i41(d61 d61Var) {
        this.f39124a = d61Var;
    }

    @Override
    public void a() {
        this.f39124a.m();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        d61 d61Var = this.f39124a;
        int i11 = d61Var.R;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        d61Var.B(false, true, true);
    }
}
