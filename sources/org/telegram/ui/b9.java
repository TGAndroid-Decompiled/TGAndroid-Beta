package org.telegram.ui;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class b9 extends r40 {
    public final int f44004w0;
    public final org.telegram.ui.ActionBar.d2 f44005x0;

    public b9(Bundle bundle, int i3, org.telegram.ui.ActionBar.d2 d2Var) {
        super(bundle);
        this.f44004w0 = i3;
        this.f44005x0 = d2Var;
    }

    @Override
    public final void s0(HashSet hashSet) {
        int size = hashSet.size();
        int i3 = this.f44004w0;
        if (size == 1) {
            TLRPC.User a22 = org.telegram.messenger.hp.s1(i3).a2((Long) hashSet.iterator().next());
            TLRPC.UserFull b22 = org.telegram.messenger.hp.s1(i3).b2(a22.f27150id);
            if (b22 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f27143id = org.telegram.messenger.hp.s1(i3).o1(a22.f27150id);
                ConnectionsManager.getInstance(i3).sendRequest(tL_users_getFullUser, new kg.t(this, i3, a22, 3));
                return;
            }
            org.telegram.ui.Components.voip.n1.m(a22, false, b22.video_calls_available, getParentActivity(), b22, org.telegram.messenger.c.a(i3));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.f21385b.nextInt();
            ConnectionsManager.getInstance(i3).sendRequest(createconferencecall, new kg.t(i3, hashSet, this.f44005x0));
        }
        finishFragment();
    }
}
