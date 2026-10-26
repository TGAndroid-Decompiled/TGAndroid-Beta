package org.telegram.ui;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class h9 extends r60 {
    public final int f39938v0;
    public final o9 f39939w0;

    public h9(Bundle bundle, int i10, o9 o9Var) {
        super(bundle);
        this.f39938v0 = i10;
        this.f39939w0 = o9Var;
    }

    @Override
    public final void o0(HashSet hashSet) {
        int size = hashSet.size();
        int i10 = this.f39938v0;
        if (size == 1) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser((Long) hashSet.iterator().next());
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(user.f22176id);
            if (userFull == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f22169id = MessagesController.getInstance(i10).getInputUser(user.f22176id);
                ConnectionsManager.getInstance(i10).sendRequest(tL_users_getFullUser, new ig.u(this, i10, user, 3));
                return;
            }
            org.telegram.ui.Components.voip.g2.m(user, false, userFull.video_calls_available, getParentActivity(), userFull, AccountInstance.getInstance(i10));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i10).sendRequest(createconferencecall, new ig.u(i10, hashSet, this.f39939w0));
        }
        finishFragment();
    }
}
