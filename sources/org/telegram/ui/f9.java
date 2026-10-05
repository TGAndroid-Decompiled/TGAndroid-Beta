package org.telegram.ui;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class f9 extends d70 {
    public final int f36228v0;
    public final org.telegram.ui.ActionBar.n2 f36229w0;

    public f9(Bundle bundle, int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        super(bundle);
        this.f36228v0 = i10;
        this.f36229w0 = n2Var;
    }

    @Override
    public final void n0(HashSet hashSet) {
        int size = hashSet.size();
        int i10 = this.f36228v0;
        if (size == 1) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser((Long) hashSet.iterator().next());
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(user.f20194id);
            if (userFull == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f20187id = MessagesController.getInstance(i10).getInputUser(user.f20194id);
                ConnectionsManager.getInstance(i10).sendRequest(tL_users_getFullUser, new gg.u(this, i10, user, 3));
                return;
            }
            org.telegram.ui.Components.voip.g2.m(user, false, userFull.video_calls_available, getParentActivity(), userFull, AccountInstance.getInstance(i10));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i10).sendRequest(createconferencecall, new gg.u(i10, hashSet, this.f36229w0));
        }
        finishFragment();
    }
}
