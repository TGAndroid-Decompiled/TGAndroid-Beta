package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

public final class ka0 implements MessagesController.MessagesLoadedCallback {

    public final a30 f39680a;

    public final boolean[] f39681b;

    public final Bundle f39682c;
    public final TLRPC.ChatInvite d;

    public final LaunchActivity f39683e;

    public ka0(LaunchActivity launchActivity, a30 a30Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f39683e = launchActivity;
        this.f39680a = a30Var;
        this.f39681b = zArr;
        this.f39682c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f39683e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.y4.u0((org.telegram.ui.ActionBar.n2) i0.a.i(1, launchActivity.Z), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f39680a.run();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f39680a.run();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        if (this.f39681b[0]) {
            return;
        }
        rn rnVar = new rn(this.f39682c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            rnVar.G5 = chatInvite;
        }
        ((ActionBarLayout) this.f39683e.O()).P(rnVar);
    }
}
