package org.telegram.ui;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class b9 extends k60 {
    public final int f36767r0;
    public final org.telegram.ui.ActionBar.o2 f36768s0;

    public b9(Bundle bundle, int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        super(bundle);
        this.f36767r0 = i9;
        this.f36768s0 = o2Var;
    }

    @Override
    public final void m0(HashSet hashSet) {
        int size = hashSet.size();
        int i9 = this.f36767r0;
        if (size == 1) {
            TLRPC.User user = MessagesController.getInstance(i9).getUser((Long) hashSet.iterator().next());
            TLRPC.UserFull userFull = MessagesController.getInstance(i9).getUserFull(user.f22527id);
            if (userFull == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f22520id = MessagesController.getInstance(i9).getInputUser(user.f22527id);
                ConnectionsManager.getInstance(i9).sendRequest(tL_users_getFullUser, new bg.q0(this, i9, user, 4));
                return;
            }
            org.telegram.ui.Components.voip.e2.n(user, false, userFull.video_calls_available, getParentActivity(), userFull, AccountInstance.getInstance(i9));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i9).sendRequest(createconferencecall, new bg.q0(i9, hashSet, this.f36768s0));
        }
        finishFragment();
    }
}
