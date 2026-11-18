package org.telegram.ui;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class c9 extends z40 {
    public final int f46464w0;
    public final org.telegram.ui.ActionBar.h2 f46465x0;

    public c9(Bundle bundle, int i7, org.telegram.ui.ActionBar.h2 h2Var) {
        super(bundle);
        this.f46464w0 = i7;
        this.f46465x0 = h2Var;
    }

    @Override
    public final void s0(HashSet hashSet) {
        int size = hashSet.size();
        int i7 = this.f46464w0;
        if (size == 1) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2((Long) hashSet.iterator().next());
            TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(i7).d2(c22.f28554id);
            if (d2 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f28547id = org.telegram.messenger.mp.u1(i7).q1(c22.f28554id);
                ConnectionsManager.getInstance(i7).sendRequest(tL_users_getFullUser, new jg.u(this, i7, c22, 3));
                return;
            }
            org.telegram.ui.Components.voip.b2.m(c22, false, d2.video_calls_available, getParentActivity(), d2, org.telegram.messenger.c.a(i7));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.f22780b.nextInt();
            ConnectionsManager.getInstance(i7).sendRequest(createconferencecall, new jg.u(i7, hashSet, this.f46465x0));
        }
        finishFragment();
    }
}
