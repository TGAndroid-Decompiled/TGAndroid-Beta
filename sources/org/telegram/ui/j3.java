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
    public final int f37244a;
    public final Object f37245b;

    public j3(Object obj, int i10) {
        this.f37244a = i10;
        this.f37245b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z10;
        switch (this.f37244a) {
            case 0:
                o3 o3Var = (o3) this.f37245b;
                Float f7 = (Float) obj;
                k4 k4Var = o3Var.K;
                if (o3Var == k4Var.f37557u0[0]) {
                    if (k4Var.f37545h0.f41506d0.getCurrentProgress() > f7.floatValue()) {
                        k4Var.f37545h0.f41506d0.a(0.0f, false);
                    }
                    k4Var.f37545h0.f41506d0.a(f7.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.qk0) this.f37245b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                yr yrVar = ((pr) this.f37245b).f39278b;
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
                if (hVar.f(user.f19363id) == null) {
                    if (ChatObject.isChannel(yrVar.f42249r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = yrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f19363id;
                        tL_channelParticipant.date = yrVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.f19363id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f19363id;
                        tL_chatParticipant.inviter_id = yrVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.f19363id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new org.telegram.ui.ActionBar.l5(8));
                }
                yrVar.A0(w02);
                return;
            case 3:
                v3 v3Var = (v3) this.f37245b;
                int i10 = ((c5.i) obj).f4381a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new wc0(13, v3Var, responseCodeString));
                return;
            case 4:
                wi0 wi0Var = (wi0) this.f37245b;
                if (((c5.i) obj).f4381a == 0) {
                    AndroidUtilities.runOnUIThread(wi0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f37245b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f37245b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f32671u2.participants.participants.size(); i11++) {
                    if (profileActivity.f32671u2.participants.participants.get(i11).user_id == user2.f19363id) {
                        profileActivity.f32671u2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f37245b).f32710b.T((View) obj).f44838a;
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
