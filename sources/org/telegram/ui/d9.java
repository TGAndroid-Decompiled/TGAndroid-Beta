package org.telegram.ui;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class d9 extends v50 {
    public final int f36705v0;
    public final org.telegram.ui.ActionBar.k2 f36706w0;

    public d9(Bundle bundle, int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        super(bundle);
        this.f36705v0 = i10;
        this.f36706w0 = k2Var;
    }

    @Override
    public final void r0(HashSet hashSet) {
        int size = hashSet.size();
        int i10 = this.f36705v0;
        if (size == 1) {
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(i10).Z1((Long) hashSet.iterator().next());
            TLRPC.UserFull a2 = org.telegram.messenger.vp.r1(i10).a2(Z1.f19942id);
            if (a2 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f19935id = org.telegram.messenger.vp.r1(i10).n1(Z1.f19942id);
                ConnectionsManager.getInstance(i10).sendRequest(tL_users_getFullUser, new mg.w(this, i10, Z1, 3));
                return;
            }
            org.telegram.ui.Components.voip.m1.m(Z1, false, a2.video_calls_available, getParentActivity(), a2, org.telegram.messenger.c.a(i10));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.f14519b.nextInt();
            ConnectionsManager.getInstance(i10).sendRequest(createconferencecall, new mg.w(i10, hashSet, this.f36706w0));
        }
        finishFragment();
    }
}
