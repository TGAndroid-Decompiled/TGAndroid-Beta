package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
public final class qa0 extends u50 {
    public qa0(ta0 ta0Var, Bundle bundle) {
        super(bundle);
    }

    public static void z0(qa0 qa0Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_error tL_error) {
        int i10 = 0;
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            org.telegram.messenger.wp.r1(qa0Var.currentAccount).V3(updates.users, false);
            org.telegram.messenger.wp.r1(qa0Var.currentAccount).P3(updates.chats, false);
            ArrayList z02 = org.telegram.messenger.wp.z0(updates, TL_update.TL_updateGroupCall.class);
            int size = z02.size();
            TLRPC.GroupCall groupCall = null;
            while (i10 < size) {
                Object obj = z02.get(i10);
                i10++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            if (LaunchActivity.I1 != null && groupCall != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.f19811id = groupCall.f19804id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                org.telegram.ui.Components.voip.n1.g(LaunchActivity.I1, qa0Var.currentAccount, tL_inputGroupCall, false, groupCall, hashSet);
            }
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            org.telegram.messenger.wp.r1(qa0Var.currentAccount).V3(groupcall.users, false);
            org.telegram.messenger.wp.r1(qa0Var.currentAccount).P3(groupcall.chats, false);
            if (LaunchActivity.I1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                TLRPC.GroupCall groupCall2 = groupcall.call;
                tL_inputGroupCall2.f19811id = groupCall2.f19804id;
                tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                org.telegram.ui.Components.voip.n1.g(LaunchActivity.I1, qa0Var.currentAccount, tL_inputGroupCall2, false, groupCall2, hashSet);
            }
        } else if (tL_error != null) {
            ta0.d().f0(tL_error, false);
        }
    }

    @Override
    public final void s0(HashSet hashSet) {
        if (hashSet.size() == 1) {
            TLRPC.User Z1 = getMessagesController().Z1((Long) hashSet.iterator().next());
            TLRPC.UserFull a2 = getMessagesController().a2(Z1.f19943id);
            if (a2 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f19936id = getMessagesController().n1(Z1.f19943id);
                getConnectionsManager().sendRequest(tL_users_getFullUser, new org.telegram.ui.Components.t20(19, this, Z1));
                return;
            }
            org.telegram.ui.Components.voip.n1.m(Z1, false, a2.video_calls_available, getParentActivity(), a2, getAccountInstance());
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.f14520b.nextInt();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new org.telegram.ui.Components.t20(20, this, hashSet));
        }
        finishFragment();
    }
}
