package org.telegram.ui;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class c9 extends w40 {
    public final int f46044w0;
    public final org.telegram.ui.ActionBar.e2 f46045x0;

    public c9(Bundle bundle, int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        super(bundle);
        this.f46044w0 = i7;
        this.f46045x0 = e2Var;
    }

    @Override
    public final void s0(HashSet hashSet) {
        int size = hashSet.size();
        int i7 = this.f46044w0;
        if (size == 1) {
            TLRPC.User a22 = org.telegram.messenger.np.s1(i7).a2((Long) hashSet.iterator().next());
            TLRPC.UserFull b22 = org.telegram.messenger.np.s1(i7).b2(a22.f28200id);
            if (b22 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f28193id = org.telegram.messenger.np.s1(i7).o1(a22.f28200id);
                ConnectionsManager.getInstance(i7).sendRequest(tL_users_getFullUser, new jg.u(this, i7, a22, 3));
                return;
            }
            org.telegram.ui.Components.voip.c2.m(a22, false, b22.video_calls_available, getParentActivity(), b22, org.telegram.messenger.c.a(i7));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.f22414b.nextInt();
            ConnectionsManager.getInstance(i7).sendRequest(createconferencecall, new jg.u(i7, hashSet, this.f46045x0));
        }
        finishFragment();
    }
}
