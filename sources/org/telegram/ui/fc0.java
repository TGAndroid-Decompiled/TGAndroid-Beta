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
public final class fc0 extends j70 {
    public fc0(ic0 ic0Var, Bundle bundle) {
        super(bundle);
    }

    public static void t0(fc0 fc0Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_error tL_error) {
        int i10 = 0;
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(fc0Var.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(fc0Var.currentAccount).putChats(updates.chats, false);
            ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
            int size = findUpdatesAndRemove.size();
            TLRPC.GroupCall groupCall = null;
            while (i10 < size) {
                Object obj = findUpdatesAndRemove.get(i10);
                i10++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            if (LaunchActivity.G1 != null && groupCall != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.f18933id = groupCall.f18926id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                org.telegram.ui.Components.voip.d2.g(LaunchActivity.G1, fc0Var.currentAccount, tL_inputGroupCall, false, groupCall, hashSet);
            }
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(fc0Var.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(fc0Var.currentAccount).putChats(groupcall.chats, false);
            if (LaunchActivity.G1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                TLRPC.GroupCall groupCall2 = groupcall.call;
                tL_inputGroupCall2.f18933id = groupCall2.f18926id;
                tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                org.telegram.ui.Components.voip.d2.g(LaunchActivity.G1, fc0Var.currentAccount, tL_inputGroupCall2, false, groupCall2, hashSet);
            }
        } else if (tL_error != null) {
            ic0.d().f0(tL_error, false);
        }
    }

    @Override
    public final void n0(HashSet hashSet) {
        if (hashSet.size() == 1) {
            TLRPC.User user = getMessagesController().getUser((Long) hashSet.iterator().next());
            TLRPC.UserFull userFull = getMessagesController().getUserFull(user.f19063id);
            if (userFull == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f19056id = getMessagesController().getInputUser(user.f19063id);
                getConnectionsManager().sendRequest(tL_users_getFullUser, new to(29, this, user));
                return;
            }
            org.telegram.ui.Components.voip.d2.m(user, false, userFull.video_calls_available, getParentActivity(), userFull, getAccountInstance());
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new ec0(0, this, hashSet));
        }
        finishFragment();
    }
}
