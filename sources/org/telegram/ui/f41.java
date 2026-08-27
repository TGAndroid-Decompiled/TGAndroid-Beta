package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

public final class f41 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.ek0 {

    public final a61 f37935a;

    public f41(a61 a61Var) {
        this.f37935a = a61Var;
    }

    @Override
    public void b() {
        this.f37935a.m();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        a61 a61Var = this.f37935a;
        int i11 = a61Var.R;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        a61Var.B(false, true, true);
    }
}
