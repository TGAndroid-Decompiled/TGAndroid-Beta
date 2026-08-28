package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class g41 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.ck0 {
    public final b61 f38426a;

    public g41(b61 b61Var) {
        this.f38426a = b61Var;
    }

    @Override
    public void b() {
        this.f38426a.m();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        b61 b61Var = this.f38426a;
        int i10 = b61Var.R;
        ConnectionsManager.getInstance(i10).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i10).clearRecentEmojiStatuses();
        b61Var.B(false, true, true);
    }
}
