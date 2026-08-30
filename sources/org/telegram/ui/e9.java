package org.telegram.ui;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class e9 extends y60 {
    public final int f33930s0;
    public final org.telegram.ui.ActionBar.p2 f33931t0;

    public e9(Bundle bundle, int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        super(bundle);
        this.f33930s0 = i10;
        this.f33931t0 = p2Var;
    }

    @Override
    public final void n0(HashSet hashSet) {
        int size = hashSet.size();
        int i10 = this.f33930s0;
        if (size == 1) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser((Long) hashSet.iterator().next());
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(user.f19331id);
            if (userFull == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f19324id = MessagesController.getInstance(i10).getInputUser(user.f19331id);
                ConnectionsManager.getInstance(i10).sendRequest(tL_users_getFullUser, new gg.l0(this, i10, user, 3));
                return;
            }
            org.telegram.ui.Components.voip.f2.n(user, false, userFull.video_calls_available, getParentActivity(), userFull, AccountInstance.getInstance(i10));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i10).sendRequest(createconferencecall, new gg.l0(i10, hashSet, this.f33931t0));
        }
        finishFragment();
    }
}
