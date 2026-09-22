package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class bb0 implements MessagesController.MessagesLoadedCallback {
    public final ma0 f32107a;
    public final boolean[] f32108b;
    public final Bundle f32109c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public bb0(LaunchActivity launchActivity, ma0 ma0Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.f32107a = ma0Var;
        this.f32108b = zArr;
        this.f32109c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.c5.u0((org.telegram.ui.ActionBar.n2) hg.c.h(1, launchActivity.f30817d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f32107a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f32107a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f32108b[0]) {
            return;
        }
        bo boVar = new bo(this.f32109c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            boVar.K5 = chatInvite;
        }
        ((ActionBarLayout) this.e.O()).P(boVar);
    }
}
