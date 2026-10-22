package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ea0 implements MessagesController.MessagesLoadedCallback {
    public final z70 f36616a;
    public final boolean[] f36617b;
    public final Bundle f36618c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public ea0(LaunchActivity launchActivity, z70 z70Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.f36616a = z70Var;
        this.f36617b = zArr;
        this.f36618c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.f5.t0((org.telegram.ui.ActionBar.n2) i2.e.h(1, launchActivity.f33165d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f36616a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f36616a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f36617b[0]) {
            return;
        }
        qn qnVar = new qn(this.f36618c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            qnVar.K5 = chatInvite;
        }
        ((ActionBarLayout) this.e.O()).P(qnVar);
    }
}
