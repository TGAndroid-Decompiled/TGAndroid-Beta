package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class eb0 implements MessagesController.MessagesLoadedCallback {
    public final o00 f35504a;
    public final boolean[] f35505b;
    public final Bundle f35506c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public eb0(LaunchActivity launchActivity, o00 o00Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.f35504a = o00Var;
        this.f35505b = zArr;
        this.f35506c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.g5.t0((org.telegram.ui.ActionBar.m2) i2.d.g(1, launchActivity.f32109d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f35504a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f35504a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f35505b[0]) {
            return;
        }
        fo foVar = new fo(this.f35506c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            foVar.K5 = chatInvite;
        }
        ((ActionBarLayout) this.e.O()).P(foVar);
    }
}
