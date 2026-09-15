package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class bb0 implements MessagesController.MessagesLoadedCallback {
    public final ma0 f32122a;
    public final boolean[] f32123b;
    public final Bundle f32124c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public bb0(LaunchActivity launchActivity, ma0 ma0Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.f32122a = ma0Var;
        this.f32123b = zArr;
        this.f32124c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.c5.u0((org.telegram.ui.ActionBar.n2) hg.k0.h(1, launchActivity.f30820d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f32122a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f32122a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f32123b[0]) {
            return;
        }
        bo boVar = new bo(this.f32124c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            boVar.K5 = chatInvite;
        }
        ((ActionBarLayout) this.e.O()).P(boVar);
    }
}
