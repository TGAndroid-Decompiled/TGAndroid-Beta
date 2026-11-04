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
public final class j90 extends r40 {
    public j90(m90 m90Var, Bundle bundle) {
        super(bundle);
    }

    public static void z0(j90 j90Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_error tL_error) {
        int i3 = 0;
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            org.telegram.messenger.hp.s1(j90Var.currentAccount).Y3(updates.users, false);
            org.telegram.messenger.hp.s1(j90Var.currentAccount).S3(updates.chats, false);
            ArrayList z02 = org.telegram.messenger.hp.z0(updates, TL_update.TL_updateGroupCall.class);
            int size = z02.size();
            TLRPC.GroupCall groupCall = null;
            while (i3 < size) {
                Object obj = z02.get(i3);
                i3++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            if (LaunchActivity.K1 != null && groupCall != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.f27018id = groupCall.f27011id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                org.telegram.ui.Components.voip.n1.g(LaunchActivity.K1, j90Var.currentAccount, tL_inputGroupCall, false, groupCall, hashSet);
            }
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            org.telegram.messenger.hp.s1(j90Var.currentAccount).Y3(groupcall.users, false);
            org.telegram.messenger.hp.s1(j90Var.currentAccount).S3(groupcall.chats, false);
            if (LaunchActivity.K1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                TLRPC.GroupCall groupCall2 = groupcall.call;
                tL_inputGroupCall2.f27018id = groupCall2.f27011id;
                tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                org.telegram.ui.Components.voip.n1.g(LaunchActivity.K1, j90Var.currentAccount, tL_inputGroupCall2, false, groupCall2, hashSet);
            }
        } else if (tL_error != null) {
            m90.d().f0(tL_error, false);
        }
    }

    @Override
    public final void s0(HashSet hashSet) {
        if (hashSet.size() == 1) {
            TLRPC.User a22 = getMessagesController().a2((Long) hashSet.iterator().next());
            TLRPC.UserFull b22 = getMessagesController().b2(a22.f27150id);
            if (b22 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f27143id = getMessagesController().o1(a22.f27150id);
                getConnectionsManager().sendRequest(tL_users_getFullUser, new xy(8, this, a22));
                return;
            }
            org.telegram.ui.Components.voip.n1.m(a22, false, b22.video_calls_available, getParentActivity(), b22, getAccountInstance());
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.f21385b.nextInt();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new xy(9, this, hashSet));
        }
        finishFragment();
    }
}
