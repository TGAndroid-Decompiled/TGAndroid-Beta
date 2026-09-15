package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class k51 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.nk0 {
    public final g71 f35034a;

    public k51(g71 g71Var) {
        this.f35034a = g71Var;
    }

    @Override
    public void a() {
        this.f35034a.m();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        g71 g71Var = this.f35034a;
        int i11 = g71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        g71Var.B(false, true, true);
    }
}
