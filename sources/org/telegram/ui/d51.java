package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class d51 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.ok0 {
    public final z61 f32519a;

    public d51(z61 z61Var) {
        this.f32519a = z61Var;
    }

    @Override
    public void a() {
        this.f32519a.m();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        z61 z61Var = this.f32519a;
        int i11 = z61Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        z61Var.B(false, true, true);
    }
}
