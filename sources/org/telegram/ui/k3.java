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
public final class k3 implements q0.a {
    public final int f39691a;
    public final Object f39692b;

    public k3(Object obj, int i9) {
        this.f39691a = i9;
        this.f39692b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z10;
        switch (this.f39691a) {
            case 0:
                p3 p3Var = (p3) this.f39692b;
                Float f10 = (Float) obj;
                l4 l4Var = p3Var.G;
                if (p3Var == l4Var.f40026q0[0]) {
                    if (l4Var.f40014d0.W.getCurrentProgress() > f10.floatValue()) {
                        l4Var.f40014d0.W.a(0.0f, false);
                    }
                    l4Var.f40014d0.W.a(f10.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.ej0) this.f39692b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                jr jrVar = ((zq) this.f39692b).f45237b;
                cr v02 = jrVar.v0();
                ArrayList arrayList2 = jrVar.B;
                a0.h hVar = jrVar.I;
                if (hVar != null && hVar.m() != 0) {
                    arrayList = jrVar.D;
                } else {
                    arrayList = arrayList2;
                }
                if (hVar == null || hVar.m() == 0) {
                    hVar = jrVar.G;
                }
                if (hVar.f(user.f22527id) == null) {
                    if (ChatObject.isChannel(jrVar.f39595r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = jrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f22527id;
                        tL_channelParticipant.date = jrVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.f22527id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f22527id;
                        tL_chatParticipant.inviter_id = jrVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.f22527id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new j9.a(20));
                }
                jrVar.z0(v02);
                return;
            case 3:
                w3 w3Var = (w3) this.f39692b;
                int i9 = ((n2.g) obj).f18319a;
                if (i9 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i9);
                }
                AndroidUtilities.runOnUIThread(new cf0(3, w3Var, responseCodeString));
                return;
            case 4:
                ai0 ai0Var = (ai0) this.f39692b;
                if (((n2.g) obj).f18319a == 0) {
                    AndroidUtilities.runOnUIThread(ai0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f39692b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f39692b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i10 = 0; i10 < profileActivity.f36032q2.participants.participants.size(); i10++) {
                    if (profileActivity.f36032q2.participants.participants.get(i10).user_id == user2.f22527id) {
                        profileActivity.f36032q2.participants.participants.remove(i10);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f39692b).f36097b.T((View) obj).f5501a;
                if (view instanceof c11) {
                    c11 c11Var = (c11) view;
                    if (c11Var.d == SharedConfig.currentProxy) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c11Var.setChecked(z10);
                    c11Var.b();
                    return;
                }
                return;
        }
    }
}
