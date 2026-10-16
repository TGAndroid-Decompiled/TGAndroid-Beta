package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class db0 implements MessagesController.MessagesLoadedCallback {
    public final d20 f34938a;
    public final boolean[] f34939b;
    public final Bundle f34940c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public db0(LaunchActivity launchActivity, d20 d20Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.f34938a = d20Var;
        this.f34939b = zArr;
        this.f34940c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.g5.t0((org.telegram.ui.ActionBar.m2) i2.d.h(1, launchActivity.f31811d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f34938a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f34938a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f34939b[0]) {
            return;
        }
        fo foVar = new fo(this.f34940c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            foVar.K5 = chatInvite;
        }
        ((ActionBarLayout) this.e.O()).P(foVar);
    }
}
