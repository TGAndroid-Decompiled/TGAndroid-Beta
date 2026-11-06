package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class o80 implements org.telegram.messenger.ep {
    public final q10 f48326a;
    public final boolean[] f48327b;
    public final Bundle f48328c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f48329e;

    public o80(LaunchActivity launchActivity, q10 q10Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f48329e = launchActivity;
        this.f48326a = q10Var;
        this.f48327b = zArr;
        this.f48328c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.f48329e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.v4.r0((org.telegram.ui.ActionBar.f2) jg.g.i(1, launchActivity.f41257d0), null, org.telegram.messenger.hd.M0(2131749074, null), null);
        }
        try {
            this.f48326a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void f(boolean z9) {
        try {
            this.f48326a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.f48327b[0]) {
            return;
        }
        an anVar = new an(this.f48328c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            anVar.f43723a6 = chatInvite;
        }
        ((ActionBarLayout) this.f48329e.M()).S(anVar);
    }
}
