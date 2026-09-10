package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class q51 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.xk0 {
    public final l71 f35975a;

    public q51(l71 l71Var) {
        this.f35975a = l71Var;
    }

    @Override
    public void a() {
        this.f35975a.m();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        l71 l71Var = this.f35975a;
        int i11 = l71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        l71Var.B(false, true, true);
    }
}
