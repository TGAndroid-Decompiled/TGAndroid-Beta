package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
public final class jb0 extends m60 {
    public jb0(mb0 mb0Var, Bundle bundle) {
        super(bundle);
    }

    public static void t0(jb0 jb0Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_error tL_error) {
        int i10 = 0;
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(jb0Var.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(jb0Var.currentAccount).putChats(updates.chats, false);
            ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
            int size = findUpdatesAndRemove.size();
            TLRPC.GroupCall groupCall = null;
            while (i10 < size) {
                Object obj = findUpdatesAndRemove.get(i10);
                i10++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            if (LaunchActivity.C1 != null && groupCall != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.f22409id = groupCall.f22402id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                org.telegram.ui.Components.voip.h2.h(LaunchActivity.C1, jb0Var.currentAccount, tL_inputGroupCall, false, groupCall, hashSet);
            }
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(jb0Var.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(jb0Var.currentAccount).putChats(groupcall.chats, false);
            if (LaunchActivity.C1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                TLRPC.GroupCall groupCall2 = groupcall.call;
                tL_inputGroupCall2.f22409id = groupCall2.f22402id;
                tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                org.telegram.ui.Components.voip.h2.h(LaunchActivity.C1, jb0Var.currentAccount, tL_inputGroupCall2, false, groupCall2, hashSet);
            }
        } else if (tL_error != null) {
            mb0.b().d0(tL_error, false);
        }
    }

    @Override
    public final void n0(HashSet hashSet) {
        if (hashSet.size() == 1) {
            TLRPC.User user = getMessagesController().getUser((Long) hashSet.iterator().next());
            TLRPC.UserFull userFull = getMessagesController().getUserFull(user.f22539id);
            if (userFull == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f22532id = getMessagesController().getInputUser(user.f22539id);
                getConnectionsManager().sendRequest(tL_users_getFullUser, new u80(2, this, user));
                return;
            }
            org.telegram.ui.Components.voip.h2.n(user, false, userFull.video_calls_available, getParentActivity(), userFull, getAccountInstance());
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new u80(3, this, hashSet));
        }
        finishFragment();
    }
}
