package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class la0 implements MessagesController.MessagesLoadedCallback {
    public final f80 f39179a;
    public final boolean[] f39180b;
    public final Bundle f39181c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public la0(LaunchActivity launchActivity, f80 f80Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.f39179a = f80Var;
        this.f39180b = zArr;
        this.f39181c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.d5.t0((org.telegram.ui.ActionBar.o2) i2.o1.i(1, launchActivity.f33465d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f39179a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f39179a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f39180b[0]) {
            return;
        }
        sn snVar = new sn(this.f39181c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            snVar.W5 = chatInvite;
        }
        ((ActionBarLayout) this.e.O()).Q(snVar);
    }
}
