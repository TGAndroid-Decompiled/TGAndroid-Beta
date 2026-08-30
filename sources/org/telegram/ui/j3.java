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
    public final int f35213a;
    public final Object f35214b;

    public j3(Object obj, int i10) {
        this.f35213a = i10;
        this.f35214b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z4;
        switch (this.f35213a) {
            case 0:
                p3 p3Var = (p3) this.f35214b;
                Float f10 = (Float) obj;
                l4 l4Var = p3Var.H;
                if (p3Var == l4Var.f35945r0[0]) {
                    if (l4Var.f35933e0.f39628a0.getCurrentProgress() > f10.floatValue()) {
                        l4Var.f35933e0.f39628a0.a(0.0f, false);
                    }
                    l4Var.f35933e0.f39628a0.a(f10.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.yj0) this.f35214b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                pr prVar = ((gr) this.f35214b).f34665b;
                jr w02 = prVar.w0();
                ArrayList arrayList2 = prVar.C;
                a0.h hVar = prVar.J;
                if (hVar != null && hVar.m() != 0) {
                    arrayList = prVar.E;
                } else {
                    arrayList = arrayList2;
                }
                if (hVar == null || hVar.m() == 0) {
                    hVar = prVar.H;
                }
                if (hVar.f(user.f19331id) == null) {
                    if (ChatObject.isChannel(prVar.f37481r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = prVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f19331id;
                        tL_channelParticipant.date = prVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.f19331id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f19331id;
                        tL_chatParticipant.inviter_id = prVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.f19331id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new nh.e4(15));
                }
                prVar.A0(w02);
                return;
            case 3:
                w3 w3Var = (w3) this.f35214b;
                int i10 = ((p2.h) obj).f40993a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new fe0(9, w3Var, responseCodeString));
                return;
            case 4:
                hi0 hi0Var = (hi0) this.f35214b;
                if (((p2.h) obj).f40993a == 0) {
                    AndroidUtilities.runOnUIThread(hi0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f35214b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f35214b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f32150r2.participants.participants.size(); i11++) {
                    if (profileActivity.f32150r2.participants.participants.get(i11).user_id == user2.f19331id) {
                        profileActivity.f32150r2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f35214b).f32207b.T((View) obj).f5785a;
                if (view instanceof o11) {
                    o11 o11Var = (o11) view;
                    if (o11Var.d == SharedConfig.currentProxy) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    o11Var.setChecked(z4);
                    o11Var.b();
                    return;
                }
                return;
        }
    }
}
