package org.telegram.ui;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class a9 extends m60 {
    public final int f36457r0;
    public final org.telegram.ui.ActionBar.o2 f36458s0;

    public a9(Bundle bundle, int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        super(bundle);
        this.f36457r0 = i10;
        this.f36458s0 = o2Var;
    }

    @Override
    public final void n0(HashSet hashSet) {
        int size = hashSet.size();
        int i10 = this.f36457r0;
        if (size == 1) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser((Long) hashSet.iterator().next());
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(user.f22539id);
            if (userFull == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f22532id = MessagesController.getInstance(i10).getInputUser(user.f22539id);
                ConnectionsManager.getInstance(i10).sendRequest(tL_users_getFullUser, new eg.m0(this, i10, user, 3));
                return;
            }
            org.telegram.ui.Components.voip.h2.n(user, false, userFull.video_calls_available, getParentActivity(), userFull, AccountInstance.getInstance(i10));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i10).sendRequest(createconferencecall, new eg.m0(i10, hashSet, this.f36458s0));
        }
        finishFragment();
    }
}
