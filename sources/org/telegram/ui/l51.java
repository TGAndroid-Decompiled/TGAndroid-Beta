package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class l51 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.nk0 {
    public final h71 f35327a;

    public l51(h71 h71Var) {
        this.f35327a = h71Var;
    }

    @Override
    public void a() {
        this.f35327a.m();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        h71 h71Var = this.f35327a;
        int i11 = h71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        h71Var.B(false, true, true);
    }
}
