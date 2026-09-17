package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class db0 implements MessagesController.MessagesLoadedCallback {
    public final oa0 f33081a;
    public final boolean[] f33082b;
    public final Bundle f33083c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public db0(LaunchActivity launchActivity, oa0 oa0Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.f33081a = oa0Var;
        this.f33082b = zArr;
        this.f33083c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.c5.u0((org.telegram.ui.ActionBar.o2) hg.k0.h(1, launchActivity.f30834d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f33081a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f33081a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f33082b[0]) {
            return;
        }
        bo boVar = new bo(this.f33083c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            boVar.K5 = chatInvite;
        }
        ((ActionBarLayout) this.e.O()).P(boVar);
    }
}
