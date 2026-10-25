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
public final class h3 implements q0.a {
    public final int f39875a;
    public final Object f39876b;

    public h3(Object obj, int i10) {
        this.f39875a = i10;
        this.f39876b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        int i10 = this.f39875a;
        boolean z10 = true;
        Object obj2 = this.f39876b;
        switch (i10) {
            case 0:
                m3 m3Var = (m3) obj2;
                Float f7 = (Float) obj;
                j4 j4Var = m3Var.L;
                if (m3Var == j4Var.f40446u0[0]) {
                    if (j4Var.f40434h0.f45395d0.getCurrentProgress() > f7.floatValue()) {
                        j4Var.f40434h0.f45395d0.a(0.0f, false);
                    }
                    j4Var.f40434h0.f45395d0.a(f7.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.pk0) obj2).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                kr krVar = ((br) obj2).f38146b;
                er x02 = krVar.x0();
                ArrayList arrayList2 = krVar.E;
                a0.h hVar = krVar.L;
                if (hVar != null && hVar.m() != 0) {
                    arrayList = krVar.G;
                } else {
                    arrayList = arrayList2;
                }
                if (hVar == null || hVar.m() == 0) {
                    hVar = krVar.J;
                }
                if (hVar.f(user.f22174id) == null) {
                    if (ChatObject.isChannel(krVar.f41029n)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = krVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f22174id;
                        tL_channelParticipant.date = krVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.f22174id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f22174id;
                        tL_chatParticipant.inviter_id = krVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.f22174id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new org.telegram.ui.ActionBar.n4(11));
                }
                krVar.B0(x02);
                return;
            case 3:
                t3 t3Var = (t3) obj2;
                int i11 = ((d5.i) obj).f7985a;
                if (i11 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i11);
                }
                AndroidUtilities.runOnUIThread(new wb0(13, t3Var, responseCodeString));
                return;
            case 4:
                ci0 ci0Var = (ci0) obj2;
                if (((d5.i) obj).f7985a == 0) {
                    AndroidUtilities.runOnUIThread(ci0Var);
                    return;
                }
                return;
            case 5:
                int i12 = ProfileActivity.R6;
                ((ArrayList) obj2).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i13 = 0; i13 < profileActivity.f36088u2.participants.participants.size(); i13++) {
                    if (profileActivity.f36088u2.participants.participants.get(i13).user_id == user2.f22174id) {
                        profileActivity.f36088u2.participants.participants.remove(i13);
                        profileActivity.p5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) obj2).f36131b.T((View) obj).f47735a;
                if (view instanceof s11) {
                    s11 s11Var = (s11) view;
                    if (s11Var.d != SharedConfig.currentProxy) {
                        z10 = false;
                    }
                    s11Var.setChecked(z10);
                    s11Var.b();
                    return;
                }
                return;
        }
    }
}
