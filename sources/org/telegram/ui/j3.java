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
    public final int f36914a;
    public final Object f36915b;

    public j3(Object obj, int i10) {
        this.f36914a = i10;
        this.f36915b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z10;
        switch (this.f36914a) {
            case 0:
                o3 o3Var = (o3) this.f36915b;
                Float f7 = (Float) obj;
                k4 k4Var = o3Var.K;
                if (o3Var == k4Var.f37278u0[0]) {
                    if (k4Var.f37266h0.f41207d0.getCurrentProgress() > f7.floatValue()) {
                        k4Var.f37266h0.f41207d0.a(0.0f, false);
                    }
                    k4Var.f37266h0.f41207d0.a(f7.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.qk0) this.f36915b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                yr yrVar = ((pr) this.f36915b).f38998b;
                sr w02 = yrVar.w0();
                ArrayList arrayList2 = yrVar.F;
                a0.h hVar = yrVar.M;
                if (hVar != null && hVar.m() != 0) {
                    arrayList = yrVar.H;
                } else {
                    arrayList = arrayList2;
                }
                if (hVar == null || hVar.m() == 0) {
                    hVar = yrVar.K;
                }
                if (hVar.f(user.f19063id) == null) {
                    if (ChatObject.isChannel(yrVar.f41926r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = yrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f19063id;
                        tL_channelParticipant.date = yrVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.f19063id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f19063id;
                        tL_chatParticipant.inviter_id = yrVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.f19063id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new org.telegram.ui.ActionBar.l5(8));
                }
                yrVar.A0(w02);
                return;
            case 3:
                v3 v3Var = (v3) this.f36915b;
                int i10 = ((c5.i) obj).f4384a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new se0(8, v3Var, responseCodeString));
                return;
            case 4:
                vi0 vi0Var = (vi0) this.f36915b;
                if (((c5.i) obj).f4384a == 0) {
                    AndroidUtilities.runOnUIThread(vi0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f36915b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f36915b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f32373u2.participants.participants.size(); i11++) {
                    if (profileActivity.f32373u2.participants.participants.get(i11).user_id == user2.f19063id) {
                        profileActivity.f32373u2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f36915b).f32412b.T((View) obj).f44838a;
                if (view instanceof n21) {
                    n21 n21Var = (n21) view;
                    if (n21Var.d == SharedConfig.currentProxy) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    n21Var.setChecked(z10);
                    n21Var.b();
                    return;
                }
                return;
        }
    }
}
