package org.telegram.ui;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class c9 extends w40 {
    public final int f44727v0;
    public final org.telegram.ui.ActionBar.f2 f44728w0;

    public c9(Bundle bundle, int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        super(bundle);
        this.f44727v0 = i7;
        this.f44728w0 = f2Var;
    }

    @Override
    public final void s0(HashSet hashSet) {
        int size = hashSet.size();
        int i7 = this.f44727v0;
        if (size == 1) {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(i7).a2((Long) hashSet.iterator().next());
            TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(i7).b2(a22.f27105id);
            if (b22 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f27098id = org.telegram.messenger.qp.s1(i7).o1(a22.f27105id);
                ConnectionsManager.getInstance(i7).sendRequest(tL_users_getFullUser, new jg.v(this, i7, a22, 3));
                return;
            }
            org.telegram.ui.Components.voip.y1.m(a22, false, b22.video_calls_available, getParentActivity(), b22, org.telegram.messenger.c.a(i7));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.f21334b.nextInt();
            ConnectionsManager.getInstance(i7).sendRequest(createconferencecall, new jg.v(i7, hashSet, this.f44728w0));
        }
        finishFragment();
    }
}
