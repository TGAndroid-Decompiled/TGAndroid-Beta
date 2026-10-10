package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class n51 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.tl0 {
    public final k71 f40125a;

    public n51(k71 k71Var) {
        this.f40125a = k71Var;
    }

    @Override
    public void a() {
        this.f40125a.m();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        k71 k71Var = this.f40125a;
        int i11 = k71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        k71Var.B(false, true, true);
    }
}
