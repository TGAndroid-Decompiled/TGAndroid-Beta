package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
public final class j3 implements q0.a {
    public final int f38026a;
    public final Object f38027b;

    public j3(Object obj, int i10) {
        this.f38026a = i10;
        this.f38027b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z10;
        switch (this.f38026a) {
            case 0:
                o3 o3Var = (o3) this.f38027b;
                Float f7 = (Float) obj;
                l4 l4Var = o3Var.K;
                if (o3Var == l4Var.f38725u0[0]) {
                    if (l4Var.f38713h0.f42752d0.getCurrentProgress() > f7.floatValue()) {
                        l4Var.f38713h0.f42752d0.a(0.0f, false);
                    }
                    l4Var.f38713h0.f42752d0.a(f7.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.mk0) this.f38027b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                jr jrVar = ((ar) this.f38027b).f35467b;
                dr w02 = jrVar.w0();
                ArrayList arrayList2 = jrVar.F;
                a0.h hVar = jrVar.M;
                if (hVar != null && hVar.m() != 0) {
                    arrayList = jrVar.H;
                } else {
                    arrayList = arrayList2;
                }
                if (hVar == null || hVar.m() == 0) {
                    hVar = jrVar.K;
                }
                if (hVar.f(user.f20419id) == null) {
                    if (ChatObject.isChannel(jrVar.f38295r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = jrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f20419id;
                        tL_channelParticipant.date = jrVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.f20419id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f20419id;
                        tL_chatParticipant.inviter_id = jrVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.f20419id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new org.telegram.ui.ActionBar.i4(11));
                }
                jrVar.A0(w02);
                return;
            case 3:
                v3 v3Var = (v3) this.f38027b;
                int i10 = ((c5.i) obj).f4757a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new b80(26, v3Var, responseCodeString));
                return;
            case 4:
                ci0 ci0Var = (ci0) this.f38027b;
                if (((c5.i) obj).f4757a == 0) {
                    AndroidUtilities.runOnUIThread(ci0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f38027b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f38027b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f33718v2.participants.participants.size(); i11++) {
                    if (profileActivity.f33718v2.participants.participants.get(i11).user_id == user2.f20419id) {
                        profileActivity.f33718v2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f38027b).f33752b.T((View) obj).f45910a;
                if (view instanceof m11) {
                    m11 m11Var = (m11) view;
                    if (m11Var.d == SharedConfig.currentProxy) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    m11Var.setChecked(z10);
                    m11Var.b();
                    return;
                }
                return;
        }
    }
}
