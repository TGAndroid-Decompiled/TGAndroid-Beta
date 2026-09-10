package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class bb0 implements MessagesController.MessagesLoadedCallback {
    public final h90 f31213a;
    public final boolean[] f31214b;
    public final Bundle f31215c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public bb0(LaunchActivity launchActivity, h90 h90Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.f31213a = h90Var;
        this.f31214b = zArr;
        this.f31215c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.d5.u0((org.telegram.ui.ActionBar.p2) hc.b.i(1, launchActivity.f29933d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f31213a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f31213a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f31214b[0]) {
            return;
        }
        eo eoVar = new eo(this.f31215c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            eoVar.K5 = chatInvite;
        }
        ((ActionBarLayout) this.e.O()).P(eoVar);
    }
}
