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
public final class l3 implements q0.a {
    public final int f40080a;
    public final Object f40081b;

    public l3(Object obj, int i10) {
        this.f40080a = i10;
        this.f40081b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z10;
        switch (this.f40080a) {
            case 0:
                q3 q3Var = (q3) this.f40081b;
                Float f9 = (Float) obj;
                m4 m4Var = q3Var.G;
                if (q3Var == m4Var.f40404q0[0]) {
                    if (m4Var.f40392d0.W.getCurrentProgress() > f9.floatValue()) {
                        m4Var.f40392d0.W.a(0.0f, false);
                    }
                    m4Var.f40392d0.W.a(f9.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.pj0) this.f40081b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                jr jrVar = ((ar) this.f40081b).f36587b;
                dr w02 = jrVar.w0();
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
                if (hVar.f(user.f22539id) == null) {
                    if (ChatObject.isChannel(jrVar.f39656r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = jrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f22539id;
                        tL_channelParticipant.date = jrVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.f22539id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f22539id;
                        tL_chatParticipant.inviter_id = jrVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.f22539id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new lh.e4(18));
                }
                jrVar.A0(w02);
                return;
            case 3:
                x3 x3Var = (x3) this.f40081b;
                int i10 = ((p2.g) obj).f45457a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new lf0(0, x3Var, responseCodeString));
                return;
            case 4:
                zh0 zh0Var = (zh0) this.f40081b;
                if (((p2.g) obj).f45457a == 0) {
                    AndroidUtilities.runOnUIThread(zh0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f40081b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f40081b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f36099q2.participants.participants.size(); i11++) {
                    if (profileActivity.f36099q2.participants.participants.get(i11).user_id == user2.f22539id) {
                        profileActivity.f36099q2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f40081b).f36162b.T((View) obj).f6432a;
                if (view instanceof d11) {
                    d11 d11Var = (d11) view;
                    if (d11Var.d == SharedConfig.currentProxy) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    d11Var.setChecked(z10);
                    d11Var.b();
                    return;
                }
                return;
        }
    }
}
