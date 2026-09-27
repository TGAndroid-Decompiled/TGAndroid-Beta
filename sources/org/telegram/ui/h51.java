package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class h51 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.al0 {
    public final c71 f34138a;

    public h51(c71 c71Var) {
        this.f34138a = c71Var;
    }

    @Override
    public void e() {
        this.f34138a.m();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        c71 c71Var = this.f34138a;
        int i11 = c71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        c71Var.B(false, true, true);
    }
}
