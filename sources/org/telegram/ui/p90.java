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
public final class p90 extends z40 {
    public p90(s90 s90Var, Bundle bundle) {
        super(bundle);
    }

    public static void z0(p90 p90Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_error tL_error) {
        int i7 = 0;
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            org.telegram.messenger.mp.u1(p90Var.currentAccount).f4(updates.users, false);
            org.telegram.messenger.mp.u1(p90Var.currentAccount).Z3(updates.chats, false);
            ArrayList B0 = org.telegram.messenger.mp.B0(updates, TL_update.TL_updateGroupCall.class);
            int size = B0.size();
            TLRPC.GroupCall groupCall = null;
            while (i7 < size) {
                Object obj = B0.get(i7);
                i7++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            if (LaunchActivity.H1 != null && groupCall != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.f28448id = groupCall.f28441id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                org.telegram.ui.Components.voip.b2.g(LaunchActivity.H1, p90Var.currentAccount, tL_inputGroupCall, false, groupCall, hashSet);
            }
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            org.telegram.messenger.mp.u1(p90Var.currentAccount).f4(groupcall.users, false);
            org.telegram.messenger.mp.u1(p90Var.currentAccount).Z3(groupcall.chats, false);
            if (LaunchActivity.H1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                TLRPC.GroupCall groupCall2 = groupcall.call;
                tL_inputGroupCall2.f28448id = groupCall2.f28441id;
                tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                org.telegram.ui.Components.voip.b2.g(LaunchActivity.H1, p90Var.currentAccount, tL_inputGroupCall2, false, groupCall2, hashSet);
            }
        } else if (tL_error != null) {
            s90.d().g0(tL_error, false);
        }
    }

    @Override
    public final void s0(HashSet hashSet) {
        if (hashSet.size() == 1) {
            TLRPC.User c22 = getMessagesController().c2((Long) hashSet.iterator().next());
            TLRPC.UserFull d2 = getMessagesController().d2(c22.f28580id);
            if (d2 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f28573id = getMessagesController().q1(c22.f28580id);
                getConnectionsManager().sendRequest(tL_users_getFullUser, new e00(7, this, c22));
                return;
            }
            org.telegram.ui.Components.voip.b2.m(c22, false, d2.video_calls_available, getParentActivity(), d2, getAccountInstance());
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.f22805b.nextInt();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new e00(8, this, hashSet));
        }
        finishFragment();
    }
}
