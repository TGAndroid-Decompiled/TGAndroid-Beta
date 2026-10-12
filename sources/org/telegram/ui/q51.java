package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class q51 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.yl0 {
    public final n71 f41195a;

    public q51(n71 n71Var) {
        this.f41195a = n71Var;
    }

    @Override
    public void a() {
        this.f41195a.m();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        n71 n71Var = this.f41195a;
        int i11 = n71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        n71Var.B(false, true, true);
    }
}
