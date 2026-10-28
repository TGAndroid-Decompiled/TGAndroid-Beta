package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class i41 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.pl0 {
    public final f61 f40042a;

    public i41(f61 f61Var) {
        this.f40042a = f61Var;
    }

    @Override
    public void d() {
        this.f40042a.m();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        f61 f61Var = this.f40042a;
        int i11 = f61Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        f61Var.B(false, true, true);
    }
}
