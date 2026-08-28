package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ga0 implements MessagesController.MessagesLoadedCallback {
    public final x20 f38490a;
    public final boolean[] f38491b;
    public final Bundle f38492c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f38493e;

    public ga0(LaunchActivity launchActivity, x20 x20Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f38493e = launchActivity;
        this.f38490a = x20Var;
        this.f38491b = zArr;
        this.f38492c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f38493e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.y4.u0((org.telegram.ui.ActionBar.o2) j3.r0.j(1, launchActivity.Z), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f38490a.run();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f38490a.run();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (this.f38491b[0]) {
            return;
        }
        qn qnVar = new qn(this.f38492c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            qnVar.G5 = chatInvite;
        }
        ((ActionBarLayout) this.f38493e.O()).P(qnVar);
    }
}
