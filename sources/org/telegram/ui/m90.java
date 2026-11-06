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
public final class m90 extends w40 {
    public m90(p90 p90Var, Bundle bundle) {
        super(bundle);
    }

    public static void z0(m90 m90Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_error tL_error) {
        int i7 = 0;
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            org.telegram.messenger.qp.s1(m90Var.currentAccount).Y3(updates.users, false);
            org.telegram.messenger.qp.s1(m90Var.currentAccount).S3(updates.chats, false);
            ArrayList z02 = org.telegram.messenger.qp.z0(updates, TL_update.TL_updateGroupCall.class);
            int size = z02.size();
            TLRPC.GroupCall groupCall = null;
            while (i7 < size) {
                Object obj = z02.get(i7);
                i7++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            if (LaunchActivity.G1 != null && groupCall != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.f26969id = groupCall.f26962id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                org.telegram.ui.Components.voip.y1.g(LaunchActivity.G1, m90Var.currentAccount, tL_inputGroupCall, false, groupCall, hashSet);
            }
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            org.telegram.messenger.qp.s1(m90Var.currentAccount).Y3(groupcall.users, false);
            org.telegram.messenger.qp.s1(m90Var.currentAccount).S3(groupcall.chats, false);
            if (LaunchActivity.G1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                TLRPC.GroupCall groupCall2 = groupcall.call;
                tL_inputGroupCall2.f26969id = groupCall2.f26962id;
                tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                org.telegram.ui.Components.voip.y1.g(LaunchActivity.G1, m90Var.currentAccount, tL_inputGroupCall2, false, groupCall2, hashSet);
            }
        } else if (tL_error != null) {
            p90.d().f0(tL_error, false);
        }
    }

    @Override
    public final void s0(HashSet hashSet) {
        if (hashSet.size() == 1) {
            TLRPC.User a22 = getMessagesController().a2((Long) hashSet.iterator().next());
            TLRPC.UserFull b22 = getMessagesController().b2(a22.f27101id);
            if (b22 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f27094id = getMessagesController().o1(a22.f27101id);
                getConnectionsManager().sendRequest(tL_users_getFullUser, new h50(5, this, a22));
                return;
            }
            org.telegram.ui.Components.voip.y1.m(a22, false, b22.video_calls_available, getParentActivity(), b22, getAccountInstance());
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.f21331b.nextInt();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new h50(6, this, hashSet));
        }
        finishFragment();
    }
}
