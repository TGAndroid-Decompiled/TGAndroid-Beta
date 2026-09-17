package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class bb0 implements MessagesController.MessagesLoadedCallback {
    public final r80 f34714a;
    public final boolean[] f34715b;
    public final Bundle f34716c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f34717e;

    public bb0(LaunchActivity launchActivity, r80 r80Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f34717e = launchActivity;
        this.f34714a = r80Var;
        this.f34715b = zArr;
        this.f34716c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f34717e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.e5.u0((org.telegram.ui.ActionBar.n2) i2.g.h(1, launchActivity.f33457d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f34714a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f34714a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (this.f34715b[0]) {
            return;
        }
        co coVar = new co(this.f34716c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            coVar.K5 = chatInvite;
        }
        ((ActionBarLayout) this.f34717e.O()).P(coVar);
    }
}
